package typings.thrift.mod.Thrift

import typings.thrift.mod.TProtocol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("thrift", "Thrift.TApplicationException")
@js.native
class TApplicationException () extends TException {
  def this(`type`: TApplicationExceptionType) = this()
  def this(`type`: js.UndefOr[scala.Nothing], message: String) = this()
  def this(`type`: TApplicationExceptionType, message: String) = this()
  
  var code: Double = js.native
  
  def getCode(): Double = js.native
  
  def read(input: TProtocol): Unit = js.native
  
  def write(output: TProtocol): Unit = js.native
}
