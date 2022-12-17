package typings.vueRuntimeCore.mod

import typings.vueRuntimeCore.vueRuntimeCoreBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait App[HostElement] extends StObject {
  
  var _component: ConcreteComponent[js.Object, Any, Any, ComputedOptions, MethodOptions] = js.native
  
  var _container: HostElement | Null = js.native
  
  var _context: AppContext = js.native
  
  var _instance: ComponentInternalInstance | Null = js.native
  
  var _props: Data | Null = js.native
  
  var _uid: Double = js.native
  
  def component(name: String): js.UndefOr[Component[Any, Any, Any, ComputedOptions, MethodOptions]] = js.native
  def component(name: String, component: Component[Any, Any, Any, ComputedOptions, MethodOptions]): this.type = js.native
  
  var config: AppConfig = js.native
  
  def directive(name: String): js.UndefOr[Directive[Any, Any]] = js.native
  def directive(name: String, directive: Directive[Any, Any]): this.type = js.native
  
  /**
    * v2 compat only
    */
  var filter: js.UndefOr[js.Function1[/* name */ String, js.UndefOr[js.Function]]] = js.native
  
  def mixin(mixin: ComponentOptions[js.Object, Any, Any, Any, Any, Any, Any, Any]): this.type = js.native
  
  def mount(rootContainer: HostElement): ComponentPublicInstance[
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
  ] = js.native
  def mount(rootContainer: HostElement, isHydrate: Boolean): ComponentPublicInstance[
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
  ] = js.native
  def mount(rootContainer: HostElement, isHydrate: Boolean, isSVG: Boolean): ComponentPublicInstance[
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
  ] = js.native
  def mount(rootContainer: HostElement, isHydrate: Unit, isSVG: Boolean): ComponentPublicInstance[
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
  ] = js.native
  def mount(rootContainer: String): ComponentPublicInstance[
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
  ] = js.native
  def mount(rootContainer: String, isHydrate: Boolean): ComponentPublicInstance[
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
  ] = js.native
  def mount(rootContainer: String, isHydrate: Boolean, isSVG: Boolean): ComponentPublicInstance[
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
  ] = js.native
  def mount(rootContainer: String, isHydrate: Unit, isSVG: Boolean): ComponentPublicInstance[
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
  ] = js.native
  
  def provide[T](key: String, value: T): this.type = js.native
  def provide[T](key: js.Symbol, value: T): this.type = js.native
  
  def unmount(): Unit = js.native
  
  def use(plugin: Plugin2, options: Any*): this.type = js.native
  
  var version: String = js.native
}
