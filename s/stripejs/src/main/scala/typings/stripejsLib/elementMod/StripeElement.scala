package typings
package stripejsLib.elementMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StripeElement extends js.Object {
  /**
    * Blur the element
    * @see https://stripe.com/docs/stripe-js/reference#other-methods
    */
  def blur(): scala.Unit = js.native
  /**
    * Clear the value of the element
    */
  def clear(): scala.Unit = js.native
  /**
    * Removes the Element from the DOM and destroys it
    * NOTE: a destroyed element can not be re-activated or re-mounted to the DOM
    */
  def destroy(): scala.Unit = js.native
  /**
    * Give focus to the element
    */
  def focus(): scala.Unit = js.native
  def mount(element: java.lang.String): scala.Unit = js.native
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
  def mount(element: stdLib.HTMLElement): scala.Unit = js.native
  /**
    * Watch for changes on the element
    * @see https://stripe.com/docs/stripe-js/reference#element-on
    *
    * @param event - What event to listen to
    * @param handler - The handler function that is called when the event fires
    */
  @JSName("on")
  def on_blur(event: stripejsLib.stripejsLibStrings.blur, handler: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("on")
  def on_change(
    event: stripejsLib.stripejsLibStrings.change,
    handler: js.Function1[/* event */ OnChange, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_click(
    event: stripejsLib.stripejsLibStrings.click,
    handler: js.Function1[/* event */ stripejsLib.Anon_PreventDefault, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_focus(event: stripejsLib.stripejsLibStrings.focus, handler: js.Function0[scala.Unit]): scala.Unit = js.native
  @JSName("on")
  def on_ready(event: stripejsLib.stripejsLibStrings.ready, handler: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * Unmounts the Element from the DOM
    * Call `element.mount()` to re-attach it to the DOM
    * @see mount
    */
  def unmount(): scala.Unit = js.native
  /**
    * Updates the options the Element was initialized with
    * NOTE: Updates are merged into the existing configuration
    * @param options - The options that should be used to update the element
    */
  def update(options: CardElementOptions): scala.Unit = js.native
  def update(options: IBANElementOptions): scala.Unit = js.native
  def update(options: IdealBankOptions): scala.Unit = js.native
  def update(options: PaymentButtonOptions): scala.Unit = js.native
}

