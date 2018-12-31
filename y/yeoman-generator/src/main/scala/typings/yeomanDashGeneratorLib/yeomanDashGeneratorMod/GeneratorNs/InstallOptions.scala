package typings
package yeomanDashGeneratorLib.yeomanDashGeneratorMod.GeneratorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstallOptions extends js.Object {
  /**
    * whether to run `bower install` or can be options to pass to `dargs` as arguments
    */
  var bower: js.UndefOr[scala.Boolean | js.Object] = js.undefined
  /**
    * whether to run `npm install` or can be options to pass to `dargs` as arguments
    */
  var npm: js.UndefOr[scala.Boolean | js.Object] = js.undefined
  /**
    * whether to log the used commands
    */
  var skipMessage: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * whether to run `yarn install` or can be options to pass to `dargs` as arguments
    */
  var yarn: js.UndefOr[scala.Boolean | js.Object] = js.undefined
}

