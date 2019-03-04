package typings
package swizLib.swizMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IValidator extends js.Object {
  var help: java.lang.String
  var name: java.lang.String
  def func(value: js.Any, baton: js.Any, callback: js.Function): scala.Unit
}

object IValidator {
  @scala.inline
  def apply(
    func: js.Function3[js.Any, js.Any, js.Function, scala.Unit],
    help: java.lang.String,
    name: java.lang.String
  ): IValidator = {
    val __obj = js.Dynamic.literal(func = func, help = help, name = name)
  
    __obj.asInstanceOf[IValidator]
  }
}

