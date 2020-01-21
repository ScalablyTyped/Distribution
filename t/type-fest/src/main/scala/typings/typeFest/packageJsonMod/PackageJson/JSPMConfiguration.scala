package typings.typeFest.packageJsonMod.PackageJson

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JSPMConfiguration extends js.Object {
  /**
  		JSPM configuration.
  		*/
  var jspm: js.UndefOr[typings.typeFest.packageJsonMod.PackageJson] = js.undefined
}

object JSPMConfiguration {
  @scala.inline
  def apply(jspm: typings.typeFest.packageJsonMod.PackageJson = null): JSPMConfiguration = {
    val __obj = js.Dynamic.literal()
    if (jspm != null) __obj.updateDynamic("jspm")(jspm.asInstanceOf[js.Any])
    __obj.asInstanceOf[JSPMConfiguration]
  }
}

