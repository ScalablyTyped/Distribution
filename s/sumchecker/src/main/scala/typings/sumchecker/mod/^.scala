package typings.sumchecker.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("sumchecker", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def apply(algorithm: String, checksumFilename: String, baseDir: String, filesToCheck: String): js.Promise[Unit] = js.native
  def apply(algorithm: String, checksumFilename: String, baseDir: String, filesToCheck: js.Array[String]): js.Promise[Unit] = js.native
}
