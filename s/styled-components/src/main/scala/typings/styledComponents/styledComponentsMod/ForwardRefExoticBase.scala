package typings.styledComponents.styledComponentsMod

import typings.react.mod.WeakValidationMap
import typings.std.Partial
import typings.styledComponents.styledComponentsStrings.defaultProps
import typings.styledComponents.styledComponentsStrings.propTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// abuse Pick to strip the call signature from ForwardRefExoticComponent
/* Inlined std.Pick<react.react.ForwardRefExoticComponent<P>, keyof react.react.ForwardRefExoticComponent<any>> */
trait ForwardRefExoticBase[P] extends js.Object {
  @JSName("$$typeof")
  var DollarDollartypeof: js.Symbol
  var defaultProps: js.UndefOr[Partial[typings.styledComponents.styledComponentsStrings.defaultProps]] = js.undefined
  var displayName: js.UndefOr[String] = js.undefined
  var propTypes: js.UndefOr[WeakValidationMap[typings.styledComponents.styledComponentsStrings.propTypes]] = js.undefined
}

object ForwardRefExoticBase {
  @scala.inline
  def apply[P](
    DollarDollartypeof: js.Symbol,
    defaultProps: Partial[defaultProps] = null,
    displayName: String = null,
    propTypes: WeakValidationMap[propTypes] = null
  ): ForwardRefExoticBase[P] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("$$typeof")(DollarDollartypeof.asInstanceOf[js.Any])
    if (defaultProps != null) __obj.updateDynamic("defaultProps")(defaultProps.asInstanceOf[js.Any])
    if (displayName != null) __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    if (propTypes != null) __obj.updateDynamic("propTypes")(propTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForwardRefExoticBase[P]]
  }
}

