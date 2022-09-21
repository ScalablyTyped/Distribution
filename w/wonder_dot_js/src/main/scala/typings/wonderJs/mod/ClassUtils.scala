package typings.wonderJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder.js/dist/es2015", "ClassUtils")
@js.native
open class ClassUtils ()
  extends typings.wonderJs.classUtilsMod.ClassUtils
/* static members */
object ClassUtils {
  
  @JSImport("wonder.js/dist/es2015", "ClassUtils")
  @js.native
  val ^ : js.Any = js.native
  
  inline def addClass(className: String, _class: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addClass")(className.asInstanceOf[js.Any], _class.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addClassNameAttributeToClass(className: String, _class: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addClassNameAttributeToClass")(className.asInstanceOf[js.Any], _class.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getClass(className: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getClass")(className.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getClassNameByInstance(obj: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getClassNameByInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[Any]
}
