package typings.xstyledSystem.mod

import typings.csstype.mod.FlexBasisProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlexBasisProps[TLength] extends js.Object {
  val flexBasis: js.UndefOr[ResponsiveValue[FlexBasisProperty[TLength]]] = js.undefined
}

object FlexBasisProps {
  @scala.inline
  def apply[TLength](flexBasis: ResponsiveValue[FlexBasisProperty[TLength]] = null): FlexBasisProps[TLength] = {
    val __obj = js.Dynamic.literal()
    if (flexBasis != null) __obj.updateDynamic("flexBasis")(flexBasis.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexBasisProps[TLength]]
  }
}

