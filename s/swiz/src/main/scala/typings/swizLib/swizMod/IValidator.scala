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

