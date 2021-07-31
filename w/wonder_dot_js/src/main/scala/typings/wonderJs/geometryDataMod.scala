package typings.wonderJs

import typings.wonderJs.face3Mod.Face3
import typings.wonderJs.geometryMod.Geometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geometryDataMod {
  
  @JSImport("wonder.js/dist/es2015/component/geometry/data/GeometryData", "GeometryData")
  @js.native
  abstract class GeometryData protected () extends StObject {
    def this(geometry: Geometry) = this()
    
    def dispose(): Unit = js.native
    
    var faces: js.Array[Face3] = js.native
    
    var geometry: Geometry = js.native
    
    val indices: js.Array[Double] = js.native
    
    /* protected */ def onChangeFace(): Unit = js.native
    
    var vertices: js.Array[Double] = js.native
  }
}
