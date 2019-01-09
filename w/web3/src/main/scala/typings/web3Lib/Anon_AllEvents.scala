package typings
package web3Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AllEvents
  extends /* eventName */ org.scalablytyped.runtime.StringDictionary[
      js.Function2[
        /* options */ js.UndefOr[Anon_Filter], 
        /* cb */ js.UndefOr[web3Lib.typesMod.Callback[web3Lib.typesMod.EventLog]], 
        web3Lib.typesMod.EventEmitter
      ]
    ] {
  def allEvents(): web3Lib.typesMod.EventEmitter = js.native
  def allEvents(options: Anon_Filter): web3Lib.typesMod.EventEmitter = js.native
  def allEvents(options: Anon_Filter, cb: web3Lib.typesMod.Callback[web3Lib.typesMod.EventLog]): web3Lib.typesMod.EventEmitter = js.native
}

