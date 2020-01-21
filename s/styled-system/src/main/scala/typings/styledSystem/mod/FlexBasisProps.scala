package typings.styledSystem.mod

import typings.csstype.mod.FlexBasisProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FlexBasisProps[TLength] extends js.Object {
  // TODO: The FlexBasisValue currently really only exists for documentation
  //       purposes, because flex-basis also accepts `Nem` and `Npx` strings.
  //       Not sure there’s a way to still have the union values show up as
  //       auto-completion results.
  var flexBasis: js.UndefOr[ResponsiveValue[FlexBasisProperty[TLength]]] = js.undefined
}

object FlexBasisProps {
  @scala.inline
  def apply[TLength](flexBasis: ResponsiveValue[FlexBasisProperty[TLength]] = null): FlexBasisProps[TLength] = {
    val __obj = js.Dynamic.literal()
    if (flexBasis != null) __obj.updateDynamic("flexBasis")(flexBasis.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlexBasisProps[TLength]]
  }
}

