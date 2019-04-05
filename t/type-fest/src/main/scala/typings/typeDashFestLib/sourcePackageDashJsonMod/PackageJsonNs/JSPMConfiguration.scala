package typings
package typeDashFestLib.sourcePackageDashJsonMod.PackageJsonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSPMConfiguration extends js.Object {
  /**
  		JSPM configuration.
  		*/
  var jspm: js.UndefOr[typeDashFestLib.sourcePackageDashJsonMod.PackageJson] = js.undefined
}

object JSPMConfiguration {
  @scala.inline
  def apply(jspm: typeDashFestLib.sourcePackageDashJsonMod.PackageJson = null): JSPMConfiguration = {
    val __obj = js.Dynamic.literal()
    if (jspm != null) __obj.updateDynamic("jspm")(jspm)
    __obj.asInstanceOf[JSPMConfiguration]
  }
}

