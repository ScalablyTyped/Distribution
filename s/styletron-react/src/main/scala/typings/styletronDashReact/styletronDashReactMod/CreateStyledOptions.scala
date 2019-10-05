package typings.styletronDashReact.styletronDashReactMod

import typings.react.reactMod.ComponentType
import typings.react.reactMod.FC
import typings.styletronDashStandard.styletronDashStandardMod.StandardEngine
import typings.styletronDashStandard.styletronDashStandardMod.StyleObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateStyledOptions extends js.Object {
  var driver: StyletronDriver
  var getInitialStyle: StyletronGetInitialStyle
  var wrapper: StyletronWrapper
}

object CreateStyledOptions {
  @scala.inline
  def apply(
    driver: (/* style */ StyleObject, /* styletron */ StandardEngine) => String,
    getInitialStyle: () => StyleObject,
    wrapper: /* fc */ FC[js.Any] => ComponentType[js.Any]
  ): CreateStyledOptions = {
    val __obj = js.Dynamic.literal(driver = js.Any.fromFunction2(driver), getInitialStyle = js.Any.fromFunction0(getInitialStyle), wrapper = js.Any.fromFunction1(wrapper))
  
    __obj.asInstanceOf[CreateStyledOptions]
  }
}

