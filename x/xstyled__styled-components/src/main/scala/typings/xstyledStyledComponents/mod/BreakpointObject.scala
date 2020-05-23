package typings.xstyledStyledComponents.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {[ Key in keyof @xstyled/styled-components.@xstyled/styled-components.Breakpoints ]:? ArgType} */
trait BreakpointObject[ArgType] extends js.Object {
  var lg: js.UndefOr[ArgType] = js.undefined
  var md: js.UndefOr[ArgType] = js.undefined
  var sm: js.UndefOr[ArgType] = js.undefined
  var xl: js.UndefOr[ArgType] = js.undefined
  var xs: js.UndefOr[ArgType] = js.undefined
}

object BreakpointObject {
  @scala.inline
  def apply[ArgType](lg: ArgType = null, md: ArgType = null, sm: ArgType = null, xl: ArgType = null, xs: ArgType = null): BreakpointObject[ArgType] = {
    val __obj = js.Dynamic.literal()
    if (lg != null) __obj.updateDynamic("lg")(lg.asInstanceOf[js.Any])
    if (md != null) __obj.updateDynamic("md")(md.asInstanceOf[js.Any])
    if (sm != null) __obj.updateDynamic("sm")(sm.asInstanceOf[js.Any])
    if (xl != null) __obj.updateDynamic("xl")(xl.asInstanceOf[js.Any])
    if (xs != null) __obj.updateDynamic("xs")(xs.asInstanceOf[js.Any])
    __obj.asInstanceOf[BreakpointObject[ArgType]]
  }
}

