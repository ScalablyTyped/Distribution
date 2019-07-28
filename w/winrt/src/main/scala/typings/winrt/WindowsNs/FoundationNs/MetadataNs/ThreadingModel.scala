package typings.winrt.WindowsNs.FoundationNs.MetadataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ThreadingModel extends js.Object

@JSGlobal("Windows.Foundation.Metadata.ThreadingModel")
@js.native
object ThreadingModel extends js.Object {
  @js.native
  sealed trait both extends ThreadingModel
  
  @js.native
  sealed trait invalidThreading extends ThreadingModel
  
  @js.native
  sealed trait mTA extends ThreadingModel
  
  @js.native
  sealed trait sTA extends ThreadingModel
  
  /* 2 */ val both: typings.winrt.WindowsNs.FoundationNs.MetadataNs.ThreadingModel.both with Double = js.native
  /* 3 */ val invalidThreading: typings.winrt.WindowsNs.FoundationNs.MetadataNs.ThreadingModel.invalidThreading with Double = js.native
  /* 1 */ val mTA: typings.winrt.WindowsNs.FoundationNs.MetadataNs.ThreadingModel.mTA with Double = js.native
  /* 0 */ val sTA: typings.winrt.WindowsNs.FoundationNs.MetadataNs.ThreadingModel.sTA with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ThreadingModel with Double] = js.native
}

