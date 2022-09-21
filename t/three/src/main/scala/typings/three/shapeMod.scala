package typings.three

import typings.three.anon.Holes
import typings.three.pathMod.Path
import typings.three.vector2Mod.Vector2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object shapeMod {
  
  @JSImport("three/src/extras/core/Shape", "Shape")
  @js.native
  open class Shape () extends Path {
    def this(points: js.Array[Vector2]) = this()
    
    def extractPoints(divisions: Double): Holes = js.native
    
    def getPointsHoles(divisions: Double): js.Array[js.Array[Vector2]] = js.native
    
    /**
      * @default []
      */
    var holes: js.Array[Path] = js.native
    
    var uuid: String = js.native
  }
}
