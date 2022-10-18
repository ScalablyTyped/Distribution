package typings.vueReactivity.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@vue/reactivity", "ReactiveEffect")
@js.native
open class ReactiveEffect[T] protected () extends StObject {
  def this(fn: js.Function0[T]) = this()
  def this(fn: js.Function0[T], scheduler: EffectScheduler) = this()
  def this(fn: js.Function0[T], scheduler: Null, scope: EffectScope_) = this()
  def this(fn: js.Function0[T], scheduler: Unit, scope: EffectScope_) = this()
  def this(fn: js.Function0[T], scheduler: EffectScheduler, scope: EffectScope_) = this()
  
  var active: Boolean = js.native
  
  var deps: js.Array[Dep] = js.native
  
  def fn(): T = js.native
  
  /* Excluded from this release type: computed */
  /* Excluded from this release type: allowRecurse */
  /* Excluded from this release type: deferStop */
  var onStop: js.UndefOr[js.Function0[Unit]] = js.native
  
  var onTrack: js.UndefOr[js.Function1[/* event */ DebuggerEvent, Unit]] = js.native
  
  var onTrigger: js.UndefOr[js.Function1[/* event */ DebuggerEvent, Unit]] = js.native
  
  var parent: js.UndefOr[ReactiveEffect[Any]] = js.native
  
  def run(): js.UndefOr[T] = js.native
  
  var scheduler: EffectScheduler | Null = js.native
  
  def stop(): Unit = js.native
}
