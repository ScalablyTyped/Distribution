package typings.stylableNode

import typings.std.ReturnType
import typings.stylableNode.anon.FnCall
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@stylable/node/cjs/resolve-namespace", JSImport.Namespace)
@js.native
object resolveNamespaceMod extends js.Object {
  
  val resolveNamespace: ReturnType[FnCall] = js.native
  
  def resolveNamespaceFactory(): ReturnType[FnCall] = js.native
  def resolveNamespaceFactory(hashSalt: js.UndefOr[scala.Nothing], prefix: String): ReturnType[FnCall] = js.native
  def resolveNamespaceFactory(hashSalt: String): ReturnType[FnCall] = js.native
  def resolveNamespaceFactory(hashSalt: String, prefix: String): ReturnType[FnCall] = js.native
}
