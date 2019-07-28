package typings.winjs.WinJSNs.UINs.PagesNs

import typings.std.HTMLElement
import typings.winjs.WinJSNs.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

//#region Interfaces
/**
  * Provides members for a PageControl. You implement this interface when defining a new PageControl.
  **/
trait IPageControlMembers extends js.Object {
  //#region Methods
  /**
    * Called if any error occurs during the processing of the page.
    * @param err The error that occurred.
    * @returns Nothing if the error was handled, or an error promise if the error was not handled.
    **/
  var error: js.UndefOr[js.Function1[/* err */ js.Any, _]] = js.undefined
  /**
    * Initializes the control before the content of the control is set. Use the processed method for any initialization that should be done after the content of the control has been set.
    * @param element The DOM element that will contain all the content for the page.
    * @param options The options passed to the constructor of the page.
    * @returns A promise that is fulfilled when initialization is complete, if asynchronous processing is necessary. If not, returns nothing.
    **/
  var init: js.UndefOr[js.Function2[/* element */ HTMLElement, /* options */ js.Any, _]] = js.undefined
  /**
    * Creates DOM objects from the content in the specified URI. This method is called after the PageControl is defined and before the init method is called.
    * @param uri The URI from which to create DOM objects.
    * @returns A promise whose fulfilled value is the set of unparented DOM objects.
    **/
  var load: js.UndefOr[js.Function1[/* uri */ String, _]] = js.undefined
  /**
    * Initializes the control after the content of the control is set.
    * @param element The DOM element that will contain all the content for the page.
    * @param options The options that are to be passed to the constructor of the page.
    * @returns A promise that is fulfilled when initialization is complete, if asynchronous processing is necessary. If not, returns nothing.
    **/
  var processed: js.UndefOr[js.Function2[/* element */ HTMLElement, /* options */ js.Any, _]] = js.undefined
  /**
    * Called after all initialization and rendering is complete. At this time, the element is ready for use.
    * @param element The DOM element that contains all the content for the page.
    * @param options An object that contains one or more property/value pairs to apply to the PageControl. How these property/value pairs are used (or not used) depends on the implementation of that particular PageControl.
    * @returns A promise that is fulfilled when the element is ready for use, if asynchronous processing is necessary. If not, returns nothing.
    **/
  var ready: js.UndefOr[js.Function2[/* element */ HTMLElement, /* options */ js.Any, _]] = js.undefined
  /**
    * Takes the elements returned by the load method and attaches them to the specified element.
    * @param element The DOM element to which the loadResult elements are appended.
    * @param options An object that contains one or more property/value pairs to apply to the PageControl. How these property/value pairs are used (or not used) depends on the implementation of that particular PageControl.
    * @param loadResult A Promise that contains the elements returned from the load method.
    **/
  var render: js.UndefOr[
    js.Function3[/* element */ HTMLElement, /* options */ js.Any, /* loadResult */ Promise[_], Unit]
  ] = js.undefined
}

object IPageControlMembers {
  @scala.inline
  def apply(
    error: /* err */ js.Any => _ = null,
    init: (/* element */ HTMLElement, /* options */ js.Any) => _ = null,
    load: /* uri */ String => _ = null,
    processed: (/* element */ HTMLElement, /* options */ js.Any) => _ = null,
    ready: (/* element */ HTMLElement, /* options */ js.Any) => _ = null,
    render: (/* element */ HTMLElement, /* options */ js.Any, /* loadResult */ Promise[_]) => Unit = null
  ): IPageControlMembers = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(js.Any.fromFunction1(error))
    if (init != null) __obj.updateDynamic("init")(js.Any.fromFunction2(init))
    if (load != null) __obj.updateDynamic("load")(js.Any.fromFunction1(load))
    if (processed != null) __obj.updateDynamic("processed")(js.Any.fromFunction2(processed))
    if (ready != null) __obj.updateDynamic("ready")(js.Any.fromFunction2(ready))
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction3(render))
    __obj.asInstanceOf[IPageControlMembers]
  }
}

