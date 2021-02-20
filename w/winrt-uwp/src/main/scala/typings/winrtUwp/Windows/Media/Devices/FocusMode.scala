package typings.winrtUwp.Windows.Media.Devices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FocusMode extends StObject
/** Defines the values for focus mode. */
@JSGlobal("Windows.Media.Devices.FocusMode")
@js.native
object FocusMode extends StObject {
  
  /** Use autofocus. */
  @js.native
  sealed trait auto extends FocusMode
  
  /** Continuously adjust focus. */
  @js.native
  sealed trait continuous extends FocusMode
  
  /** Use manual focus. */
  @js.native
  sealed trait manual extends FocusMode
  
  /** Focus once. */
  @js.native
  sealed trait single extends FocusMode
}
