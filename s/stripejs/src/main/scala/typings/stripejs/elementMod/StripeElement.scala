package typings.stripejs.elementMod

import typings.std.HTMLElement
import typings.stripejs.anon.PreventDefault
import typings.stripejs.stripejsStrings.blur
import typings.stripejs.stripejsStrings.change
import typings.stripejs.stripejsStrings.click
import typings.stripejs.stripejsStrings.focus
import typings.stripejs.stripejsStrings.ready
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StripeElement extends js.Object {
  
  /**
    * Blur the element
    * @see https://stripe.com/docs/stripe-js/reference#other-methods
    */
  def blur(): Unit = js.native
  
  /**
    * Clear the value of the element
    */
  def clear(): Unit = js.native
  
  /**
    * Removes the Element from the DOM and destroys it
    * NOTE: a destroyed element can not be re-activated or re-mounted to the DOM
    */
  def destroy(): Unit = js.native
  
  /**
    * Give focus to the element
    */
  def focus(): Unit = js.native
  
  def mount(element: String): Unit = js.native
  /**
    * Mount the element to the DOM
    * @see https://stripe.com/docs/stripe-js/reference#element-mount
    *
    * @param element - A HTML DOM element or a CSS selector
    *
    * @example ```
    * <label for="card-element">Card</label>
    * <div id="card-element"></div>
    *
    * cardElement.mount('#card-element');
    * ```
    */
  def mount(element: HTMLElement): Unit = js.native
  
  /**
    * Watch for changes on the element
    * @see https://stripe.com/docs/stripe-js/reference#element-on
    *
    * @param event - What event to listen to
    * @param handler - The handler function that is called when the event fires
    */
  @JSName("on")
  def on_blur(event: blur, handler: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_change(event: change, handler: js.Function1[/* event */ OnChange, Unit]): Unit = js.native
  @JSName("on")
  def on_click(event: click, handler: js.Function1[/* event */ PreventDefault, Unit]): Unit = js.native
  @JSName("on")
  def on_focus(event: focus, handler: js.Function0[Unit]): Unit = js.native
  @JSName("on")
  def on_ready(event: ready, handler: js.Function0[Unit]): Unit = js.native
  
  /**
    * Unmounts the Element from the DOM
    * Call `element.mount()` to re-attach it to the DOM
    * @see mount
    */
  def unmount(): Unit = js.native
  
  /**
    * Updates the options the Element was initialized with
    * NOTE: Updates are merged into the existing configuration
    * @param options - The options that should be used to update the element
    */
  def update(options: CardElementOptions): Unit = js.native
  def update(options: IBANElementOptions): Unit = js.native
  def update(options: IdealBankOptions): Unit = js.native
  def update(options: PaymentButtonOptions): Unit = js.native
}
