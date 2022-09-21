package typings.wepy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  object default {
    
    @JSImport("wepy/util", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def camelize(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("camelize")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def copy[T](obj: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("$copy")(obj.asInstanceOf[js.Any]).asInstanceOf[T]
    inline def copy[T](obj: T, deep: Boolean): T = (^.asInstanceOf[js.Dynamic].applyDynamic("$copy")(obj.asInstanceOf[js.Any], deep.asInstanceOf[js.Any])).asInstanceOf[T]
    
    inline def extend(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("$extend")().asInstanceOf[Any]
    
    inline def getParams(url: String): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("$getParams")(url.asInstanceOf[js.Any]).asInstanceOf[js.Object]
    
    inline def has(obj: js.Object, path: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("$has")(obj.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def hyphenate(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("hyphenate")(str.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def isDeepEqual(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("$isDeepEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def isDeepEqual(a: Any, b: Any, aStack: js.Array[Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("$isDeepEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], aStack.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def isDeepEqual(a: Any, b: Any, aStack: js.Array[Any], bStack: js.Array[Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("$isDeepEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], aStack.asInstanceOf[js.Any], bStack.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def isDeepEqual(a: Any, b: Any, aStack: Unit, bStack: js.Array[Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("$isDeepEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], aStack.asInstanceOf[js.Any], bStack.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def isEmpty(obj: js.Object): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("$isEmpty")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def isEqual(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("$isEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def isEqual(a: Any, b: Any, aStack: js.Array[Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("$isEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], aStack.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def isEqual(a: Any, b: Any, aStack: js.Array[Any], bStack: js.Array[Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("$isEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], aStack.asInstanceOf[js.Any], bStack.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def isEqual(a: Any, b: Any, aStack: Unit, bStack: js.Array[Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("$isEqual")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], aStack.asInstanceOf[js.Any], bStack.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    inline def isPlainObject(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("$isPlainObject")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    inline def resolvePath(route: String, url: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("$resolvePath")(route.asInstanceOf[js.Any], url.asInstanceOf[js.Any])).asInstanceOf[String]
  }
}
