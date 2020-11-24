package typings.webpackClean.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * directory to be resolved to
    * @default null;
    */
  var basePath: js.UndefOr[String | Null] = js.native
  
  /**
    * specify if the files should be force deleted in case of compile errors.
    * If forceDelete is not enabled, the compile errors will be logged to stdout but the deletion of the files will not take place
    * @default false
    */
  var forceDelete: js.UndefOr[Boolean] = js.native
  
  /**
    * specify if the .map files should be automatically removed
    * @default false
    */
  var removeMaps: js.UndefOr[Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setBasePath(value: String): Self = this.set("basePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBasePath: Self = this.set("basePath", js.undefined)
    
    @scala.inline
    def setBasePathNull: Self = this.set("basePath", null)
    
    @scala.inline
    def setForceDelete(value: Boolean): Self = this.set("forceDelete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceDelete: Self = this.set("forceDelete", js.undefined)
    
    @scala.inline
    def setRemoveMaps(value: Boolean): Self = this.set("removeMaps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoveMaps: Self = this.set("removeMaps", js.undefined)
  }
}
