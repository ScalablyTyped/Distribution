package typings.winjs.WinJS.UI

import typings.std.HTMLElement
import typings.winjs.WinJS.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides functions to load HTML content programmatically.
**/
@JSGlobal("WinJS.UI.Fragments")
@js.native
object Fragments extends js.Object {
  //#region Functions
  /**
    * Starts loading the fragment at the specified location. The returned promise completes when the fragment is ready to be copied.
    * @param href The URI that contains the fragment to be copied.
    * @returns A promise that is fulfilled when the fragment has been prepared for copying.
    **/
  def cache(href: String): Promise[_] = js.native
  /**
    * Removes any cached information about the specified fragment. This method does not unload any scripts or styles that are referenced by the fragment.
    * @param href The URI that contains the fragment to be cleared. If no URI is provided, the entire contents of the cache are cleared.
    **/
  def clearCache(href: String): Unit = js.native
  def clearCache(href: HTMLElement): Unit = js.native
  /**
    * Loads the contents of the specified URI into the specified element without copying it.
    * @param href The URI that contains the fragment to copy.
    * @param element Optional. The element to which the fragment is appended.
    * @returns A promise that is fulfilled when the fragment has been loaded. If a target element is not specified, the copied fragment is the completed value. The element is not added to the cache. See also rendercopy, where the element is added to the cache.
    **/
  def render(href: String): Promise[HTMLElement] = js.native
  def render(href: String, element: HTMLElement): Promise[HTMLElement] = js.native
  /**
    * Loads and copies the contents of the specified URI into the specified element.
    * @param href The URI that contains the fragment to copy.
    * @param target The element to which the fragment is appended.
    * @returns A promise that is fulfilled when the fragment has been loaded. If a target element is not specified, the copied fragment is the completed value. The fragment is added to the cache. See also render, where the element is not added to the cache.
    **/
  def renderCopy(href: String): Promise[HTMLElement] = js.native
  def renderCopy(href: String, target: HTMLElement): Promise[HTMLElement] = js.native
  def renderCopy(href: HTMLElement): Promise[HTMLElement] = js.native
  def renderCopy(href: HTMLElement, target: HTMLElement): Promise[HTMLElement] = js.native
}

