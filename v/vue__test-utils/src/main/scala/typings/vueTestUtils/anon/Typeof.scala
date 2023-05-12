package typings.vueTestUtils.anon

import typings.std.ArrayConstructor
import typings.std.BooleanConstructor
import typings.std.FunctionConstructor
import typings.std.StringConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeof extends StObject {
  
  /* standard es5 */
  def appear[T](): Boolean
  def appear[T](value: T): Boolean
  @JSName("appear")
  var appear_Original: BooleanConstructor
  
  /* standard es5 */
  def mode(): String
  def mode(value: Any): String
  @JSName("mode")
  var mode_Original: StringConstructor
  
  var onAfterAppear: js.Array[ArrayConstructor | FunctionConstructor]
  
  var onAfterEnter: js.Array[ArrayConstructor | FunctionConstructor]
  
  var onAfterLeave: js.Array[ArrayConstructor | FunctionConstructor]
  
  var onAppear: js.Array[ArrayConstructor | FunctionConstructor]
  
  var onAppearCancelled: js.Array[ArrayConstructor | FunctionConstructor]
  
  var onBeforeAppear: js.Array[ArrayConstructor | FunctionConstructor]
  
  var onBeforeEnter: js.Array[ArrayConstructor | FunctionConstructor]
  
  var onBeforeLeave: js.Array[ArrayConstructor | FunctionConstructor]
  
  var onEnter: js.Array[ArrayConstructor | FunctionConstructor]
  
  var onEnterCancelled: js.Array[ArrayConstructor | FunctionConstructor]
  
  var onLeave: js.Array[ArrayConstructor | FunctionConstructor]
  
  var onLeaveCancelled: js.Array[ArrayConstructor | FunctionConstructor]
  
  /* standard es5 */
  def persisted[T](): Boolean
  def persisted[T](value: T): Boolean
  @JSName("persisted")
  var persisted_Original: BooleanConstructor
}
object Typeof {
  
  inline def apply(
    appear: BooleanConstructor,
    mode: StringConstructor,
    onAfterAppear: js.Array[ArrayConstructor | FunctionConstructor],
    onAfterEnter: js.Array[ArrayConstructor | FunctionConstructor],
    onAfterLeave: js.Array[ArrayConstructor | FunctionConstructor],
    onAppear: js.Array[ArrayConstructor | FunctionConstructor],
    onAppearCancelled: js.Array[ArrayConstructor | FunctionConstructor],
    onBeforeAppear: js.Array[ArrayConstructor | FunctionConstructor],
    onBeforeEnter: js.Array[ArrayConstructor | FunctionConstructor],
    onBeforeLeave: js.Array[ArrayConstructor | FunctionConstructor],
    onEnter: js.Array[ArrayConstructor | FunctionConstructor],
    onEnterCancelled: js.Array[ArrayConstructor | FunctionConstructor],
    onLeave: js.Array[ArrayConstructor | FunctionConstructor],
    onLeaveCancelled: js.Array[ArrayConstructor | FunctionConstructor],
    persisted: BooleanConstructor
  ): Typeof = {
    val __obj = js.Dynamic.literal(appear = appear.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], onAfterAppear = onAfterAppear.asInstanceOf[js.Any], onAfterEnter = onAfterEnter.asInstanceOf[js.Any], onAfterLeave = onAfterLeave.asInstanceOf[js.Any], onAppear = onAppear.asInstanceOf[js.Any], onAppearCancelled = onAppearCancelled.asInstanceOf[js.Any], onBeforeAppear = onBeforeAppear.asInstanceOf[js.Any], onBeforeEnter = onBeforeEnter.asInstanceOf[js.Any], onBeforeLeave = onBeforeLeave.asInstanceOf[js.Any], onEnter = onEnter.asInstanceOf[js.Any], onEnterCancelled = onEnterCancelled.asInstanceOf[js.Any], onLeave = onLeave.asInstanceOf[js.Any], onLeaveCancelled = onLeaveCancelled.asInstanceOf[js.Any], persisted = persisted.asInstanceOf[js.Any])
    __obj.asInstanceOf[Typeof]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Typeof] (val x: Self) extends AnyVal {
    
    inline def setAppear(value: BooleanConstructor): Self = StObject.set(x, "appear", value.asInstanceOf[js.Any])
    
    inline def setMode(value: StringConstructor): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setOnAfterAppear(value: js.Array[ArrayConstructor | FunctionConstructor]): Self = StObject.set(x, "onAfterAppear", value.asInstanceOf[js.Any])
    
    inline def setOnAfterAppearVarargs(value: (ArrayConstructor | FunctionConstructor)*): Self = StObject.set(x, "onAfterAppear", js.Array(value*))
    
    inline def setOnAfterEnter(value: js.Array[ArrayConstructor | FunctionConstructor]): Self = StObject.set(x, "onAfterEnter", value.asInstanceOf[js.Any])
    
    inline def setOnAfterEnterVarargs(value: (ArrayConstructor | FunctionConstructor)*): Self = StObject.set(x, "onAfterEnter", js.Array(value*))
    
    inline def setOnAfterLeave(value: js.Array[ArrayConstructor | FunctionConstructor]): Self = StObject.set(x, "onAfterLeave", value.asInstanceOf[js.Any])
    
    inline def setOnAfterLeaveVarargs(value: (ArrayConstructor | FunctionConstructor)*): Self = StObject.set(x, "onAfterLeave", js.Array(value*))
    
    inline def setOnAppear(value: js.Array[ArrayConstructor | FunctionConstructor]): Self = StObject.set(x, "onAppear", value.asInstanceOf[js.Any])
    
    inline def setOnAppearCancelled(value: js.Array[ArrayConstructor | FunctionConstructor]): Self = StObject.set(x, "onAppearCancelled", value.asInstanceOf[js.Any])
    
    inline def setOnAppearCancelledVarargs(value: (ArrayConstructor | FunctionConstructor)*): Self = StObject.set(x, "onAppearCancelled", js.Array(value*))
    
    inline def setOnAppearVarargs(value: (ArrayConstructor | FunctionConstructor)*): Self = StObject.set(x, "onAppear", js.Array(value*))
    
    inline def setOnBeforeAppear(value: js.Array[ArrayConstructor | FunctionConstructor]): Self = StObject.set(x, "onBeforeAppear", value.asInstanceOf[js.Any])
    
    inline def setOnBeforeAppearVarargs(value: (ArrayConstructor | FunctionConstructor)*): Self = StObject.set(x, "onBeforeAppear", js.Array(value*))
    
    inline def setOnBeforeEnter(value: js.Array[ArrayConstructor | FunctionConstructor]): Self = StObject.set(x, "onBeforeEnter", value.asInstanceOf[js.Any])
    
    inline def setOnBeforeEnterVarargs(value: (ArrayConstructor | FunctionConstructor)*): Self = StObject.set(x, "onBeforeEnter", js.Array(value*))
    
    inline def setOnBeforeLeave(value: js.Array[ArrayConstructor | FunctionConstructor]): Self = StObject.set(x, "onBeforeLeave", value.asInstanceOf[js.Any])
    
    inline def setOnBeforeLeaveVarargs(value: (ArrayConstructor | FunctionConstructor)*): Self = StObject.set(x, "onBeforeLeave", js.Array(value*))
    
    inline def setOnEnter(value: js.Array[ArrayConstructor | FunctionConstructor]): Self = StObject.set(x, "onEnter", value.asInstanceOf[js.Any])
    
    inline def setOnEnterCancelled(value: js.Array[ArrayConstructor | FunctionConstructor]): Self = StObject.set(x, "onEnterCancelled", value.asInstanceOf[js.Any])
    
    inline def setOnEnterCancelledVarargs(value: (ArrayConstructor | FunctionConstructor)*): Self = StObject.set(x, "onEnterCancelled", js.Array(value*))
    
    inline def setOnEnterVarargs(value: (ArrayConstructor | FunctionConstructor)*): Self = StObject.set(x, "onEnter", js.Array(value*))
    
    inline def setOnLeave(value: js.Array[ArrayConstructor | FunctionConstructor]): Self = StObject.set(x, "onLeave", value.asInstanceOf[js.Any])
    
    inline def setOnLeaveCancelled(value: js.Array[ArrayConstructor | FunctionConstructor]): Self = StObject.set(x, "onLeaveCancelled", value.asInstanceOf[js.Any])
    
    inline def setOnLeaveCancelledVarargs(value: (ArrayConstructor | FunctionConstructor)*): Self = StObject.set(x, "onLeaveCancelled", js.Array(value*))
    
    inline def setOnLeaveVarargs(value: (ArrayConstructor | FunctionConstructor)*): Self = StObject.set(x, "onLeave", js.Array(value*))
    
    inline def setPersisted(value: BooleanConstructor): Self = StObject.set(x, "persisted", value.asInstanceOf[js.Any])
  }
}
