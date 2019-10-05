package typings.tampermonkey

import org.scalablytyped.runtime.NumberDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("GM_getTabs")
@js.native
object GM_getTabs extends js.Object {
  /** Gets all tab objects as a hash to communicate with other script instances */
  def apply(callback: js.Function1[/* tabsMap */ NumberDictionary[js.Any], Unit]): Unit = js.native
}

