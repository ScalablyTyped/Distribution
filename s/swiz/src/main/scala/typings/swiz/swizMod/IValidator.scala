package typings.swiz.swizMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IValidator extends js.Object {
  var help: String
  var name: String
  def func(value: js.Any, baton: js.Any, callback: js.Function): Unit
}

object IValidator {
  @scala.inline
  def apply(func: (js.Any, js.Any, js.Function) => Unit, help: String, name: String): IValidator = {
    val __obj = js.Dynamic.literal(func = js.Any.fromFunction3(func), help = help.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IValidator]
  }
}

