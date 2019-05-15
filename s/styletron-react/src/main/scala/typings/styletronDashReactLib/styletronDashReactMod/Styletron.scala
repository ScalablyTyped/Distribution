package typings
package styletronDashReactLib.styletronDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Styletron extends js.Object {
  var base: StyletronBase = js.native
  var debug: js.UndefOr[styletronDashReactLib.Anon_StackIndex] = js.native
  @JSName("driver")
  var driver_Original: StyletronDriver = js.native
  @JSName("getInitialStyle")
  var getInitialStyle_Original: StyletronGetInitialStyle = js.native
  var reducers: js.Array[ReducerContainer] = js.native
  @JSName("wrapper")
  var wrapper_Original: StyletronWrapper = js.native
  def driver(
    style: styletronDashStandardLib.styletronDashStandardMod.StyleObject,
    styletron: styletronDashStandardLib.styletronDashStandardMod.StandardEngine
  ): java.lang.String = js.native
  def getInitialStyle(): styletronDashStandardLib.styletronDashStandardMod.StyleObject = js.native
  def wrapper(fc: reactLib.reactMod.FC[_]): reactLib.reactMod.ComponentType[_] = js.native
}

