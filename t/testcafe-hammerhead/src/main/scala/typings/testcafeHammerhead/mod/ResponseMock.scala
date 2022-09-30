package typings.testcafeHammerhead.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("testcafe-hammerhead", "ResponseMock")
@js.native
open class ResponseMock protected () extends StObject {
  /** Creates a ResponseMock instance **/
  def this(body: String) = this()
  def this(body: js.Function) = this()
  def this(body: String, statusCode: Double) = this()
  def this(body: js.Function, statusCode: Double) = this()
  def this(body: String, statusCode: Double, headers: js.Object) = this()
  def this(body: String, statusCode: Unit, headers: js.Object) = this()
  def this(body: js.Function, statusCode: Double, headers: js.Object) = this()
  def this(body: js.Function, statusCode: Unit, headers: js.Object) = this()
  
  /** The body of the response mock **/
  var body: String | js.Function = js.native
  
  /** The unique identifier of the response mock **/
  var id: String = js.native
  
  /** Indicates that response defines as a function **/
  var isPredicate: Boolean = js.native
}
/* static members */
object ResponseMock {
  
  @JSImport("testcafe-hammerhead", "ResponseMock")
  @js.native
  val ^ : js.Any = js.native
  
  /** Creates an ResponseMock instance from object **/
  inline def from(`val`: js.Object): ResponseMock = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(`val`.asInstanceOf[js.Any]).asInstanceOf[ResponseMock]
}
