package typings
package yaddaLib.libMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yadda/lib", "EventBus")
@js.native
object EventBusNs extends js.Object {
  @js.native
  class EventBus ()
    extends yaddaLib.libEventBusMod.EventBus
  
  val ON_DEFINE: yaddaLib.yaddaLibStrings.__ON_DEFINE__ = js.native
  val ON_EXECUTE: yaddaLib.yaddaLibStrings.__ON_EXECUTE__ = js.native
  val ON_SCENARIO: yaddaLib.yaddaLibStrings.__ON_SCENARIO__ = js.native
  val ON_STEP: yaddaLib.yaddaLibStrings.__ON_STEP__ = js.native
  def instance(): yaddaLib.libEventBusMod.EventBus = js.native
}

