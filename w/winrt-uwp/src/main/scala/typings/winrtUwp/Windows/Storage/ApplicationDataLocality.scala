package typings.winrtUwp.Windows.Storage

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
  
}

