package typings
package styletronDashReactLib.styletronDashReactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateStyledOptions extends js.Object {
  @JSName("driver")
  var driver_Original: StyletronDriver = js.native
  @JSName("getInitialStyle")
  var getInitialStyle_Original: StyletronGetInitialStyle = js.native
  @JSName("wrapper")
  var wrapper_Original: StyletronWrapper = js.native
  def driver(
    style: styletronDashStandardLib.styletronDashStandardMod.StyleObject,
    styletron: styletronDashStandardLib.styletronDashStandardMod.StandardEngine
  ): java.lang.String = js.native
  def getInitialStyle(): styletronDashStandardLib.styletronDashStandardMod.StyleObject = js.native
  def wrapper(fc: reactLib.reactMod.FC[_]): reactLib.reactMod.ComponentType[_] = js.native
}

