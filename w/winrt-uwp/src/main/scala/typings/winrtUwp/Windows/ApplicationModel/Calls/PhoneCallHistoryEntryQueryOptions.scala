package typings.winrtUwp.Windows.ApplicationModel.Calls

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Options for querying the phone call entries. */
@js.native
trait PhoneCallHistoryEntryQueryOptions extends StObject {
  
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
  implicit class PhoneCallHistoryEntryQueryOptionsMutableBuilder[Self <: PhoneCallHistoryEntryQueryOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDesiredMedia(value: PhoneCallHistoryEntryQueryDesiredMedia): Self = StObject.set(x, "desiredMedia", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceIds(value: IVector[String]): Self = StObject.set(x, "sourceIds", value.asInstanceOf[js.Any])
  }
}
