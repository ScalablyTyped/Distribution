package typings.tampermonkey

import typings.tampermonkey.Tampermonkey.OpenTabObject
import typings.tampermonkey.Tampermonkey.OpenTabOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GM_openInTab")
@js.native
object GM_openInTab extends js.Object {
  /**
    * Opens a new tab with this url.
    * The options object can have the following properties:
    * - `active` decides whether the new tab should be focused,
    * - `insert` that inserts the new tab after the current one and
    * - `setParent` makes the browser re-focus the current tab on close.
    *
    * Otherwise the new tab is just appended.
    * If `options` is boolean (loadInBackground) it has the opposite meaning of
    * active and was added to achieve Greasemonkey 3.x compatibility.
    *
    * If neither active nor loadInBackground is given, then the tab will not be
    * focused.
    * @returns Object with the function `close`, the listener `onclosed` and a flag
    * called `closed`.
    */
  def apply(url: String): OpenTabObject = js.native
  def apply(url: String, options: Boolean): OpenTabObject = js.native
  def apply(url: String, options: OpenTabOptions): OpenTabObject = js.native
}

