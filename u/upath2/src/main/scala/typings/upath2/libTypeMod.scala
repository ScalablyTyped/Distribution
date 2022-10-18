package typings.upath2

import typings.node.pathMod.FormatInputPathObject
import typings.node.pathMod.ParsedPath
import typings.node.pathMod.PlatformPath
import typings.upath2.upath2Strings.Colon
import typings.upath2.upath2Strings.Semicolon
import typings.upath2.upath2Strings.Slash
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypeMod {
  
  @JSImport("upath2/lib/type", "ORIGIN_KEY")
  @js.native
  val ORIGIN_KEY: js.Symbol = js.native
  
  /* Inlined parent std.Partial<node.path.ParsedPath> */
  trait IParse extends StObject {
    
    var base: js.UndefOr[String] = js.undefined
    
    var dir: js.UndefOr[String] = js.undefined
    
    var ext: js.UndefOr[String] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var root: js.UndefOr[String] = js.undefined
  }
  object IParse {
    
    inline def apply(): IParse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IParse]
    }
    
    extension [Self <: IParse](x: Self) {
      
      inline def setBase(value: String): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
      
      inline def setBaseUndefined: Self = StObject.set(x, "base", js.undefined)
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      inline def setExt(value: String): Self = StObject.set(x, "ext", value.asInstanceOf[js.Any])
      
      inline def setExtUndefined: Self = StObject.set(x, "ext", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
  
  /* Inlined parent std.Omit<upath2.upath2/lib/type.IPathNode, 'win32' | 'posix' | 'default'> */
  @js.native
  trait IPath
    extends StObject
       with _IPathType {
    
    var default: js.UndefOr[IPath] = js.native
    
    def basename(path: String): String = js.native
    def basename[T /* <: String */, U /* <: String */](path: T): String = js.native
    def basename[T /* <: String */, U /* <: String */](path: T, ext: U): String = js.native
    @JSName("basename")
    var basename_Original: js.Function1[/* path */ String, String] = js.native
    
    var delimiter: Semicolon | Colon = js.native
    
    def dirname(path: String): String = js.native
    def dirname[T /* <: String */](path: T): String = js.native
    @JSName("dirname")
    var dirname_Original: js.Function1[/* path */ String, String] = js.native
    
    def extname(path: String): String = js.native
    def extname[T /* <: String */](path: T): String = js.native
    @JSName("extname")
    var extname_Original: js.Function1[/* path */ String, String] = js.native
    
    var filterNameEntry: js.UndefOr[js.Function1[/* name */ String, String]] = js.native
    
    var fn: js.UndefOr[IPath] = js.native
    
    def format(pathObject: FormatInputPathObject): String = js.native
    def format[T](pathObject: T): String = js.native
    @JSName("format")
    var format_Original: js.Function1[/* pathObject */ FormatInputPathObject, String] = js.native
    
    def isAbsolute(path: String): Boolean = js.native
    def isAbsolute[T /* <: String */](path: T): Boolean = js.native
    @JSName("isAbsolute")
    var isAbsolute_Original: js.Function1[/* path */ String, Boolean] = js.native
    
    def join(paths: String*): String = js.native
    def join[T, U](path: T, paths: U*): String = js.native
    @JSName("join")
    var join_Original: js.Function1[/* repeated */ String, String] = js.native
    
    var name: js.UndefOr[String | IPathPlatform] = js.native
    
    def normalize(path: String): String = js.native
    def normalize[T /* <: String */](path: T): String = js.native
    @JSName("normalize")
    var normalize_Original: js.Function1[/* path */ String, String] = js.native
    
    def parse(path: String): ParsedPath = js.native
    def parse[T /* <: String */](path: T): ParsedPath = js.native
    @JSName("parse")
    var parse_Original: js.Function1[/* path */ String, ParsedPath] = js.native
    
    var posix: js.UndefOr[IPath] = js.native
    
    def relative(from: String, to: String): String = js.native
    def relative[T /* <: String */, U /* <: String */](from: T, to: U): String = js.native
    @JSName("relative")
    var relative_Original: js.Function2[/* from */ String, /* to */ String, String] = js.native
    
    def resolve(paths: String*): String = js.native
    def resolve[T, U](path: T, paths: U*): String = js.native
    @JSName("resolve")
    var resolve_Original: js.Function1[/* repeated */ String, String] = js.native
    
    var sep: (/* \ */ String) | Slash = js.native
    
    def toNamespacedPath(path: String): String = js.native
    @JSName("toNamespacedPath")
    var toNamespacedPath_Original: js.Function1[/* path */ String, String] = js.native
    
    var upath: js.UndefOr[IPath] = js.native
    
    var vaildNameEntry: js.UndefOr[js.Function1[/* name */ String, String]] = js.native
    
    var win32: js.UndefOr[IPath] = js.native
  }
  
  /* Inlined parent std.Pick<node.path.PlatformPath, 'toNamespacedPath' | 'delimiter' | 'sep' | 'isAbsolute' | 'extname' | 'dirname' | 'format' | 'parse' | 'resolve' | 'relative' | 'normalize' | 'join' | 'basename'> */
  trait IPathNode
    extends StObject
       with _IPathType {
    
    def basename(path: String): String
    @JSName("basename")
    var basename_Original: js.Function1[/* path */ String, String]
    
    var delimiter: Semicolon | Colon
    
    def dirname(path: String): String
    @JSName("dirname")
    var dirname_Original: js.Function1[/* path */ String, String]
    
    def extname(path: String): String
    @JSName("extname")
    var extname_Original: js.Function1[/* path */ String, String]
    
    def format(pathObject: FormatInputPathObject): String
    @JSName("format")
    var format_Original: js.Function1[/* pathObject */ FormatInputPathObject, String]
    
    def isAbsolute(path: String): Boolean
    @JSName("isAbsolute")
    var isAbsolute_Original: js.Function1[/* path */ String, Boolean]
    
    def join(paths: String*): String
    @JSName("join")
    var join_Original: js.Function1[/* repeated */ String, String]
    
    def normalize(path: String): String
    @JSName("normalize")
    var normalize_Original: js.Function1[/* path */ String, String]
    
    def parse(path: String): ParsedPath
    @JSName("parse")
    var parse_Original: js.Function1[/* path */ String, ParsedPath]
    
    var posix: js.UndefOr[IPathNode] = js.undefined
    
    def relative(from: String, to: String): String
    @JSName("relative")
    var relative_Original: js.Function2[/* from */ String, /* to */ String, String]
    
    def resolve(paths: String*): String
    @JSName("resolve")
    var resolve_Original: js.Function1[/* repeated */ String, String]
    
    var sep: (/* \ */ String) | Slash
    
    def toNamespacedPath(path: String): String
    @JSName("toNamespacedPath")
    var toNamespacedPath_Original: js.Function1[/* path */ String, String]
    
    var win32: js.UndefOr[IPathNode] = js.undefined
  }
  object IPathNode {
    
    inline def apply(
      basename: /* path */ String => String,
      delimiter: Semicolon | Colon,
      dirname: /* path */ String => String,
      extname: /* path */ String => String,
      format: /* pathObject */ FormatInputPathObject => String,
      isAbsolute: /* path */ String => Boolean,
      join: /* repeated */ String => String,
      normalize: /* path */ String => String,
      parse: /* path */ String => ParsedPath,
      relative: (/* from */ String, /* to */ String) => String,
      resolve: /* repeated */ String => String,
      sep: (/* \ */ String) | Slash,
      toNamespacedPath: /* path */ String => String
    ): IPathNode = {
      val __obj = js.Dynamic.literal(basename = js.Any.fromFunction1(basename), delimiter = delimiter.asInstanceOf[js.Any], dirname = js.Any.fromFunction1(dirname), extname = js.Any.fromFunction1(extname), format = js.Any.fromFunction1(format), isAbsolute = js.Any.fromFunction1(isAbsolute), join = js.Any.fromFunction1(join), normalize = js.Any.fromFunction1(normalize), parse = js.Any.fromFunction1(parse), relative = js.Any.fromFunction2(relative), resolve = js.Any.fromFunction1(resolve), sep = sep.asInstanceOf[js.Any], toNamespacedPath = js.Any.fromFunction1(toNamespacedPath))
      __obj.asInstanceOf[IPathNode]
    }
    
    extension [Self <: IPathNode](x: Self) {
      
      inline def setBasename(value: /* path */ String => String): Self = StObject.set(x, "basename", js.Any.fromFunction1(value))
      
      inline def setDelimiter(value: Semicolon | Colon): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      inline def setDirname(value: /* path */ String => String): Self = StObject.set(x, "dirname", js.Any.fromFunction1(value))
      
      inline def setExtname(value: /* path */ String => String): Self = StObject.set(x, "extname", js.Any.fromFunction1(value))
      
      inline def setFormat(value: /* pathObject */ FormatInputPathObject => String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
      
      inline def setIsAbsolute(value: /* path */ String => Boolean): Self = StObject.set(x, "isAbsolute", js.Any.fromFunction1(value))
      
      inline def setJoin(value: /* repeated */ String => String): Self = StObject.set(x, "join", js.Any.fromFunction1(value))
      
      inline def setNormalize(value: /* path */ String => String): Self = StObject.set(x, "normalize", js.Any.fromFunction1(value))
      
      inline def setParse(value: /* path */ String => ParsedPath): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
      
      inline def setPosix(value: IPathNode): Self = StObject.set(x, "posix", value.asInstanceOf[js.Any])
      
      inline def setPosixUndefined: Self = StObject.set(x, "posix", js.undefined)
      
      inline def setRelative(value: (/* from */ String, /* to */ String) => String): Self = StObject.set(x, "relative", js.Any.fromFunction2(value))
      
      inline def setResolve(value: /* repeated */ String => String): Self = StObject.set(x, "resolve", js.Any.fromFunction1(value))
      
      inline def setSep(value: (/* \ */ String) | Slash): Self = StObject.set(x, "sep", value.asInstanceOf[js.Any])
      
      inline def setToNamespacedPath(value: /* path */ String => String): Self = StObject.set(x, "toNamespacedPath", js.Any.fromFunction1(value))
      
      inline def setWin32(value: IPathNode): Self = StObject.set(x, "win32", value.asInstanceOf[js.Any])
      
      inline def setWin32Undefined: Self = StObject.set(x, "win32", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.upath2.upath2Strings.upath
    - typings.upath2.upath2Strings.node
    - typings.upath2.upath2Strings.win32
    - typings.upath2.upath2Strings.posix
  */
  trait IPathPlatform extends StObject
  object IPathPlatform {
    
    inline def node: typings.upath2.upath2Strings.node = "node".asInstanceOf[typings.upath2.upath2Strings.node]
    
    inline def posix: typings.upath2.upath2Strings.posix = "posix".asInstanceOf[typings.upath2.upath2Strings.posix]
    
    inline def upath: typings.upath2.upath2Strings.upath = "upath".asInstanceOf[typings.upath2.upath2Strings.upath]
    
    inline def win32: typings.upath2.upath2Strings.win32 = "win32".asInstanceOf[typings.upath2.upath2Strings.win32]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.upath2.upath2Strings.win32
    - typings.upath2.upath2Strings.posix
  */
  trait IPathPlatformOrigin extends StObject
  object IPathPlatformOrigin {
    
    inline def posix: typings.upath2.upath2Strings.posix = "posix".asInstanceOf[typings.upath2.upath2Strings.posix]
    
    inline def win32: typings.upath2.upath2Strings.win32 = "win32".asInstanceOf[typings.upath2.upath2Strings.win32]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.node.pathMod.PlatformPath
    - typings.upath2.libTypeMod.IPath
    - typings.upath2.libTypeMod.IPathNode
  */
  type IPathType = _IPathType | PlatformPath
  
  trait _IPathType extends StObject
}
