package typings.xmlrpc

import typings.xmlrpc.mod.HeadersProcessor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonProcessors extends js.Object {
  var processors: js.Array[HeadersProcessor]
}

object AnonProcessors {
  @scala.inline
  def apply(processors: js.Array[HeadersProcessor]): AnonProcessors = {
    val __obj = js.Dynamic.literal(processors = processors.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonProcessors]
  }
}

