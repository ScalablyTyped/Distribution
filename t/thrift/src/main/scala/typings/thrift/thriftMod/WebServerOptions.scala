package typings.thrift.thriftMod

import org.scalablytyped.runtime.StringDictionary
import typings.thrift.Anon_HandlerProcessor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebServerOptions[TProcessor, THandler] extends js.Object {
  var services: StringDictionary[Anon_HandlerProcessor[TProcessor, THandler]]
}

object WebServerOptions {
  @scala.inline
  def apply[TProcessor, THandler](services: StringDictionary[Anon_HandlerProcessor[TProcessor, THandler]]): WebServerOptions[TProcessor, THandler] = {
    val __obj = js.Dynamic.literal(services = services)
  
    __obj.asInstanceOf[WebServerOptions[TProcessor, THandler]]
  }
}

