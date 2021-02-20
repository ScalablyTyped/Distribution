package typings.winjs.global.WinJS.UI

import typings.std.HTMLElement
import typings.winjs.WinJS.Promise
import typings.winjs.WinJS.UI.Pages.IPageControlMembers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides methods for defining and displaying PageControl objects.
**/
object Pages {
  
  //#endregion Interfaces
  //#region Objects
  //#endregion Objects
  //#region Functions
  /**
    * Creates a new PageControl from the specified URI that contains the specified members. Multiple calls to this method for the same URI are allowed, and all members will be merged.
    * @param uri The URI for the content that defines the page.
    * @param members An object that defines the members that the control will have.
    * @returns A constructor function that creates the PageControl.
    **/
  @JSGlobal("WinJS.UI.Pages.define")
  @js.native
  def define(uri: String, members: IPageControlMembers): js.Function4[
    /* element */ js.UndefOr[HTMLElement], 
    /* options */ js.UndefOr[js.Any], 
    /* complete */ js.UndefOr[js.Function1[/* page */ js.Any, Unit]], 
    /* parentedPromise */ js.UndefOr[Promise[_]], 
    Unit
  ] = js.native
  
  /**
    * Gets an already-defined page control for the specified URI, or creates a new one.
    * @param uri The URI for the content that defines the page.
    * @returns A constructor function that creates the page.
    **/
  @JSGlobal("WinJS.UI.Pages.get")
  @js.native
  def get(uri: String): js.Function4[
    /* element */ js.UndefOr[HTMLElement], 
    /* options */ js.UndefOr[js.Any], 
    /* complete */ js.UndefOr[js.Function1[/* page */ js.Any, Unit]], 
    /* parentedPromise */ js.UndefOr[Promise[_]], 
    Unit
  ] = js.native
  
  /**
    * Creates a PageControl from the specified URI and inserts it inside the specified element.
    * @param uri The URI for the content that defines the page.
    * @param element The DOM element to which the PageControl is appended.
    * @param options An object that contains one or more property/value pairs to apply to the new PageControl. How these property/value pairs are used (or not used) depends on the implementation of that particular PageControl.
    * @param parentedPromise A Promise that is fulfilled when the new PageControl is done rendering and its contents becomes the child of element.
    * @returns A promise that is fulfilled when rendering is complete, if asynchronous processing is necessary. If not, returns nothing.
    **/
  @JSGlobal("WinJS.UI.Pages.render")
  @js.native
  def render(uri: String): Promise[_] = js.native
  @JSGlobal("WinJS.UI.Pages.render")
  @js.native
  def render(
    uri: String,
    element: js.UndefOr[scala.Nothing],
    options: js.UndefOr[scala.Nothing],
    parentedPromise: Promise[_]
  ): Promise[_] = js.native
  @JSGlobal("WinJS.UI.Pages.render")
  @js.native
  def render(uri: String, element: js.UndefOr[scala.Nothing], options: js.Any): Promise[_] = js.native
  @JSGlobal("WinJS.UI.Pages.render")
  @js.native
  def render(uri: String, element: js.UndefOr[scala.Nothing], options: js.Any, parentedPromise: Promise[_]): Promise[_] = js.native
  @JSGlobal("WinJS.UI.Pages.render")
  @js.native
  def render(uri: String, element: HTMLElement): Promise[_] = js.native
  @JSGlobal("WinJS.UI.Pages.render")
  @js.native
  def render(uri: String, element: HTMLElement, options: js.UndefOr[scala.Nothing], parentedPromise: Promise[_]): Promise[_] = js.native
  @JSGlobal("WinJS.UI.Pages.render")
  @js.native
  def render(uri: String, element: HTMLElement, options: js.Any): Promise[_] = js.native
  @JSGlobal("WinJS.UI.Pages.render")
  @js.native
  def render(uri: String, element: HTMLElement, options: js.Any, parentedPromise: Promise[_]): Promise[_] = js.native
}
