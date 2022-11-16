package typings.vueTestUtils

import typings.std.Node
import typings.std.Record
import typings.vueRuntimeCore.mod.Component
import typings.vueRuntimeCore.mod.ComponentOptionsBase
import typings.vueRuntimeCore.mod.ComponentPublicInstance
import typings.vueRuntimeCore.mod.ComputedOptions
import typings.vueRuntimeCore.mod.Directive
import typings.vueRuntimeCore.mod.MethodOptions
import typings.vueTestUtils.anon.RequiredGlobalMountOption
import typings.vueTestUtils.distTypesMod.GlobalMountOptions
import typings.vueTestUtils.distTypesMod.RefSelector
import typings.vueTestUtils.distTypesMod.Stub
import typings.vueTestUtils.distTypesMod.Stubs
import typings.vueTestUtils.vueTestUtilsBooleans.`false`
import typings.vueTestUtils.vueTestUtilsBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distUtilsMod {
  
  @JSImport("@vue/test-utils/dist/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def convertStubsToRecord(stubs: Stubs): Record[String, Stub] = ^.asInstanceOf[js.Dynamic].applyDynamic("convertStubsToRecord")(stubs.asInstanceOf[js.Any]).asInstanceOf[Record[String, Stub]]
  
  inline def getComponentsFromStubs(stubs: Stubs): Record[String, (Component[Any, Any, Any, ComputedOptions, MethodOptions]) | Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("getComponentsFromStubs")(stubs.asInstanceOf[js.Any]).asInstanceOf[Record[String, (Component[Any, Any, Any, ComputedOptions, MethodOptions]) | Boolean]]
  
  inline def getDirectivesFromStubs(stubs: Stubs): Record[String, (Directive[Any, Any]) | `true`] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDirectivesFromStubs")(stubs.asInstanceOf[js.Any]).asInstanceOf[Record[String, (Directive[Any, Any]) | `true`]]
  
  inline def hasOwnProperty_[O /* <: js.Object */](obj: O, prop: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasOwnProperty")(obj.asInstanceOf[js.Any], prop.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def hasOwnProperty_[O /* <: js.Object */](obj: O, prop: js.Symbol): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasOwnProperty")(obj.asInstanceOf[js.Any], prop.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def hasOwnProperty_[O /* <: js.Object */](obj: O, prop: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasOwnProperty")(obj.asInstanceOf[js.Any], prop.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def hasSetupState_false(
    vm: ComponentPublicInstance[
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      js.Object, 
      `false`, 
      ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object, js.Object, String], 
      js.Object
    ]
  ): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasSetupState")(vm.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isClassComponent(component: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isClassComponent")(component.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isComponent(component: Any): /* is @vue/runtime-core.@vue/runtime-core.ConcreteComponent<{}, any, any, @vue/runtime-core.@vue/runtime-core.ComputedOptions, @vue/runtime-core.@vue/runtime-core.MethodOptions> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isComponent")(component.asInstanceOf[js.Any]).asInstanceOf[/* is @vue/runtime-core.@vue/runtime-core.ConcreteComponent<{}, any, any, @vue/runtime-core.@vue/runtime-core.ComputedOptions, @vue/runtime-core.@vue/runtime-core.MethodOptions> */ Boolean]
  
  inline def isFunctionalComponent(component: Any): /* is @vue/runtime-core.@vue/runtime-core.FunctionalComponent<{}, {}> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunctionalComponent")(component.asInstanceOf[js.Any]).asInstanceOf[/* is @vue/runtime-core.@vue/runtime-core.FunctionalComponent<{}, {}> */ Boolean]
  
  inline def isNotNullOrUndefined[T /* <: js.Object */](): /* is T */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNotNullOrUndefined")().asInstanceOf[/* is T */ Boolean]
  inline def isNotNullOrUndefined[T /* <: js.Object */](obj: T): /* is T */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isNotNullOrUndefined")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is T */ Boolean]
  
  inline def isObject(obj: Any): /* is std.Record<string, any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObject")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is std.Record<string, any> */ Boolean]
  
  inline def isObjectComponent(component: Any): /* is @vue/runtime-core.@vue/runtime-core.ComponentOptions<{}, any, any, any, any, any, any, any> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isObjectComponent")(component.asInstanceOf[js.Any]).asInstanceOf[/* is @vue/runtime-core.@vue/runtime-core.ComponentOptions<{}, any, any, any, any, any, any, any> */ Boolean]
  
  inline def isRefSelector(selector: String): /* is @vue/test-utils.@vue/test-utils/dist/types.RefSelector */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRefSelector")(selector.asInstanceOf[js.Any]).asInstanceOf[/* is @vue/test-utils.@vue/test-utils/dist/types.RefSelector */ Boolean]
  inline def isRefSelector(selector: RefSelector): /* is @vue/test-utils.@vue/test-utils/dist/types.RefSelector */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRefSelector")(selector.asInstanceOf[js.Any]).asInstanceOf[/* is @vue/test-utils.@vue/test-utils/dist/types.RefSelector */ Boolean]
  
  inline def mergeDeep(target: Record[String, Any], source: Record[String, Any]): Record[String, Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeDeep")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[Record[String, Any]]
  
  inline def mergeGlobalProperties(): RequiredGlobalMountOption = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeGlobalProperties")().asInstanceOf[RequiredGlobalMountOption]
  inline def mergeGlobalProperties(mountGlobal: GlobalMountOptions): RequiredGlobalMountOption = ^.asInstanceOf[js.Dynamic].applyDynamic("mergeGlobalProperties")(mountGlobal.asInstanceOf[js.Any]).asInstanceOf[RequiredGlobalMountOption]
  
  inline def textContent(element: Node): String = ^.asInstanceOf[js.Dynamic].applyDynamic("textContent")(element.asInstanceOf[js.Any]).asInstanceOf[String]
}
