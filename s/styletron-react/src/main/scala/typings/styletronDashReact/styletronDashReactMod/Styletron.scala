package typings.styletronDashReact.styletronDashReactMod

import typings.react.reactMod.ComponentType
import typings.react.reactMod.FC
import typings.styletronDashReact.Anon_StackIndex
import typings.styletronDashStandard.styletronDashStandardMod.StandardEngine
import typings.styletronDashStandard.styletronDashStandardMod.StyleObject
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
    driver: (/* style */ StyleObject, /* styletron */ StandardEngine) => String,
    getInitialStyle: () => StyleObject,
    reducers: js.Array[ReducerContainer],
    wrapper: /* fc */ FC[js.Any] => ComponentType[js.Any],
    debug: Anon_StackIndex = null
  ): Styletron = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], driver = js.Any.fromFunction2(driver), getInitialStyle = js.Any.fromFunction0(getInitialStyle), reducers = reducers, wrapper = js.Any.fromFunction1(wrapper))
    if (debug != null) __obj.updateDynamic("debug")(debug)
    __obj.asInstanceOf[Styletron]
  }
}

