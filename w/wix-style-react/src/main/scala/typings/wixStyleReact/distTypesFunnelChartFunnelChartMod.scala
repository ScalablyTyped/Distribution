package typings.wixStyleReact

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import typings.react.mod.global.JSX.Element
import typings.wixStyleReact.anon.DisplayValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesFunnelChartFunnelChartMod {
  
  object default {
    
    /** FunnelChart */
    inline def apply(props: Any): Element | Null = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element | Null]
    
    @JSImport("wix-style-react/dist/types/FunnelChart/FunnelChart", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/FunnelChart/FunnelChart", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      inline def differenceBadgeTooltipContent1(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("differenceBadgeTooltipContent_1")().asInstanceOf[String]
      
      inline def onDifferenceBadgeTooltipShow1(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onDifferenceBadgeTooltipShow_1")().asInstanceOf[Unit]
    }
    
    @JSImport("wix-style-react/dist/types/FunnelChart/FunnelChart", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/FunnelChart/FunnelChart", "default.propTypes.className")
      @js.native
      val className: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/FunnelChart/FunnelChart", "default.propTypes.data")
      @js.native
      val data: Validator[js.Array[js.UndefOr[InferProps[DisplayValue] | Null]]] = js.native
      
      @JSImport("wix-style-react/dist/types/FunnelChart/FunnelChart", "default.propTypes.dataHook")
      @js.native
      val dataHook: Requireable[String] = js.native
      
      @JSImport("wix-style-react/dist/types/FunnelChart/FunnelChart", "default.propTypes.differenceBadgeTooltipContent")
      @js.native
      val differenceBadgeTooltipContent: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      
      @JSImport("wix-style-react/dist/types/FunnelChart/FunnelChart", "default.propTypes.hideDifferenceBadge")
      @js.native
      val hideDifferenceBadge: Requireable[Boolean] = js.native
      
      @JSImport("wix-style-react/dist/types/FunnelChart/FunnelChart", "default.propTypes.onDifferenceBadgeTooltipShow")
      @js.native
      val onDifferenceBadgeTooltipShow: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
    }
  }
}
