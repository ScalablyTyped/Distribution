package typings.w2ui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object W2UI_ {
  type W2EventHandler = (js.Function1[/* e */ typings.w2ui.W2UI_.W2Event, scala.Unit]) | (js.Function2[/* id */ java.lang.String, /* e */ typings.w2ui.W2UI_.W2Event, scala.Unit])
  type W2Grid = typings.w2ui.W2UI_.W2Grid_
  /* Rewritten from type alias, can be one of: 
    - typings.w2ui.W2UI_.W2Layout
    - typings.w2ui.W2UI_.W2Grid
    - typings.w2ui.W2UI_.W2Toolbar
    - typings.w2ui.W2UI_.W2Sidebar
    - typings.w2ui.W2UI_.W2Tabs
    - typings.w2ui.W2UI_.W2Form
    - typings.w2ui.W2UI_.W2Popup
  */
  type W2Object = typings.w2ui.W2UI_._W2Object | typings.w2ui.W2UI_.W2Grid
  type W2UI = // morally, [s: string]<T extends W2Common>: T;
  org.scalablytyped.runtime.StringDictionary[js.Any]
}
