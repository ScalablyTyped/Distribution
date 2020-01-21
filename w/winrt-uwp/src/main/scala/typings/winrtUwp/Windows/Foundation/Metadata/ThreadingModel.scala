package typings.winrtUwp.Windows.Foundation.Metadata

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ThreadingModel with Double] = js.native
  /* 2 */ @js.native
  object both extends TopLevel[both with Double]
  
  /* 3 */ @js.native
  object invalidThreading extends TopLevel[invalidThreading with Double]
  
  /* 1 */ @js.native
  object mta extends TopLevel[mta with Double]
  
  /* 0 */ @js.native
  object sta extends TopLevel[sta with Double]
  
}

