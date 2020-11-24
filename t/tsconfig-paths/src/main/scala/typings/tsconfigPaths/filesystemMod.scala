package typings.tsconfigPaths

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("tsconfig-paths/lib/filesystem", JSImport.Namespace)
@js.native
object filesystemMod extends js.Object {
  
  def fileExistsAsync(
    path2: String,
    callback2: js.Function2[/* err */ js.UndefOr[Error], /* exists */ js.UndefOr[Boolean], Unit]
  ): Unit = js.native
  
  def fileExistsSync(path: String): Boolean = js.native
  
  def readJsonFromDiskAsync(
    path: String,
    callback: js.Function2[/* err */ js.UndefOr[Error], /* content */ js.UndefOr[js.Any], Unit]
  ): Unit = js.native
  
  def readJsonFromDiskSync(packageJsonPath: String): js.UndefOr[js.Any] = js.native
  
  def removeExtension(path: String): String = js.native
  
  type FileExistsAsync_ = js.Function2[
    /* path */ String, 
    /* callback */ js.Function2[/* err */ js.UndefOr[Error], /* exists */ js.UndefOr[Boolean], Unit], 
    Unit
  ]
  
  type FileExistsSync_ = js.Function1[/* name */ String, Boolean]
  
  type PackageJson = StringDictionary[String]
  
  type ReadJsonAsync = js.Function2[/* path */ String, /* callback */ ReadJsonAsyncCallback, Unit]
  
  type ReadJsonAsyncCallback = js.Function2[/* err */ js.UndefOr[Error], /* content */ js.UndefOr[js.Any], Unit]
  
  type ReadJsonSync = js.Function1[/* packageJsonPath */ String, js.UndefOr[js.Any]]
}
