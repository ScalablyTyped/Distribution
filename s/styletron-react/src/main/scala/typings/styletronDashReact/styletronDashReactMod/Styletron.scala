package typings.styletronDashReact.styletronDashReactMod

import typings.styletronDashReact.Anon_StackIndex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Styletron extends js.Object {
  var base: StyletronBase
  var debug: js.UndefOr[Anon_StackIndex] = js.undefined
  var driver: StyletronDriver
  var getInitialStyle: StyletronGetInitialStyle
  var reducers: js.Array[ReducerContainer]
  var wrapper: StyletronWrapper
}

object Styletron {
  @scala.inline
  def apply(
    base: StyletronBase,
    driver: StyletronDriver,
    getInitialStyle: StyletronGetInitialStyle,
    reducers: js.Array[ReducerContainer],
    wrapper: StyletronWrapper,
    debug: Anon_StackIndex = null
  ): Styletron = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], driver = driver, getInitialStyle = getInitialStyle, reducers = reducers, wrapper = wrapper)
    if (debug != null) __obj.updateDynamic("debug")(debug)
    __obj.asInstanceOf[Styletron]
  }
}

