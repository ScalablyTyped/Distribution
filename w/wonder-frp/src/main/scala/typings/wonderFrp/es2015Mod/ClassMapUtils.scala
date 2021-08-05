package typings.wonderFrp.es2015Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("wonder-frp/dist/es2015", "ClassMapUtils")
@js.native
class ClassMapUtils ()
  extends typings.wonderFrp.utilsClassMapUtilsMod.ClassMapUtils
/* static members */
object ClassMapUtils {
  
  @JSImport("wonder-frp/dist/es2015", "ClassMapUtils")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("wonder-frp/dist/es2015", "ClassMapUtils._classMap")
  @js.native
  def _classMap: js.Any = js.native
  inline def _classMap_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_classMap")(x.asInstanceOf[js.Any])
  
  inline def addClassMap(className: String, _class: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addClassMap")(className.asInstanceOf[js.Any], _class.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getClass(className: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getClass")(className.asInstanceOf[js.Any]).asInstanceOf[js.Any]
}
