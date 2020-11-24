package typings.umbraco.umbraco.services

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Configuration
  */
@js.native
trait IConfiguration extends js.Object {
  
  var dimensions: IDimension = js.native
  
  var maxImageSize: Double = js.native
  
  var stylesheets: js.Array[String] = js.native
  
  var toolbar: js.Array[String] = js.native
}
object IConfiguration {
  
  @scala.inline
  def apply(
    dimensions: IDimension,
    maxImageSize: Double,
    stylesheets: js.Array[String],
    toolbar: js.Array[String]
  ): IConfiguration = {
    val __obj = js.Dynamic.literal(dimensions = dimensions.asInstanceOf[js.Any], maxImageSize = maxImageSize.asInstanceOf[js.Any], stylesheets = stylesheets.asInstanceOf[js.Any], toolbar = toolbar.asInstanceOf[js.Any])
    __obj.asInstanceOf[IConfiguration]
  }
  
  @scala.inline
  implicit class IConfigurationOps[Self <: IConfiguration] (val x: Self) extends AnyVal {
    
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
    def setDimensions(value: IDimension): Self = this.set("dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxImageSize(value: Double): Self = this.set("maxImageSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStylesheetsVarargs(value: String*): Self = this.set("stylesheets", js.Array(value :_*))
    
    @scala.inline
    def setStylesheets(value: js.Array[String]): Self = this.set("stylesheets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToolbarVarargs(value: String*): Self = this.set("toolbar", js.Array(value :_*))
    
    @scala.inline
    def setToolbar(value: js.Array[String]): Self = this.set("toolbar", value.asInstanceOf[js.Any])
  }
}
