package typings
package winrtDashUwpLib.WindowsNs.FoundationNs.MetadataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ThreadingModel extends js.Object

/** Specifies the threading model. */
@JSGlobal("Windows.Foundation.Metadata.ThreadingModel")
@js.native
object ThreadingModel extends js.Object {
  /** Both single-threaded and multithreaded apartments. */
  @js.native
  sealed trait both
    extends winrtDashUwpLib.WindowsNs.FoundationNs.MetadataNs.ThreadingModel
  
  /** No valid threading model applies. */
  @js.native
  sealed trait invalidThreading
    extends winrtDashUwpLib.WindowsNs.FoundationNs.MetadataNs.ThreadingModel
  
  /** Multithreaded apartment. */
  @js.native
  sealed trait mta
    extends winrtDashUwpLib.WindowsNs.FoundationNs.MetadataNs.ThreadingModel
  
  /** Single-threaded apartment. */
  @js.native
  sealed trait sta
    extends winrtDashUwpLib.WindowsNs.FoundationNs.MetadataNs.ThreadingModel
  
  /* 2 */ val both: both with scala.Double = js.native
  /* 3 */ val invalidThreading: invalidThreading with scala.Double = js.native
  /* 1 */ val mta: mta with scala.Double = js.native
  /* 0 */ val sta: sta with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.FoundationNs.MetadataNs.ThreadingModel with scala.Double
  ] = js.native
}

