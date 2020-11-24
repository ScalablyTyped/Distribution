package typings.webpack.dllReferencePluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DllReferencePluginOptionsManifest extends js.Object {
  
  /**
  	 * The mappings from request to module info
  	 */
  var content: DllReferencePluginOptionsContent = js.native
  
  /**
  	 * The name where the dll is exposed (external name)
  	 */
  var name: js.UndefOr[String] = js.native
  
  /**
  	 * The type how the dll is exposed (external type)
  	 */
  var `type`: js.UndefOr[DllReferencePluginOptionsSourceType] = js.native
}
object DllReferencePluginOptionsManifest {
  
  @scala.inline
  def apply(content: DllReferencePluginOptionsContent): DllReferencePluginOptionsManifest = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[DllReferencePluginOptionsManifest]
  }
  
  @scala.inline
  implicit class DllReferencePluginOptionsManifestOps[Self <: DllReferencePluginOptionsManifest] (val x: Self) extends AnyVal {
    
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
    def setContent(value: DllReferencePluginOptionsContent): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setType(value: DllReferencePluginOptionsSourceType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
