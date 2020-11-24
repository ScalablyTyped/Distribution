package typings.tcpPing.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tcp-ping", "ping")
@js.native
object ping extends js.Object {
  
  def apply(options: Options, callback: js.Function2[/* error */ Error, /* result */ Result, Unit]): Unit = js.native
}
