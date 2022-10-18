package typings.upath2

import typings.node.pathMod.ParsedPath
import typings.upath2.libTypeMod.IParse
import typings.upath2.libTypeMod.IPath
import typings.upath2.libTypeMod.IPathPlatform
import typings.upath2.upath2Strings.Slash
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Pick<upath2.upath2/lib/type.IPath, 'sep' | 'name'> */
  trait PickIPathsepname extends StObject {
    
    var name: js.UndefOr[String | IPathPlatform] = js.undefined
    
    var sep: (/* \ */ String) | Slash
  }
  object PickIPathsepname {
    
    inline def apply(sep: (/* \ */ String) | Slash): PickIPathsepname = {
      val __obj = js.Dynamic.literal(sep = sep.asInstanceOf[js.Any])
      __obj.asInstanceOf[PickIPathsepname]
    }
    
    extension [Self <: PickIPathsepname](x: Self) {
      
      inline def setName(value: String | IPathPlatform): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setSep(value: (/* \ */ String) | Slash): Self = StObject.set(x, "sep", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Pick<upath2.upath2/core.PathWrap, keyof upath2.upath2/lib/type.IPathNode> */
  trait PickPathWrapkeyofIPathNod extends StObject {
    
    def basename[T /* <: String */, U /* <: String */](path: T): String
    def basename[T /* <: String */, U /* <: String */](path: T, ext: U): String
    @JSName("basename")
    var basename_Original: js.Function2[/* path */ String, /* ext */ js.UndefOr[String], String]
    
    var delimiter: String
    
    def dirname[T /* <: String */](path: T): String
    @JSName("dirname")
    var dirname_Original: js.Function1[/* path */ String, String]
    
    def extname[T /* <: String */](path: T): String
    @JSName("extname")
    var extname_Original: js.Function1[/* path */ String, String]
    
    def format[T](pathObject: T): String
    @JSName("format")
    var format_Original: js.Function1[/* pathObject */ IParse, String]
    
    def isAbsolute[T /* <: String */](path: T): Boolean
    @JSName("isAbsolute")
    var isAbsolute_Original: js.Function1[/* path */ String, Boolean]
    
    def join[T, U](path: T, paths: U*): String
    @JSName("join")
    var join_Original: js.Function2[/* path */ String, /* repeated */ String, String]
    
    def normalize[T /* <: String */](path: T): String
    @JSName("normalize")
    var normalize_Original: js.Function1[/* path */ String, String]
    
    def parse[T /* <: String */](path: T): ParsedPath
    @JSName("parse")
    var parse_Original: js.Function1[/* path */ String, ParsedPath]
    
    var posix: js.UndefOr[IPath] = js.undefined
    
    def relative[T /* <: String */, U /* <: String */](from: T, to: U): String
    @JSName("relative")
    var relative_Original: js.Function2[/* from */ String, /* to */ String, String]
    
    def resolve[T, U](path: T, paths: U*): String
    @JSName("resolve")
    var resolve_Original: js.Function2[/* path */ String, /* repeated */ String, String]
    
    var sep: String
    
    def toNamespacedPath(path: String): Any
    @JSName("toNamespacedPath")
    var toNamespacedPath_Original: js.Function1[/* path */ String, Any]
    
    var win32: js.UndefOr[IPath] = js.undefined
  }
  object PickPathWrapkeyofIPathNod {
    
    inline def apply(
      basename: (/* path */ String, /* ext */ js.UndefOr[String]) => String,
      delimiter: String,
      dirname: /* path */ String => String,
      extname: /* path */ String => String,
      format: /* pathObject */ IParse => String,
      isAbsolute: /* path */ String => Boolean,
      join: (/* path */ String, /* repeated */ String) => String,
      normalize: /* path */ String => String,
      parse: /* path */ String => ParsedPath,
      relative: (/* from */ String, /* to */ String) => String,
      resolve: (/* path */ String, /* repeated */ String) => String,
      sep: String,
      toNamespacedPath: /* path */ String => Any
    ): PickPathWrapkeyofIPathNod = {
      val __obj = js.Dynamic.literal(basename = js.Any.fromFunction2(basename), delimiter = delimiter.asInstanceOf[js.Any], dirname = js.Any.fromFunction1(dirname), extname = js.Any.fromFunction1(extname), format = js.Any.fromFunction1(format), isAbsolute = js.Any.fromFunction1(isAbsolute), join = js.Any.fromFunction2(join), normalize = js.Any.fromFunction1(normalize), parse = js.Any.fromFunction1(parse), relative = js.Any.fromFunction2(relative), resolve = js.Any.fromFunction2(resolve), sep = sep.asInstanceOf[js.Any], toNamespacedPath = js.Any.fromFunction1(toNamespacedPath))
      __obj.asInstanceOf[PickPathWrapkeyofIPathNod]
    }
    
    extension [Self <: PickPathWrapkeyofIPathNod](x: Self) {
      
      inline def setBasename(value: (/* path */ String, /* ext */ js.UndefOr[String]) => String): Self = StObject.set(x, "basename", js.Any.fromFunction2(value))
      
      inline def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      inline def setDirname(value: /* path */ String => String): Self = StObject.set(x, "dirname", js.Any.fromFunction1(value))
      
      inline def setExtname(value: /* path */ String => String): Self = StObject.set(x, "extname", js.Any.fromFunction1(value))
      
      inline def setFormat(value: /* pathObject */ IParse => String): Self = StObject.set(x, "format", js.Any.fromFunction1(value))
      
      inline def setIsAbsolute(value: /* path */ String => Boolean): Self = StObject.set(x, "isAbsolute", js.Any.fromFunction1(value))
      
      inline def setJoin(value: (/* path */ String, /* repeated */ String) => String): Self = StObject.set(x, "join", js.Any.fromFunction2(value))
      
      inline def setNormalize(value: /* path */ String => String): Self = StObject.set(x, "normalize", js.Any.fromFunction1(value))
      
      inline def setParse(value: /* path */ String => ParsedPath): Self = StObject.set(x, "parse", js.Any.fromFunction1(value))
      
      inline def setPosix(value: IPath): Self = StObject.set(x, "posix", value.asInstanceOf[js.Any])
      
      inline def setPosixUndefined: Self = StObject.set(x, "posix", js.undefined)
      
      inline def setRelative(value: (/* from */ String, /* to */ String) => String): Self = StObject.set(x, "relative", js.Any.fromFunction2(value))
      
      inline def setResolve(value: (/* path */ String, /* repeated */ String) => String): Self = StObject.set(x, "resolve", js.Any.fromFunction2(value))
      
      inline def setSep(value: String): Self = StObject.set(x, "sep", value.asInstanceOf[js.Any])
      
      inline def setToNamespacedPath(value: /* path */ String => Any): Self = StObject.set(x, "toNamespacedPath", js.Any.fromFunction1(value))
      
      inline def setWin32(value: IPath): Self = StObject.set(x, "win32", value.asInstanceOf[js.Any])
      
      inline def setWin32Undefined: Self = StObject.set(x, "win32", js.undefined)
    }
  }
  
  trait TypeofPathWrap extends StObject {
    
    var fn: IPath
  }
  object TypeofPathWrap {
    
    inline def apply(fn: IPath): TypeofPathWrap = {
      val __obj = js.Dynamic.literal(fn = fn.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeofPathWrap]
    }
    
    extension [Self <: TypeofPathWrap](x: Self) {
      
      inline def setFn(value: IPath): Self = StObject.set(x, "fn", value.asInstanceOf[js.Any])
    }
  }
}
