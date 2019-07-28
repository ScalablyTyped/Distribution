package typings.vscodeDashJsonrpc

import typings.vscodeDashJsonrpc.libMessagesMod.Message
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libMessageReaderMod {
  type DataCallback = js.Function1[/* data */ Message, Unit]
}
