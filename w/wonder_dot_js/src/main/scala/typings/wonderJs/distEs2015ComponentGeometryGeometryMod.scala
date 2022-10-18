package typings.wonderJs

import typings.wonderJs.distEs2015ComponentGeometryDataBasicGeometryDataMod.BasicGeometryData
import typings.wonderJs.distEs2015ComponentGeometryDataBufferContainerMod.BufferContainer
import typings.wonderJs.distEs2015ComponentGeometryDataGeometryDataMod.GeometryData
import typings.wonderJs.distEs2015CoreComponentMod.Component
import typings.wonderJs.distEs2015CoreEntityObjectGameObjectGameObjectMod.GameObject
import typings.wonderJs.distEs2015MaterialMaterialMod.Material
import typings.wonderJs.distEs2015RendererEdrawmodeMod.EDrawMode
import typings.wonderJs.distEs2015StructureFace3Mod.Face3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015ComponentGeometryGeometryMod {
  
  /* note: abstract class */ @JSImport("wonder.js/dist/es2015/component/geometry/Geometry", "Geometry")
  @js.native
  open class Geometry () extends Component {
    
    var buffers: BufferContainer = js.native
    
    def computeData(): GeometryDataType = js.native
    
    /* protected */ def createBasicGeometryData(computedData: GeometryDataType): BasicGeometryData = js.native
    
    /* protected */ def createBufferContainer(): BufferContainer = js.native
    
    def createBuffersFromGeometryData(): Unit = js.native
    
    /* protected */ def createGeometryData(computedData: GeometryDataType): GeometryData = js.native
    
    var drawMode: EDrawMode = js.native
    
    @JSName("entityObject")
    var entityObject_Geometry: GameObject = js.native
    
    val geometryData: GeometryData = js.native
    
    var material: Material = js.native
  }
  
  trait GeometryDataType extends StObject {
    
    var faces: js.UndefOr[js.Array[Face3]] = js.undefined
    
    var vertices: js.Array[Double]
  }
  object GeometryDataType {
    
    inline def apply(vertices: js.Array[Double]): GeometryDataType = {
      val __obj = js.Dynamic.literal(vertices = vertices.asInstanceOf[js.Any])
      __obj.asInstanceOf[GeometryDataType]
    }
    
    extension [Self <: GeometryDataType](x: Self) {
      
      inline def setFaces(value: js.Array[Face3]): Self = StObject.set(x, "faces", value.asInstanceOf[js.Any])
      
      inline def setFacesUndefined: Self = StObject.set(x, "faces", js.undefined)
      
      inline def setFacesVarargs(value: Face3*): Self = StObject.set(x, "faces", js.Array(value*))
      
      inline def setVertices(value: js.Array[Double]): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
      
      inline def setVerticesVarargs(value: Double*): Self = StObject.set(x, "vertices", js.Array(value*))
    }
  }
}
