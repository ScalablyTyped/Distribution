package typings.vsoNodeApi.testInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BuildCoverage extends StObject {
  
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
  
  @scala.inline
  implicit class BuildCoverageMutableBuilder[Self <: BuildCoverage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCodeCoverageFileUrl(value: String): Self = StObject.set(x, "codeCoverageFileUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfiguration(value: BuildConfiguration): Self = StObject.set(x, "configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastError(value: String): Self = StObject.set(x, "lastError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModules(value: js.Array[ModuleCoverage]): Self = StObject.set(x, "modules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModulesVarargs(value: ModuleCoverage*): Self = StObject.set(x, "modules", js.Array(value :_*))
    
    @scala.inline
    def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
