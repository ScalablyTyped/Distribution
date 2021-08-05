package typings.upath

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("upath", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("upath", "VERSION")
  @js.native
  def VERSION: String = js.native
  inline def VERSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERSION")(x.asInstanceOf[js.Any])
  
  inline def addExt(file: String, ext: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("addExt")(file.asInstanceOf[js.Any], ext.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def basename(p: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("basename")(p.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def basename(p: String, ext: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("basename")(p.asInstanceOf[js.Any], ext.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def changeExt(filename: String, ext: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("changeExt")(filename.asInstanceOf[js.Any], ext.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def changeExt(filename: String, ext: String, ignoreExts: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("changeExt")(filename.asInstanceOf[js.Any], ext.asInstanceOf[js.Any], ignoreExts.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def changeExt(filename: String, ext: String, ignoreExts: js.Array[String], maxSize: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("changeExt")(filename.asInstanceOf[js.Any], ext.asInstanceOf[js.Any], ignoreExts.asInstanceOf[js.Any], maxSize.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def changeExt(filename: String, ext: String, ignoreExts: Unit, maxSize: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("changeExt")(filename.asInstanceOf[js.Any], ext.asInstanceOf[js.Any], ignoreExts.asInstanceOf[js.Any], maxSize.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def defaultExt(filename: String, ext: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultExt")(filename.asInstanceOf[js.Any], ext.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def defaultExt(filename: String, ext: String, ignoreExts: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultExt")(filename.asInstanceOf[js.Any], ext.asInstanceOf[js.Any], ignoreExts.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def defaultExt(filename: String, ext: String, ignoreExts: js.Array[String], maxSize: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultExt")(filename.asInstanceOf[js.Any], ext.asInstanceOf[js.Any], ignoreExts.asInstanceOf[js.Any], maxSize.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def defaultExt(filename: String, ext: String, ignoreExts: Unit, maxSize: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("defaultExt")(filename.asInstanceOf[js.Any], ext.asInstanceOf[js.Any], ignoreExts.asInstanceOf[js.Any], maxSize.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("upath", "delimiter")
  @js.native
  def delimiter: String = js.native
  inline def delimiter_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("delimiter")(x.asInstanceOf[js.Any])
  
  inline def dirname(p: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("dirname")(p.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def extname(p: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("extname")(p.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def format(pathObject: ParsedPath): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(pathObject.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def isAbsolute(path: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAbsolute")(path.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def join(paths: (js.Any | String)*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("join")(paths.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def joinSafe(p: js.Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("joinSafe")(p.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def normalize(p: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(p.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def normalizeSafe(p: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeSafe")(p.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def normalizeTrim(p: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeTrim")(p.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def parse(pathString: String): ParsedPath = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(pathString.asInstanceOf[js.Any]).asInstanceOf[ParsedPath]
  
  object posix {
    
    @JSImport("upath", "posix")
    @js.native
    val ^ : js.Any = js.native
    
    inline def basename(p: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("basename")(p.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def basename(p: String, ext: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("basename")(p.asInstanceOf[js.Any], ext.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSImport("upath", "posix.delimiter")
    @js.native
    def delimiter: String = js.native
    inline def delimiter_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("delimiter")(x.asInstanceOf[js.Any])
    
    inline def dirname(p: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("dirname")(p.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def extname(p: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("extname")(p.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def format(pP: ParsedPath): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(pP.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def isAbsolute(p: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAbsolute")(p.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def join(paths: js.Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("join")(paths.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def normalize(p: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(p.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def parse(p: String): ParsedPath = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(p.asInstanceOf[js.Any]).asInstanceOf[ParsedPath]
    
    inline def relative(from: String, to: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("relative")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def resolve(pathSegments: js.Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(pathSegments.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSImport("upath", "posix.sep")
    @js.native
    def sep: String = js.native
    inline def sep_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sep")(x.asInstanceOf[js.Any])
  }
  
  inline def relative(from: String, to: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("relative")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def removeExt(filename: String, ext: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("removeExt")(filename.asInstanceOf[js.Any], ext.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def resolve(pathSegments: js.Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(pathSegments.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("upath", "sep")
  @js.native
  def sep: String = js.native
  inline def sep_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sep")(x.asInstanceOf[js.Any])
  
  inline def toUnix(p: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("toUnix")(p.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def trimExt(filename: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("trimExt")(filename.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def trimExt(filename: String, ignoreExts: js.Array[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("trimExt")(filename.asInstanceOf[js.Any], ignoreExts.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def trimExt(filename: String, ignoreExts: js.Array[String], maxSize: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("trimExt")(filename.asInstanceOf[js.Any], ignoreExts.asInstanceOf[js.Any], maxSize.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def trimExt(filename: String, ignoreExts: Unit, maxSize: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("trimExt")(filename.asInstanceOf[js.Any], ignoreExts.asInstanceOf[js.Any], maxSize.asInstanceOf[js.Any])).asInstanceOf[String]
  
  object win32 {
    
    @JSImport("upath", "win32")
    @js.native
    val ^ : js.Any = js.native
    
    inline def basename(p: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("basename")(p.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def basename(p: String, ext: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("basename")(p.asInstanceOf[js.Any], ext.asInstanceOf[js.Any])).asInstanceOf[String]
    
    @JSImport("upath", "win32.delimiter")
    @js.native
    def delimiter: String = js.native
    inline def delimiter_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("delimiter")(x.asInstanceOf[js.Any])
    
    inline def dirname(p: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("dirname")(p.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def extname(p: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("extname")(p.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def format(pP: ParsedPath): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(pP.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def isAbsolute(p: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isAbsolute")(p.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def join(paths: js.Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("join")(paths.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def normalize(p: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(p.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def parse(p: String): ParsedPath = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(p.asInstanceOf[js.Any]).asInstanceOf[ParsedPath]
    
    inline def relative(from: String, to: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("relative")(from.asInstanceOf[js.Any], to.asInstanceOf[js.Any])).asInstanceOf[String]
    
    inline def resolve(pathSegments: js.Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(pathSegments.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @JSImport("upath", "win32.sep")
    @js.native
    def sep: String = js.native
    inline def sep_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("sep")(x.asInstanceOf[js.Any])
  }
  
  trait ParsedPath extends StObject {
    
    /**
      * The file name including extension (if any) such as 'index.html'
      */
    var base: String
    
    /**
      * The full directory path such as '/home/user/dir' or 'c:\path\dir'
      */
    var dir: String
    
    /**
      * The file extension (if any) such as '.html'
      */
    var ext: String
    
    /**
      * The file name without extension (if any) such as 'index'
      */
    var name: String
    
    /**
      * The root of the path such as '/' or 'c:\'
      */
    var root: String
  }
  object ParsedPath {
    
    inline def apply(base: String, dir: String, ext: String, name: String, root: String): ParsedPath = {
      val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any], ext = ext.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedPath]
    }
    
    extension [Self <: ParsedPath](x: Self) {
      
      inline def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setExt(value: String): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    }
  }
}
