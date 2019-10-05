package typings.winjs.WinJS.Binding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WinJS.Binding.converter")
@js.native
object converter extends js.Object {
  /**
    * Creates a default binding initializer for binding between a source property and a destination property with the specified converter function that is executed on the value of the source property.
    * @param convert The conversion function that takes the source property and produces a value that is set to the destination property. This function must be accessible from the global namespace.
    * @returns The binding initializer.
    **/
  def apply(convert: js.Function): js.Function = js.native
}

