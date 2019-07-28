package typings.vsoDashNodeDashApi.interfacesTestInterfacesMod

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
    val __obj = js.Dynamic.literal(codeCoverageFileUrl = codeCoverageFileUrl, configuration = configuration, lastError = lastError, modules = modules, state = state)
  
    __obj.asInstanceOf[BuildCoverage]
  }
}

