package typings.wonderFrp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object classMapUtilsMod {
  
  @JSImport("wonder-frp/dist/commonjs/utils/ClassMapUtils", "ClassMapUtils")
  @js.native
  class ClassMapUtils () extends StObject
  /* static members */
  object ClassMapUtils {
    
    @JSImport("wonder-frp/dist/commonjs/utils/ClassMapUtils", "ClassMapUtils")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wonder-frp/dist/commonjs/utils/ClassMapUtils", "ClassMapUtils._classMap")
    @js.native
    def _classMap: js.Any = js.native
    @scala.inline
    def _classMap_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_classMap")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def addClassMap(className: String, _class: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addClassMap")(className.asInstanceOf[js.Any], _class.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    @scala.inline
    def getClass(className: String): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getClass")(className.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  }
}
