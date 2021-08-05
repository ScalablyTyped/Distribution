package typings.stylableNode

import typings.std.Set
import typings.stylableNode.anon.Errors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object findFilesMod {
  
  @JSImport("@stylable/node/cjs/find-files", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findFiles(fs: FileSystem, rootDirectory: String, ext: String, blacklist: Set[String]): Errors = (^.asInstanceOf[js.Dynamic].applyDynamic("findFiles")(fs.asInstanceOf[js.Any], rootDirectory.asInstanceOf[js.Any], ext.asInstanceOf[js.Any], blacklist.asInstanceOf[js.Any])).asInstanceOf[Errors]
  inline def findFiles(fs: FileSystem, rootDirectory: String, ext: String, blacklist: Set[String], useRelative: Boolean): Errors = (^.asInstanceOf[js.Dynamic].applyDynamic("findFiles")(fs.asInstanceOf[js.Any], rootDirectory.asInstanceOf[js.Any], ext.asInstanceOf[js.Any], blacklist.asInstanceOf[js.Any], useRelative.asInstanceOf[js.Any])).asInstanceOf[Errors]
  
  type FileSystem = js.Any
}
