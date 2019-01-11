package typings
package winjsLib.WinJSNs.UINs.PagesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WinJS.UI.Pages")
@js.native
object ^ extends js.Object {
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
  def define(uri: java.lang.String, members: winjsLib.WinJSNs.UINs.PagesNs.IPageControlMembers): js.Function4[
    /* element */ js.UndefOr[stdLib.HTMLElement], 
    /* options */ js.UndefOr[js.Any], 
    /* complete */ js.UndefOr[js.Function1[/* page */ js.Any, scala.Unit]], 
    /* parentedPromise */ js.UndefOr[winjsLib.WinJSNs.Promise[_]], 
    scala.Unit
  ] = js.native
  /**
    * Gets an already-defined page control for the specified URI, or creates a new one.
    * @param uri The URI for the content that defines the page.
    * @returns A constructor function that creates the page.
    **/
  def get(uri: java.lang.String): js.Function4[
    /* element */ js.UndefOr[stdLib.HTMLElement], 
    /* options */ js.UndefOr[js.Any], 
    /* complete */ js.UndefOr[js.Function1[/* page */ js.Any, scala.Unit]], 
    /* parentedPromise */ js.UndefOr[winjsLib.WinJSNs.Promise[_]], 
    scala.Unit
  ] = js.native
  /**
    * Creates a PageControl from the specified URI and inserts it inside the specified element.
    * @param uri The URI for the content that defines the page.
    * @param element The DOM element to which the PageControl is appended.
    * @param options An object that contains one or more property/value pairs to apply to the new PageControl. How these property/value pairs are used (or not used) depends on the implementation of that particular PageControl.
    * @param parentedPromise A Promise that is fulfilled when the new PageControl is done rendering and its contents becomes the child of element.
    * @returns A promise that is fulfilled when rendering is complete, if asynchronous processing is necessary. If not, returns nothing.
    **/
  def render(uri: java.lang.String): winjsLib.WinJSNs.Promise[_] = js.native
  def render(uri: java.lang.String, element: stdLib.HTMLElement): winjsLib.WinJSNs.Promise[_] = js.native
  def render(uri: java.lang.String, element: stdLib.HTMLElement, options: js.Any): winjsLib.WinJSNs.Promise[_] = js.native
  def render(
    uri: java.lang.String,
    element: stdLib.HTMLElement,
    options: js.Any,
    parentedPromise: winjsLib.WinJSNs.Promise[_]
  ): winjsLib.WinJSNs.Promise[_] = js.native
}

