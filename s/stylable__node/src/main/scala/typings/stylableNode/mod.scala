package typings.stylableNode

import typings.std.ReturnType
import typings.std.Set
import typings.stylableNode.anon.Errors
import typings.stylableNode.anon.FnCall
import typings.stylableNode.anon.PartialOptions
import typings.stylableNode.findFilesMod.FileSystem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@stylable/node", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def attachHook(): Unit = js.native
  def attachHook(hasMatcherAfterCompileStylableConfigRuntimePathIgnoreJSModules: PartialOptions): Unit = js.native
  
  def findFiles(fs: FileSystem, rootDirectory: String, ext: String, blacklist: Set[String]): Errors = js.native
  def findFiles(fs: FileSystem, rootDirectory: String, ext: String, blacklist: Set[String], useRelative: Boolean): Errors = js.native
  
  val resolveNamespace: ReturnType[FnCall] = js.native
  
  def resolveNamespaceFactory(): ReturnType[FnCall] = js.native
  def resolveNamespaceFactory(hashSalt: js.UndefOr[scala.Nothing], prefix: String): ReturnType[FnCall] = js.native
  def resolveNamespaceFactory(hashSalt: String): ReturnType[FnCall] = js.native
  def resolveNamespaceFactory(hashSalt: String, prefix: String): ReturnType[FnCall] = js.native
}
