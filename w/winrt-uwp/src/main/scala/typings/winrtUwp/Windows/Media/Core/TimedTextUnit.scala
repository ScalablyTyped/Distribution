package typings.winrtUwp.Windows.Media.Core

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TimedTextUnit extends StObject
/** Specifies the units in which timed a timed text style value is expressed. */
@JSGlobal("Windows.Media.Core.TimedTextUnit")
@js.native
object TimedTextUnit extends StObject {
  
  /** The style value is expressed as a percentage. */
  @js.native
  sealed trait percentage
    extends StObject
       with TimedTextUnit
  
  /** The style value is expressed in pixels. */
  @js.native
  sealed trait pixels
    extends StObject
       with TimedTextUnit
}
