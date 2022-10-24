package typings.wixStyleReact

import typings.react.mod.global.JSX.Element
import typings.wixStyleReact.anon.CurrentBarData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFunnelChartFunnelStepMod {
  
  @JSImport("wix-style-react/dist/types/FunnelChart/FunnelStep", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def EmptyFunnelStep(): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("EmptyFunnelStep")().asInstanceOf[Element]
  
  inline def FunnelStep(param0: CurrentBarData): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("FunnelStep")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
}
