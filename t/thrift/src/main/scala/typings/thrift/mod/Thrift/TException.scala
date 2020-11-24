package typings.thrift.mod.Thrift

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("thrift", "Thrift.TException")
@js.native
class TException protected () extends Error {
  def this(message: String) = this()
  
  def getMessage(): String = js.native
}
