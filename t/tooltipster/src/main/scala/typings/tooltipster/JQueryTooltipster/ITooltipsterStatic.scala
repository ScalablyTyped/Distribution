package typings.tooltipster.JQueryTooltipster

import typings.std.HTMLElement
import typings.tooltipster.JQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITooltipsterStatic extends js.Object {
  
  /**
    * all instances of all tooltips present in the page are returned
    */
  def instances(): js.Array[ITooltipsterInstance] = js.native
  /**
    * Returns the instances of Tooltipster of all tooltips set on the element(s) matched by the argument.
    */
  def instances(element: HTMLElement): js.Array[ITooltipsterInstance] = js.native
  /**
    * Returns the instances of Tooltipster of all tooltips set on the element(s) matched by the argument.
    */
  def instances(selector: String): js.Array[ITooltipsterInstance] = js.native
  def instances(selector: JQuery): js.Array[ITooltipsterInstance] = js.native
  
  /**
    * Returns the instances of Tooltipster which were generated during the last initializing call.
    */
  def instancesLatest(): js.Array[ITooltipsterInstance] = js.native
  
  /**
    * Handle Tooltipster's `off` event coming from any instance.
    */
  def off(eventName: String): ITooltipsterStatic = js.native
  
  /**
    * Handle Tooltipster's `on` event coming from any instance. See http://iamceege.github.io/tooltipster/#events
    * for a complete description of available events.
    */
  def on(eventName: String, callback: js.Function1[/* e */ ITooltipEvent, Unit]): ITooltipsterStatic = js.native
  
  /**
    * Handle Tooltipster's `one` event coming from any instance.
    */
  def one(eventName: String, callback: js.Function1[/* e */ ITooltipEvent, Unit]): ITooltipsterStatic = js.native
  
  /**
    * Returns an array of all HTML elements in the page which have one or several tooltips initialized. If a selector 
    * is passed, the results will be limited to the descendants of the matched elements.
    */
  def origins(): js.Array[HTMLElement] = js.native
  def origins(selector: String): js.Array[HTMLElement] = js.native
  def origins(selector: JQuery): js.Array[HTMLElement] = js.native
  
  /**
    * Changes the default options that will apply to any tooltips created from now on.
    */
  def setDefaults(options: ITooltipsterOptions): Unit = js.native
  
  /**
    * Trigger a Tooltipster's event coming from any instance.
    */
  def triggerHandler(eventName: String): ITooltipsterStatic = js.native
}
