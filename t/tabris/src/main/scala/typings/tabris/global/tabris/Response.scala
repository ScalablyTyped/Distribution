package typings.tabris.global.tabris

import typings.tabris.Blob
import typings.tabris.FormData
import typings.tabris.ResponseInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Response
/**
  * Represents an HTTP Response as used by `fetch()`.
  */
/* was `typeof Response` */
@JSGlobal("tabris.Response")
@js.native
class Response ()
  extends typings.tabris.mod.Response {
  def this(body: String) = this()
  def this(body: Blob) = this()
  def this(body: FormData) = this()
  def this(body: String, init: ResponseInit) = this()
  def this(body: Unit, init: ResponseInit) = this()
  def this(body: Blob, init: ResponseInit) = this()
  def this(body: FormData, init: ResponseInit) = this()
}
/* was `typeof Response` */
object Response {
  
  @JSGlobal("tabris.Response")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def error(): typings.tabris.Response = ^.asInstanceOf[js.Dynamic].applyDynamic("error")().asInstanceOf[typings.tabris.Response]
  
  /* static member */
  inline def redirect(url: String, status: Double): typings.tabris.Response = (^.asInstanceOf[js.Dynamic].applyDynamic("redirect")(url.asInstanceOf[js.Any], status.asInstanceOf[js.Any])).asInstanceOf[typings.tabris.Response]
}
