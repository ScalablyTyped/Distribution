package typings.wrench

import typings.wrench.anon.Preserve
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("wrench", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wrench", "LineReader")
  @js.native
  open class LineReader protected () extends StObject {
    def this(filename: String) = this()
    def this(filename: String, bufferSize: Double) = this()
    
    def getBufferAndSetCurrentPosition(position: Double): Double = js.native
    
    def getNextLine(): String = js.native
    
    def hasNextLine(): Boolean = js.native
  }
  
  inline def chmodSyncRecursive(sourceDir: String, filemode: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("chmodSyncRecursive")(sourceDir.asInstanceOf[js.Any], filemode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def chownSyncRecursive(sourceDir: String, uid: Double, gid: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("chownSyncRecursive")(sourceDir.asInstanceOf[js.Any], uid.asInstanceOf[js.Any], gid.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def copyDirRecursive(srcDir: String, newDir: String, fn: js.Function1[/* err */ js.Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copyDirRecursive")(srcDir.asInstanceOf[js.Any], newDir.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def copyDirSyncRecursive(sourceDir: String, newDirLocation: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copyDirSyncRecursive")(sourceDir.asInstanceOf[js.Any], newDirLocation.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def copyDirSyncRecursive(sourceDir: String, newDirLocation: String, opts: Preserve): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("copyDirSyncRecursive")(sourceDir.asInstanceOf[js.Any], newDirLocation.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def mkdirSyncRecursive(path: String, mode: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSyncRecursive")(path.asInstanceOf[js.Any], mode.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def readdirRecursive(baseDir: String, fn: js.Function2[/* err */ js.Error, /* files */ js.Array[String], Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("readdirRecursive")(baseDir.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def readdirSyncRecursive(baseDir: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("readdirSyncRecursive")(baseDir.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def rmdirRecursive(path: String, fn: js.Function1[/* err */ js.Error, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rmdirRecursive")(path.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def rmdirSyncRecursive(path: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("rmdirSyncRecursive")(path.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def rmdirSyncRecursive(path: String, failSilent: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("rmdirSyncRecursive")(path.asInstanceOf[js.Any], failSilent.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
