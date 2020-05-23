package typings.xmlrpc.anon

import typings.xmlrpc.mod.HeadersProcessor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Processors extends js.Object {
  var processors: js.Array[HeadersProcessor]
}

object Processors {
  @scala.inline
  def apply(processors: js.Array[HeadersProcessor]): Processors = {
    val __obj = js.Dynamic.literal(processors = processors.asInstanceOf[js.Any])
    __obj.asInstanceOf[Processors]
  }
}

