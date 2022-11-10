package typings.vueDevtoolsApi

import typings.vueDevtoolsApi.libEsmApiApiMod.DevtoolsPluginApi
import typings.vueDevtoolsApi.libEsmPluginMod.PluginDescriptor
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
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    A extends B ? A : B
    }}}
    */
  type Cast[A, B] = A
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    {[ K in keyof C ]: K extends keyof T? T[K] : never}
    }}}
    */
  @js.native
  trait Exact[C, T] extends StObject
  
  type Narrow[A] = Cast[
    A, 
    js.Array[Any] | (/* import warning: importer.ImportType#apply Failed type conversion: A extends @vue/devtools-api.@vue/devtools-api.Narrowable ? A : never */ js.Any)
  ]
  
  type Narrowable = String | Double | js.BigInt | Boolean
  
  type SetupFunction[TSettings] = js.Function1[/* api */ DevtoolsPluginApi[TSettings], Unit]
}
