package typings.winrtUwp.Windows.Media.Devices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FocusMode extends StObject
/** Defines the values for focus mode. */
@JSGlobal("Windows.Media.Devices.FocusMode")
@js.native
object FocusMode extends StObject {
  
  /** Use autofocus. */
  @js.native
  sealed trait auto
    extends StObject
       with FocusMode
  
  /** Continuously adjust focus. */
  @js.native
  sealed trait continuous
    extends StObject
       with FocusMode
  
  /** Use manual focus. */
  @js.native
  sealed trait manual
    extends StObject
       with FocusMode
  
  /** Focus once. */
  @js.native
  sealed trait single
    extends StObject
       with FocusMode
}
