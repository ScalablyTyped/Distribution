package typings.thrift.mod.Thrift

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("thrift", "Thrift.TException")
@js.native
class TException protected ()
  extends StObject
     with Error {
  def this(message: String) = this()
  
  def getMessage(): String = js.native
  
  /* CompleteClass */
  var message: String = js.native
  
  /* CompleteClass */
  var name: String = js.native
}
