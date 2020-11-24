package typings.tsconfigPaths.configLoaderMod

import org.scalablytyped.runtime.StringDictionary
import typings.tsconfigPaths.tsconfigPathsStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfigLoaderSuccessResult extends ConfigLoaderResult {
  
  var absoluteBaseUrl: String = js.native
  
  var addMatchAll: js.UndefOr[Boolean] = js.native
  
  var baseUrl: String = js.native
  
  var configFileAbsolutePath: String = js.native
  
  var mainFields: js.UndefOr[js.Array[String]] = js.native
  
  var paths: StringDictionary[js.Array[String]] = js.native
  
  var resultType: success = js.native
}
object ConfigLoaderSuccessResult {
  
  @scala.inline
  def apply(
    absoluteBaseUrl: String,
    baseUrl: String,
    configFileAbsolutePath: String,
    paths: StringDictionary[js.Array[String]],
    resultType: success
  ): ConfigLoaderSuccessResult = {
    val __obj = js.Dynamic.literal(absoluteBaseUrl = absoluteBaseUrl.asInstanceOf[js.Any], baseUrl = baseUrl.asInstanceOf[js.Any], configFileAbsolutePath = configFileAbsolutePath.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any], resultType = resultType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigLoaderSuccessResult]
  }
  
  @scala.inline
  implicit class ConfigLoaderSuccessResultOps[Self <: ConfigLoaderSuccessResult] (val x: Self) extends AnyVal {
    
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
    def setAbsoluteBaseUrl(value: String): Self = this.set("absoluteBaseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBaseUrl(value: String): Self = this.set("baseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfigFileAbsolutePath(value: String): Self = this.set("configFileAbsolutePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaths(value: StringDictionary[js.Array[String]]): Self = this.set("paths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultType(value: success): Self = this.set("resultType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddMatchAll(value: Boolean): Self = this.set("addMatchAll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddMatchAll: Self = this.set("addMatchAll", js.undefined)
    
    @scala.inline
    def setMainFieldsVarargs(value: String*): Self = this.set("mainFields", js.Array(value :_*))
    
    @scala.inline
    def setMainFields(value: js.Array[String]): Self = this.set("mainFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMainFields: Self = this.set("mainFields", js.undefined)
  }
}
