package typings.testcafe.mod.global

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Request Mock
//----------------------------------------------------------------------------------------------------------------------
@js.native
trait RequestMock extends StObject {
  
  /**
    * Specifies requests to intercept
    * @param filter - Specifies which requests should be mocked with a response that follows in the `respond` method.
    */
  def onRequestTo(filter: String): RequestMock = js.native
  def onRequestTo(filter: js.Function1[/* req */ RequestMockOptions, Boolean]): RequestMock = js.native
  def onRequestTo(filter: js.Object): RequestMock = js.native
  def onRequestTo(filter: js.RegExp): RequestMock = js.native
  
  /**
    * Specifies the mocked response.
    * @param body - The mocked response body.
    * @param statusCode - The response status code.
    * @param headers - Custom headers added to the response in the property-value form.
    */
  def respond(): RequestMock = js.native
  def respond(body: String): RequestMock = js.native
  def respond(body: String, statusCode: Double): RequestMock = js.native
  def respond(body: String, statusCode: Double, headers: Record[String, String]): RequestMock = js.native
  def respond(body: String, statusCode: Unit, headers: Record[String, String]): RequestMock = js.native
  def respond(body: js.Function2[/* req */ RequestMockOptions, /* res */ ResponseMock, js.Promise[Unit] | Unit]): RequestMock = js.native
  def respond(
    body: js.Function2[/* req */ RequestMockOptions, /* res */ ResponseMock, js.Promise[Unit] | Unit],
    statusCode: Double
  ): RequestMock = js.native
  def respond(
    body: js.Function2[/* req */ RequestMockOptions, /* res */ ResponseMock, js.Promise[Unit] | Unit],
    statusCode: Double,
    headers: Record[String, String]
  ): RequestMock = js.native
  def respond(
    body: js.Function2[/* req */ RequestMockOptions, /* res */ ResponseMock, js.Promise[Unit] | Unit],
    statusCode: Unit,
    headers: Record[String, String]
  ): RequestMock = js.native
  def respond(body: js.Object): RequestMock = js.native
  def respond(body: js.Object, statusCode: Double): RequestMock = js.native
  def respond(body: js.Object, statusCode: Double, headers: Record[String, String]): RequestMock = js.native
  def respond(body: js.Object, statusCode: Unit, headers: Record[String, String]): RequestMock = js.native
  def respond(body: Unit, statusCode: Double): RequestMock = js.native
  def respond(body: Unit, statusCode: Double, headers: Record[String, String]): RequestMock = js.native
  def respond(body: Unit, statusCode: Unit, headers: Record[String, String]): RequestMock = js.native
}
object RequestMock {
  
  inline def apply: RequestMockFactory = js.Dynamic.global.selectDynamic("RequestMock").asInstanceOf[RequestMockFactory]
}
