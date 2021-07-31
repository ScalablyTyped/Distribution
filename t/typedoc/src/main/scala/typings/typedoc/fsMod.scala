package typings.typedoc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fsMod {
  
  @JSImport("typedoc/dist/lib/utils/fs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def directoryExists(directoryPath: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("directoryExists")(directoryPath.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def ensureDirectoriesExist(directoryPath: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("ensureDirectoriesExist")(directoryPath.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def normalizePath(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizePath")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def readFile(file: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("readFile")(file.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def writeFile(fileName: String, data: String, writeByteOrderMark: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(fileName.asInstanceOf[js.Any], data.asInstanceOf[js.Any], writeByteOrderMark.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def writeFile(
    fileName: String,
    data: String,
    writeByteOrderMark: Boolean,
    onError: js.Function1[/* message */ String, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("writeFile")(fileName.asInstanceOf[js.Any], data.asInstanceOf[js.Any], writeByteOrderMark.asInstanceOf[js.Any], onError.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
