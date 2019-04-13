package typings
package wepyLib

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
    def $copy[T](obj: T, deep: scala.Boolean): T = js.native
    @JSName("$extend")
    def $extend(): js.Any = js.native
    @JSName("$getParams")
    def $getParams(url: java.lang.String): js.Object = js.native
    @JSName("$has")
    def $has(obj: js.Object, path: java.lang.String): scala.Boolean = js.native
    @JSName("$isDeepEqual")
    def $isDeepEqual(a: js.Any, b: js.Any): scala.Boolean = js.native
    @JSName("$isDeepEqual")
    def $isDeepEqual(a: js.Any, b: js.Any, aStack: js.Array[_]): scala.Boolean = js.native
    @JSName("$isDeepEqual")
    def $isDeepEqual(a: js.Any, b: js.Any, aStack: js.Array[_], bStack: js.Array[_]): scala.Boolean = js.native
    @JSName("$isEmpty")
    def $isEmpty(obj: js.Object): scala.Boolean = js.native
    @JSName("$isEqual")
    def $isEqual(a: js.Any, b: js.Any): scala.Boolean = js.native
    @JSName("$isEqual")
    def $isEqual(a: js.Any, b: js.Any, aStack: js.Array[_]): scala.Boolean = js.native
    @JSName("$isEqual")
    def $isEqual(a: js.Any, b: js.Any, aStack: js.Array[_], bStack: js.Array[_]): scala.Boolean = js.native
    @JSName("$isPlainObject")
    def $isPlainObject(obj: js.Any): scala.Boolean = js.native
    @JSName("$resolvePath")
    def $resolvePath(route: java.lang.String, url: java.lang.String): java.lang.String = js.native
    def camelize(str: java.lang.String): java.lang.String = js.native
    def hyphenate(str: java.lang.String): java.lang.String = js.native
  }
  
}

