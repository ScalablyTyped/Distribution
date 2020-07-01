package typings.writeFileWebpackPlugin.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserOptionsType extends js.Object {
  /**
    * Atomically replace files content (i.e., to prevent programs like test watchers from seeing partial files).
    * @default true
    */
  var atomicReplace: js.UndefOr[Boolean] = js.undefined
  /**
    * Stop writing files on webpack errors
    * @default true
    */
  var exitOnErrors: js.UndefOr[Boolean] = js.undefined
  /**
    * Forces the execution of the plugin regardless of being using `webpack-dev-server` or not
    * @default false
    */
  var force: js.UndefOr[Boolean] = js.undefined
  /**
    * Logs names of the files that are being written (or skipped because they have not changed)
    * @default true
    */
  var log: js.UndefOr[Boolean] = js.undefined
  /**
    * A regular expression or function used to test if file should be written.
    * When not present, all bundle will be written.
    */
  var test: js.UndefOr[RegExp] = js.undefined
  /**
    * Use hash index to write only files that have changed since the last iteration.
    * @default true
    */
  var useHashIndex: js.UndefOr[Boolean] = js.undefined
}

object UserOptionsType {
  @scala.inline
  def apply(
    atomicReplace: js.UndefOr[Boolean] = js.undefined,
    exitOnErrors: js.UndefOr[Boolean] = js.undefined,
    force: js.UndefOr[Boolean] = js.undefined,
    log: js.UndefOr[Boolean] = js.undefined,
    test: RegExp = null,
    useHashIndex: js.UndefOr[Boolean] = js.undefined
  ): UserOptionsType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(atomicReplace)) __obj.updateDynamic("atomicReplace")(atomicReplace.get.asInstanceOf[js.Any])
    if (!js.isUndefined(exitOnErrors)) __obj.updateDynamic("exitOnErrors")(exitOnErrors.get.asInstanceOf[js.Any])
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.get.asInstanceOf[js.Any])
    if (!js.isUndefined(log)) __obj.updateDynamic("log")(log.get.asInstanceOf[js.Any])
    if (test != null) __obj.updateDynamic("test")(test.asInstanceOf[js.Any])
    if (!js.isUndefined(useHashIndex)) __obj.updateDynamic("useHashIndex")(useHashIndex.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserOptionsType]
  }
}

