package typings.xstyledSystem.mod

import typings.csstype.mod.GridTemplateAreasProperty
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridTemplateAreasProps extends js.Object {
  val gridTemplateAreas: js.UndefOr[ResponsiveValue[GridTemplateAreasProperty]] = js.undefined
}

object GridTemplateAreasProps {
  @scala.inline
  def apply(gridTemplateAreas: ResponsiveValue[GridTemplateAreasProperty] = null): GridTemplateAreasProps = {
    val __obj = js.Dynamic.literal()
    if (gridTemplateAreas != null) __obj.updateDynamic("gridTemplateAreas")(gridTemplateAreas.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridTemplateAreasProps]
  }
}

