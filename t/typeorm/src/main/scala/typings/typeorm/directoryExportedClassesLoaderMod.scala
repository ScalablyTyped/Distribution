package typings.typeorm

import typings.typeorm.loggerMod.Logger
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/browser/util/DirectoryExportedClassesLoader", JSImport.Namespace)
@js.native
object directoryExportedClassesLoaderMod extends js.Object {
  
  def importClassesFromDirectories(logger: Logger, directories: js.Array[String]): js.Array[js.Function] = js.native
  def importClassesFromDirectories(logger: Logger, directories: js.Array[String], formats: js.Array[String]): js.Array[js.Function] = js.native
  
  def importJsonsFromDirectories(directories: js.Array[String]): js.Array[_] = js.native
  def importJsonsFromDirectories(directories: js.Array[String], format: String): js.Array[_] = js.native
}
