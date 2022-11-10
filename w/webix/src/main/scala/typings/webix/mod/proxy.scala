package typings.webix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object proxy {
  
  inline def apply[T /* <: ProxyName */](`type`: T, source: String): ProxyType[T] = (^.asInstanceOf[js.Dynamic].apply(`type`.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[ProxyType[T]]
  inline def apply[T /* <: ProxyName */](`type`: T, source: String, config: obj): ProxyType[T] = (^.asInstanceOf[js.Dynamic].apply(`type`.asInstanceOf[js.Any], source.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[ProxyType[T]]
  
  @JSImport("webix", "proxy")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("webix", "proxy.GraphQL")
  @js.native
  val GraphQL: GraphQLProxy = js.native
  
  @JSImport("webix", "proxy.binary")
  @js.native
  val binary: binaryProxy = js.native
  
  @JSImport("webix", "proxy.debug")
  @js.native
  val debug: debugProxy = js.native
  
  @JSImport("webix", "proxy.json")
  @js.native
  val json: jsonProxy = js.native
  
  @JSImport("webix", "proxy.post")
  @js.native
  val post: postProxy = js.native
  
  @JSImport("webix", "proxy.rest")
  @js.native
  val rest: restProxy = js.native
}
