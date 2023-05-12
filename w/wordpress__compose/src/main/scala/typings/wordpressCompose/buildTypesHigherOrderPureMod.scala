package typings.wordpressCompose

import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesHigherOrderPureMod {
  
  @JSImport("@wordpress/compose/build-types/higher-order/pure", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Given a component returns the enhanced component augmented with a component
    * only re-rendering when its props/state change
    */
  inline def default[Props /* <: js.Object */](Inner: ComponentType[Props]): ComponentType[Props] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(Inner.asInstanceOf[js.Any]).asInstanceOf[ComponentType[Props]]
}
