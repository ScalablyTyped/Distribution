package typings.tsLoader.interfacesMod

import typings.tsLoader.anon.TsLoaderDefinitionFileVersions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WebpackModule extends js.Object {
  
  var buildMeta: TsLoaderDefinitionFileVersions = js.native
  
  var errors: js.Array[WebpackError] = js.native
  
  var resource: String = js.native
}
object WebpackModule {
  
  @scala.inline
  def apply(buildMeta: TsLoaderDefinitionFileVersions, errors: js.Array[WebpackError], resource: String): WebpackModule = {
    val __obj = js.Dynamic.literal(buildMeta = buildMeta.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebpackModule]
  }
  
  @scala.inline
  implicit class WebpackModuleOps[Self <: WebpackModule] (val x: Self) extends AnyVal {
    
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
    def setBuildMeta(value: TsLoaderDefinitionFileVersions): Self = this.set("buildMeta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorsVarargs(value: WebpackError*): Self = this.set("errors", js.Array(value :_*))
    
    @scala.inline
    def setErrors(value: js.Array[WebpackError]): Self = this.set("errors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResource(value: String): Self = this.set("resource", value.asInstanceOf[js.Any])
  }
}
