package typings.urllib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object urllibMod {
  import typings.node.httpMod.IncomingMessage
  import typings.std.Error

  type Callback[T] = js.Function3[/* err */ Error, /* data */ T, /* res */ IncomingMessage, Unit]
}
