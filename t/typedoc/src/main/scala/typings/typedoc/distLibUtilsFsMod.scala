package typings.typedoc

import typings.typedoc.anon.IncludeDirectories
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibUtilsFsMod {
  
  @JSImport("typedoc/dist/lib/utils/fs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def copy(src: String, dest: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("copy")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def copySync(src: String, dest: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copySync")(src.asInstanceOf[js.Any], dest.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getCommonDirectory(files: js.Array[String]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getCommonDirectory")(files.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def glob(pattern: String, root: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("glob")(pattern.asInstanceOf[js.Any], root.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def glob(pattern: String, root: String, options: IncludeDirectories): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("glob")(pattern.asInstanceOf[js.Any], root.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def normalizePath(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizePath")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def readFile(file: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(file.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def writeFile(fileName: String, data: String): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(fileName.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def writeFileSync(fileName: String, data: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFileSync")(fileName.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
