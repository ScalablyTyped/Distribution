package typings.typeDashFest.sourcePackageDashJsonMod.PackageJson

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSPMConfiguration extends js.Object {
  /**
  		JSPM configuration.
  		*/
  var jspm: js.UndefOr[typings.typeDashFest.sourcePackageDashJsonMod.PackageJson] = js.undefined
}

object JSPMConfiguration {
  @scala.inline
  def apply(jspm: typings.typeDashFest.sourcePackageDashJsonMod.PackageJson = null): JSPMConfiguration = {
    val __obj = js.Dynamic.literal()
    if (jspm != null) __obj.updateDynamic("jspm")(jspm)
    __obj.asInstanceOf[JSPMConfiguration]
  }
}

