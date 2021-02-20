package typings.upath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("upath", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("upath", "VERSION")
  @js.native
  def VERSION: String = js.native
  @scala.inline
  def VERSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERSION")(x.asInstanceOf[js.Any])
  
  @JSImport("upath", "addExt")
  @js.native
  def addExt(file: String, ext: String): String = js.native
  
  @JSImport("upath", "basename")
  @js.native
  def basename(p: String): String = js.native
  @JSImport("upath", "basename")
  @js.native
  def basename(p: String, ext: String): String = js.native
  
  @JSImport("upath", "changeExt")
  @js.native
  def changeExt(filename: String, ext: String): String = js.native
  @JSImport("upath", "changeExt")
  @js.native
  def changeExt(filename: String, ext: String, ignoreExts: js.UndefOr[scala.Nothing], maxSize: Double): String = js.native
  @JSImport("upath", "changeExt")
  @js.native
  def changeExt(filename: String, ext: String, ignoreExts: js.Array[String]): String = js.native
  @JSImport("upath", "changeExt")
  @js.native
  def changeExt(filename: String, ext: String, ignoreExts: js.Array[String], maxSize: Double): String = js.native
  
  @JSImport("upath", "defaultExt")
  @js.native
  def defaultExt(filename: String, ext: String): String = js.native
  @JSImport("upath", "defaultExt")
  @js.native
  def defaultExt(filename: String, ext: String, ignoreExts: js.UndefOr[scala.Nothing], maxSize: Double): String = js.native
  @JSImport("upath", "defaultExt")
  @js.native
  def defaultExt(filename: String, ext: String, ignoreExts: js.Array[String]): String = js.native
  @JSImport("upath", "defaultExt")
  @js.native
  def defaultExt(filename: String, ext: String, ignoreExts: js.Array[String], maxSize: Double): String = js.native
  
  @JSImport("upath", "delimiter")
  @js.native
  def delimiter: String = js.native
  @scala.inline
  def delimiter_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("delimiter")(x.asInstanceOf[js.Any])
  
  @JSImport("upath", "dirname")
  @js.native
  def dirname(p: String): String = js.native
  
  @JSImport("upath", "extname")
  @js.native
  def extname(p: String): String = js.native
  
  @JSImport("upath", "format")
  @js.native
  def format(pathObject: ParsedPath): String = js.native
  
  @JSImport("upath", "isAbsolute")
  @js.native
  def isAbsolute(path: String): Boolean = js.native
  
  @JSImport("upath", "join")
  @js.native
  def join(paths: (js.Any | String)*): String = js.native
  
  @JSImport("upath", "joinSafe")
  @js.native
  def joinSafe(p: js.Any*): String = js.native
  
  @JSImport("upath", "normalize")
  @js.native
  def normalize(p: String): String = js.native
  
  @JSImport("upath", "normalizeSafe")
  @js.native
  def normalizeSafe(p: String): String = js.native
  
  @JSImport("upath", "normalizeTrim")
  @js.native
  def normalizeTrim(p: String): String = js.native
  
  @JSImport("upath", "parse")
  @js.native
  def parse(pathString: String): ParsedPath = js.native
  
  object posix {
    
    @JSImport("upath", "posix")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("upath", "posix.basename")
    @js.native
    def basename(p: String): String = js.native
    @JSImport("upath", "posix.basename")
    @js.native
    def basename(p: String, ext: String): String = js.native
    
    @JSImport("upath", "posix.delimiter")
    @js.native
    def delimiter: String = js.native
    @scala.inline
    def delimiter_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("delimiter")(x.asInstanceOf[js.Any])
    
    @JSImport("upath", "posix.dirname")
    @js.native
    def dirname(p: String): String = js.native
    
    @JSImport("upath", "posix.extname")
    @js.native
    def extname(p: String): String = js.native
    
    @JSImport("upath", "posix.format")
    @js.native
    def format(pP: ParsedPath): String = js.native
    
    @JSImport("upath", "posix.isAbsolute")
    @js.native
    def isAbsolute(p: String): Boolean = js.native
    
    @JSImport("upath", "posix.join")
    @js.native
    def join(paths: js.Any*): String = js.native
    
    @JSImport("upath", "posix.normalize")
    @js.native
    def normalize(p: String): String = js.native
    
    @JSImport("upath", "posix.parse")
    @js.native
    def parse(p: String): ParsedPath = js.native
    
    @JSImport("upath", "posix.relative")
    @js.native
    def relative(from: String, to: String): String = js.native
    
    @JSImport("upath", "posix.resolve")
    @js.native
    def resolve(pathSegments: js.Any*): String = js.native
    
    @JSImport("upath", "posix.sep")
    @js.native
    def sep: String = js.native
    @scala.inline
    def sep_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sep")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("upath", "relative")
  @js.native
  def relative(from: String, to: String): String = js.native
  
  @JSImport("upath", "removeExt")
  @js.native
  def removeExt(filename: String, ext: String): String = js.native
  
  @JSImport("upath", "resolve")
  @js.native
  def resolve(pathSegments: js.Any*): String = js.native
  
  @JSImport("upath", "sep")
  @js.native
  def sep: String = js.native
  @scala.inline
  def sep_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sep")(x.asInstanceOf[js.Any])
  
  @JSImport("upath", "toUnix")
  @js.native
  def toUnix(p: String): String = js.native
  
  @JSImport("upath", "trimExt")
  @js.native
  def trimExt(filename: String): String = js.native
  @JSImport("upath", "trimExt")
  @js.native
  def trimExt(filename: String, ignoreExts: js.UndefOr[scala.Nothing], maxSize: Double): String = js.native
  @JSImport("upath", "trimExt")
  @js.native
  def trimExt(filename: String, ignoreExts: js.Array[String]): String = js.native
  @JSImport("upath", "trimExt")
  @js.native
  def trimExt(filename: String, ignoreExts: js.Array[String], maxSize: Double): String = js.native
  
  object win32 {
    
    @JSImport("upath", "win32")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("upath", "win32.basename")
    @js.native
    def basename(p: String): String = js.native
    @JSImport("upath", "win32.basename")
    @js.native
    def basename(p: String, ext: String): String = js.native
    
    @JSImport("upath", "win32.delimiter")
    @js.native
    def delimiter: String = js.native
    @scala.inline
    def delimiter_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("delimiter")(x.asInstanceOf[js.Any])
    
    @JSImport("upath", "win32.dirname")
    @js.native
    def dirname(p: String): String = js.native
    
    @JSImport("upath", "win32.extname")
    @js.native
    def extname(p: String): String = js.native
    
    @JSImport("upath", "win32.format")
    @js.native
    def format(pP: ParsedPath): String = js.native
    
    @JSImport("upath", "win32.isAbsolute")
    @js.native
    def isAbsolute(p: String): Boolean = js.native
    
    @JSImport("upath", "win32.join")
    @js.native
    def join(paths: js.Any*): String = js.native
    
    @JSImport("upath", "win32.normalize")
    @js.native
    def normalize(p: String): String = js.native
    
    @JSImport("upath", "win32.parse")
    @js.native
    def parse(p: String): ParsedPath = js.native
    
    @JSImport("upath", "win32.relative")
    @js.native
    def relative(from: String, to: String): String = js.native
    
    @JSImport("upath", "win32.resolve")
    @js.native
    def resolve(pathSegments: js.Any*): String = js.native
    
    @JSImport("upath", "win32.sep")
    @js.native
    def sep: String = js.native
    @scala.inline
    def sep_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sep")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ParsedPath extends StObject {
    
    /**
      * The file name including extension (if any) such as 'index.html'
      */
    var base: String = js.native
    
    /**
      * The full directory path such as '/home/user/dir' or 'c:\path\dir'
      */
    var dir: String = js.native
    
    /**
      * The file extension (if any) such as '.html'
      */
    var ext: String = js.native
    
    /**
      * The file name without extension (if any) such as 'index'
      */
    var name: String = js.native
    
    /**
      * The root of the path such as '/' or 'c:\'
      */
    var root: String = js.native
  }
  object ParsedPath {
    
    @scala.inline
    def apply(base: String, dir: String, ext: String, name: String, root: String): ParsedPath = {
      val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], ext = ext.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedPath]
    }
    
    @scala.inline
    implicit class ParsedPathMutableBuilder[Self <: ParsedPath] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExt(value: String): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
