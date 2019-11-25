package typings.xmlrpc

import typings.xmlrpc.xmlrpcMod.HeadersProcessor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Processors extends js.Object {
  var processors: js.Array[HeadersProcessor]
}

object Anon_Processors {
  @scala.inline
  def apply(processors: js.Array[HeadersProcessor]): Anon_Processors = {
    val __obj = js.Dynamic.literal(processors = processors.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Processors]
  }
}

