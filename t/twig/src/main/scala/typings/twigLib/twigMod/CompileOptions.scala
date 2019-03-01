package typings
package twigLib.twigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompileOptions extends js.Object {
  var filename: java.lang.String
  var settings: js.Any
}

object CompileOptions {
  @scala.inline
  def apply(filename: java.lang.String, settings: js.Any): CompileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("filename")(filename)
    __obj.updateDynamic("settings")(settings)
    __obj.asInstanceOf[CompileOptions]
  }
}

