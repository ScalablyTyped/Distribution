package typings
package tooltipsterLib.JQueryTooltipsterNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITooltipsterStatic extends js.Object {
  /**
  		 * all instances of all tooltips present in the page are returned
  		 */
  def instances(): js.Array[ITooltipsterInstance] = js.native
  /**
  		 * Returns the instances of Tooltipster of all tooltips set on the element(s) matched by the argument.
  		 */
  def instances(element: stdLib.HTMLElement): js.Array[ITooltipsterInstance] = js.native
  /**
  		 * Returns the instances of Tooltipster of all tooltips set on the element(s) matched by the argument.
  		 */
  def instances(selector: java.lang.String): js.Array[ITooltipsterInstance] = js.native
  /**
  		 * Returns the instances of Tooltipster of all tooltips set on the element(s) matched by the argument.
  		 */
  def instances(selector: tooltipsterLib.JQuery): js.Array[ITooltipsterInstance] = js.native
  /**
  		 * Returns the instances of Tooltipster which were generated during the last initializing call.
  		 */
  def instancesLatest(): js.Array[ITooltipsterInstance] = js.native
  /**
  		 * Handle Tooltipster's `off` event coming from any instance.
  		 */
  def off(eventName: java.lang.String): ITooltipsterStatic = js.native
  /**
  		 * Handle Tooltipster's `on` event coming from any instance. See http://iamceege.github.io/tooltipster/#events
  		 * for a complete description of available events.
  		 */
  def on(eventName: java.lang.String, callback: js.Function1[/* e */ ITooltipEvent, scala.Unit]): ITooltipsterStatic = js.native
  /**
  		 * Handle Tooltipster's `one` event coming from any instance.
  		 */
  def one(eventName: java.lang.String, callback: js.Function1[/* e */ ITooltipEvent, scala.Unit]): ITooltipsterStatic = js.native
  /**
  		 * Returns an array of all HTML elements in the page which have one or several tooltips initialized. If a selector 
  		 * is passed, the results will be limited to the descendants of the matched elements.
  		 */
  def origins(): js.Array[stdLib.HTMLElement] = js.native
  /**
  		 * Returns an array of all HTML elements in the page which have one or several tooltips initialized. If a selector 
  		 * is passed, the results will be limited to the descendants of the matched elements.
  		 */
  def origins(selector: java.lang.String): js.Array[stdLib.HTMLElement] = js.native
  /**
  		 * Returns an array of all HTML elements in the page which have one or several tooltips initialized. If a selector 
  		 * is passed, the results will be limited to the descendants of the matched elements.
  		 */
  def origins(selector: tooltipsterLib.JQuery): js.Array[stdLib.HTMLElement] = js.native
  /**
  		 * Changes the default options that will apply to any tooltips created from now on.
  		 */
  def setDefaults(options: ITooltipsterOptions): scala.Unit = js.native
  /**
  		 * Trigger a Tooltipster's event coming from any instance.
  		 */
  def triggerHandler(eventName: java.lang.String): ITooltipsterStatic = js.native
}

