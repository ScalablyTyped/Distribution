package typings.tsconfigPaths.configLoaderMod

import typings.tsconfigPaths.tsconfigLoaderMod.TsConfigLoaderParams
import typings.tsconfigPaths.tsconfigLoaderMod.TsConfigLoaderResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigLoaderParams extends js.Object {
  
  var cwd: String = js.native
  
  var explicitParams: js.UndefOr[ExplicitParams] = js.native
  
  var tsConfigLoader: js.UndefOr[TsConfigLoader] = js.native
}
object ConfigLoaderParams {
  
  @scala.inline
  def apply(cwd: String): ConfigLoaderParams = {
    val __obj = js.Dynamic.literal(cwd = cwd.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigLoaderParams]
  }
  
  @scala.inline
  implicit class ConfigLoaderParamsOps[Self <: ConfigLoaderParams] (val x: Self) extends AnyVal {
    
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
    def setCwd(value: String): Self = this.set("cwd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExplicitParams(value: ExplicitParams): Self = this.set("explicitParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExplicitParams: Self = this.set("explicitParams", js.undefined)
    
    @scala.inline
    def setTsConfigLoader(value: /* params */ TsConfigLoaderParams => TsConfigLoaderResult): Self = this.set("tsConfigLoader", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTsConfigLoader: Self = this.set("tsConfigLoader", js.undefined)
  }
}
