package typings
package tooltipsterLib.JQueryTooltipsterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITooltipsterJQuery extends js.Object {
  /** Activates Tooltipster */
  def apply(): tooltipsterLib.JQuery = js.native
  /**
  		 * Closes the tooltip. When the animation is over, its HTML element is destroyed (definitely removed from the 
  		 * DOM). The `callback` function argument is optional.
  		 */
  def apply(method: tooltipsterLib.tooltipsterLibStrings.close): tooltipsterLib.JQuery = js.native
  /**
  		 * Closes the tooltip. When the animation is over, its HTML element is destroyed (definitely removed from the 
  		 * DOM). The `callback` function argument is optional.
  		 */
  def apply(method: tooltipsterLib.tooltipsterLibStrings.close, callback: TooltipsterStandardCallbackFunction): tooltipsterLib.JQuery = js.native
  /**
  		 * Returns a tooltip's current content. If the selector matches multiple origins, only the value of the first 
  		 * will be returned.
  		 */
  def apply(method: tooltipsterLib.tooltipsterLibStrings.content): js.Any = js.native
  /**
  		 * Updates the tooltip's content.
  		 * @param value the new content of the tooltip
  		 */
  def apply(method: tooltipsterLib.tooltipsterLibStrings.content, value: java.lang.String): tooltipsterLib.JQuery = js.native
  /**
  		 * Closes and destroys the tooltip functionality.
  		 */
  def apply(method: tooltipsterLib.tooltipsterLibStrings.destroy): tooltipsterLib.JQuery = js.native
  /**
  		 * Temporarily disables a tooltip from being able to open.
  		 */
  def apply(method: tooltipsterLib.tooltipsterLibStrings.disable): tooltipsterLib.JQuery = js.native
  /**
  		 * Returns the HTML element which has been tooltipped.
  		 */
  def apply(method: tooltipsterLib.tooltipsterLibStrings.elementOrigin): stdLib.HTMLElement = js.native
  /**
  		 * Returns the HTML root element of the tooltip if it is open, `null` if it is closed.
  		 */
  def apply(method: tooltipsterLib.tooltipsterLibStrings.elementTooltip): stdLib.HTMLElement | scala.Null = js.native
  /**
  		 * If a tooltip was disabled, restores its previous functionality.
  		 */
  def apply(method: tooltipsterLib.tooltipsterLibStrings.enable): tooltipsterLib.JQuery = js.native
  /**
  		 * Returns the instance of Tooltipster associated to the tooltip. If the selector matches multiple origins, 
  		 * only the instance of the first will be returned.
  		 */
  def apply(method: tooltipsterLib.tooltipsterLibStrings.instance): ITooltipsterInstance = js.native
  /**
  		 * Handle Tooltipster's `off` event coming from any instance.
  		 */
  def apply(method: tooltipsterLib.tooltipsterLibStrings.off, eventName: java.lang.String): tooltipsterLib.JQuery = js.native
  /**
  		 * Handle Tooltipster's `one` event coming from any instance.
  		 */
  def apply(
    method: tooltipsterLib.tooltipsterLibStrings.one,
    eventName: java.lang.String,
    callback: js.Function1[/* e */ jqueryLib.JQueryEventObject, scala.Unit]
  ): tooltipsterLib.JQuery = js.native
  /**
  		 * Handle Tooltipster's `on` event coming from any instance. See http://iamceege.github.io/tooltipster/#events
  		 * for a complete description of available events.
  		 */
  def apply(
    method: tooltipsterLib.tooltipsterLibStrings.on,
    eventName: java.lang.String,
    callback: js.Function1[/* e */ jqueryLib.JQueryEventObject, scala.Unit]
  ): tooltipsterLib.JQuery = js.native
  /**
  		 * Opens the tooltip. The `callback` function argument is optional (see its input signature) and, if provided, 
  		 * is called when the opening animation has ended
  		 */
  def apply(method: tooltipsterLib.tooltipsterLibStrings.open): tooltipsterLib.JQuery = js.native
  /**
  		 * Opens the tooltip. The `callback` function argument is optional (see its input signature) and, if provided, 
  		 * is called when the opening animation has ended
  		 */
  def apply(method: tooltipsterLib.tooltipsterLibStrings.open, callback: TooltipsterStandardCallbackFunction): tooltipsterLib.JQuery = js.native
  /**
  		 * Returns the value of an option.
  		 */
  def apply(method: tooltipsterLib.tooltipsterLibStrings.option, optionName: java.lang.String): js.Any = js.native
  /**
  		 * Sets the value of an option (for advanced users only; we do not provide support on unexpected results).
  		 */
  def apply(
    method: tooltipsterLib.tooltipsterLibStrings.option,
    optionName: java.lang.String,
    optionValue: js.Any
  ): tooltipsterLib.JQuery = js.native
  /**
  		 * Resizes and repositions the tooltip.
  		 */
  def apply(method: tooltipsterLib.tooltipsterLibStrings.reposition): tooltipsterLib.JQuery = js.native
  /**
  		 * Returns various information about the tooltip, like whether it is open or not. See 
  		 * http://iamceege.github.io/tooltipster/#status
  		 */
  def apply(method: tooltipsterLib.tooltipsterLibStrings.status): ITooltipStatus = js.native
  /**
  		 * Trigger a Tooltipster's event coming from any instance.
  		 */
  def apply(method: tooltipsterLib.tooltipsterLibStrings.triggerHandler, eventName: java.lang.String): tooltipsterLib.JQuery = js.native
  /** Activates Tooltipster */
  def apply(options: ITooltipsterOptions): tooltipsterLib.JQuery = js.native
}

