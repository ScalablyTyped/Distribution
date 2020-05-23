package typings.stripeV3.stripe.elements

import typings.stripeV3.anon.PreventDefault
import typings.stripeV3.stripeV3Strings.click
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Element extends js.Object {
  def addEventListener(event: eventTypes, handler: handler): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_click(event: click, handler: js.Function1[/* response */ PreventDefault, Unit]): Unit = js.native
  def blur(): Unit = js.native
  def clear(): Unit = js.native
  def destroy(): Unit = js.native
  def focus(): Unit = js.native
  // HTMLElement keeps giving this error for some reason:
  // Cannot find name 'HTMLElement'
  def mount(domElement: js.Any): Unit = js.native
  def on(event: eventTypes, handler: handler): Unit = js.native
  @JSName("on")
  def on_click(event: click, handler: js.Function1[/* response */ PreventDefault, Unit]): Unit = js.native
  def unmount(): Unit = js.native
  def update(options: ElementsOptions): Unit = js.native
}

