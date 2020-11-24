package typings.vsoNodeApi.tfvcInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TfvcMergeSource extends js.Object {
  
  /**
    * Indicates if this a rename source. If false, it is a merge source.
    */
  var isRename: Boolean = js.native
  
  /**
    * The server item of the merge source
    */
  var serverItem: String = js.native
  
  /**
    * Start of the version range
    */
  var versionFrom: Double = js.native
  
  /**
    * End of the version range
    */
  var versionTo: Double = js.native
}
object TfvcMergeSource {
  
  @scala.inline
  def apply(isRename: Boolean, serverItem: String, versionFrom: Double, versionTo: Double): TfvcMergeSource = {
    val __obj = js.Dynamic.literal(isRename = isRename.asInstanceOf[js.Any], serverItem = serverItem.asInstanceOf[js.Any], versionFrom = versionFrom.asInstanceOf[js.Any], versionTo = versionTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[TfvcMergeSource]
  }
  
  @scala.inline
  implicit class TfvcMergeSourceOps[Self <: TfvcMergeSource] (val x: Self) extends AnyVal {
    
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
    def setIsRename(value: Boolean): Self = this.set("isRename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerItem(value: String): Self = this.set("serverItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionFrom(value: Double): Self = this.set("versionFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionTo(value: Double): Self = this.set("versionTo", value.asInstanceOf[js.Any])
  }
}
