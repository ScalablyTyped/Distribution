package typings.wonderJs

import typings.wonderJs.vector4Mod.Vector4
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/structure/RectRegion", JSImport.Namespace)
@js.native
object rectRegionMod extends js.Object {
  @js.native
  class RectRegion () extends Vector4 {
    var height: Double = js.native
    var width: Double = js.native
    def isNotEmpty(): Boolean = js.native
  }
  
}

