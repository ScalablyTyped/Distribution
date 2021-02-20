package typings.typedoc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fsMod {
  
  @JSImport("typedoc/dist/lib/utils/fs", "directoryExists")
  @js.native
  def directoryExists(directoryPath: String): Boolean = js.native
  
  @JSImport("typedoc/dist/lib/utils/fs", "ensureDirectoriesExist")
  @js.native
  def ensureDirectoriesExist(directoryPath: String): Unit = js.native
  
  @JSImport("typedoc/dist/lib/utils/fs", "normalizePath")
  @js.native
  def normalizePath(path: String): String = js.native
  
  @JSImport("typedoc/dist/lib/utils/fs", "readFile")
  @js.native
  def readFile(file: String): String = js.native
  
  @JSImport("typedoc/dist/lib/utils/fs", "writeFile")
  @js.native
  def writeFile(fileName: String, data: String, writeByteOrderMark: Boolean): Unit = js.native
  @JSImport("typedoc/dist/lib/utils/fs", "writeFile")
  @js.native
  def writeFile(
    fileName: String,
    data: String,
    writeByteOrderMark: Boolean,
    onError: js.Function1[/* message */ String, Unit]
  ): Unit = js.native
}
