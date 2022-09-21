package typings.vueDevtoolsApi

import org.scalablytyped.runtime.TopLevel
import typings.vueDevtoolsApi.apiApiMod.DevtoolsPluginApi
import typings.vueDevtoolsApi.pluginMod.PluginDescriptor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@vue/devtools-api", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def isPerformanceSupported(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isPerformanceSupported")().asInstanceOf[Boolean]
  
  inline def now(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("now")().asInstanceOf[Double]
  
  inline def setupDevtoolsPlugin[TDescriptor /* <: Exact[TDescriptor, PluginDescriptor] */, TSettings](pluginDescriptor: Narrow[TDescriptor], setupFn: SetupFunction[TSettings]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("setupDevtoolsPlugin")(pluginDescriptor.asInstanceOf[js.Any], setupFn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  type Cast[A, B] = B | A
  
  type Exact[C, T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof C ]: K extends keyof T? T[K] : never}
    */ typings.vueDevtoolsApi.vueDevtoolsApiStrings.Exact & TopLevel[T]
  
  type Narrow[A] = Cast[
    A, 
    js.Array[Any] | A | (/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof A ]: @vue/devtools-api.@vue/devtools-api.Narrow<A[K]>}
    */ typings.vueDevtoolsApi.vueDevtoolsApiStrings.Narrow & TopLevel[A])
  ]
  
  type Narrowable = String | Double | js.BigInt | Boolean
  
  type SetupFunction[TSettings] = js.Function1[/* api */ DevtoolsPluginApi[TSettings], Unit]
}
