package typings.tedious.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tedious", "RequestError")
@js.native
class RequestError ()
  extends StObject
     with Error {
  def this(message: String) = this()
  def this(message: String, code: String) = this()
  def this(message: Unit, code: String) = this()
  
  var code: String = js.native
  
  /* CompleteClass */
  var message: String = js.native
  
  /* CompleteClass */
  var name: String = js.native
}
