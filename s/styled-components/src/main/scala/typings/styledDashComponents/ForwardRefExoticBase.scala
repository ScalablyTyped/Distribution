package typings.styledDashComponents

import typings.std.Partial
import typings.styledDashComponents.styledDashComponentsStrings.defaultProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// abuse Pick to strip the call signature from ForwardRefExoticComponent
/* Inlined std.Pick<react.react.ForwardRefExoticComponent<P>, keyof react.react.ForwardRefExoticComponent<any>> */
trait ForwardRefExoticBase[P] extends js.Object {
  @JSName("$$typeof")
  var $$typeof: js.Symbol
  var defaultProps: js.UndefOr[Partial[typings.styledDashComponents.styledDashComponentsStrings.defaultProps]] = js.undefined
  var displayName: js.UndefOr[String] = js.undefined
}

object ForwardRefExoticBase {
  @scala.inline
  def apply[P]($$typeof: js.Symbol, defaultProps: Partial[defaultProps] = null, displayName: String = null): ForwardRefExoticBase[P] = {
    val __obj = js.Dynamic.literal($$typeof = $$typeof)
    if (defaultProps != null) __obj.updateDynamic("defaultProps")(defaultProps)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    __obj.asInstanceOf[ForwardRefExoticBase[P]]
  }
}

