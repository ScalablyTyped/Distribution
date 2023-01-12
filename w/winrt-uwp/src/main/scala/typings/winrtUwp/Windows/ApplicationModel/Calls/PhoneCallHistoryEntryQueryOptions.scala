package typings.winrtUwp.Windows.ApplicationModel.Calls

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Options for querying the phone call entries. */
trait PhoneCallHistoryEntryQueryOptions extends StObject {
  
  /** Gets or sets the query filter based on the type of media. */
  var desiredMedia: PhoneCallHistoryEntryQueryDesiredMedia
  
  /** Get the query filter based on the source ID of the phone call entry. */
  var sourceIds: IVector[String]
}
object PhoneCallHistoryEntryQueryOptions {
  
  inline def apply(desiredMedia: PhoneCallHistoryEntryQueryDesiredMedia, sourceIds: IVector[String]): PhoneCallHistoryEntryQueryOptions = {
    val __obj = js.Dynamic.literal(desiredMedia = desiredMedia.asInstanceOf[js.Any], sourceIds = sourceIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneCallHistoryEntryQueryOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PhoneCallHistoryEntryQueryOptions] (val x: Self) extends AnyVal {
    
    inline def setDesiredMedia(value: PhoneCallHistoryEntryQueryDesiredMedia): Self = StObject.set(x, "desiredMedia", value.asInstanceOf[js.Any])
    
    inline def setSourceIds(value: IVector[String]): Self = StObject.set(x, "sourceIds", value.asInstanceOf[js.Any])
  }
}
