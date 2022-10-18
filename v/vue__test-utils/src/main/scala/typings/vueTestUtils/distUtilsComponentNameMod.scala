package typings.vueTestUtils

import typings.vueRuntimeCore.mod.ComponentInternalInstance
import typings.vueRuntimeCore.mod.VNodeTypes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsComponentNameMod {
  
  @JSImport("@vue/test-utils/dist/utils/componentName", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getComponentName(instance: Any, `type`: VNodeTypes): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getComponentName")(instance.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def getComponentName(instance: Null, `type`: VNodeTypes): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getComponentName")(instance.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getComponentRegisteredName(instance: Null, `type`: VNodeTypes): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getComponentRegisteredName")(instance.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[String | Null]
  inline def getComponentRegisteredName(instance: ComponentInternalInstance, `type`: VNodeTypes): String | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getComponentRegisteredName")(instance.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[String | Null]
}
