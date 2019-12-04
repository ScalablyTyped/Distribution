package typings.xstate.libPatternsMod

import typings.std.Record
import typings.xstate.Anon_TypeTEventType
import typings.xstate.libTypesMod.AtomicStateNodeConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate/lib/patterns", "toggle")
@js.native
object toggle extends js.Object {
  def apply[TEventType /* <: String */](onState: String, offState: String, eventType: TEventType): Record[String, AtomicStateNodeConfig[_, Anon_TypeTEventType[TEventType]]] = js.native
}

