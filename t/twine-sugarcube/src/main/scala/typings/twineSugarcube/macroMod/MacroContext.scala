package typings.twineSugarcube.macroMod

import typings.std.HTMLElement
import typings.twineSugarcube.extensionsMod.global.Array
import typings.twineSugarcube.twineSugarcubeBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MacroContext extends js.Object {
  
  /**
    * The argument string parsed into an array of discrete arguments.
    * @since 2.0.0
    */
  var args: MacroArgsArray = js.native
  
  /**
    * Returns whether any of the macro's ancestors passed the test implemented by the given
    * filter function.
    * @param filter he function used to test each ancestor execution context object, which
    * is passed in as its sole parameter.
    * @since 2.0.0
    */
  def contextHas(filter: js.Function1[/* context */ MacroContextObject, Boolean]): Boolean = js.native
  
  /**
    * Returns the first of the macro's ancestors which passed the test implemented by the given
    * filter function or null, if no members pass.
    * @param filter The function used to test each ancestor execution context object, which is
    * passed in as its sole parameter.
    * @since 2.0.0
    */
  def contextSelect(filter: js.Function1[/* context */ MacroContextObject, Boolean]): js.Object = js.native
  
  /**
    * Returns a new array containing all of the macro's ancestors which passed the test implemented
    * by the given filter function or an empty array, if no members pass.
    * @since 2.0.0
    * @param filter
    */
  def contextSelectAll(filter: js.Function1[/* context */ MacroContextObject, Boolean]): Array[js.Object] = js.native
  
  /**
    * Renders the message prefixed with the name of the macro and returns false.
    * @param message The error message to output.
    * @since 2.0.0
    */
  def error(message: String): `false` = js.native
  
  /**
    * The name of the macro.
    * @since 2.0.0
    */
  var name: String = js.native
  
  /**
    * The current output element.
    * @since 2.0.0
    */
  var output: HTMLElement = js.native
  
  /**
    * The (execution) context object of the macro's parent, or null if the macro has no parent.
    * @since 2.0.0
    */
  var parent: js.Object = js.native
  
  /**
    * The text of a container macro parsed into discrete payload objects by tag.
    * @since 2.0.0
    */
  var payload: Array[MacroContextObject] = js.native
  
  /**
    * The macro's definition — created via @see Macro.add()
    * @since 2.0.0
    */
  var self: js.Object = js.native
}
object MacroContext {
  
  @scala.inline
  def apply(
    args: MacroArgsArray,
    contextHas: js.Function1[/* context */ MacroContextObject, Boolean] => Boolean,
    contextSelect: js.Function1[/* context */ MacroContextObject, Boolean] => js.Object,
    contextSelectAll: js.Function1[/* context */ MacroContextObject, Boolean] => Array[js.Object],
    error: String => `false`,
    name: String,
    output: HTMLElement,
    parent: js.Object,
    payload: Array[MacroContextObject],
    self: js.Object
  ): MacroContext = {
    val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], contextHas = js.Any.fromFunction1(contextHas), contextSelect = js.Any.fromFunction1(contextSelect), contextSelectAll = js.Any.fromFunction1(contextSelectAll), error = js.Any.fromFunction1(error), name = name.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any], self = self.asInstanceOf[js.Any])
    __obj.asInstanceOf[MacroContext]
  }
  
  @scala.inline
  implicit class MacroContextOps[Self <: MacroContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setArgs(value: MacroArgsArray): Self = this.set("args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextHas(value: js.Function1[/* context */ MacroContextObject, Boolean] => Boolean): Self = this.set("contextHas", js.Any.fromFunction1(value))
    
    @scala.inline
    def setContextSelect(value: js.Function1[/* context */ MacroContextObject, Boolean] => js.Object): Self = this.set("contextSelect", js.Any.fromFunction1(value))
    
    @scala.inline
    def setContextSelectAll(value: js.Function1[/* context */ MacroContextObject, Boolean] => Array[js.Object]): Self = this.set("contextSelectAll", js.Any.fromFunction1(value))
    
    @scala.inline
    def setError(value: String => `false`): Self = this.set("error", js.Any.fromFunction1(value))
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutput(value: HTMLElement): Self = this.set("output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParent(value: js.Object): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPayload(value: Array[MacroContextObject]): Self = this.set("payload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelf(value: js.Object): Self = this.set("self", value.asInstanceOf[js.Any])
  }
}
