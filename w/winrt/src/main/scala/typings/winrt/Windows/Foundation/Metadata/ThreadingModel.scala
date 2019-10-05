package typings.winrt.Windows.Foundation.Metadata

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
  
  /* 2 */ val both: typings.winrt.Windows.Foundation.Metadata.ThreadingModel.both with Double = js.native
  /* 3 */ val invalidThreading: typings.winrt.Windows.Foundation.Metadata.ThreadingModel.invalidThreading with Double = js.native
  /* 1 */ val mTA: typings.winrt.Windows.Foundation.Metadata.ThreadingModel.mTA with Double = js.native
  /* 0 */ val sTA: typings.winrt.Windows.Foundation.Metadata.ThreadingModel.sTA with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ThreadingModel with Double] = js.native
}

