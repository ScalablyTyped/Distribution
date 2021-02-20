package typings.temp

import typings.node.fsMod.WriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("temp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("temp", "cleanup")
  @js.native
  def cleanup(): Unit = js.native
  @JSImport("temp", "cleanup")
  @js.native
  def cleanup(callback: js.Function2[/* err */ js.Any, /* result */ Stats, Unit]): Unit = js.native
  
  @JSImport("temp", "cleanupSync")
  @js.native
  def cleanupSync(): Boolean | Stats = js.native
  
  @JSImport("temp", "createWriteStream")
  @js.native
  def createWriteStream(): WriteStream = js.native
  @JSImport("temp", "createWriteStream")
  @js.native
  def createWriteStream(affixes: String): WriteStream = js.native
  @JSImport("temp", "createWriteStream")
  @js.native
  def createWriteStream(affixes: AffixOptions): WriteStream = js.native
  
  @JSImport("temp", "dir")
  @js.native
  def dir: String = js.native
  @scala.inline
  def dir_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dir")(x.asInstanceOf[js.Any])
  
  @JSImport("temp", "mkdir")
  @js.native
  def mkdir(): Unit = js.native
  @JSImport("temp", "mkdir")
  @js.native
  def mkdir(
    affixes: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ js.Any, /* dirPath */ String, Unit]
  ): Unit = js.native
  @JSImport("temp", "mkdir")
  @js.native
  def mkdir(affixes: String): Unit = js.native
  @JSImport("temp", "mkdir")
  @js.native
  def mkdir(affixes: String, callback: js.Function2[/* err */ js.Any, /* dirPath */ String, Unit]): Unit = js.native
  @JSImport("temp", "mkdir")
  @js.native
  def mkdir(affixes: AffixOptions): Unit = js.native
  @JSImport("temp", "mkdir")
  @js.native
  def mkdir(affixes: AffixOptions, callback: js.Function2[/* err */ js.Any, /* dirPath */ String, Unit]): Unit = js.native
  
  @JSImport("temp", "mkdirSync")
  @js.native
  def mkdirSync(): String = js.native
  @JSImport("temp", "mkdirSync")
  @js.native
  def mkdirSync(affixes: String): String = js.native
  @JSImport("temp", "mkdirSync")
  @js.native
  def mkdirSync(affixes: AffixOptions): String = js.native
  
  @JSImport("temp", "open")
  @js.native
  def open(): Unit = js.native
  @JSImport("temp", "open")
  @js.native
  def open(
    affixes: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* err */ js.Any, /* result */ OpenFile, Unit]
  ): Unit = js.native
  @JSImport("temp", "open")
  @js.native
  def open(affixes: String): Unit = js.native
  @JSImport("temp", "open")
  @js.native
  def open(affixes: String, callback: js.Function2[/* err */ js.Any, /* result */ OpenFile, Unit]): Unit = js.native
  @JSImport("temp", "open")
  @js.native
  def open(affixes: AffixOptions): Unit = js.native
  @JSImport("temp", "open")
  @js.native
  def open(affixes: AffixOptions, callback: js.Function2[/* err */ js.Any, /* result */ OpenFile, Unit]): Unit = js.native
  
  @JSImport("temp", "openSync")
  @js.native
  def openSync(): OpenFile = js.native
  @JSImport("temp", "openSync")
  @js.native
  def openSync(affixes: String): OpenFile = js.native
  @JSImport("temp", "openSync")
  @js.native
  def openSync(affixes: AffixOptions): OpenFile = js.native
  
  @JSImport("temp", "path")
  @js.native
  def path(): String = js.native
  @JSImport("temp", "path")
  @js.native
  def path(affixes: js.UndefOr[scala.Nothing], defaultPrefix: String): String = js.native
  @JSImport("temp", "path")
  @js.native
  def path(affixes: String): String = js.native
  @JSImport("temp", "path")
  @js.native
  def path(affixes: String, defaultPrefix: String): String = js.native
  @JSImport("temp", "path")
  @js.native
  def path(affixes: AffixOptions): String = js.native
  @JSImport("temp", "path")
  @js.native
  def path(affixes: AffixOptions, defaultPrefix: String): String = js.native
  
  @JSImport("temp", "track")
  @js.native
  def track(): js.Any = js.native
  @JSImport("temp", "track")
  @js.native
  def track(value: Boolean): js.Any = js.native
  
  @js.native
  trait AffixOptions extends StObject {
    
    var dir: js.UndefOr[String] = js.native
    
    var prefix: js.UndefOr[String] = js.native
    
    var suffix: js.UndefOr[String] = js.native
  }
  object AffixOptions {
    
    @scala.inline
    def apply(): AffixOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AffixOptions]
    }
    
    @scala.inline
    implicit class AffixOptionsMutableBuilder[Self <: AffixOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
    }
  }
  
  @js.native
  trait OpenFile extends StObject {
    
    var fd: Double = js.native
    
    var path: String = js.native
  }
  object OpenFile {
    
    @scala.inline
    def apply(fd: Double, path: String): OpenFile = {
      val __obj = js.Dynamic.literal(fd = fd.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[OpenFile]
    }
    
    @scala.inline
    implicit class OpenFileMutableBuilder[Self <: OpenFile] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFd(value: Double): Self = StObject.set(x, "fd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Stats extends StObject {
    
    var dirs: Double = js.native
    
    var files: Double = js.native
  }
  object Stats {
    
    @scala.inline
    def apply(dirs: Double, files: Double): Stats = {
      val __obj = js.Dynamic.literal(dirs = dirs.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any])
      __obj.asInstanceOf[Stats]
    }
    
    @scala.inline
    implicit class StatsMutableBuilder[Self <: Stats] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDirs(value: Double): Self = StObject.set(x, "dirs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiles(value: Double): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    }
  }
}
