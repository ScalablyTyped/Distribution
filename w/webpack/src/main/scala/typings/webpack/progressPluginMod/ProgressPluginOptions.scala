package typings.webpack.progressPluginMod

import typings.webpack.webpackBooleans.`false`
import typings.webpack.webpackBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProgressPluginOptions extends js.Object {
  
  /**
  	 * Show active modules count and one active module in progress message
  	 */
  var activeModules: js.UndefOr[Boolean] = js.native
  
  /**
  	 * Show entries count in progress message
  	 */
  var entries: js.UndefOr[Boolean] = js.native
  
  /**
  	 * Function that executes for every progress step
  	 */
  var handler: js.UndefOr[HandlerFunction] = js.native
  
  /**
  	 * Show modules count in progress message
  	 */
  var modules: js.UndefOr[Boolean] = js.native
  
  /**
  	 * Minimum modules count to start with. Only for mode=modules. Default: 500
  	 */
  var modulesCount: js.UndefOr[Double] = js.native
  
  /**
  	 * Collect profile data for progress steps. Default: false
  	 */
  var profile: js.UndefOr[`true` | `false` | Null] = js.native
}
object ProgressPluginOptions {
  
  @scala.inline
  def apply(): ProgressPluginOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressPluginOptions]
  }
  
  @scala.inline
  implicit class ProgressPluginOptionsOps[Self <: ProgressPluginOptions] (val x: Self) extends AnyVal {
    
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
    def setActiveModules(value: Boolean): Self = this.set("activeModules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveModules: Self = this.set("activeModules", js.undefined)
    
    @scala.inline
    def setEntries(value: Boolean): Self = this.set("entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEntries: Self = this.set("entries", js.undefined)
    
    @scala.inline
    def setHandler(value: (/* percentage */ Double, /* msg */ String, /* repeated */ String) => Unit): Self = this.set("handler", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteHandler: Self = this.set("handler", js.undefined)
    
    @scala.inline
    def setModules(value: Boolean): Self = this.set("modules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModules: Self = this.set("modules", js.undefined)
    
    @scala.inline
    def setModulesCount(value: Double): Self = this.set("modulesCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteModulesCount: Self = this.set("modulesCount", js.undefined)
    
    @scala.inline
    def setProfile(value: `true` | `false`): Self = this.set("profile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProfile: Self = this.set("profile", js.undefined)
    
    @scala.inline
    def setProfileNull: Self = this.set("profile", null)
  }
}
