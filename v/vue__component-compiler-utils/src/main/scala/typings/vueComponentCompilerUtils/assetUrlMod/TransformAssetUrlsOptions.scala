package typings.vueComponentCompilerUtils.assetUrlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransformAssetUrlsOptions extends js.Object {
  
  /**
    * If base is provided, instead of transforming relative asset urls into
    * imports, they will be directly rewritten to absolute urls.
    */
  var base: js.UndefOr[String] = js.native
}
object TransformAssetUrlsOptions {
  
  @scala.inline
  def apply(): TransformAssetUrlsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransformAssetUrlsOptions]
  }
  
  @scala.inline
  implicit class TransformAssetUrlsOptionsOps[Self <: TransformAssetUrlsOptions] (val x: Self) extends AnyVal {
    
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
  }
}
