package typings.wonderJs

import typings.wonderJs.basicGeometryDataMod.BasicGeometryData
import typings.wonderJs.bufferContainerMod.BufferContainer
import typings.wonderJs.componentMod.Component
import typings.wonderJs.edrawmodeMod.EDrawMode
import typings.wonderJs.face3Mod.Face3
import typings.wonderJs.gameObjectMod.GameObject
import typings.wonderJs.geometryDataMod.GeometryData
import typings.wonderJs.materialMod.Material
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geometryMod {
  
  @JSImport("wonder.js/dist/es2015/component/geometry/Geometry", "Geometry")
  @js.native
  abstract class Geometry () extends Component {
    
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
    
    @scala.inline
    def apply(vertices: js.Array[Double]): GeometryDataType = {
      val __obj = js.Dynamic.literal(vertices = vertices.asInstanceOf[js.Any])
      __obj.asInstanceOf[GeometryDataType]
    }
    
    @scala.inline
    implicit class GeometryDataTypeMutableBuilder[Self <: GeometryDataType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFaces(value: js.Array[Face3]): Self = StObject.set(x, "faces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFacesUndefined: Self = StObject.set(x, "faces", js.undefined)
      
      @scala.inline
      def setFacesVarargs(value: Face3*): Self = StObject.set(x, "faces", js.Array(value :_*))
      
      @scala.inline
      def setVertices(value: js.Array[Double]): Self = StObject.set(x, "vertices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticesVarargs(value: Double*): Self = StObject.set(x, "vertices", js.Array(value :_*))
    }
  }
}
