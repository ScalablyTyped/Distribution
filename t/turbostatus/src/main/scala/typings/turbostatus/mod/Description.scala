package typings.turbostatus.mod

import typings.turbostatus.turbostatusBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Description extends js.Object {
  
  var commitsSinceTag: String | `false` = js.native
  
  var hash: String = js.native
  
  var nearestTag: String | `false` = js.native
}
object Description {
  
  @scala.inline
  def apply(commitsSinceTag: String | `false`, hash: String, nearestTag: String | `false`): Description = {
    val __obj = js.Dynamic.literal(commitsSinceTag = commitsSinceTag.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], nearestTag = nearestTag.asInstanceOf[js.Any])
    __obj.asInstanceOf[Description]
  }
  
  @scala.inline
  implicit class DescriptionOps[Self <: Description] (val x: Self) extends AnyVal {
    
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
    def setCommitsSinceTag(value: String | `false`): Self = this.set("commitsSinceTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHash(value: String): Self = this.set("hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNearestTag(value: String | `false`): Self = this.set("nearestTag", value.asInstanceOf[js.Any])
  }
}
