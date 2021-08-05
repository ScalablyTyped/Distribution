package typings.wonderJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder.js/dist/es2015", "ClassUtils")
@js.native
class ClassUtils ()
  extends typings.wonderJs.classUtilsMod.ClassUtils
/* static members */
object ClassUtils {
  
  @JSImport("wonder.js/dist/es2015", "ClassUtils")
  @js.native
  val ^ : js.Any = js.native
  
  inline def addClass(className: String, _class: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addClass")(className.asInstanceOf[js.Any], _class.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def addClassNameAttributeToClass(className: String, _class: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addClassNameAttributeToClass")(className.asInstanceOf[js.Any], _class.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getClass(className: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getClass")(className.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  inline def getClassNameByInstance(obj: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getClassNameByInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
