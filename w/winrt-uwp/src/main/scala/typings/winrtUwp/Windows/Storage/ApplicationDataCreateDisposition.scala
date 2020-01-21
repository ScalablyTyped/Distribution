package typings.winrtUwp.Windows.Storage

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ApplicationDataCreateDisposition extends js.Object

/** Specifies options for creating application data containers or returning existing containers. This enumeration is used by the ApplicationDataContainer.CreateContainer method. */
@JSGlobal("Windows.Storage.ApplicationDataCreateDisposition")
@js.native
object ApplicationDataCreateDisposition extends js.Object {
  /** Always returns the specified container. Creates the container if it does not exist. */
  @js.native
  sealed trait always extends ApplicationDataCreateDisposition
  
  /** Returns the specified container only if it already exists. Raises an exception of type System.Exception if the specified container does not exist. */
  @js.native
  sealed trait existing extends ApplicationDataCreateDisposition
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ApplicationDataCreateDisposition with Double] = js.native
  /* 0 */ @js.native
  object always extends TopLevel[always with Double]
  
  /* 1 */ @js.native
  object existing extends TopLevel[existing with Double]
  
}

