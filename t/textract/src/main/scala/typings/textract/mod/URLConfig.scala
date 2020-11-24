package typings.textract.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait URLConfig extends Config {
  
  /**
    * Used with fromUrl, if set, rather than using the content-type from the URL request, will use the provided typeOverride.
    */
  var typeOverride: js.UndefOr[String] = js.native
}
object URLConfig {
  
  @scala.inline
  def apply(): URLConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[URLConfig]
  }
  
  @scala.inline
  implicit class URLConfigOps[Self <: URLConfig] (val x: Self) extends AnyVal {
    
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
    def setTypeOverride(value: String): Self = this.set("typeOverride", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTypeOverride: Self = this.set("typeOverride", js.undefined)
  }
}
