package typings
package atVueComponentDashCompilerDashUtilsLib.distTemplateCompilerModulesUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Attr extends js.Object {
  var name: java.lang.String
  var value: java.lang.String
}

object Attr {
  @scala.inline
  def apply(name: java.lang.String, value: java.lang.String): Attr = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Attr]
  }
}

