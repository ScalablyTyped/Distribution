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
  
  val both: both with java.lang.String = js.native
  val invalidThreading: invalidThreading with java.lang.String = js.native
  val mTA: mTA with java.lang.String = js.native
  val sTA: sTA with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.FoundationNs.MetadataNs.ThreadingModel with java.lang.String] = js.native
}

