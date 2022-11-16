package typings.tsconfigPaths

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libFilesystemMod {
  
  @JSImport("tsconfig-paths/lib/filesystem", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fileExistsAsync(
    path2: String,
    callback2: js.Function2[/* err */ js.UndefOr[js.Error], /* exists */ js.UndefOr[Boolean], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fileExistsAsync")(path2.asInstanceOf[js.Any], callback2.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def fileExistsSync(path: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("fileExistsSync")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def readJsonFromDiskAsync(
    path: String,
    callback: js.Function2[/* err */ js.UndefOr[js.Error], /* content */ js.UndefOr[Any], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readJsonFromDiskAsync")(path.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def readJsonFromDiskSync(packageJsonPath: String): js.UndefOr[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("readJsonFromDiskSync")(packageJsonPath.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Any]]
  
  inline def removeExtension(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("removeExtension")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type FileExistsAsync_ = js.Function2[
    /* path */ String, 
    /* callback */ js.Function2[/* err */ js.UndefOr[js.Error], /* exists */ js.UndefOr[Boolean], Unit], 
    Unit
  ]
  
  type FileExistsSync_ = js.Function1[/* name */ String, Boolean]
  
  /** 
  NOTE: Rewritten from type alias:
  {{{
  type PackageJson = {[key: string] : string | tsconfig-paths.tsconfig-paths/lib/filesystem.PackageJson}
  }}}
  to avoid circular code involving: 
  - tsconfig-paths.tsconfig-paths/lib/filesystem.PackageJson
  */
  trait PackageJson
    extends StObject
       with /* key */ StringDictionary[String | PackageJson]
  object PackageJson {
    
    inline def apply(): PackageJson = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PackageJson]
    }
  }
  
  type ReadJsonAsync = js.Function2[/* path */ String, /* callback */ ReadJsonAsyncCallback, Unit]
  
  type ReadJsonAsyncCallback = js.Function2[/* err */ js.UndefOr[js.Error], /* content */ js.UndefOr[Any], Unit]
  
  type ReadJsonSync = js.Function1[/* packageJsonPath */ String, js.UndefOr[Any]]
}
