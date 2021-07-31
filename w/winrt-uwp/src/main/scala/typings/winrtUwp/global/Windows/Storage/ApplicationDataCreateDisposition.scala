package typings.winrtUwp.global.Windows.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies options for creating application data containers or returning existing containers. This enumeration is used by the ApplicationDataContainer.CreateContainer method. */
@JSGlobal("Windows.Storage.ApplicationDataCreateDisposition")
@js.native
object ApplicationDataCreateDisposition extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Storage.ApplicationDataCreateDisposition & Double] = js.native
  
  /* 0 */ val always: typings.winrtUwp.Windows.Storage.ApplicationDataCreateDisposition.always & Double = js.native
  
  /* 1 */ val existing: typings.winrtUwp.Windows.Storage.ApplicationDataCreateDisposition.existing & Double = js.native
}
