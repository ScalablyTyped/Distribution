package typings.tsconfigPaths.configLoaderMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExplicitParams extends js.Object {
  
  var addMatchAll: js.UndefOr[Boolean] = js.native
  
  var baseUrl: String = js.native
  
  var mainFields: js.UndefOr[js.Array[String]] = js.native
  
  var paths: StringDictionary[js.Array[String]] = js.native
}
object ExplicitParams {
  
  @scala.inline
  def apply(baseUrl: String, paths: StringDictionary[js.Array[String]]): ExplicitParams = {
    val __obj = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any], paths = paths.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExplicitParams]
  }
  
  @scala.inline
  implicit class ExplicitParamsOps[Self <: ExplicitParams] (val x: Self) extends AnyVal {
    
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
    def setBaseUrl(value: String): Self = this.set("baseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPaths(value: StringDictionary[js.Array[String]]): Self = this.set("paths", value.asInstanceOf[js.Any])
    
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
