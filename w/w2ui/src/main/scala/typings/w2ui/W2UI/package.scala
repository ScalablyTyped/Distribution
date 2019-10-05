package typings.w2ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object W2UI {
  import org.scalablytyped.runtime.StringDictionary

  type W2EventHandler = (js.Function1[/* e */ W2Event, Unit]) | (js.Function2[/* id */ String, /* e */ W2Event, Unit])
  type W2Grid = W2Grid_
  /* Rewritten from type alias, can be one of: 
    - typings.w2ui.W2UI.W2Layout
    - typings.w2ui.W2UI.W2Grid
    - typings.w2ui.W2UI.W2Toolbar
    - typings.w2ui.W2UI.W2Sidebar
    - typings.w2ui.W2UI.W2Tabs
    - typings.w2ui.W2UI.W2Form
    - typings.w2ui.W2UI.W2Popup
  */
  type W2Object = _W2Object | W2Grid
  type W2UI = // morally, [s: string]<T extends W2Common>: T;
  StringDictionary[js.Any]
}
