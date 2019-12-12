package typings.winrt.Windows.Storage.Provider

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.Storage.Provider.WriteActivationMode.afterWrite
import typings.winrt.Windows.Storage.Provider.WriteActivationMode.notNeeded
import typings.winrt.Windows.Storage.Provider.WriteActivationMode.readOnly
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WriteActivationMode extends js.Object

@JSGlobal("Windows.Storage.Provider.WriteActivationMode")
@js.native
object WriteActivationMode extends js.Object {
  @js.native
  sealed trait afterWrite extends WriteActivationMode
  
  @js.native
  sealed trait notNeeded extends WriteActivationMode
  
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

