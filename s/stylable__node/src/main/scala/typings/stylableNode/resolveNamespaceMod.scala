package typings.stylableNode

import typings.std.ReturnType
import typings.stylableNode.anon.FnCall
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object resolveNamespaceMod {
  
  @JSImport("@stylable/node/cjs/resolve-namespace", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@stylable/node/cjs/resolve-namespace", "resolveNamespace")
  @js.native
  val resolveNamespace: ReturnType[FnCall] = js.native
  
  @scala.inline
  def resolveNamespaceFactory(): ReturnType[FnCall] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveNamespaceFactory")().asInstanceOf[ReturnType[FnCall]]
  @scala.inline
  def resolveNamespaceFactory(hashSalt: String): ReturnType[FnCall] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveNamespaceFactory")(hashSalt.asInstanceOf[js.Any]).asInstanceOf[ReturnType[FnCall]]
  @scala.inline
  def resolveNamespaceFactory(hashSalt: String, prefix: String): ReturnType[FnCall] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveNamespaceFactory")(hashSalt.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[ReturnType[FnCall]]
  @scala.inline
  def resolveNamespaceFactory(hashSalt: Unit, prefix: String): ReturnType[FnCall] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveNamespaceFactory")(hashSalt.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[ReturnType[FnCall]]
}
