package typings.vueRuntimeDom.mod

import typings.std.ArrayConstructor
import typings.std.Boolean
import typings.std.BooleanConstructor
import typings.std.FunctionConstructor
import typings.std.String
import typings.std.StringConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object BaseTransitionPropsValidators {
  
  @JSImport("@vue/runtime-dom", "BaseTransitionPropsValidators")
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@vue/runtime-dom", "BaseTransitionPropsValidators.appear")
  @js.native
  /* standard es5 */
  open class appear ()
    extends StObject
       with Boolean {
    def this(value: Any) = this()
  }
  object appear {
    
    /* standard es5 */
    inline def apply[T](): scala.Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("appear")().asInstanceOf[scala.Boolean]
    inline def apply[T](value: T): scala.Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("appear")(value.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  }
  @JSImport("@vue/runtime-dom", "BaseTransitionPropsValidators.appear")
  @js.native
  def appear_FBaseTransitionPropsValidators: BooleanConstructor = js.native
  
  inline def appear_FBaseTransitionPropsValidators_=(x: BooleanConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("appear")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@vue/runtime-dom", "BaseTransitionPropsValidators.mode")
  @js.native
  /* standard es5 */
  open class mode ()
    extends StObject
       with String {
    def this(value: Any) = this()
  }
  object mode {
    
    /* standard es5 */
    inline def apply(): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("mode")().asInstanceOf[java.lang.String]
    inline def apply(value: Any): java.lang.String = ^.asInstanceOf[js.Dynamic].applyDynamic("mode")(value.asInstanceOf[js.Any]).asInstanceOf[java.lang.String]
  }
  @JSImport("@vue/runtime-dom", "BaseTransitionPropsValidators.mode")
  @js.native
  def mode_FBaseTransitionPropsValidators: StringConstructor = js.native
  
  inline def mode_FBaseTransitionPropsValidators_=(x: StringConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mode")(x.asInstanceOf[js.Any])
  
  @JSImport("@vue/runtime-dom", "BaseTransitionPropsValidators.onAfterAppear")
  @js.native
  def onAfterAppear: js.Array[ArrayConstructor | FunctionConstructor] = js.native
  inline def onAfterAppear_=(x: js.Array[ArrayConstructor | FunctionConstructor]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onAfterAppear")(x.asInstanceOf[js.Any])
  
  @JSImport("@vue/runtime-dom", "BaseTransitionPropsValidators.onAfterEnter")
  @js.native
  def onAfterEnter: js.Array[ArrayConstructor | FunctionConstructor] = js.native
  inline def onAfterEnter_=(x: js.Array[ArrayConstructor | FunctionConstructor]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onAfterEnter")(x.asInstanceOf[js.Any])
  
  @JSImport("@vue/runtime-dom", "BaseTransitionPropsValidators.onAfterLeave")
  @js.native
  def onAfterLeave: js.Array[ArrayConstructor | FunctionConstructor] = js.native
  inline def onAfterLeave_=(x: js.Array[ArrayConstructor | FunctionConstructor]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onAfterLeave")(x.asInstanceOf[js.Any])
  
  @JSImport("@vue/runtime-dom", "BaseTransitionPropsValidators.onAppear")
  @js.native
  def onAppear: js.Array[ArrayConstructor | FunctionConstructor] = js.native
  
  @JSImport("@vue/runtime-dom", "BaseTransitionPropsValidators.onAppearCancelled")
  @js.native
  def onAppearCancelled: js.Array[ArrayConstructor | FunctionConstructor] = js.native
  inline def onAppearCancelled_=(x: js.Array[ArrayConstructor | FunctionConstructor]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onAppearCancelled")(x.asInstanceOf[js.Any])
  
  inline def onAppear_=(x: js.Array[ArrayConstructor | FunctionConstructor]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onAppear")(x.asInstanceOf[js.Any])
  
  @JSImport("@vue/runtime-dom", "BaseTransitionPropsValidators.onBeforeAppear")
  @js.native
  def onBeforeAppear: js.Array[ArrayConstructor | FunctionConstructor] = js.native
  inline def onBeforeAppear_=(x: js.Array[ArrayConstructor | FunctionConstructor]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onBeforeAppear")(x.asInstanceOf[js.Any])
  
  @JSImport("@vue/runtime-dom", "BaseTransitionPropsValidators.onBeforeEnter")
  @js.native
  def onBeforeEnter: js.Array[ArrayConstructor | FunctionConstructor] = js.native
  inline def onBeforeEnter_=(x: js.Array[ArrayConstructor | FunctionConstructor]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onBeforeEnter")(x.asInstanceOf[js.Any])
  
  @JSImport("@vue/runtime-dom", "BaseTransitionPropsValidators.onBeforeLeave")
  @js.native
  def onBeforeLeave: js.Array[ArrayConstructor | FunctionConstructor] = js.native
  inline def onBeforeLeave_=(x: js.Array[ArrayConstructor | FunctionConstructor]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onBeforeLeave")(x.asInstanceOf[js.Any])
  
  @JSImport("@vue/runtime-dom", "BaseTransitionPropsValidators.onEnter")
  @js.native
  def onEnter: js.Array[ArrayConstructor | FunctionConstructor] = js.native
  
  @JSImport("@vue/runtime-dom", "BaseTransitionPropsValidators.onEnterCancelled")
  @js.native
  def onEnterCancelled: js.Array[ArrayConstructor | FunctionConstructor] = js.native
  inline def onEnterCancelled_=(x: js.Array[ArrayConstructor | FunctionConstructor]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onEnterCancelled")(x.asInstanceOf[js.Any])
  
  inline def onEnter_=(x: js.Array[ArrayConstructor | FunctionConstructor]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onEnter")(x.asInstanceOf[js.Any])
  
  @JSImport("@vue/runtime-dom", "BaseTransitionPropsValidators.onLeave")
  @js.native
  def onLeave: js.Array[ArrayConstructor | FunctionConstructor] = js.native
  
  @JSImport("@vue/runtime-dom", "BaseTransitionPropsValidators.onLeaveCancelled")
  @js.native
  def onLeaveCancelled: js.Array[ArrayConstructor | FunctionConstructor] = js.native
  inline def onLeaveCancelled_=(x: js.Array[ArrayConstructor | FunctionConstructor]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onLeaveCancelled")(x.asInstanceOf[js.Any])
  
  inline def onLeave_=(x: js.Array[ArrayConstructor | FunctionConstructor]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onLeave")(x.asInstanceOf[js.Any])
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("@vue/runtime-dom", "BaseTransitionPropsValidators.persisted")
  @js.native
  /* standard es5 */
  open class persisted ()
    extends StObject
       with Boolean {
    def this(value: Any) = this()
  }
  object persisted {
    
    /* standard es5 */
    inline def apply[T](): scala.Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("persisted")().asInstanceOf[scala.Boolean]
    inline def apply[T](value: T): scala.Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("persisted")(value.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  }
  @JSImport("@vue/runtime-dom", "BaseTransitionPropsValidators.persisted")
  @js.native
  def persisted_FBaseTransitionPropsValidators: BooleanConstructor = js.native
  
  inline def persisted_FBaseTransitionPropsValidators_=(x: BooleanConstructor): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("persisted")(x.asInstanceOf[js.Any])
}
