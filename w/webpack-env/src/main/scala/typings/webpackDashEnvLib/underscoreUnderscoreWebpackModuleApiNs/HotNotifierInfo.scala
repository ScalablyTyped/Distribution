package typings
package webpackDashEnvLib.underscoreUnderscoreWebpackModuleApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HotNotifierInfo extends js.Object {
  /**
    * For declined/accepted/unaccepted: the chain from where the update was propagated.
    */
  var chain: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /**
    * For errors: the module id owning the accept handler.
    */
  var dependencyId: js.UndefOr[scala.Double] = js.undefined
  /**
    * For errors: the thrown error
    */
  var error: js.UndefOr[nodeLib.Error] = js.undefined
  /**
    * The module in question.
    */
  var moduleId: scala.Double
  /**
    * For self-accept-error-handler-errored: the error thrown by the module
    * before the error handler tried to handle it.
    */
  var originalError: js.UndefOr[nodeLib.Error] = js.undefined
  /**
    * For accepted: The location of accept handlers that will handle the update
    */
  var outdatedDependencies: js.UndefOr[org.scalablytyped.runtime.NumberDictionary[js.Array[scala.Double]]] = js.undefined
  /**
    * For accepted: the modules that are outdated and will be disposed
    */
  var outdatedModules: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /**
    * For declined: the module id of the declining parent
    */
  var parentId: js.UndefOr[scala.Double] = js.undefined
  var `type`: webpackDashEnvLib.webpackDashEnvLibStrings.`self-declined` | webpackDashEnvLib.webpackDashEnvLibStrings.declined | webpackDashEnvLib.webpackDashEnvLibStrings.unaccepted | webpackDashEnvLib.webpackDashEnvLibStrings.accepted | webpackDashEnvLib.webpackDashEnvLibStrings.disposed | webpackDashEnvLib.webpackDashEnvLibStrings.`accept-errored` | webpackDashEnvLib.webpackDashEnvLibStrings.`self-accept-errored` | webpackDashEnvLib.webpackDashEnvLibStrings.`self-accept-error-handler-errored`
}

object HotNotifierInfo {
  @scala.inline
  def apply(
    moduleId: scala.Double,
    `type`: webpackDashEnvLib.webpackDashEnvLibStrings.`self-declined` | webpackDashEnvLib.webpackDashEnvLibStrings.declined | webpackDashEnvLib.webpackDashEnvLibStrings.unaccepted | webpackDashEnvLib.webpackDashEnvLibStrings.accepted | webpackDashEnvLib.webpackDashEnvLibStrings.disposed | webpackDashEnvLib.webpackDashEnvLibStrings.`accept-errored` | webpackDashEnvLib.webpackDashEnvLibStrings.`self-accept-errored` | webpackDashEnvLib.webpackDashEnvLibStrings.`self-accept-error-handler-errored`,
    chain: js.Array[scala.Double] = null,
    dependencyId: scala.Int | scala.Double = null,
    error: nodeLib.Error = null,
    originalError: nodeLib.Error = null,
    outdatedDependencies: org.scalablytyped.runtime.NumberDictionary[js.Array[scala.Double]] = null,
    outdatedModules: js.Array[scala.Double] = null,
    parentId: scala.Int | scala.Double = null
  ): HotNotifierInfo = {
    val __obj = js.Dynamic.literal(`type` = `type`.asInstanceOf[js.Any])
    __obj.updateDynamic("moduleId")(moduleId)
    if (chain != null) __obj.updateDynamic("chain")(chain)
    if (dependencyId != null) __obj.updateDynamic("dependencyId")(dependencyId.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error)
    if (originalError != null) __obj.updateDynamic("originalError")(originalError)
    if (outdatedDependencies != null) __obj.updateDynamic("outdatedDependencies")(outdatedDependencies)
    if (outdatedModules != null) __obj.updateDynamic("outdatedModules")(outdatedModules)
    if (parentId != null) __obj.updateDynamic("parentId")(parentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[HotNotifierInfo]
  }
}

