package typings
package winjsLib.WinJSNs.UINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides functions to load HTML content programmatically.
**/
@JSGlobal("WinJS.UI.Fragments")
@js.native
object FragmentsNs extends js.Object {
  //#region Functions
  /**
    * Starts loading the fragment at the specified location. The returned promise completes when the fragment is ready to be copied.
    * @param href The URI that contains the fragment to be copied.
    * @returns A promise that is fulfilled when the fragment has been prepared for copying.
    **/
  def cache(href: java.lang.String): winjsLib.WinJSNs.Promise[_] = js.native
  /**
    * Removes any cached information about the specified fragment. This method does not unload any scripts or styles that are referenced by the fragment.
    * @param href The URI that contains the fragment to be cleared. If no URI is provided, the entire contents of the cache are cleared.
    **/
  def clearCache(href: java.lang.String): scala.Unit = js.native
  def clearCache(href: stdLib.HTMLElement): scala.Unit = js.native
  /**
    * Loads the contents of the specified URI into the specified element without copying it.
    * @param href The URI that contains the fragment to copy.
    * @param element Optional. The element to which the fragment is appended.
    * @returns A promise that is fulfilled when the fragment has been loaded. If a target element is not specified, the copied fragment is the completed value. The element is not added to the cache. See also rendercopy, where the element is added to the cache.
    **/
  def render(href: java.lang.String): winjsLib.WinJSNs.Promise[stdLib.HTMLElement] = js.native
  def render(href: java.lang.String, element: stdLib.HTMLElement): winjsLib.WinJSNs.Promise[stdLib.HTMLElement] = js.native
  /**
    * Loads and copies the contents of the specified URI into the specified element.
    * @param href The URI that contains the fragment to copy.
    * @param target The element to which the fragment is appended.
    * @returns A promise that is fulfilled when the fragment has been loaded. If a target element is not specified, the copied fragment is the completed value. The fragment is added to the cache. See also render, where the element is not added to the cache.
    **/
  def renderCopy(href: java.lang.String): winjsLib.WinJSNs.Promise[stdLib.HTMLElement] = js.native
  def renderCopy(href: java.lang.String, target: stdLib.HTMLElement): winjsLib.WinJSNs.Promise[stdLib.HTMLElement] = js.native
  def renderCopy(href: stdLib.HTMLElement): winjsLib.WinJSNs.Promise[stdLib.HTMLElement] = js.native
  def renderCopy(href: stdLib.HTMLElement, target: stdLib.HTMLElement): winjsLib.WinJSNs.Promise[stdLib.HTMLElement] = js.native
}

