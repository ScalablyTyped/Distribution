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
  
  val both: both with java.lang.String = js.native
  val invalidThreading: invalidThreading with java.lang.String = js.native
  val mta: mta with java.lang.String = js.native
  val sta: sta with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.FoundationNs.MetadataNs.ThreadingModel with java.lang.String
  ] = js.native
}

