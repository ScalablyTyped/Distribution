package typings.stylableNode

import typings.std.Set
import typings.stylableNode.anon.Errors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@stylable/node/cjs/find-files", JSImport.Namespace)
@js.native
object findFilesMod extends js.Object {
  
  def findFiles(fs: FileSystem, rootDirectory: String, ext: String, blacklist: Set[String]): Errors = js.native
  def findFiles(fs: FileSystem, rootDirectory: String, ext: String, blacklist: Set[String], useRelative: Boolean): Errors = js.native
  
  type FileSystem = js.Any
}
