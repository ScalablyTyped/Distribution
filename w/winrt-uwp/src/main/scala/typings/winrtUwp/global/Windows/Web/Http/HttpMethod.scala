package typings.winrtUwp.global.Windows.Web.Http

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Retrieves standard HTTP methods such as GET and POST and creates new HTTP methods. */
@JSGlobal("Windows.Web.Http.HttpMethod")
@js.native
class HttpMethod protected ()
  extends StObject
     with typings.winrtUwp.Windows.Web.Http.HttpMethod {
  /**
    * Initializes a new instance of the HttpMethod class with a specific HTTP method.
    * @param method The HTTP method.
    */
  def this(method: String) = this()
  
  /** Gets the HTTP method. */
  /* CompleteClass */
  var method: String = js.native
}
object HttpMethod {
  
  @JSGlobal("Windows.Web.Http.HttpMethod")
  @js.native
  val ^ : js.Any = js.native
  
  /** Gets the HTTP DELETE method. */
  /* static member */
  @JSGlobal("Windows.Web.Http.HttpMethod.delete")
  @js.native
  def delete: typings.winrtUwp.Windows.Web.Http.HttpMethod = js.native
  inline def delete_=(x: typings.winrtUwp.Windows.Web.Http.HttpMethod): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("delete")(x.asInstanceOf[js.Any])
  
  /** Gets the HTTP GET method. */
  /* static member */
  @JSGlobal("Windows.Web.Http.HttpMethod.get")
  @js.native
  def get: typings.winrtUwp.Windows.Web.Http.HttpMethod = js.native
  inline def get_=(x: typings.winrtUwp.Windows.Web.Http.HttpMethod): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("get")(x.asInstanceOf[js.Any])
  
  /** Gets the HTTP HEAD method. */
  /* static member */
  @JSGlobal("Windows.Web.Http.HttpMethod.head")
  @js.native
  def head: typings.winrtUwp.Windows.Web.Http.HttpMethod = js.native
  inline def head_=(x: typings.winrtUwp.Windows.Web.Http.HttpMethod): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("head")(x.asInstanceOf[js.Any])
  
  /** Gets the HTTP OPTIONS method. */
  /* static member */
  @JSGlobal("Windows.Web.Http.HttpMethod.options")
  @js.native
  def options: typings.winrtUwp.Windows.Web.Http.HttpMethod = js.native
  inline def options_=(x: typings.winrtUwp.Windows.Web.Http.HttpMethod): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
  
  /** Gets the HTTP PATCH method, */
  /* static member */
  @JSGlobal("Windows.Web.Http.HttpMethod.patch")
  @js.native
  def patch: typings.winrtUwp.Windows.Web.Http.HttpMethod = js.native
  inline def patch_=(x: typings.winrtUwp.Windows.Web.Http.HttpMethod): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("patch")(x.asInstanceOf[js.Any])
  
  /** Gets the HTTP POST method. */
  /* static member */
  @JSGlobal("Windows.Web.Http.HttpMethod.post")
  @js.native
  def post: typings.winrtUwp.Windows.Web.Http.HttpMethod = js.native
  inline def post_=(x: typings.winrtUwp.Windows.Web.Http.HttpMethod): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("post")(x.asInstanceOf[js.Any])
  
  /** Gets the HTTP PUT method. */
  /* static member */
  @JSGlobal("Windows.Web.Http.HttpMethod.put")
  @js.native
  def put: typings.winrtUwp.Windows.Web.Http.HttpMethod = js.native
  inline def put_=(x: typings.winrtUwp.Windows.Web.Http.HttpMethod): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("put")(x.asInstanceOf[js.Any])
}
