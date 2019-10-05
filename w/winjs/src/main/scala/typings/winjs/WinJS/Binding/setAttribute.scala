package typings.winjs.WinJS.Binding

import typings.winjs.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WinJS.Binding.setAttribute")
@js.native
object setAttribute extends js.Object {
  /**
    * Creates a one-way binding between the source object and an attribute on the destination element.
    * @param source The source object.
    * @param sourceProperties The path on the source object to the source property.
    * @param dest The destination object.
    * @param destProperties The path on the destination object to the destination property. This must be a single name.
    * @returns An object with a cancel() method that is used to coalesce bindings.
    **/
  def apply(source: js.Any, sourceProperties: js.Array[_], dest: Element, destProperties: js.Array[_]): js.Any = js.native
}

