package typings.yadda.mod

import typings.yadda.yaddaStrings.__ON_DEFINE__
import typings.yadda.yaddaStrings.__ON_EXECUTE__
import typings.yadda.yaddaStrings.__ON_SCENARIO__
import typings.yadda.yaddaStrings.__ON_STEP__
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yadda", "EventBus")
@js.native
object EventBus extends js.Object {
  @js.native
  class EventBus ()
    extends typings.yadda.eventBusMod.EventBus
  
  val ON_DEFINE: __ON_DEFINE__ = js.native
  val ON_EXECUTE: __ON_EXECUTE__ = js.native
  val ON_SCENARIO: __ON_SCENARIO__ = js.native
  val ON_STEP: __ON_STEP__ = js.native
  def instance(): typings.yadda.eventBusMod.EventBus = js.native
}

