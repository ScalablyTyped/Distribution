package typings.winrtDashUwp.Windows.Storage

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ApplicationDataLocality with Double] = js.native
  /* 0 */ @js.native
  object local extends TopLevel[local with Double]
  
  /* 3 */ @js.native
  object localCache extends TopLevel[localCache with Double]
  
  /* 1 */ @js.native
  object roaming extends TopLevel[roaming with Double]
  
  /* 2 */ @js.native
  object temporary extends TopLevel[temporary with Double]
  
}

