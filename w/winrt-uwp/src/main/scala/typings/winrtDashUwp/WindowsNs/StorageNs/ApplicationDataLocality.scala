package typings.winrtDashUwp.WindowsNs.StorageNs

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
  sealed trait local extends ApplicationDataLocality
  
  /** The data resides in the local cache for the application data store. */
  @js.native
  sealed trait localCache extends ApplicationDataLocality
  
  /** The data resides in the roaming application data store. */
  @js.native
  sealed trait roaming extends ApplicationDataLocality
  
  /** The data resides in the temporary application data store. */
  @js.native
  sealed trait temporary extends ApplicationDataLocality
  
  /* 0 */ val local: typings.winrtDashUwp.WindowsNs.StorageNs.ApplicationDataLocality.local with Double = js.native
  /* 3 */ val localCache: typings.winrtDashUwp.WindowsNs.StorageNs.ApplicationDataLocality.localCache with Double = js.native
  /* 1 */ val roaming: typings.winrtDashUwp.WindowsNs.StorageNs.ApplicationDataLocality.roaming with Double = js.native
  /* 2 */ val temporary: typings.winrtDashUwp.WindowsNs.StorageNs.ApplicationDataLocality.temporary with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ApplicationDataLocality with Double] = js.native
}

