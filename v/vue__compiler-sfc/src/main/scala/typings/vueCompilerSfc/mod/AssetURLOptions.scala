package typings.vueCompilerSfc.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssetURLOptions extends js.Object {
  
  /**
    * If base is provided, instead of transforming relative asset urls into
    * imports, they will be directly rewritten to absolute urls.
    */
  var base: js.UndefOr[String | Null] = js.native
  
  /**
    * If true, also processes absolute urls.
    */
  var includeAbsolute: js.UndefOr[Boolean] = js.native
  
  var tags: js.UndefOr[AssetURLTagConfig] = js.native
}
object AssetURLOptions {
  
  @scala.inline
  def apply(): AssetURLOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssetURLOptions]
  }
  
  @scala.inline
  implicit class AssetURLOptionsOps[Self <: AssetURLOptions] (val x: Self) extends AnyVal {
    
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
    def setBase(value: String): Self = this.set("base", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBase: Self = this.set("base", js.undefined)
    
    @scala.inline
    def setBaseNull: Self = this.set("base", null)
    
    @scala.inline
    def setIncludeAbsolute(value: Boolean): Self = this.set("includeAbsolute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncludeAbsolute: Self = this.set("includeAbsolute", js.undefined)
    
    @scala.inline
    def setTags(value: AssetURLTagConfig): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
