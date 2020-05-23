package typings.typescriptServices.anon

import typings.typescriptServices.TypeScript.GetAccessor
import typings.typescriptServices.TypeScript.SetAccessor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Getter extends js.Object {
  var getter: GetAccessor
  var setter: SetAccessor
}

object Getter {
  @scala.inline
  def apply(getter: GetAccessor, setter: SetAccessor): Getter = {
    val __obj = js.Dynamic.literal(getter = getter.asInstanceOf[js.Any], setter = setter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Getter]
  }
}

