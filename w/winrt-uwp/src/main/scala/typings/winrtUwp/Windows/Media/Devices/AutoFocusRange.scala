package typings.winrtUwp.Windows.Media.Devices

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AutoFocusRange extends StObject
/** Defines the options for auto focus range. */
@JSGlobal("Windows.Media.Devices.AutoFocusRange")
@js.native
object AutoFocusRange extends StObject {
  
  /** Full range. */
  @js.native
  sealed trait fullRange extends AutoFocusRange
  
  /** Macro. */
  @js.native
  sealed trait `macro` extends AutoFocusRange
  
  /** Normal range. */
  @js.native
  sealed trait normal extends AutoFocusRange
}
