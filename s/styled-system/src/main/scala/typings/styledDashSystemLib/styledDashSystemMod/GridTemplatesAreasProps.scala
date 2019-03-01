package typings
package styledDashSystemLib.styledDashSystemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridTemplatesAreasProps extends js.Object {
  /**
    * The grid-template-areas CSS property specifies named grid areas.
    *
    * [MDN reference](https://developer.mozilla.org/en-US/docs/Web/CSS/grid-template-areas)
    */
  var gridTemplateAreas: js.UndefOr[ResponsiveValue[csstypeLib.csstypeMod.GridTemplateAreasProperty]] = js.undefined
}

object GridTemplatesAreasProps {
  @scala.inline
  def apply(gridTemplateAreas: ResponsiveValue[csstypeLib.csstypeMod.GridTemplateAreasProperty] = null): GridTemplatesAreasProps = {
    val __obj = js.Dynamic.literal()
    if (gridTemplateAreas != null) __obj.updateDynamic("gridTemplateAreas")(gridTemplateAreas.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridTemplatesAreasProps]
  }
}

