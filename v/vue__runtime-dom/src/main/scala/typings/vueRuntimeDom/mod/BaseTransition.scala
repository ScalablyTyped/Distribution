package typings.vueRuntimeDom.mod

import org.scalablytyped.runtime.Instantiable0
import typings.vueRuntimeCore.anon.Props
import typings.vueRuntimeCore.mod.BaseTransitionProps
import typings.vueRuntimeDom.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("@vue/runtime-dom", "BaseTransition")
@js.native
open class BaseTransition ()
  extends StObject
     with Props {
  
  /* CompleteClass */
  @JSName("$props")
  var $props: BaseTransitionProps[Any] = js.native
}
object BaseTransition {
  
  inline def apply: Instantiable0[Props] = ^.asInstanceOf[js.Dynamic].selectDynamic("BaseTransition").asInstanceOf[Instantiable0[Props]]
}
