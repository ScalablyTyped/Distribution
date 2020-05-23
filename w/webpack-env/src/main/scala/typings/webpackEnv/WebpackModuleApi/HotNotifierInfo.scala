package typings.webpackEnv.WebpackModuleApi

import org.scalablytyped.runtime.NumberDictionary
import typings.std.Error
import typings.webpackEnv.webpackEnvStrings.`accept-errored`
import typings.webpackEnv.webpackEnvStrings.`self-accept-error-handler-errored`
import typings.webpackEnv.webpackEnvStrings.`self-accept-errored`
import typings.webpackEnv.webpackEnvStrings.`self-declined`
import typings.webpackEnv.webpackEnvStrings.accepted
import typings.webpackEnv.webpackEnvStrings.declined
import typings.webpackEnv.webpackEnvStrings.disposed
import typings.webpackEnv.webpackEnvStrings.unaccepted
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HotNotifierInfo extends js.Object {
  /**
    * For declined/accepted/unaccepted: the chain from where the update was propagated.
    */
  var chain: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * For errors: the module id owning the accept handler.
    */
  var dependencyId: js.UndefOr[Double] = js.undefined
  /**
    * For errors: the thrown error
    */
  var error: js.UndefOr[Error] = js.undefined
  /**
    * The module in question.
    */
  var moduleId: Double
  /**
    * For self-accept-error-handler-errored: the error thrown by the module
    * before the error handler tried to handle it.
    */
  var originalError: js.UndefOr[Error] = js.undefined
  /**
    * For accepted: The location of accept handlers that will handle the update
    */
  var outdatedDependencies: js.UndefOr[NumberDictionary[js.Array[Double]]] = js.undefined
  /**
    * For accepted: the modules that are outdated and will be disposed
    */
  var outdatedModules: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * For declined: the module id of the declining parent
    */
  var parentId: js.UndefOr[Double] = js.undefined
  var `type`: `self-declined` | declined | unaccepted | accepted | disposed | `accept-errored` | `self-accept-errored` | `self-accept-error-handler-errored`
}

object HotNotifierInfo {
  @scala.inline
  def apply(
    moduleId: Double,
    `type`: `self-declined` | declined | unaccepted | accepted | disposed | `accept-errored` | `self-accept-errored` | `self-accept-error-handler-errored`,
    chain: js.Array[Double] = null,
    dependencyId: js.UndefOr[Double] = js.undefined,
    error: Error = null,
    originalError: Error = null,
    outdatedDependencies: NumberDictionary[js.Array[Double]] = null,
    outdatedModules: js.Array[Double] = null,
    parentId: js.UndefOr[Double] = js.undefined
  ): HotNotifierInfo = {
    val __obj = js.Dynamic.literal(moduleId = moduleId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (chain != null) __obj.updateDynamic("chain")(chain.asInstanceOf[js.Any])
    if (!js.isUndefined(dependencyId)) __obj.updateDynamic("dependencyId")(dependencyId.get.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (originalError != null) __obj.updateDynamic("originalError")(originalError.asInstanceOf[js.Any])
    if (outdatedDependencies != null) __obj.updateDynamic("outdatedDependencies")(outdatedDependencies.asInstanceOf[js.Any])
    if (outdatedModules != null) __obj.updateDynamic("outdatedModules")(outdatedModules.asInstanceOf[js.Any])
    if (!js.isUndefined(parentId)) __obj.updateDynamic("parentId")(parentId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[HotNotifierInfo]
  }
}

