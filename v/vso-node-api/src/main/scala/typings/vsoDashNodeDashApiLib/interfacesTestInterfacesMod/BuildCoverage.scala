package typings
package vsoDashNodeDashApiLib.interfacesTestInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildCoverage extends js.Object {
  var codeCoverageFileUrl: java.lang.String
  var configuration: BuildConfiguration
  var lastError: java.lang.String
  var modules: js.Array[ModuleCoverage]
  var state: java.lang.String
}

object BuildCoverage {
  @scala.inline
  def apply(
    codeCoverageFileUrl: java.lang.String,
    configuration: BuildConfiguration,
    lastError: java.lang.String,
    modules: js.Array[ModuleCoverage],
    state: java.lang.String
  ): BuildCoverage = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("codeCoverageFileUrl")(codeCoverageFileUrl)
    __obj.updateDynamic("configuration")(configuration)
    __obj.updateDynamic("lastError")(lastError)
    __obj.updateDynamic("modules")(modules)
    __obj.updateDynamic("state")(state)
    __obj.asInstanceOf[BuildCoverage]
  }
}

