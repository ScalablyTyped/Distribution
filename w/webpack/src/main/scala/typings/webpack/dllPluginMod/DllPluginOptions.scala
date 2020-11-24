package typings.webpack.dllPluginMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DllPluginOptions extends js.Object {
  
  /**
  	 * Context of requests in the manifest file (defaults to the webpack context)
  	 */
  var context: js.UndefOr[String] = js.native
  
  /**
  	 * If true, only entry points will be exposed
  	 */
  var entryOnly: js.UndefOr[Boolean] = js.native
  
  /**
  	 * If true, manifest json file (output) will be formatted
  	 */
  var format: js.UndefOr[Boolean] = js.native
  
  /**
  	 * Name of the exposed dll function (external name, use value of 'output.library')
  	 */
  var name: js.UndefOr[String] = js.native
  
  /**
  	 * Absolute path to the manifest json file (output)
  	 */
  var path: String = js.native
  
  /**
  	 * Type of the dll bundle (external type, use value of 'output.libraryTarget')
  	 */
  var `type`: js.UndefOr[String] = js.native
}
object DllPluginOptions {
  
  @scala.inline
  def apply(path: String): DllPluginOptions = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[DllPluginOptions]
  }
  
  @scala.inline
  implicit class DllPluginOptionsOps[Self <: DllPluginOptions] (val x: Self) extends AnyVal {
    
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
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContext(value: String): Self = this.set("context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    
    @scala.inline
    def setEntryOnly(value: Boolean): Self = this.set("entryOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntryOnly: Self = this.set("entryOnly", js.undefined)
    
    @scala.inline
    def setFormat(value: Boolean): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
