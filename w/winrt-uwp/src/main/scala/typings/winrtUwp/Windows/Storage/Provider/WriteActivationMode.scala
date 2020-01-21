package typings.winrtUwp.Windows.Storage.Provider

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WriteActivationMode extends js.Object

/** Indicates whether other apps can write to the locally cached version of the file and when Windows will request an update if another app writes to that local file. */
@JSGlobal("Windows.Storage.Provider.WriteActivationMode")
@js.native
object WriteActivationMode extends js.Object {
  /** Windows will trigger a file update request after another app writes to the local file. */
  @js.native
  sealed trait afterWrite extends WriteActivationMode
  
  /** Windows will trigger a file update request when another app writes to the local file. */
  @js.native
  sealed trait notNeeded extends WriteActivationMode
  
  /** Other apps can't write to the local file. */
  @js.native
  sealed trait readOnly extends WriteActivationMode
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[WriteActivationMode with Double] = js.native
  /* 2 */ @js.native
  object afterWrite extends TopLevel[afterWrite with Double]
  
  /* 1 */ @js.native
  object notNeeded extends TopLevel[notNeeded with Double]
  
  /* 0 */ @js.native
  object readOnly extends TopLevel[readOnly with Double]
  
}

