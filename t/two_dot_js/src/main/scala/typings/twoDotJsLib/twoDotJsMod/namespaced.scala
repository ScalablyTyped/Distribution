package typings
package twoDotJsLib.twoDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("two.js", JSImport.Namespace)
@js.native
class namespaced () extends Two {
  def this(params: twoDotJsLib.twoDotJsMod.TwoNs.ConstructorParams) = this()
}

@JSImport("two.js", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  var Array: stdLib.Float32ArrayConstructor | stdLib.ArrayConstructor = js.native
}

