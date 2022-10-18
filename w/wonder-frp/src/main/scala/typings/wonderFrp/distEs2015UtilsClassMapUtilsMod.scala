package typings.wonderFrp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs2015UtilsClassMapUtilsMod {
  
  @JSImport("wonder-frp/dist/es2015/utils/ClassMapUtils", "ClassMapUtils")
  @js.native
  open class ClassMapUtils () extends StObject
  /* static members */
  object ClassMapUtils {
    
    @JSImport("wonder-frp/dist/es2015/utils/ClassMapUtils", "ClassMapUtils")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wonder-frp/dist/es2015/utils/ClassMapUtils", "ClassMapUtils._classMap")
    @js.native
    def _classMap: Any = js.native
    inline def _classMap_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_classMap")(x.asInstanceOf[js.Any])
    
    inline def addClassMap(className: String, _class: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addClassMap")(className.asInstanceOf[js.Any], _class.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def getClass(className: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getClass")(className.asInstanceOf[js.Any]).asInstanceOf[Any]
  }
}
