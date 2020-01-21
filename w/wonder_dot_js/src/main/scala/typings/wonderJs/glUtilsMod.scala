package typings.wonderJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/renderer/GlUtils", JSImport.Namespace)
@js.native
object glUtilsMod extends js.Object {
  @js.native
  class GlUtils () extends js.Object
  
  /* static members */
  @js.native
  object GlUtils extends js.Object {
    def drawArrays(mode: js.Any, first: Double, count: Double): Unit = js.native
    def drawElements(mode: js.Any, count: Double, `type`: js.Any, offset: Double): Unit = js.native
  }
  
}

