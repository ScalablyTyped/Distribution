package typings.styledSystem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShadowProps[ThemeType /* <: Theme[TLengthStyledSystem] */]
  extends BoxShadowProps[ThemeType]
     with TextShadowProps[ThemeType]

object ShadowProps {
  @scala.inline
  def apply[/* <: typings.styledSystem.mod.Theme[typings.styledSystem.mod.TLengthStyledSystem] */ ThemeType](): ShadowProps[ThemeType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShadowProps[ThemeType]]
  }
}

