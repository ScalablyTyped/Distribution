package typings
package thriftLib.thriftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebServerOptions[TProcessor, THandler] extends js.Object {
  var services: org.scalablytyped.runtime.StringDictionary[thriftLib.Anon_HandlerProcessor[TProcessor, THandler]]
}

object WebServerOptions {
  @scala.inline
  def apply[TProcessor, THandler](
    services: org.scalablytyped.runtime.StringDictionary[thriftLib.Anon_HandlerProcessor[TProcessor, THandler]]
  ): WebServerOptions[TProcessor, THandler] = {
    val __obj = js.Dynamic.literal(services = services)
  
    __obj.asInstanceOf[WebServerOptions[TProcessor, THandler]]
  }
}

