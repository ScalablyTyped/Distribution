package typings.urllib

import typings.node.httpMod.IncomingMessage
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object urllibMod {
  type Callback[T] = js.Function3[/* err */ Error, /* data */ T, /* res */ IncomingMessage, Unit]
}
