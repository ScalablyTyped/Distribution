package typings.wrench

import typings.std.Error
import typings.wrench.anon.Preserve
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("wrench", "LineReader")
  @js.native
  class LineReader protected () extends StObject {
    def this(filename: String) = this()
    def this(filename: String, bufferSize: Double) = this()
    
    def getBufferAndSetCurrentPosition(position: Double): Double = js.native
    
    def getNextLine(): String = js.native
    
    def hasNextLine(): Boolean = js.native
  }
  
  @JSImport("wrench", "chmodSyncRecursive")
  @js.native
  def chmodSyncRecursive(sourceDir: String, filemode: Double): Unit = js.native
  
  @JSImport("wrench", "chownSyncRecursive")
  @js.native
  def chownSyncRecursive(sourceDir: String, uid: Double, gid: Double): Unit = js.native
  
  @JSImport("wrench", "copyDirRecursive")
  @js.native
  def copyDirRecursive(srcDir: String, newDir: String, fn: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  @JSImport("wrench", "copyDirSyncRecursive")
  @js.native
  def copyDirSyncRecursive(sourceDir: String, newDirLocation: String): Unit = js.native
  @JSImport("wrench", "copyDirSyncRecursive")
  @js.native
  def copyDirSyncRecursive(sourceDir: String, newDirLocation: String, opts: Preserve): Unit = js.native
  
  @JSImport("wrench", "mkdirSyncRecursive")
  @js.native
  def mkdirSyncRecursive(path: String, mode: Double): Unit = js.native
  
  @JSImport("wrench", "readdirRecursive")
  @js.native
  def readdirRecursive(baseDir: String, fn: js.Function2[/* err */ Error, /* files */ js.Array[String], Unit]): Unit = js.native
  
  @JSImport("wrench", "readdirSyncRecursive")
  @js.native
  def readdirSyncRecursive(baseDir: String): js.Array[String] = js.native
  
  @JSImport("wrench", "rmdirRecursive")
  @js.native
  def rmdirRecursive(path: String, fn: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  @JSImport("wrench", "rmdirSyncRecursive")
  @js.native
  def rmdirSyncRecursive(path: String): Unit = js.native
  @JSImport("wrench", "rmdirSyncRecursive")
  @js.native
  def rmdirSyncRecursive(path: String, failSilent: Boolean): Unit = js.native
}
