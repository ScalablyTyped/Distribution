package typings.wepy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wepy/util", JSImport.Namespace)
@js.native
object utilMod extends js.Object {
  @js.native
  object default extends js.Object {
    @JSName("$copy")
    def $copy[T](obj: T): T = js.native
    @JSName("$copy")
    def $copy[T](obj: T, deep: Boolean): T = js.native
    @JSName("$extend")
    def $extend(): js.Any = js.native
    @JSName("$getParams")
    def $getParams(url: String): js.Object = js.native
    @JSName("$has")
    def $has(obj: js.Object, path: String): Boolean = js.native
    @JSName("$isDeepEqual")
    def $isDeepEqual(a: js.Any, b: js.Any): Boolean = js.native
    @JSName("$isDeepEqual")
    def $isDeepEqual(a: js.Any, b: js.Any, aStack: js.Array[_]): Boolean = js.native
    @JSName("$isDeepEqual")
    def $isDeepEqual(a: js.Any, b: js.Any, aStack: js.Array[_], bStack: js.Array[_]): Boolean = js.native
    @JSName("$isEmpty")
    def $isEmpty(obj: js.Object): Boolean = js.native
    @JSName("$isEqual")
    def $isEqual(a: js.Any, b: js.Any): Boolean = js.native
    @JSName("$isEqual")
    def $isEqual(a: js.Any, b: js.Any, aStack: js.Array[_]): Boolean = js.native
    @JSName("$isEqual")
    def $isEqual(a: js.Any, b: js.Any, aStack: js.Array[_], bStack: js.Array[_]): Boolean = js.native
    @JSName("$isPlainObject")
    def $isPlainObject(obj: js.Any): Boolean = js.native
    @JSName("$resolvePath")
    def $resolvePath(route: String, url: String): String = js.native
    def camelize(str: String): String = js.native
    def hyphenate(str: String): String = js.native
  }
  
}

