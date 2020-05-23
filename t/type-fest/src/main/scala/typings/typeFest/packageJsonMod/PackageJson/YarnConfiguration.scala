package typings.typeFest.packageJsonMod.PackageJson

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait YarnConfiguration extends js.Object {
  /**
  		If your package only allows one version of a given dependency, and you’d like to enforce the same behavior as `yarn install --flat` on the command line, set this to `true`.
  		Note that if your `package.json` contains `"flat": true` and other packages depend on yours (e.g. you are building a library rather than an application), those other packages will also need `"flat": true` in their `package.json` or be installed with `yarn install --flat` on the command-line.
  		*/
  var flat: js.UndefOr[Boolean] = js.undefined
  /**
  		Selective version resolutions. Allows the definition of custom package versions inside dependencies without manual edits in the `yarn.lock` file.
  		*/
  var resolutions: js.UndefOr[Dependency] = js.undefined
}

object YarnConfiguration {
  @scala.inline
  def apply(flat: js.UndefOr[Boolean] = js.undefined, resolutions: Dependency = null): YarnConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(flat)) __obj.updateDynamic("flat")(flat.get.asInstanceOf[js.Any])
    if (resolutions != null) __obj.updateDynamic("resolutions")(resolutions.asInstanceOf[js.Any])
    __obj.asInstanceOf[YarnConfiguration]
  }
}

