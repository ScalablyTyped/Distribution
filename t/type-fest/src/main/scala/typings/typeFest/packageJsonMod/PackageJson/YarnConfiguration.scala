package typings.typeFest.packageJsonMod.PackageJson

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait YarnConfiguration extends js.Object {
  /**
  		If your package only allows one version of a given dependency, and you’d like to enforce the same behavior as `yarn install --flat` on the command line, set this to `true`.
  		Note that if your `package.json` contains `"flat": true` and other packages depend on yours (e.g. you are building a library rather than an application), those other packages will also need `"flat": true` in their `package.json` or be installed with `yarn install --flat` on the command-line.
  		*/
  var flat: js.UndefOr[Boolean] = js.native
  /**
  		Selective version resolutions. Allows the definition of custom package versions inside dependencies without manual edits in the `yarn.lock` file.
  		*/
  var resolutions: js.UndefOr[Dependency] = js.native
}

object YarnConfiguration {
  @scala.inline
  def apply(): YarnConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[YarnConfiguration]
  }
  @scala.inline
  implicit class YarnConfigurationOps[Self <: YarnConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFlat(value: Boolean): Self = this.set("flat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlat: Self = this.set("flat", js.undefined)
    @scala.inline
    def setResolutions(value: Dependency): Self = this.set("resolutions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolutions: Self = this.set("resolutions", js.undefined)
  }
  
}

