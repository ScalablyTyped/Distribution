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
  
  val local: local with java.lang.String = js.native
  val localCache: localCache with java.lang.String = js.native
  val roaming: roaming with java.lang.String = js.native
  val temporary: temporary with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.StorageNs.ApplicationDataLocality with java.lang.String
  ] = js.native
}

