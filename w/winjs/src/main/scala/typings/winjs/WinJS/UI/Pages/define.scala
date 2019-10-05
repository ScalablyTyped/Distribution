package typings.winjs.WinJS.UI.Pages

import typings.std.HTMLElement
import typings.winjs.WinJS.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WinJS.UI.Pages.define")
@js.native
object define extends js.Object {
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
  def apply(uri: String, members: IPageControlMembers): js.Function4[
    /* element */ js.UndefOr[HTMLElement], 
    /* options */ js.UndefOr[js.Any], 
    /* complete */ js.UndefOr[js.Function1[/* page */ js.Any, Unit]], 
    /* parentedPromise */ js.UndefOr[Promise[_]], 
    Unit
  ] = js.native
}

