package typings.yeomanGenerator.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstallOptions extends js.Object {
  /**
    * whether to run `bower install` or can be options to pass to `dargs` as arguments
    */
  var bower: js.UndefOr[Boolean | js.Object] = js.native
  /**
    * whether to run `npm install` or can be options to pass to `dargs` as arguments
    */
  var npm: js.UndefOr[Boolean | js.Object] = js.native
  /**
    * whether to log the used commands
    */
  var skipMessage: js.UndefOr[Boolean] = js.native
  /**
    * whether to run `yarn install` or can be options to pass to `dargs` as arguments
    */
  var yarn: js.UndefOr[Boolean | js.Object] = js.native
}

object InstallOptions {
  @scala.inline
  def apply(): InstallOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstallOptions]
  }
  @scala.inline
  implicit class InstallOptionsOps[Self <: InstallOptions] (val x: Self) extends AnyVal {
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
    def setBower(value: Boolean | js.Object): Self = this.set("bower", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBower: Self = this.set("bower", js.undefined)
    @scala.inline
    def setNpm(value: Boolean | js.Object): Self = this.set("npm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNpm: Self = this.set("npm", js.undefined)
    @scala.inline
    def setSkipMessage(value: Boolean): Self = this.set("skipMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSkipMessage: Self = this.set("skipMessage", js.undefined)
    @scala.inline
    def setYarn(value: Boolean | js.Object): Self = this.set("yarn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYarn: Self = this.set("yarn", js.undefined)
  }
  
}

