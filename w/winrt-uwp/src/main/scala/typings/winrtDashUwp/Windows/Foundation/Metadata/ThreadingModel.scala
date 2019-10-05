package typings.winrtDashUwp.Windows.Foundation.Metadata

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
  sealed trait both extends ThreadingModel
  
  /** No valid threading model applies. */
  @js.native
  sealed trait invalidThreading extends ThreadingModel
  
  /** Multithreaded apartment. */
  @js.native
  sealed trait mta extends ThreadingModel
  
  /** Single-threaded apartment. */
  @js.native
  sealed trait sta extends ThreadingModel
  
  /* 2 */ val both: typings.winrtDashUwp.Windows.Foundation.Metadata.ThreadingModel.both with Double = js.native
  /* 3 */ val invalidThreading: typings.winrtDashUwp.Windows.Foundation.Metadata.ThreadingModel.invalidThreading with Double = js.native
  /* 1 */ val mta: typings.winrtDashUwp.Windows.Foundation.Metadata.ThreadingModel.mta with Double = js.native
  /* 0 */ val sta: typings.winrtDashUwp.Windows.Foundation.Metadata.ThreadingModel.sta with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ThreadingModel with Double] = js.native
}

