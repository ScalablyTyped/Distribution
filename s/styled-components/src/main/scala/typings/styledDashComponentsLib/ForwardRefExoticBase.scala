package typings
package styledDashComponentsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// abuse Pick to strip the call signature from ForwardRefExoticComponent
/* Inlined std.Pick<react.react.ForwardRefExoticComponent<P>, keyof react.react.ForwardRefExoticComponent<any>> */
trait ForwardRefExoticBase[P] extends js.Object {
  @JSName("$$typeof")
  var $$typeof: js.Symbol
  var defaultProps: js.UndefOr[
    stdLib.Partial[styledDashComponentsLib.styledDashComponentsLibStrings.defaultProps]
  ] = js.undefined
  var displayName: js.UndefOr[java.lang.String] = js.undefined
}

object ForwardRefExoticBase {
  @scala.inline
  def apply[P](
    $$typeof: js.Symbol,
    defaultProps: stdLib.Partial[styledDashComponentsLib.styledDashComponentsLibStrings.defaultProps] = null,
    displayName: java.lang.String = null
  ): ForwardRefExoticBase[P] = {
    val __obj = js.Dynamic.literal($$typeof = $$typeof)
    if (defaultProps != null) __obj.updateDynamic("defaultProps")(defaultProps)
    if (displayName != null) __obj.updateDynamic("displayName")(displayName)
    __obj.asInstanceOf[ForwardRefExoticBase[P]]
  }
}

