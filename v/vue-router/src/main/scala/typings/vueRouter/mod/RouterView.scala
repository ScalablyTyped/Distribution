package typings.vueRouter.mod

import org.scalablytyped.runtime.Instantiable0
import typings.vueRouter.anon.Default
import typings.vueRouter.anon.Props
import typings.vueRouter.mod.^
import typings.vueRuntimeCore.mod.AllowedComponentProps
import typings.vueRuntimeCore.mod.ComponentCustomProps
import typings.vueRuntimeCore.mod.VNodeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("vue-router", "RouterView")
@js.native
open class RouterView ()
  extends StObject
     with Props {
  
  /* CompleteClass */
  @JSName("$props")
  var $props: AllowedComponentProps & ComponentCustomProps & VNodeProps & RouterViewProps = js.native
  
  /* CompleteClass */
  @JSName("$slots")
  var $slots: Default = js.native
}
object RouterView {
  
  inline def apply: Instantiable0[Props] = ^.asInstanceOf[js.Dynamic].selectDynamic("RouterView").asInstanceOf[Instantiable0[Props]]
}
