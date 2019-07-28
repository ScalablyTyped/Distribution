package typings.styletronDashReact.styletronDashReactMod

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
  def apply(driver: StyletronDriver, getInitialStyle: StyletronGetInitialStyle, wrapper: StyletronWrapper): CreateStyledOptions = {
    val __obj = js.Dynamic.literal(driver = driver, getInitialStyle = getInitialStyle, wrapper = wrapper)
  
    __obj.asInstanceOf[CreateStyledOptions]
  }
}

