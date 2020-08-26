package typings.typeFest.packageJsonMod.PackageJson

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JSPMConfiguration extends js.Object {
  /**
  		JSPM configuration.
  		*/
  var jspm: js.UndefOr[typings.typeFest.packageJsonMod.PackageJson] = js.native
}

object JSPMConfiguration {
  @scala.inline
  def apply(): JSPMConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JSPMConfiguration]
  }
  @scala.inline
  implicit class JSPMConfigurationOps[Self <: JSPMConfiguration] (val x: Self) extends AnyVal {
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
    def setJspm(value: typings.typeFest.packageJsonMod.PackageJson): Self = this.set("jspm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJspm: Self = this.set("jspm", js.undefined)
  }
  
}

