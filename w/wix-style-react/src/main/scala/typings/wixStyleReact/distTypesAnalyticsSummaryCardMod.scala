package typings.wixStyleReact

import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.std.HTMLButtonElement
import typings.wixStyleReact.distTypesSparklineChartMod.chartData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesAnalyticsSummaryCardMod {
  
  @JSImport("wix-style-react/dist/types/AnalyticsSummaryCard", JSImport.Default)
  @js.native
  open class default ()
    extends PureComponent[AnalyticsSummaryCardProps, js.Object, Any]
  
  type AnalyticsSummaryCard = PureComponent[AnalyticsSummaryCardProps, js.Object, Any]
  
  trait AnalyticsSummaryCardProps extends StObject {
    
    var chartAnimationDuration: js.UndefOr[Double] = js.undefined
    
    var chartColorHex: js.UndefOr[String] = js.undefined
    
    var chartData: js.Array[typings.wixStyleReact.distTypesSparklineChartMod.chartData]
    
    var chartHighlightedStartingIndex: js.UndefOr[Double] = js.undefined
    
    var chartWidth: js.UndefOr[Double] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var ctaButton: js.UndefOr[ReactNode] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var footer: js.UndefOr[ReactNode] = js.undefined
    
    var getChartTooltipContent: js.UndefOr[js.Function1[/* index */ Double, ReactNode]] = js.undefined
    
    var invertedTrend: js.UndefOr[Boolean] = js.undefined
    
    var isLoading: js.UndefOr[Boolean] = js.undefined
    
    var isTrendVisible: js.UndefOr[Boolean] = js.undefined
    
    var onCTAClick: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
    
    var onChartHover: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
    
    var onClick: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var titleTooltip: js.UndefOr[String] = js.undefined
    
    var trend: js.UndefOr[Double] = js.undefined
    
    var value: String
    
    var valueTooltip: js.UndefOr[String] = js.undefined
  }
  object AnalyticsSummaryCardProps {
    
    inline def apply(chartData: js.Array[chartData], value: String): AnalyticsSummaryCardProps = {
      val __obj = js.Dynamic.literal(chartData = chartData.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnalyticsSummaryCardProps]
    }
    
    extension [Self <: AnalyticsSummaryCardProps](x: Self) {
      
      inline def setChartAnimationDuration(value: Double): Self = StObject.set(x, "chartAnimationDuration", value.asInstanceOf[js.Any])
      
      inline def setChartAnimationDurationUndefined: Self = StObject.set(x, "chartAnimationDuration", js.undefined)
      
      inline def setChartColorHex(value: String): Self = StObject.set(x, "chartColorHex", value.asInstanceOf[js.Any])
      
      inline def setChartColorHexUndefined: Self = StObject.set(x, "chartColorHex", js.undefined)
      
      inline def setChartData(value: js.Array[chartData]): Self = StObject.set(x, "chartData", value.asInstanceOf[js.Any])
      
      inline def setChartDataVarargs(value: chartData*): Self = StObject.set(x, "chartData", js.Array(value*))
      
      inline def setChartHighlightedStartingIndex(value: Double): Self = StObject.set(x, "chartHighlightedStartingIndex", value.asInstanceOf[js.Any])
      
      inline def setChartHighlightedStartingIndexUndefined: Self = StObject.set(x, "chartHighlightedStartingIndex", js.undefined)
      
      inline def setChartWidth(value: Double): Self = StObject.set(x, "chartWidth", value.asInstanceOf[js.Any])
      
      inline def setChartWidthUndefined: Self = StObject.set(x, "chartWidth", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCtaButton(value: ReactNode): Self = StObject.set(x, "ctaButton", value.asInstanceOf[js.Any])
      
      inline def setCtaButtonUndefined: Self = StObject.set(x, "ctaButton", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setFooter(value: ReactNode): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setGetChartTooltipContent(value: /* index */ Double => ReactNode): Self = StObject.set(x, "getChartTooltipContent", js.Any.fromFunction1(value))
      
      inline def setGetChartTooltipContentUndefined: Self = StObject.set(x, "getChartTooltipContent", js.undefined)
      
      inline def setInvertedTrend(value: Boolean): Self = StObject.set(x, "invertedTrend", value.asInstanceOf[js.Any])
      
      inline def setInvertedTrendUndefined: Self = StObject.set(x, "invertedTrend", js.undefined)
      
      inline def setIsLoading(value: Boolean): Self = StObject.set(x, "isLoading", value.asInstanceOf[js.Any])
      
      inline def setIsLoadingUndefined: Self = StObject.set(x, "isLoading", js.undefined)
      
      inline def setIsTrendVisible(value: Boolean): Self = StObject.set(x, "isTrendVisible", value.asInstanceOf[js.Any])
      
      inline def setIsTrendVisibleUndefined: Self = StObject.set(x, "isTrendVisible", js.undefined)
      
      inline def setOnCTAClick(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onCTAClick", js.Any.fromFunction1(value))
      
      inline def setOnCTAClickUndefined: Self = StObject.set(x, "onCTAClick", js.undefined)
      
      inline def setOnChartHover(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onChartHover", js.Any.fromFunction1(value))
      
      inline def setOnChartHoverUndefined: Self = StObject.set(x, "onChartHover", js.undefined)
      
      inline def setOnClick(value: MouseEvent[HTMLButtonElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleTooltip(value: String): Self = StObject.set(x, "titleTooltip", value.asInstanceOf[js.Any])
      
      inline def setTitleTooltipUndefined: Self = StObject.set(x, "titleTooltip", js.undefined)
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTrend(value: Double): Self = StObject.set(x, "trend", value.asInstanceOf[js.Any])
      
      inline def setTrendUndefined: Self = StObject.set(x, "trend", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueTooltip(value: String): Self = StObject.set(x, "valueTooltip", value.asInstanceOf[js.Any])
      
      inline def setValueTooltipUndefined: Self = StObject.set(x, "valueTooltip", js.undefined)
    }
  }
}
