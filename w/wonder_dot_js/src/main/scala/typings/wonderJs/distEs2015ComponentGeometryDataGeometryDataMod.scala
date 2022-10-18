package typings.wonderJs

import typings.wonderJs.distEs2015ComponentGeometryGeometryMod.Geometry
import typings.wonderJs.distEs2015StructureFace3Mod.Face3
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015ComponentGeometryDataGeometryDataMod {
  
  /* note: abstract class */ @JSImport("wonder.js/dist/es2015/component/geometry/data/GeometryData", "GeometryData")
  @js.native
  open class GeometryData protected () extends StObject {
    def this(geometry: Geometry) = this()
    
    def dispose(): Unit = js.native
    
    var faces: js.Array[Face3] = js.native
    
    /* protected */ var geometry: Geometry = js.native
    
    val indices: js.Array[Double] = js.native
    
    /* protected */ def onChangeFace(): Unit = js.native
    
    var vertices: js.Array[Double] = js.native
  }
}
