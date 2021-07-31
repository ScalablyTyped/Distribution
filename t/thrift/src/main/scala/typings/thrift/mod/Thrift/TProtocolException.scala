package typings.thrift.mod.Thrift

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("thrift", "Thrift.TProtocolException")
@js.native
class TProtocolException protected ()
  extends StObject
     with Error {
  def this(`type`: TProtocolExceptionType, message: String) = this()
  
  /* CompleteClass */
  var message: String = js.native
  
  /* CompleteClass */
  var name: String = js.native
  
  var `type`: TProtocolExceptionType = js.native
}
