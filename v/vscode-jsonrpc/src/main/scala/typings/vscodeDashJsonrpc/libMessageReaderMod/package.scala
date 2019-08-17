package typings.vscodeDashJsonrpc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libMessageReaderMod {
  import typings.vscodeDashJsonrpc.libMessagesMod.Message

  type DataCallback = js.Function1[/* data */ Message, Unit]
}
