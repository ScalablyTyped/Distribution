package typings.winrtUwp.global.Windows.Foundation

import typings.winrtUwp.Windows.Foundation.DeferralCompletedHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Stores a DeferralCompletedHandler to be invoked upon completion of the deferral and manipulates the state of the deferral. */
@JSGlobal("Windows.Foundation.Deferral")
@js.native
class Deferral protected ()
  extends typings.winrtUwp.Windows.Foundation.Deferral {
  /**
    * Initializes a new Deferral object and specifies a DeferralCompletedHandler to be called upon completion of the deferral.
    * @param handler A DeferralCompletedHandler to be called upon completion of the deferral.
    */
  def this(handler: DeferralCompletedHandler) = this()
}
