package typings.winjs.WinJS.Binding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WinJS.Binding.defaultBind")
@js.native
object defaultBind extends js.Object {
  /**
    * Creates a one-way binding between the source object and the destination object. Warning Do not attempt to bind data to the ID of an HTML element.
    * @param source The source object.
    * @param sourceProperties The path on the source object to the source property.
    * @param dest The destination object.
    * @param destProperties The path on the destination object to the destination property.
    * @returns An object with a cancel method that is used to coalesce bindings.
    **/
  def apply(source: js.Any, sourceProperties: js.Any, dest: js.Any, destProperties: js.Any): js.Any = js.native
}

