package typings.vueTestUtils

import typings.vueRuntimeCore.mod.ComponentOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsVueCompatSupportMod {
  
  @JSImport("@vue/test-utils/dist/utils/vueCompatSupport", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isLegacyExtendedComponent(component: Any): /* is @vue/test-utils.anon.Call */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLegacyExtendedComponent")(component.asInstanceOf[js.Any]).asInstanceOf[/* is @vue/test-utils.anon.Call */ Boolean]
  
  inline def isLegacyFunctionalComponent(component: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isLegacyFunctionalComponent")(component.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def unwrapLegacyVueExtendComponent[T](selector: T): T | (ComponentOptions[js.Object, Any, Any, Any, Any, Any, Any, Any]) = ^.asInstanceOf[js.Dynamic].applyDynamic("unwrapLegacyVueExtendComponent")(selector.asInstanceOf[js.Any]).asInstanceOf[T | (ComponentOptions[js.Object, Any, Any, Any, Any, Any, Any, Any])]
}
