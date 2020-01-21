package typings.wonderJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("wonder.js/dist/es2015/utils/ClassUtils", JSImport.Namespace)
@js.native
object classUtilsMod extends js.Object {
  @js.native
  class ClassUtils () extends js.Object
  
  /* static members */
  @js.native
  object ClassUtils extends js.Object {
    def addClass(className: String, _class: js.Any): Unit = js.native
    def addClassNameAttributeToClass(className: String, _class: js.Any): Unit = js.native
    def getClass(className: String): js.Any = js.native
    def getClassNameByInstance(obj: js.Any): js.Any = js.native
  }
  
}

