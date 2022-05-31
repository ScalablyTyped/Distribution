package typings.tabris.global

import typings.tabris.ResponseInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Response
/**
  * Represents an HTTP Response as used by `fetch()`.
  */
@JSGlobal("Response")
@js.native
class Response ()
  extends StObject
     with typings.tabris.Response {
  def this(body: String) = this()
  def this(body: typings.tabris.Blob) = this()
  def this(body: typings.tabris.FormData) = this()
  def this(body: String, init: ResponseInit) = this()
  def this(body: Unit, init: ResponseInit) = this()
  def this(body: typings.tabris.Blob, init: ResponseInit) = this()
  def this(body: typings.tabris.FormData, init: ResponseInit) = this()
}
object Response {
  
  @JSGlobal("Response")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def error(): typings.tabris.Response = ^.asInstanceOf[js.Dynamic].applyDynamic("error")().asInstanceOf[typings.tabris.Response]
  
  /* static member */
  inline def redirect(url: String, status: Double): typings.tabris.Response = (^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any], status.asInstanceOf[js.Any])).asInstanceOf[typings.tabris.Response]
}
