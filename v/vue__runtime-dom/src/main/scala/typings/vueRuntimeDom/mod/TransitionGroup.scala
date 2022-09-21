package typings.vueRuntimeDom.mod

import org.scalablytyped.runtime.Instantiable0
import typings.vueRuntimeDom.anon.Props
import typings.vueRuntimeDom.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("@vue/runtime-dom", "TransitionGroup")
@js.native
open class TransitionGroup ()
  extends StObject
     with Props {
  
  /* CompleteClass */
  @JSName("$props")
  var $props: TransitionGroupProps = js.native
}
object TransitionGroup {
  
  inline def apply: Instantiable0[Props] = ^.asInstanceOf[js.Dynamic].selectDynamic("TransitionGroup").asInstanceOf[Instantiable0[Props]]
}
