package typings.stylableNode

import typings.std.Set
import typings.stylableNode.anon.Errors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object findFilesMod {
  
  @JSImport("@stylable/node/cjs/find-files", "findFiles")
  @js.native
  def findFiles(fs: FileSystem, rootDirectory: String, ext: String, blacklist: Set[String]): Errors = js.native
  @JSImport("@stylable/node/cjs/find-files", "findFiles")
  @js.native
  def findFiles(fs: FileSystem, rootDirectory: String, ext: String, blacklist: Set[String], useRelative: Boolean): Errors = js.native
  
  type FileSystem = js.Any
}
