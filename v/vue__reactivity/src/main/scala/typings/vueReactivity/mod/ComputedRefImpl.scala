package typings.vueReactivity.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComputedRefImpl[T] extends StObject {
  
  val __v_isRef: /* true */ Boolean = js.native
  
  var _cacheable: Boolean = js.native
  
  var _dirty: Boolean = js.native
  
  /* private */ val _setter: Any = js.native
  
  /* private */ var _value: Any = js.native
  
  var dep: js.UndefOr[Dep] = js.native
  
  val effect: ReactiveEffect[T] = js.native
  
  def value: T = js.native
  def value_=(newValue: T): Unit = js.native
}
