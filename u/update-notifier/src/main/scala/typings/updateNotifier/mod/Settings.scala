package typings.updateNotifier.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Settings extends js.Object {
  
  /**
    * Which dist-tag to use to find the latest version
    * @default 'latest'
    */
  var distTag: js.UndefOr[String] = js.native
  
  /**
    * @deprecated use `pkg.name`
    */
  var packageName: js.UndefOr[String] = js.native
  
  /**
    * @deprecated use `pkg.version`
    */
  var packageVersion: js.UndefOr[String] = js.native
  
  var pkg: js.UndefOr[Package] = js.native
  
  /** Allows notification to be shown when running as an npm script */
  var shouldNotifyInNpmScript: js.UndefOr[Boolean] = js.native
  
  /** How often to check for updates */
  var updateCheckInterval: js.UndefOr[Double] = js.native
}
object Settings {
  
  @scala.inline
  def apply(): Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Settings]
  }
  
  @scala.inline
  implicit class SettingsOps[Self <: Settings] (val x: Self) extends AnyVal {
    
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
    def setDistTag(value: String): Self = this.set("distTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistTag: Self = this.set("distTag", js.undefined)
    
    @scala.inline
    def setPackageName(value: String): Self = this.set("packageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePackageName: Self = this.set("packageName", js.undefined)
    
    @scala.inline
    def setPackageVersion(value: String): Self = this.set("packageVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePackageVersion: Self = this.set("packageVersion", js.undefined)
    
    @scala.inline
    def setPkg(value: Package): Self = this.set("pkg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePkg: Self = this.set("pkg", js.undefined)
    
    @scala.inline
    def setShouldNotifyInNpmScript(value: Boolean): Self = this.set("shouldNotifyInNpmScript", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShouldNotifyInNpmScript: Self = this.set("shouldNotifyInNpmScript", js.undefined)
    
    @scala.inline
    def setUpdateCheckInterval(value: Double): Self = this.set("updateCheckInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdateCheckInterval: Self = this.set("updateCheckInterval", js.undefined)
  }
}
