package typings
package twitLib.twitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Stream
  extends nodeLib.eventsMod.EventEmitter {
  def start(): scala.Unit = js.native
  def stop(): scala.Unit = js.native
}

