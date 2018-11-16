package typings
package styledDashComponentsLib.styledDashComponentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ThemeProviderProps[T /* <: js.Object */] extends js.Object {
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactChild] = js.undefined
   // only one child is allowed, goes through React.Children.only
  var theme: T | (js.Function1[/* theme */ T, T])
}

