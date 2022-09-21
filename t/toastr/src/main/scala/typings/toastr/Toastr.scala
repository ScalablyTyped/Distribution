package typings.toastr

import typings.jquery.JQuery
import typings.std.HTMLElement
import typings.toastr.anon.Force
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Toastr extends StObject {
  
  /**
    * Clear toasts
    */
  def clear(): Unit = js.native
  def clear(toast: Unit, clearOptions: Force): Unit = js.native
  def clear(toast: JQuery[HTMLElement]): Unit = js.native
  def clear(toast: JQuery[HTMLElement], clearOptions: Force): Unit = js.native
  
  /**
    * Create an error toast
    */
  def error(message: String): JQuery[HTMLElement] = js.native
  def error(message: String, title: String): JQuery[HTMLElement] = js.native
  def error(message: String, title: String, overrides: ToastrOptions): JQuery[HTMLElement] = js.native
  def error(message: String, title: Unit, overrides: ToastrOptions): JQuery[HTMLElement] = js.native
  def error(message: JQuery[HTMLElement]): JQuery[HTMLElement] = js.native
  def error(message: JQuery[HTMLElement], title: String): JQuery[HTMLElement] = js.native
  def error(message: JQuery[HTMLElement], title: String, overrides: ToastrOptions): JQuery[HTMLElement] = js.native
  def error(message: JQuery[HTMLElement], title: Unit, overrides: ToastrOptions): JQuery[HTMLElement] = js.native
  /**
    * Create an error toast
    */
  @JSName("error")
  var error_Original: ToastrDisplayMethod = js.native
  
  /**
    * Get or create a container.
    */
  def getContainer(): JQuery[HTMLElement] = js.native
  def getContainer(options: ToastrOptions): JQuery[HTMLElement] = js.native
  /**
    * Get or create a container.
    */
  def getContainer(options: ToastrOptions, create: Boolean): JQuery[HTMLElement] = js.native
  
  /**
    * Create an info toast
    */
  def info(message: String): JQuery[HTMLElement] = js.native
  def info(message: String, title: String): JQuery[HTMLElement] = js.native
  def info(message: String, title: String, overrides: ToastrOptions): JQuery[HTMLElement] = js.native
  def info(message: String, title: Unit, overrides: ToastrOptions): JQuery[HTMLElement] = js.native
  def info(message: JQuery[HTMLElement]): JQuery[HTMLElement] = js.native
  def info(message: JQuery[HTMLElement], title: String): JQuery[HTMLElement] = js.native
  def info(message: JQuery[HTMLElement], title: String, overrides: ToastrOptions): JQuery[HTMLElement] = js.native
  def info(message: JQuery[HTMLElement], title: Unit, overrides: ToastrOptions): JQuery[HTMLElement] = js.native
  /**
    * Create an info toast
    */
  @JSName("info")
  var info_Original: ToastrDisplayMethod = js.native
  
  /**
    * The toatsr options object
    */
  var options: ToastrOptions = js.native
  
  /**
    * Removes toasts (without animation)
    */
  def remove(): Unit = js.native
  /**
    * Removes toasts (without animation)
    */
  def remove(toast: JQuery[HTMLElement]): Unit = js.native
  
  /**
    * Register a callback to be called when a toast gets created or hidden.
    *
    * @param callback The function which will be passed the event details.
    */
  def subscribe(callback: js.Function1[/* response */ ToastrResponse, Unit]): Unit = js.native
  
  /**
    * Create a success toast
    */
  def success(message: String): JQuery[HTMLElement] = js.native
  def success(message: String, title: String): JQuery[HTMLElement] = js.native
  def success(message: String, title: String, overrides: ToastrOptions): JQuery[HTMLElement] = js.native
  def success(message: String, title: Unit, overrides: ToastrOptions): JQuery[HTMLElement] = js.native
  def success(message: JQuery[HTMLElement]): JQuery[HTMLElement] = js.native
  def success(message: JQuery[HTMLElement], title: String): JQuery[HTMLElement] = js.native
  def success(message: JQuery[HTMLElement], title: String, overrides: ToastrOptions): JQuery[HTMLElement] = js.native
  def success(message: JQuery[HTMLElement], title: Unit, overrides: ToastrOptions): JQuery[HTMLElement] = js.native
  /**
    * Create a success toast
    */
  @JSName("success")
  var success_Original: ToastrDisplayMethod = js.native
  
  /**
    * Get toastr version
    */
  var version: String = js.native
  
  /**
    * Create a warning toast
    */
  def warning(message: String): JQuery[HTMLElement] = js.native
  def warning(message: String, title: String): JQuery[HTMLElement] = js.native
  def warning(message: String, title: String, overrides: ToastrOptions): JQuery[HTMLElement] = js.native
  def warning(message: String, title: Unit, overrides: ToastrOptions): JQuery[HTMLElement] = js.native
  def warning(message: JQuery[HTMLElement]): JQuery[HTMLElement] = js.native
  def warning(message: JQuery[HTMLElement], title: String): JQuery[HTMLElement] = js.native
  def warning(message: JQuery[HTMLElement], title: String, overrides: ToastrOptions): JQuery[HTMLElement] = js.native
  def warning(message: JQuery[HTMLElement], title: Unit, overrides: ToastrOptions): JQuery[HTMLElement] = js.native
  /**
    * Create a warning toast
    */
  @JSName("warning")
  var warning_Original: ToastrDisplayMethod = js.native
}
