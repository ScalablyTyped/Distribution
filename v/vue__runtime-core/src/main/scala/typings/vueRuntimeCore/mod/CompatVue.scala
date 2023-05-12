package typings.vueRuntimeCore.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.vueReactivity.mod.UnwrapNestedRefs
import typings.vueRuntimeCore.anon.FnCall
import typings.vueRuntimeCore.anon.FnCallTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<@vue/runtime-core.@vue/runtime-core.App<any>, 'version' | 'component' | 'directive'> & {  configureCompat :(config : @vue/runtime-core.@vue/runtime-core.CompatConfig): void, new (options : @vue/runtime-core.@vue/runtime-core.ComponentOptions<{}, any, any, any, any, any, any, any, any> | undefined): @vue/runtime-core.@vue/runtime-core.LegacyPublicInstance,   version :string,   config :@vue/runtime-core.@vue/runtime-core.AppConfig & @vue/runtime-core.@vue/runtime-core.LegacyConfig,   nextTick :{None <T = void>(this : T, fn : (this : T): void | undefined): std.Promise<void>}, use (plugin : @vue/runtime-core.@vue/runtime-core.Plugin<std.Array<any>>, options : ...any): @vue/runtime-core.@vue/runtime-core.CompatVue, mixin (mixin : @vue/runtime-core.@vue/runtime-core.ComponentOptions<{}, any, any, any, any, any, any, any, any>): @vue/runtime-core.@vue/runtime-core.CompatVue, component (name : string): @vue/runtime-core.@vue/runtime-core.Component<any, any, any, @vue/runtime-core.@vue/runtime-core.ComputedOptions, @vue/runtime-core.@vue/runtime-core.MethodOptions> | undefined, component (name : string, component : @vue/runtime-core.@vue/runtime-core.Component<any, any, any, @vue/runtime-core.@vue/runtime-core.ComputedOptions, @vue/runtime-core.@vue/runtime-core.MethodOptions>): @vue/runtime-core.@vue/runtime-core.CompatVue, directive (name : string): @vue/runtime-core.@vue/runtime-core.Directive<any, any> | undefined, directive (name : string, directive : @vue/runtime-core.@vue/runtime-core.Directive<any, any>): @vue/runtime-core.@vue/runtime-core.CompatVue, compile (template : string): @vue/runtime-core.@vue/runtime-core.RenderFunction, extend (options : @vue/runtime-core.@vue/runtime-core.ComponentOptions<{}, any, any, any, any, any, any, any, any> | undefined): @vue/runtime-core.@vue/runtime-core.CompatVue, set (target : any, key : string | number | symbol, value : any): void, delete (target : any, key : string | number | symbol): void,   observable :{None <T extends object>(target : T): @vue/reactivity.@vue/reactivity.UnwrapNestedRefs<T>}, filter (name : string, arg : any | undefined): null} */
@js.native
trait CompatVue
  extends StObject
     with Instantiable0[LegacyPublicInstance]
     with Instantiable1[
      /* options */ ComponentOptions[js.Object, Any, Any, Any, Any, Any, Any, Any, Any], 
      LegacyPublicInstance
    ] {
  
  def compile(template: String): RenderFunction = js.native
  
  def component(name: String): js.UndefOr[Component[Any, Any, Any, ComputedOptions, MethodOptions]] = js.native
  def component(name: String, component: Component[Any, Any, Any, ComputedOptions, MethodOptions]): CompatVue = js.native
  @JSName("component")
  var component_Original: js.Function1[
    /* name */ String, 
    js.UndefOr[Component[Any, Any, Any, ComputedOptions, MethodOptions]]
  ] = js.native
  
  var config: AppConfig & LegacyConfig = js.native
  
  def configureCompat(config: CompatConfig): Unit = js.native
  @JSName("configureCompat")
  var configureCompat_Original: js.Function1[/* config */ CompatConfig, Unit] = js.native
  
  /**
    * @deprecated Vue 3 no longer needs delete() for property deletions.
    */
  def delete(target: Any, key: String): Unit = js.native
  def delete(target: Any, key: js.Symbol): Unit = js.native
  def delete(target: Any, key: Double): Unit = js.native
  
  def directive(name: String): js.UndefOr[Directive[Any, Any]] = js.native
  def directive(name: String, directive: Directive[Any, Any]): CompatVue = js.native
  @JSName("directive")
  var directive_Original: js.Function1[/* name */ String, js.UndefOr[Directive[Any, Any]]] = js.native
  
  /**
    * @deprecated Vue 3 no longer supports extending constructors.
    */
  def extend(): CompatVue = js.native
  def extend(options: ComponentOptions[js.Object, Any, Any, Any, Any, Any, Any, Any, Any]): CompatVue = js.native
  
  /**
    * @deprecated filters have been removed from Vue 3.
    */
  def filter(name: String): Null = js.native
  def filter(name: String, arg: Any): Null = js.native
  
  def mixin(mixin: ComponentOptions[js.Object, Any, Any, Any, Any, Any, Any, Any, Any]): CompatVue = js.native
  
  def nextTick[T](): js.Promise[Unit] = js.native
  def nextTick[T](fn: js.ThisFunction0[/* this */ T, Unit]): js.Promise[Unit] = js.native
  @JSName("nextTick")
  var nextTick_Original: FnCall = js.native
  
  /**
    * @deprecated use `reactive` instead.
    */
  def observable[T /* <: js.Object */](target: T): UnwrapNestedRefs[T] = js.native
  /**
    * @deprecated use `reactive` instead.
    */
  @JSName("observable")
  var observable_Original: FnCallTarget = js.native
  
  /**
    * @deprecated Vue 3 no longer needs set() for adding new properties.
    */
  def set(target: Any, key: String, value: Any): Unit = js.native
  def set(target: Any, key: js.Symbol, value: Any): Unit = js.native
  def set(target: Any, key: Double, value: Any): Unit = js.native
  
  def use(plugin: Plugin[js.Array[Any]], options: Any*): CompatVue = js.native
  
  var version: String = js.native
}
