package typings.winjs.WinJS.Binding

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WinJS.Binding.bind")
@js.native
object bind extends js.Object {
  /**
    * Binds to one or more properties on the observable object or or on child values of that object.
    * @param observable The object to bind to.
    * @param bindingDescriptor An object literal containing the binding declarations. Binding declarations take the form: { propertyName: (function | bindingDeclaration), ... }.
    * @returns An object that contains at least a "cancel" field, which is a function that removes all bindings associated with this bind request.
    **/
  def apply(observable: js.Any, bindingDescriptor: js.Any): js.Any = js.native
}

