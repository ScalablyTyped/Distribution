package typings.wepy

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  object default {
    
    @JSImport("wepy/util", "default.camelize")
    @js.native
    def camelize(str: String): String = js.native
    
    @JSImport("wepy/util", "default.$copy")
    @js.native
    def copy[T](obj: T): T = js.native
    @JSImport("wepy/util", "default.$copy")
    @js.native
    def copy[T](obj: T, deep: Boolean): T = js.native
    
    @JSImport("wepy/util", "default.$extend")
    @js.native
    def extend(): js.Any = js.native
    
    @JSImport("wepy/util", "default.$getParams")
    @js.native
    def getParams(url: String): js.Object = js.native
    
    @JSImport("wepy/util", "default.$has")
    @js.native
    def has(obj: js.Object, path: String): Boolean = js.native
    
    @JSImport("wepy/util", "default.hyphenate")
    @js.native
    def hyphenate(str: String): String = js.native
    
    @JSImport("wepy/util", "default.$isDeepEqual")
    @js.native
    def isDeepEqual(a: js.Any, b: js.Any): Boolean = js.native
    @JSImport("wepy/util", "default.$isDeepEqual")
    @js.native
    def isDeepEqual(a: js.Any, b: js.Any, aStack: js.UndefOr[scala.Nothing], bStack: js.Array[_]): Boolean = js.native
    @JSImport("wepy/util", "default.$isDeepEqual")
    @js.native
    def isDeepEqual(a: js.Any, b: js.Any, aStack: js.Array[_]): Boolean = js.native
    @JSImport("wepy/util", "default.$isDeepEqual")
    @js.native
    def isDeepEqual(a: js.Any, b: js.Any, aStack: js.Array[_], bStack: js.Array[_]): Boolean = js.native
    
    @JSImport("wepy/util", "default.$isEmpty")
    @js.native
    def isEmpty(obj: js.Object): Boolean = js.native
    
    @JSImport("wepy/util", "default.$isEqual")
    @js.native
    def isEqual(a: js.Any, b: js.Any): Boolean = js.native
    @JSImport("wepy/util", "default.$isEqual")
    @js.native
    def isEqual(a: js.Any, b: js.Any, aStack: js.UndefOr[scala.Nothing], bStack: js.Array[_]): Boolean = js.native
    @JSImport("wepy/util", "default.$isEqual")
    @js.native
    def isEqual(a: js.Any, b: js.Any, aStack: js.Array[_]): Boolean = js.native
    @JSImport("wepy/util", "default.$isEqual")
    @js.native
    def isEqual(a: js.Any, b: js.Any, aStack: js.Array[_], bStack: js.Array[_]): Boolean = js.native
    
    @JSImport("wepy/util", "default.$isPlainObject")
    @js.native
    def isPlainObject(obj: js.Any): Boolean = js.native
    
    @JSImport("wepy/util", "default.$resolvePath")
    @js.native
    def resolvePath(route: String, url: String): String = js.native
  }
}
