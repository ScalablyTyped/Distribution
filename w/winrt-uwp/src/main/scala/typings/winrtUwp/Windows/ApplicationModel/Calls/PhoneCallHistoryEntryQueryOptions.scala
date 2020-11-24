package typings.winrtUwp.Windows.ApplicationModel.Calls

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Options for querying the phone call entries. */
@js.native
trait PhoneCallHistoryEntryQueryOptions extends js.Object {
  
  /** Gets or sets the query filter based on the type of media. */
  var desiredMedia: PhoneCallHistoryEntryQueryDesiredMedia = js.native
  
  /** Get the query filter based on the source ID of the phone call entry. */
  var sourceIds: IVector[String] = js.native
}
object PhoneCallHistoryEntryQueryOptions {
  
  @scala.inline
  def apply(desiredMedia: PhoneCallHistoryEntryQueryDesiredMedia, sourceIds: IVector[String]): PhoneCallHistoryEntryQueryOptions = {
    val __obj = js.Dynamic.literal(desiredMedia = desiredMedia.asInstanceOf[js.Any], sourceIds = sourceIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneCallHistoryEntryQueryOptions]
  }
  
  @scala.inline
  implicit class PhoneCallHistoryEntryQueryOptionsOps[Self <: PhoneCallHistoryEntryQueryOptions] (val x: Self) extends AnyVal {
    
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
    def setDesiredMedia(value: PhoneCallHistoryEntryQueryDesiredMedia): Self = this.set("desiredMedia", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceIds(value: IVector[String]): Self = this.set("sourceIds", value.asInstanceOf[js.Any])
  }
}
