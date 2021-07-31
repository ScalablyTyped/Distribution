package typings.temp

import typings.node.fsMod.WriteStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("temp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def cleanup(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanup")().asInstanceOf[Unit]
  @scala.inline
  def cleanup(callback: js.Function2[/* err */ js.Any, /* result */ Stats, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanup")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def cleanupSync(): Boolean | Stats = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanupSync")().asInstanceOf[Boolean | Stats]
  
  @scala.inline
  def createWriteStream(): WriteStream = ^.asInstanceOf[js.Dynamic].applyDynamic("createWriteStream")().asInstanceOf[WriteStream]
  @scala.inline
  def createWriteStream(affixes: String): WriteStream = ^.asInstanceOf[js.Dynamic].applyDynamic("createWriteStream")(affixes.asInstanceOf[js.Any]).asInstanceOf[WriteStream]
  @scala.inline
  def createWriteStream(affixes: AffixOptions): WriteStream = ^.asInstanceOf[js.Dynamic].applyDynamic("createWriteStream")(affixes.asInstanceOf[js.Any]).asInstanceOf[WriteStream]
  
  @JSImport("temp", "dir")
  @js.native
  def dir: String = js.native
  @scala.inline
  def dir_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dir")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def mkdir(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")().asInstanceOf[Unit]
  @scala.inline
  def mkdir(affixes: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(affixes.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def mkdir(affixes: String, callback: js.Function2[/* err */ js.Any, /* dirPath */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(affixes.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def mkdir(affixes: Unit, callback: js.Function2[/* err */ js.Any, /* dirPath */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(affixes.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def mkdir(affixes: AffixOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(affixes.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def mkdir(affixes: AffixOptions, callback: js.Function2[/* err */ js.Any, /* dirPath */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mkdir")(affixes.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def mkdirSync(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")().asInstanceOf[String]
  @scala.inline
  def mkdirSync(affixes: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(affixes.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def mkdirSync(affixes: AffixOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("mkdirSync")(affixes.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def open(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("open")().asInstanceOf[Unit]
  @scala.inline
  def open(affixes: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(affixes.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def open(affixes: String, callback: js.Function2[/* err */ js.Any, /* result */ OpenFile, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(affixes.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def open(affixes: Unit, callback: js.Function2[/* err */ js.Any, /* result */ OpenFile, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(affixes.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def open(affixes: AffixOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("open")(affixes.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def open(affixes: AffixOptions, callback: js.Function2[/* err */ js.Any, /* result */ OpenFile, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("open")(affixes.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def openSync(): OpenFile = ^.asInstanceOf[js.Dynamic].applyDynamic("openSync")().asInstanceOf[OpenFile]
  @scala.inline
  def openSync(affixes: String): OpenFile = ^.asInstanceOf[js.Dynamic].applyDynamic("openSync")(affixes.asInstanceOf[js.Any]).asInstanceOf[OpenFile]
  @scala.inline
  def openSync(affixes: AffixOptions): OpenFile = ^.asInstanceOf[js.Dynamic].applyDynamic("openSync")(affixes.asInstanceOf[js.Any]).asInstanceOf[OpenFile]
  
  @scala.inline
  def path(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("path")().asInstanceOf[String]
  @scala.inline
  def path(affixes: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("path")(affixes.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def path(affixes: String, defaultPrefix: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("path")(affixes.asInstanceOf[js.Any], defaultPrefix.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def path(affixes: Unit, defaultPrefix: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("path")(affixes.asInstanceOf[js.Any], defaultPrefix.asInstanceOf[js.Any])).asInstanceOf[String]
  @scala.inline
  def path(affixes: AffixOptions): String = ^.asInstanceOf[js.Dynamic].applyDynamic("path")(affixes.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def path(affixes: AffixOptions, defaultPrefix: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("path")(affixes.asInstanceOf[js.Any], defaultPrefix.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def track(): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("track")().asInstanceOf[js.Any]
  @scala.inline
  def track(value: Boolean): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("track")(value.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  trait AffixOptions extends StObject {
    
    var dir: js.UndefOr[String] = js.undefined
    
    var prefix: js.UndefOr[String] = js.undefined
    
    var suffix: js.UndefOr[String] = js.undefined
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
  
  trait OpenFile extends StObject {
    
    var fd: Double
    
    var path: String
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
  
  trait Stats extends StObject {
    
    var dirs: Double
    
    var files: Double
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
