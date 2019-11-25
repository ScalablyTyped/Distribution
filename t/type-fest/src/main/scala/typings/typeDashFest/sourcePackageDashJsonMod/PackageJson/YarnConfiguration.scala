package typings.typeDashFest.sourcePackageDashJsonMod.PackageJson

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YarnConfiguration extends js.Object {
  /**
  		Selective version resolutions. Allows the definition of custom package versions inside dependencies without manual edits in the `yarn.lock` file.
  		*/
  var resolutions: js.UndefOr[Dependency] = js.undefined
}

object YarnConfiguration {
  @scala.inline
  def apply(resolutions: Dependency = null): YarnConfiguration = {
    val __obj = js.Dynamic.literal()
    if (resolutions != null) __obj.updateDynamic("resolutions")(resolutions.asInstanceOf[js.Any])
    __obj.asInstanceOf[YarnConfiguration]
  }
}

