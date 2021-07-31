package typings.stylableNode

import typings.std.ReturnType
import typings.std.Set
import typings.stylableNode.anon.Errors
import typings.stylableNode.anon.FnCall
import typings.stylableNode.anon.PartialOptions
import typings.stylableNode.findFilesMod.FileSystem
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@stylable/node", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def attachHook(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("attachHook")().asInstanceOf[Unit]
  @scala.inline
  def attachHook(hasMatcherAfterCompileStylableConfigRuntimePathIgnoreJSModules: PartialOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("attachHook")(hasMatcherAfterCompileStylableConfigRuntimePathIgnoreJSModules.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def findFiles(fs: FileSystem, rootDirectory: String, ext: String, blacklist: Set[String]): Errors = (^.asInstanceOf[js.Dynamic].applyDynamic("findFiles")(fs.asInstanceOf[js.Any], rootDirectory.asInstanceOf[js.Any], ext.asInstanceOf[js.Any], blacklist.asInstanceOf[js.Any])).asInstanceOf[Errors]
  @scala.inline
  def findFiles(fs: FileSystem, rootDirectory: String, ext: String, blacklist: Set[String], useRelative: Boolean): Errors = (^.asInstanceOf[js.Dynamic].applyDynamic("findFiles")(fs.asInstanceOf[js.Any], rootDirectory.asInstanceOf[js.Any], ext.asInstanceOf[js.Any], blacklist.asInstanceOf[js.Any], useRelative.asInstanceOf[js.Any])).asInstanceOf[Errors]
  
  @JSImport("@stylable/node", "resolveNamespace")
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
