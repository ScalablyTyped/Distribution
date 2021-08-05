package typings.wixUiCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShouldLoadAsync extends StObject {
  
  var shouldLoadAsync: js.UndefOr[Boolean] = js.undefined
  
  var showTooltip: js.UndefOr[Boolean] = js.undefined
  
  var tooltipProps: js.UndefOr[js.Object] = js.undefined
}
object ShouldLoadAsync {
  
  inline def apply(): ShouldLoadAsync = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShouldLoadAsync]
  }
  
  extension [Self <: ShouldLoadAsync](x: Self) {
    
    inline def setShouldLoadAsync(value: Boolean): Self = StObject.set(x, "shouldLoadAsync", value.asInstanceOf[js.Any])
    
    inline def setShouldLoadAsyncUndefined: Self = StObject.set(x, "shouldLoadAsync", js.undefined)
    
    inline def setShowTooltip(value: Boolean): Self = StObject.set(x, "showTooltip", value.asInstanceOf[js.Any])
    
    inline def setShowTooltipUndefined: Self = StObject.set(x, "showTooltip", js.undefined)
    
    inline def setTooltipProps(value: js.Object): Self = StObject.set(x, "tooltipProps", value.asInstanceOf[js.Any])
    
    inline def setTooltipPropsUndefined: Self = StObject.set(x, "tooltipProps", js.undefined)
  }
}
