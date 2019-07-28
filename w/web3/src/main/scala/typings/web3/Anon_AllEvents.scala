package typings.web3

import org.scalablytyped.runtime.StringDictionary
import typings.web3.typesMod.Callback
import typings.web3.typesMod.EventEmitter
import typings.web3.typesMod.EventLog
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AllEvents
  extends /* eventName */ StringDictionary[
      js.Function2[
        /* options */ js.UndefOr[Anon_Filter], 
        /* cb */ js.UndefOr[Callback[EventLog]], 
        EventEmitter
      ]
    ] {
  def allEvents(): EventEmitter = js.native
  def allEvents(options: Anon_Filter): EventEmitter = js.native
  def allEvents(options: Anon_Filter, cb: Callback[EventLog]): EventEmitter = js.native
}

