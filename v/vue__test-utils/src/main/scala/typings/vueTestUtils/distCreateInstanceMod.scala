package typings.vueTestUtils

import typings.std.Record
import typings.vueRuntimeCore.mod.ComponentOptionsMixin
import typings.vueRuntimeCore.mod.ComputedOptions
import typings.vueRuntimeCore.mod.DefineComponent_
import typings.vueRuntimeCore.mod.ExtractDefaultPropTypes
import typings.vueRuntimeCore.mod.MethodOptions
import typings.vueRuntimeCore.mod.PublicProps
import typings.vueRuntimeCore.mod.ResolveProps
import typings.vueTestUtils.anon.App
import typings.vueTestUtils.distTypesMod.MountingOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCreateInstanceMod {
  
  @JSImport("@vue/test-utils/dist/createInstance", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createInstance(
    inputComponent: DefineComponent_[
      js.Object, 
      js.Object, 
      Any, 
      ComputedOptions, 
      MethodOptions, 
      ComponentOptionsMixin, 
      ComponentOptionsMixin, 
      js.Object, 
      String, 
      PublicProps, 
      ResolveProps[js.Object, js.Object], 
      ExtractDefaultPropTypes[js.Object], 
      js.Object
    ]
  ): App = ^.asInstanceOf[js.Dynamic].applyDynamic("createInstance")(inputComponent.asInstanceOf[js.Any]).asInstanceOf[App]
  inline def createInstance(
    inputComponent: DefineComponent_[
      js.Object, 
      js.Object, 
      Any, 
      ComputedOptions, 
      MethodOptions, 
      ComponentOptionsMixin, 
      ComponentOptionsMixin, 
      js.Object, 
      String, 
      PublicProps, 
      ResolveProps[js.Object, js.Object], 
      ExtractDefaultPropTypes[js.Object], 
      js.Object
    ],
    options: (MountingOptions[Any, js.Object]) & (Record[String, Any])
  ): App = (^.asInstanceOf[js.Dynamic].applyDynamic("createInstance")(inputComponent.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[App]
}
