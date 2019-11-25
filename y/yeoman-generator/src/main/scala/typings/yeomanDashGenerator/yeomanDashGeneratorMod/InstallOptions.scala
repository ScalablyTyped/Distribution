package typings.yeomanDashGenerator.yeomanDashGeneratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstallOptions extends js.Object {
  /**
    * whether to run `bower install` or can be options to pass to `dargs` as arguments
    */
  var bower: js.UndefOr[Boolean | js.Object] = js.undefined
  /**
    * whether to run `npm install` or can be options to pass to `dargs` as arguments
    */
  var npm: js.UndefOr[Boolean | js.Object] = js.undefined
  /**
    * whether to log the used commands
    */
  var skipMessage: js.UndefOr[Boolean] = js.undefined
  /**
    * whether to run `yarn install` or can be options to pass to `dargs` as arguments
    */
  var yarn: js.UndefOr[Boolean | js.Object] = js.undefined
}

object InstallOptions {
  @scala.inline
  def apply(
    bower: Boolean | js.Object = null,
    npm: Boolean | js.Object = null,
    skipMessage: js.UndefOr[Boolean] = js.undefined,
    yarn: Boolean | js.Object = null
  ): InstallOptions = {
    val __obj = js.Dynamic.literal()
    if (bower != null) __obj.updateDynamic("bower")(bower.asInstanceOf[js.Any])
    if (npm != null) __obj.updateDynamic("npm")(npm.asInstanceOf[js.Any])
    if (!js.isUndefined(skipMessage)) __obj.updateDynamic("skipMessage")(skipMessage.asInstanceOf[js.Any])
    if (yarn != null) __obj.updateDynamic("yarn")(yarn.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstallOptions]
  }
}

