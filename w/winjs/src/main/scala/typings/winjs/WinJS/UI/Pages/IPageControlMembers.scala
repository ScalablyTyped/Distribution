package typings.winjs.WinJS.UI.Pages

import typings.std.HTMLElement
import typings.winjs.WinJS.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

//#region Interfaces
/**
  * Provides members for a PageControl. You implement this interface when defining a new PageControl.
  **/
@js.native
trait IPageControlMembers extends js.Object {
  
  //#region Methods
  /**
    * Called if any error occurs during the processing of the page.
    * @param err The error that occurred.
    * @returns Nothing if the error was handled, or an error promise if the error was not handled.
    **/
  var error: js.UndefOr[js.Function1[/* err */ js.Any, _]] = js.native
  
  /**
    * Initializes the control before the content of the control is set. Use the processed method for any initialization that should be done after the content of the control has been set.
    * @param element The DOM element that will contain all the content for the page.
    * @param options The options passed to the constructor of the page.
    * @returns A promise that is fulfilled when initialization is complete, if asynchronous processing is necessary. If not, returns nothing.
    **/
  var init: js.UndefOr[js.Function2[/* element */ HTMLElement, /* options */ js.Any, _]] = js.native
  
  /**
    * Creates DOM objects from the content in the specified URI. This method is called after the PageControl is defined and before the init method is called.
    * @param uri The URI from which to create DOM objects.
    * @returns A promise whose fulfilled value is the set of unparented DOM objects.
    **/
  var load: js.UndefOr[js.Function1[/* uri */ String, _]] = js.native
  
  /**
    * Initializes the control after the content of the control is set.
    * @param element The DOM element that will contain all the content for the page.
    * @param options The options that are to be passed to the constructor of the page.
    * @returns A promise that is fulfilled when initialization is complete, if asynchronous processing is necessary. If not, returns nothing.
    **/
  var processed: js.UndefOr[js.Function2[/* element */ HTMLElement, /* options */ js.Any, _]] = js.native
  
  /**
    * Called after all initialization and rendering is complete. At this time, the element is ready for use.
    * @param element The DOM element that contains all the content for the page.
    * @param options An object that contains one or more property/value pairs to apply to the PageControl. How these property/value pairs are used (or not used) depends on the implementation of that particular PageControl.
    * @returns A promise that is fulfilled when the element is ready for use, if asynchronous processing is necessary. If not, returns nothing.
    **/
  var ready: js.UndefOr[js.Function2[/* element */ HTMLElement, /* options */ js.Any, _]] = js.native
  
  /**
    * Takes the elements returned by the load method and attaches them to the specified element.
    * @param element The DOM element to which the loadResult elements are appended.
    * @param options An object that contains one or more property/value pairs to apply to the PageControl. How these property/value pairs are used (or not used) depends on the implementation of that particular PageControl.
    * @param loadResult A Promise that contains the elements returned from the load method.
    **/
  var render: js.UndefOr[
    js.Function3[/* element */ HTMLElement, /* options */ js.Any, /* loadResult */ Promise[_], Unit]
  ] = js.native
}
object IPageControlMembers {
  
  @scala.inline
  def apply(): IPageControlMembers = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPageControlMembers]
  }
  
  @scala.inline
  implicit class IPageControlMembersOps[Self <: IPageControlMembers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setError(value: /* err */ js.Any => _): Self = this.set("error", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setInit(value: (/* element */ HTMLElement, /* options */ js.Any) => _): Self = this.set("init", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteInit: Self = this.set("init", js.undefined)
    
    @scala.inline
    def setLoad(value: /* uri */ String => _): Self = this.set("load", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteLoad: Self = this.set("load", js.undefined)
    
    @scala.inline
    def setProcessed(value: (/* element */ HTMLElement, /* options */ js.Any) => _): Self = this.set("processed", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteProcessed: Self = this.set("processed", js.undefined)
    
    @scala.inline
    def setReady(value: (/* element */ HTMLElement, /* options */ js.Any) => _): Self = this.set("ready", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteReady: Self = this.set("ready", js.undefined)
    
    @scala.inline
    def setRender(value: (/* element */ HTMLElement, /* options */ js.Any, /* loadResult */ Promise[_]) => Unit): Self = this.set("render", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
  }
}
