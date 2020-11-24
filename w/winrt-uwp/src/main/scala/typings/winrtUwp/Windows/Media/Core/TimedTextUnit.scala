package typings.winrtUwp.Windows.Media.Core

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TimedTextUnit extends js.Object
/** Specifies the units in which timed a timed text style value is expressed. */
@JSGlobal("Windows.Media.Core.TimedTextUnit")
@js.native
object TimedTextUnit extends js.Object {
  
  /** The style value is expressed as a percentage. */
  @js.native
  sealed trait percentage extends TimedTextUnit
  
  /** The style value is expressed in pixels. */
  @js.native
  sealed trait pixels extends TimedTextUnit
}
