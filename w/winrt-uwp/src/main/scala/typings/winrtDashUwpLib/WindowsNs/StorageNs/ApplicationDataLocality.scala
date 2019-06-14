package typings
package winrtDashUwpLib.WindowsNs.StorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ApplicationDataLocality extends js.Object

/** Specifies the type of an application data store. */
@JSGlobal("Windows.Storage.ApplicationDataLocality")
@js.native
object ApplicationDataLocality extends js.Object {
  /** The data resides in the local application data store. */
  @js.native
  sealed trait local
    extends winrtDashUwpLib.WindowsNs.StorageNs.ApplicationDataLocality
  
  /** The data resides in the local cache for the application data store. */
  @js.native
  sealed trait localCache
    extends winrtDashUwpLib.WindowsNs.StorageNs.ApplicationDataLocality
  
  /** The data resides in the roaming application data store. */
  @js.native
  sealed trait roaming
    extends winrtDashUwpLib.WindowsNs.StorageNs.ApplicationDataLocality
  
  /** The data resides in the temporary application data store. */
  @js.native
  sealed trait temporary
    extends winrtDashUwpLib.WindowsNs.StorageNs.ApplicationDataLocality
  
  /* 0 */ val local: local with scala.Double = js.native
  /* 3 */ val localCache: localCache with scala.Double = js.native
  /* 1 */ val roaming: roaming with scala.Double = js.native
  /* 2 */ val temporary: temporary with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.StorageNs.ApplicationDataLocality with scala.Double] = js.native
}

