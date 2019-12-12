package typings.winrt.Windows.Foundation.Metadata

import org.scalablytyped.runtime.TopLevel
import typings.winrt.Windows.Foundation.Metadata.ThreadingModel.both
import typings.winrt.Windows.Foundation.Metadata.ThreadingModel.invalidThreading
import typings.winrt.Windows.Foundation.Metadata.ThreadingModel.mTA
import typings.winrt.Windows.Foundation.Metadata.ThreadingModel.sTA
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ThreadingModel with Double] = js.native
  /* 2 */ @js.native
  object both extends TopLevel[both with Double]
  
  /* 3 */ @js.native
  object invalidThreading extends TopLevel[invalidThreading with Double]
  
  /* 1 */ @js.native
  object mTA extends TopLevel[mTA with Double]
  
  /* 0 */ @js.native
  object sTA extends TopLevel[sTA with Double]
  
}

