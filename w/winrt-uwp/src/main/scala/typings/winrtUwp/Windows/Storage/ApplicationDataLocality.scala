package typings.winrtUwp.Windows.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ApplicationDataLocality extends StObject
/** Specifies the type of an application data store. */
@JSGlobal("Windows.Storage.ApplicationDataLocality")
@js.native
object ApplicationDataLocality extends StObject {
  
  /** The data resides in the local application data store. */
  @js.native
  sealed trait local
    extends StObject
       with ApplicationDataLocality
  
  /** The data resides in the local cache for the application data store. */
  @js.native
  sealed trait localCache
    extends StObject
       with ApplicationDataLocality
  
  /** The data resides in the roaming application data store. */
  @js.native
  sealed trait roaming
    extends StObject
       with ApplicationDataLocality
  
  /** The data resides in the temporary application data store. */
  @js.native
  sealed trait temporary
    extends StObject
       with ApplicationDataLocality
}
