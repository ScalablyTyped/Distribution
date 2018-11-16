package typings
package tooltipsterLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  @JSName("tooltipster")
  var tooltipster_Original: tooltipsterLib.JQueryTooltipsterNs.ITooltipsterJQuery = js.native
  /** Activates Tooltipster */
  def tooltipster(): JQuery = js.native
  /** Activates Tooltipster */
  def tooltipster(options: tooltipsterLib.JQueryTooltipsterNs.ITooltipsterOptions): JQuery = js.native
  /**
  		 * Closes the tooltip. When the animation is over, its HTML element is destroyed (definitely removed from the 
  		 * DOM). The `callback` function argument is optional.
  		 */
  @JSName("tooltipster")
  def tooltipster_close(method: tooltipsterLib.tooltipsterLibStrings.close): JQuery = js.native
  /**
  		 * Closes the tooltip. When the animation is over, its HTML element is destroyed (definitely removed from the 
  		 * DOM). The `callback` function argument is optional.
  		 */
  @JSName("tooltipster")
  def tooltipster_close(
    method: tooltipsterLib.tooltipsterLibStrings.close,
    callback: tooltipsterLib.JQueryTooltipsterNs.TooltipsterStandardCallbackFunction
  ): JQuery = js.native
  /**
  		 * Returns a tooltip's current content. If the selector matches multiple origins, only the value of the first 
  		 * will be returned.
  		 */
  @JSName("tooltipster")
  def tooltipster_content(method: tooltipsterLib.tooltipsterLibStrings.content): js.Any = js.native
  /**
  		 * Updates the tooltip's content.
  		 * @param value the new content of the tooltip
  		 */
  @JSName("tooltipster")
  def tooltipster_content(method: tooltipsterLib.tooltipsterLibStrings.content, value: java.lang.String): JQuery = js.native
  /**
  		 * Closes and destroys the tooltip functionality.
  		 */
  @JSName("tooltipster")
  def tooltipster_destroy(method: tooltipsterLib.tooltipsterLibStrings.destroy): JQuery = js.native
  /**
  		 * Temporarily disables a tooltip from being able to open.
  		 */
  @JSName("tooltipster")
  def tooltipster_disable(method: tooltipsterLib.tooltipsterLibStrings.disable): JQuery = js.native
  /**
  		 * Returns the HTML element which has been tooltipped.
  		 */
  @JSName("tooltipster")
  def tooltipster_elementOrigin(method: tooltipsterLib.tooltipsterLibStrings.elementOrigin): stdLib.HTMLElement = js.native
  /**
  		 * Returns the HTML root element of the tooltip if it is open, `null` if it is closed.
  		 */
  @JSName("tooltipster")
  def tooltipster_elementTooltip(method: tooltipsterLib.tooltipsterLibStrings.elementTooltip): stdLib.HTMLElement | scala.Null = js.native
  /**
  		 * If a tooltip was disabled, restores its previous functionality.
  		 */
  @JSName("tooltipster")
  def tooltipster_enable(method: tooltipsterLib.tooltipsterLibStrings.enable): JQuery = js.native
  /**
  		 * Returns the instance of Tooltipster associated to the tooltip. If the selector matches multiple origins, 
  		 * only the instance of the first will be returned.
  		 */
  @JSName("tooltipster")
  def tooltipster_instance(method: tooltipsterLib.tooltipsterLibStrings.instance): tooltipsterLib.JQueryTooltipsterNs.ITooltipsterInstance = js.native
  /**
  		 * Handle Tooltipster's `off` event coming from any instance.
  		 */
  @JSName("tooltipster")
  def tooltipster_off(method: tooltipsterLib.tooltipsterLibStrings.off, eventName: java.lang.String): JQuery = js.native
  /**
  		 * Handle Tooltipster's `on` event coming from any instance. See http://iamceege.github.io/tooltipster/#events
  		 * for a complete description of available events.
  		 */
  @JSName("tooltipster")
  def tooltipster_on(
    method: tooltipsterLib.tooltipsterLibStrings.on,
    eventName: java.lang.String,
    callback: js.Function1[/* e */ jqueryLib.JQueryEventObject, scala.Unit]
  ): JQuery = js.native
  /**
  		 * Handle Tooltipster's `one` event coming from any instance.
  		 */
  @JSName("tooltipster")
  def tooltipster_one(
    method: tooltipsterLib.tooltipsterLibStrings.one,
    eventName: java.lang.String,
    callback: js.Function1[/* e */ jqueryLib.JQueryEventObject, scala.Unit]
  ): JQuery = js.native
  /**
  		 * Opens the tooltip. The `callback` function argument is optional (see its input signature) and, if provided, 
  		 * is called when the opening animation has ended
  		 */
  @JSName("tooltipster")
  def tooltipster_open(method: tooltipsterLib.tooltipsterLibStrings.open): JQuery = js.native
  /**
  		 * Opens the tooltip. The `callback` function argument is optional (see its input signature) and, if provided, 
  		 * is called when the opening animation has ended
  		 */
  @JSName("tooltipster")
  def tooltipster_open(
    method: tooltipsterLib.tooltipsterLibStrings.open,
    callback: tooltipsterLib.JQueryTooltipsterNs.TooltipsterStandardCallbackFunction
  ): JQuery = js.native
  /**
  		 * Returns the value of an option.
  		 */
  @JSName("tooltipster")
  def tooltipster_option(method: tooltipsterLib.tooltipsterLibStrings.option, optionName: java.lang.String): js.Any = js.native
  /**
  		 * Sets the value of an option (for advanced users only; we do not provide support on unexpected results).
  		 */
  @JSName("tooltipster")
  def tooltipster_option(
    method: tooltipsterLib.tooltipsterLibStrings.option,
    optionName: java.lang.String,
    optionValue: js.Any
  ): JQuery = js.native
  /**
  		 * Resizes and repositions the tooltip.
  		 */
  @JSName("tooltipster")
  def tooltipster_reposition(method: tooltipsterLib.tooltipsterLibStrings.reposition): JQuery = js.native
  /**
  		 * Returns various information about the tooltip, like whether it is open or not. See 
  		 * http://iamceege.github.io/tooltipster/#status
  		 */
  @JSName("tooltipster")
  def tooltipster_status(method: tooltipsterLib.tooltipsterLibStrings.status): tooltipsterLib.JQueryTooltipsterNs.ITooltipStatus = js.native
  /**
  		 * Trigger a Tooltipster's event coming from any instance.
  		 */
  @JSName("tooltipster")
  def tooltipster_triggerHandler(method: tooltipsterLib.tooltipsterLibStrings.triggerHandler, eventName: java.lang.String): JQuery = js.native
}

