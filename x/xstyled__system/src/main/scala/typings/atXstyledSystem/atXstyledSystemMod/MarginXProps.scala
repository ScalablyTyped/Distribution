package typings.atXstyledSystem.atXstyledSystemMod

import typings.csstype.csstypeMod.MarginLeftProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarginXProps[TLength] extends js.Object {
  val mx: js.UndefOr[ResponsiveValue[MarginLeftProperty[TLength]]] = js.undefined
}

object MarginXProps {
  @scala.inline
  def apply[TLength](mx: ResponsiveValue[MarginLeftProperty[TLength]] = null): MarginXProps[TLength] = {
    val __obj = js.Dynamic.literal()
    if (mx != null) __obj.updateDynamic("mx")(mx.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarginXProps[TLength]]
  }
}

