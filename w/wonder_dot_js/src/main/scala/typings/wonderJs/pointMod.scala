package typings.wonderJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/structure/Point", JSImport.Namespace)
@js.native
object pointMod extends js.Object {
  @js.native
  class Point () extends js.Object {
    def this(x: Double) = this()
    def this(x: Double, y: Double) = this()
    var x: Double = js.native
    var y: Double = js.native
  }
  
  /* static members */
  @js.native
  object Point extends js.Object {
    def create(): Point = js.native
    def create(x: Double): Point = js.native
    def create(x: Double, y: Double): Point = js.native
  }
  
}

