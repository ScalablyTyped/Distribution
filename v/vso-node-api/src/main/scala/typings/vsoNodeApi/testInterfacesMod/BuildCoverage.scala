package typings.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BuildCoverage extends js.Object {
  var codeCoverageFileUrl: String
  var configuration: BuildConfiguration
  var lastError: String
  var modules: js.Array[ModuleCoverage]
  var state: String
}

object BuildCoverage {
  @scala.inline
  def apply(
    codeCoverageFileUrl: String,
    configuration: BuildConfiguration,
    lastError: String,
    modules: js.Array[ModuleCoverage],
    state: String
  ): BuildCoverage = {
    val __obj = js.Dynamic.literal(codeCoverageFileUrl = codeCoverageFileUrl.asInstanceOf[js.Any], configuration = configuration.asInstanceOf[js.Any], lastError = lastError.asInstanceOf[js.Any], modules = modules.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[BuildCoverage]
  }
}

