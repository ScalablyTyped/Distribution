package typings.updateNotifier.mod

import typings.updateNotifier.updateNotifierStrings.build
import typings.updateNotifier.updateNotifierStrings.latest
import typings.updateNotifier.updateNotifierStrings.major
import typings.updateNotifier.updateNotifierStrings.minor
import typings.updateNotifier.updateNotifierStrings.patch
import typings.updateNotifier.updateNotifierStrings.prerelease
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateInfo extends js.Object {
  
  /** Current version */
  val current: String = js.native
  
  /** Latest version */
  val latest: String = js.native
  
  /** Package name */
  var name: String = js.native
  
  /** Type of current update */
  val `type`: typings.updateNotifier.updateNotifierStrings.latest | major | minor | patch | prerelease | build = js.native
}
object UpdateInfo {
  
  @scala.inline
  def apply(
    current: String,
    latest: String,
    name: String,
    `type`: latest | major | minor | patch | prerelease | build
  ): UpdateInfo = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], latest = latest.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateInfo]
  }
  
  @scala.inline
  implicit class UpdateInfoOps[Self <: UpdateInfo] (val x: Self) extends AnyVal {
    
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
    def setCurrent(value: String): Self = this.set("current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatest(value: String): Self = this.set("latest", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: latest | major | minor | patch | prerelease | build): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
