package typings.webix.global.webix

import typings.webix.mod.GraphQLProxy
import typings.webix.mod.binaryProxy
import typings.webix.mod.debugProxy
import typings.webix.mod.jsonProxy
import typings.webix.mod.postProxy
import typings.webix.mod.restProxy
import typings.webix.webix.ProxyName
import typings.webix.webix.ProxyType
import typings.webix.webix.obj
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object proxy {
  
  inline def apply[T /* <: ProxyName */](`type`: T, source: String): ProxyType[T] = (^.asInstanceOf[js.Dynamic].apply(`type`.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[ProxyType[T]]
  inline def apply[T /* <: ProxyName */](`type`: T, source: String, config: obj): ProxyType[T] = (^.asInstanceOf[js.Dynamic].apply(`type`.asInstanceOf[js.Any], source.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[ProxyType[T]]
  
  @JSGlobal("webix.proxy")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("webix.proxy.GraphQL")
  @js.native
  val GraphQL: GraphQLProxy & typings.webix.webix.GraphQLProxy = js.native
  
  @JSGlobal("webix.proxy.binary")
  @js.native
  val binary: binaryProxy & typings.webix.webix.binaryProxy = js.native
  
  @JSGlobal("webix.proxy.debug")
  @js.native
  val debug: debugProxy & typings.webix.webix.debugProxy = js.native
  
  @JSGlobal("webix.proxy.json")
  @js.native
  val json: jsonProxy & typings.webix.webix.jsonProxy = js.native
  
  @JSGlobal("webix.proxy.post")
  @js.native
  val post: postProxy & typings.webix.webix.postProxy = js.native
  
  @JSGlobal("webix.proxy.rest")
  @js.native
  val rest: restProxy & typings.webix.webix.restProxy = js.native
}
