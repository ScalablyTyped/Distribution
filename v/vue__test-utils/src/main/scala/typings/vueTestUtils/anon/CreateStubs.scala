package typings.vueTestUtils.anon

import typings.std.Node
import typings.vueRuntimeCore.mod.ComponentOptionsBase
import typings.vueRuntimeCore.mod.ComponentPublicInstance
import typings.vueRuntimeCore.mod.ComputedOptions
import typings.vueRuntimeCore.mod.ConcreteComponent
import typings.vueRuntimeCore.mod.MethodOptions
import typings.vueTestUtils.distConfigMod.Pluggable
import typings.vueTestUtils.distDomWrapperMod.DOMWrapper
import typings.vueTestUtils.distVnodeTransformersStubComponentsTransformerMod.CustomCreateStub
import typings.vueTestUtils.distVueWrapperMod.VueWrapper
import typings.vueTestUtils.vueTestUtilsBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateStubs extends StObject {
  
  var DOMWrapper: Pluggable[typings.vueTestUtils.distDomWrapperMod.DOMWrapper[Node]]
  
  var VueWrapper: Pluggable[
    typings.vueTestUtils.distVueWrapperMod.VueWrapper[
      ComponentPublicInstance[
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
    ]
  ]
  
  var createStubs: js.UndefOr[CustomCreateStub] = js.undefined
}
object CreateStubs {
  
  inline def apply(
    DOMWrapper: Pluggable[DOMWrapper[Node]],
    VueWrapper: Pluggable[
      VueWrapper[
        ComponentPublicInstance[
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
      ]
    ]
  ): CreateStubs = {
    val __obj = js.Dynamic.literal(DOMWrapper = DOMWrapper.asInstanceOf[js.Any], VueWrapper = VueWrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateStubs]
  }
  
  extension [Self <: CreateStubs](x: Self) {
    
    inline def setCreateStubs(
      value: /* params */ Component => ConcreteComponent[js.Object, Any, Any, ComputedOptions, MethodOptions]
    ): Self = StObject.set(x, "createStubs", js.Any.fromFunction1(value))
    
    inline def setCreateStubsUndefined: Self = StObject.set(x, "createStubs", js.undefined)
    
    inline def setDOMWrapper(value: Pluggable[DOMWrapper[Node]]): Self = StObject.set(x, "DOMWrapper", value.asInstanceOf[js.Any])
    
    inline def setVueWrapper(
      value: Pluggable[
          VueWrapper[
            ComponentPublicInstance[
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
          ]
        ]
    ): Self = StObject.set(x, "VueWrapper", value.asInstanceOf[js.Any])
  }
}
