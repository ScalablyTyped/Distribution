package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CurrentBarData extends StObject {
  
  var currentBarData: Any
  
  var currentBarHeight: Any
  
  var currentBarIndex: Any
  
  var getTooltipContent: Any
  
  var hideDifferenceBadge: Any
  
  var nextBarData: Any
  
  var nextBarHeight: Any
  
  var onTooltipShow: Any
}
object CurrentBarData {
  
  inline def apply(
    currentBarData: Any,
    currentBarHeight: Any,
    currentBarIndex: Any,
    getTooltipContent: Any,
    hideDifferenceBadge: Any,
    nextBarData: Any,
    nextBarHeight: Any,
    onTooltipShow: Any
  ): CurrentBarData = {
    val __obj = js.Dynamic.literal(currentBarData = currentBarData.asInstanceOf[js.Any], currentBarHeight = currentBarHeight.asInstanceOf[js.Any], currentBarIndex = currentBarIndex.asInstanceOf[js.Any], getTooltipContent = getTooltipContent.asInstanceOf[js.Any], hideDifferenceBadge = hideDifferenceBadge.asInstanceOf[js.Any], nextBarData = nextBarData.asInstanceOf[js.Any], nextBarHeight = nextBarHeight.asInstanceOf[js.Any], onTooltipShow = onTooltipShow.asInstanceOf[js.Any])
    __obj.asInstanceOf[CurrentBarData]
  }
  
  extension [Self <: CurrentBarData](x: Self) {
    
    inline def setCurrentBarData(value: Any): Self = StObject.set(x, "currentBarData", value.asInstanceOf[js.Any])
    
    inline def setCurrentBarHeight(value: Any): Self = StObject.set(x, "currentBarHeight", value.asInstanceOf[js.Any])
    
    inline def setCurrentBarIndex(value: Any): Self = StObject.set(x, "currentBarIndex", value.asInstanceOf[js.Any])
    
    inline def setGetTooltipContent(value: Any): Self = StObject.set(x, "getTooltipContent", value.asInstanceOf[js.Any])
    
    inline def setHideDifferenceBadge(value: Any): Self = StObject.set(x, "hideDifferenceBadge", value.asInstanceOf[js.Any])
    
    inline def setNextBarData(value: Any): Self = StObject.set(x, "nextBarData", value.asInstanceOf[js.Any])
    
    inline def setNextBarHeight(value: Any): Self = StObject.set(x, "nextBarHeight", value.asInstanceOf[js.Any])
    
    inline def setOnTooltipShow(value: Any): Self = StObject.set(x, "onTooltipShow", value.asInstanceOf[js.Any])
  }
}
