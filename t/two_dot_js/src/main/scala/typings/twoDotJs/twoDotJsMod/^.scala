package typings.twoDotJs.twoDotJsMod

import typings.std.ArrayConstructor
import typings.std.Float32ArrayConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("two.js", JSImport.Namespace)
@js.native
class ^ () extends Two {
  def this(params: ConstructorParams) = this()
}

@JSImport("two.js", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var Array: Float32ArrayConstructor | ArrayConstructor = js.native
  val Instances: js.Array[Two] = js.native
  val Properties: js.Array[js.Any] = js.native
  val Resolution: Double = js.native
  def noConflict(): Two = js.native
}

