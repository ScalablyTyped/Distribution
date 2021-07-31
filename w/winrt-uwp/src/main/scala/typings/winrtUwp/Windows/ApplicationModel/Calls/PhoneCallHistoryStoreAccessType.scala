package typings.winrtUwp.Windows.ApplicationModel.Calls

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PhoneCallHistoryStoreAccessType extends StObject
/** The type of store you want to retrieve. */
@JSGlobal("Windows.ApplicationModel.Calls.PhoneCallHistoryStoreAccessType")
@js.native
object PhoneCallHistoryStoreAccessType extends StObject {
  
  /** All of the entries should have limited read and write permissions. */
  @js.native
  sealed trait allEntriesLimitedReadWrite
    extends StObject
       with PhoneCallHistoryStoreAccessType
  
  /** All the entries should have full read and write permissions. */
  @js.native
  sealed trait allEntriesReadWrite
    extends StObject
       with PhoneCallHistoryStoreAccessType
  
  /** Only entries created by this application should have read and write permissions. */
  @js.native
  sealed trait appEntriesReadWrite
    extends StObject
       with PhoneCallHistoryStoreAccessType
}
