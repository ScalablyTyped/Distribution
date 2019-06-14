package typings
package winrtLib.WindowsNs.FoundationNs.MetadataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ThreadingModel extends js.Object

@JSGlobal("Windows.Foundation.Metadata.ThreadingModel")
@js.native
object ThreadingModel extends js.Object {
  @js.native
  sealed trait both
    extends winrtLib.WindowsNs.FoundationNs.MetadataNs.ThreadingModel
  
  @js.native
  sealed trait invalidThreading
    extends winrtLib.WindowsNs.FoundationNs.MetadataNs.ThreadingModel
  
  @js.native
  sealed trait mTA
    extends winrtLib.WindowsNs.FoundationNs.MetadataNs.ThreadingModel
  
  @js.native
  sealed trait sTA
    extends winrtLib.WindowsNs.FoundationNs.MetadataNs.ThreadingModel
  
  /* 2 */ val both: both with scala.Double = js.native
  /* 3 */ val invalidThreading: invalidThreading with scala.Double = js.native
  /* 1 */ val mTA: mTA with scala.Double = js.native
  /* 0 */ val sTA: sTA with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.FoundationNs.MetadataNs.ThreadingModel with scala.Double] = js.native
}

