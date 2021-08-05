package typings.typeorm

import typings.typeorm.loggerLoggerMod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilDirectoryExportedClassesLoaderMod {
  
  @JSImport("typeorm/util/DirectoryExportedClassesLoader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def importClassesFromDirectories(logger: Logger, directories: js.Array[String]): js.Array[js.Function] = (^.asInstanceOf[js.Dynamic].applyDynamic("importClassesFromDirectories")(logger.asInstanceOf[js.Any], directories.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Function]]
  inline def importClassesFromDirectories(logger: Logger, directories: js.Array[String], formats: js.Array[String]): js.Array[js.Function] = (^.asInstanceOf[js.Dynamic].applyDynamic("importClassesFromDirectories")(logger.asInstanceOf[js.Any], directories.asInstanceOf[js.Any], formats.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Function]]
  
  inline def importJsonsFromDirectories(directories: js.Array[String]): js.Array[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("importJsonsFromDirectories")(directories.asInstanceOf[js.Any]).asInstanceOf[js.Array[js.Any]]
  inline def importJsonsFromDirectories(directories: js.Array[String], format: String): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("importJsonsFromDirectories")(directories.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
}
