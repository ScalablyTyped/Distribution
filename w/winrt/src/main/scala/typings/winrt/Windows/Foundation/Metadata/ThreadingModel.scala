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
  
}

