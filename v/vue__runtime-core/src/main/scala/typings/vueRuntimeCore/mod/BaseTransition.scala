package typings.vueRuntimeCore.mod

import org.scalablytyped.runtime.Instantiable0
import typings.vueRuntimeCore.anon.PropsSlots
import typings.vueRuntimeCore.anon.`0`
import typings.vueRuntimeCore.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("@vue/runtime-core", "BaseTransition")
@js.native
open class BaseTransition ()
  extends StObject
     with PropsSlots {
  
  /* CompleteClass */
  @JSName("$props")
  var $props: BaseTransitionProps[Any] = js.native
  
  /* CompleteClass */
  @JSName("$slots")
  var $slots: `0` = js.native
}
object BaseTransition {
  
  inline def apply: Instantiable0[PropsSlots] = ^.asInstanceOf[js.Dynamic].selectDynamic("BaseTransition").asInstanceOf[Instantiable0[PropsSlots]]
}
