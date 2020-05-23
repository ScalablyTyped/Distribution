package typings.tooltipster.JQueryTooltipster

import org.scalablytyped.runtime.StringDictionary
import typings.jquery.JQueryEventObject
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITooltipsterInstance
  extends /**
  * Several plugins may have methods of the same name. To resolve the conflict, use the instance object of the 
  * tooltip and specify the full name of the desired plugin in your calls.
  */
/* pluginName */ StringDictionary[js.Any] {
  /**
    * Closes the tooltip. When the animation is over, its HTML element is destroyed (definitely removed from the 
    * DOM). The `callback` function argument is optional.
    */
  def close(): Unit = js.native
  def close(callback: TooltipsterStandardCallbackFunction): Unit = js.native
  /**
    * Returns a tooltip's current content. If the selector matches multiple origins, only the value of the first 
    * will be returned.
    */
  def content(): js.Any = js.native
  /**
    * Updates the tooltip's content.
    * @param value the new content of the tooltip
    */
  def content(value: js.Any): ITooltipsterInstance = js.native
  /**
    * Closes and destroys the tooltip functionality.
    */
  def destroy(): Unit = js.native
  /**
    * Temporarily disables a tooltip from being able to open.
    */
  def disable(): Unit = js.native
  /**
    * Returns the HTML element which has been tooltipped.
    */
  def elementOrigin(): HTMLElement = js.native
  /**
    * Returns the HTML root element of the tooltip if it is open, `null` if it is closed.
    */
  def elementTooltip(): HTMLElement | Null = js.native
  /**
    * If a tooltip was disabled, restores its previous functionality.
    */
  def enable(): Unit = js.native
  /**
    * Returns the instance of Tooltipster associated to the tooltip. If the selector matches multiple origins, 
    * only the instance of the first will be returned.
    */
  def instance(): ITooltipsterInstance = js.native
  /**
    * Handle Tooltipster's `off` event coming from any instance.
    */
  def off(eventName: String): ITooltipsterInstance = js.native
  /**
    * Handle Tooltipster's `on` event coming from any instance. See http://iamceege.github.io/tooltipster/#events
    * for a complete description of available events.
    */
  def on(eventName: String, callback: js.Function1[/* e */ JQueryEventObject, Unit]): ITooltipsterInstance = js.native
  /**
    * Handle Tooltipster's `one` event coming from any instance.
    */
  def one(eventName: String, callback: js.Function1[/* e */ JQueryEventObject, Unit]): ITooltipsterInstance = js.native
  /**
    * Opens the tooltip. The `callback` function argument is optional (see its input signature) and, if provided, 
    * is called when the opening animation has ended
    */
  def open(): ITooltipsterInstance = js.native
  def open(callback: TooltipsterStandardCallbackFunction): ITooltipsterInstance = js.native
  /**
    * Returns the value of an option.
    */
  def option(optionName: String): js.Any = js.native
  /**
    * Sets the value of an option (for advanced users only; we do not provide support on unexpected results).
    */
  def option(optionName: String, optionValue: js.Any): ITooltipsterInstance = js.native
  /**
    * Resizes and repositions the tooltip.
    */
  def reposition(): ITooltipsterInstance = js.native
  /**
    * Returns various information about the tooltip, like whether it is open or not. See 
    * http://iamceege.github.io/tooltipster/#status
    */
  def status(): ITooltipStatus = js.native
  /**
    * Trigger a Tooltipster's event coming from any instance.
    */
  def triggerHandler(eventName: String): ITooltipsterInstance = js.native
}

