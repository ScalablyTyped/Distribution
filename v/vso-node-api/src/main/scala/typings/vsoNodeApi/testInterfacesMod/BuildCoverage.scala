package typings.vsoNodeApi.testInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildCoverage extends js.Object {
  
  var codeCoverageFileUrl: String = js.native
  
  var configuration: BuildConfiguration = js.native
  
  var lastError: String = js.native
  
  var modules: js.Array[ModuleCoverage] = js.native
  
  var state: String = js.native
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
  implicit class BuildCoverageOps[Self <: BuildCoverage] (val x: Self) extends AnyVal {
    
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
    def setCodeCoverageFileUrl(value: String): Self = this.set("codeCoverageFileUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfiguration(value: BuildConfiguration): Self = this.set("configuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastError(value: String): Self = this.set("lastError", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModulesVarargs(value: ModuleCoverage*): Self = this.set("modules", js.Array(value :_*))
    
    @scala.inline
    def setModules(value: js.Array[ModuleCoverage]): Self = this.set("modules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
  }
}
