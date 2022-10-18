package typings.vueRuntimeCore.anon

import typings.vueRuntimeCore.mod.ComponentInternalInstance
import typings.vueRuntimeCore.mod.ComponentOptionsBase
import typings.vueRuntimeCore.mod.ComponentPublicInstance
import typings.vueRuntimeCore.mod.Data
import typings.vueRuntimeCore.mod.EmitFn
import typings.vueRuntimeCore.mod.EmitsOptions
import typings.vueRuntimeCore.mod.MergedComponentOptionsOverride
import typings.vueRuntimeCore.mod.Slots
import typings.vueRuntimeCore.mod.WatchOptions
import typings.vueRuntimeCore.mod.WatchStopHandle
import typings.vueRuntimeCore.vueRuntimeCoreBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Attrs[// raw bindings returned from setup()
D, MakeDefaultsOptional /* <: Boolean */, Defaults, P, PublicProps, E /* <: EmitsOptions */, Options] extends StObject {
  
  @JSName("$")
  var $: ComponentInternalInstance = js.native
  
  @JSName("$attrs")
  var $attrs: Data = js.native
  
  @JSName("$data")
  var $data: D = js.native
  
  @JSName("$el")
  var $el: Any = js.native
  
  @JSName("$emit")
  var $emit: EmitFn[E, /* keyof E */ String] = js.native
  
  @JSName("$forceUpdate")
  def $forceUpdate(): Unit = js.native
  
  @JSName("$nextTick")
  def $nextTick[T](): js.Promise[Unit] = js.native
  @JSName("$nextTick")
  def $nextTick[T](fn: js.ThisFunction0[/* this */ T, Unit]): js.Promise[Unit] = js.native
  @JSName("$nextTick")
  var $nextTick_Original: FnCall = js.native
  
  @JSName("$options")
  var $options: Options & MergedComponentOptionsOverride = js.native
  
  @JSName("$parent")
  var $parent: (ComponentPublicInstance[
    js.Object, 
    js.Object, 
    js.Object, 
    js.Object, 
    js.Object, 
    js.Object, 
    js.Object, 
    js.Object, 
    `false`, 
    ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
  ]) | Null = js.native
  
  @JSName("$props")
  var $props: /* import warning: importer.ImportType#apply Failed type conversion: MakeDefaultsOptional extends true ? std.Partial<Defaults> & std.Omit<P & PublicProps, keyof Defaults> : P & PublicProps */ js.Any = js.native
  
  @JSName("$refs")
  var $refs: Data = js.native
  
  @JSName("$root")
  var $root: (ComponentPublicInstance[
    js.Object, 
    js.Object, 
    js.Object, 
    js.Object, 
    js.Object, 
    js.Object, 
    js.Object, 
    js.Object, 
    `false`, 
    ComponentOptionsBase[Any, Any, Any, Any, Any, Any, Any, Any, Any, js.Object]
  ]) | Null = js.native
  
  @JSName("$slots")
  var $slots: Slots = js.native
  
  @JSName("$watch")
  def $watch(source: String, cb: js.Function): WatchStopHandle = js.native
  @JSName("$watch")
  def $watch(source: String, cb: js.Function, options: WatchOptions[Boolean]): WatchStopHandle = js.native
  @JSName("$watch")
  def $watch(source: js.Function, cb: js.Function): WatchStopHandle = js.native
  @JSName("$watch")
  def $watch(source: js.Function, cb: js.Function, options: WatchOptions[Boolean]): WatchStopHandle = js.native
}
