package typings.yandexMaps.mod

import typings.yandexMaps.anon.Href
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IClusterPlacemarkOptionsWithClusterPrefix extends StObject {
  
  var clusterBalloonContentLayout: js.UndefOr[IClassConstructor[ILayout] | ClusterLayoutKey] = js.undefined
  
  var clusterBalloonContentLayoutHeight: js.UndefOr[Double] = js.undefined
  
  var clusterBalloonContentLayoutWidth: js.UndefOr[Double] = js.undefined
  
  var clusterBalloonItemContentLayout: js.UndefOr[ILayout | ClusterContentLayoutKey] = js.undefined
  
  var clusterBalloonPanelContentLayout: js.UndefOr[IClassConstructor[ILayout] | ClusterLayoutKey] = js.undefined
  
  var clusterCursor: js.UndefOr[String] = js.undefined
  
  var clusterDisableClickZoom: js.UndefOr[Boolean] = js.undefined
  
  var clusterHideIconOnBalloonOpen: js.UndefOr[Boolean] = js.undefined
  
  var clusterIconColor: js.UndefOr[String] = js.undefined
  
  var clusterIconContentLayout: js.UndefOr[IClassConstructor[ILayout] | String] = js.undefined
  
  var clusterIconLayout: js.UndefOr[IClassConstructor[ILayout] | String] = js.undefined
  
  var clusterIconShape: js.UndefOr[IGeometryJson] = js.undefined
  
  var clusterIcons: js.UndefOr[js.Array[Href]] = js.undefined
  
  var clusterInteractivityModel: js.UndefOr[InteractivityModelKey] = js.undefined
  
  var clusterNumbers: js.UndefOr[js.Array[Double]] = js.undefined
  
  var clusterOpenBalloonOnClick: js.UndefOr[Boolean] = js.undefined
  
  var clusterOpenEmptyHint: js.UndefOr[Boolean] = js.undefined
  
  var clusterOpenHintOnHover: js.UndefOr[Boolean] = js.undefined
  
  var clusterZIndexHover: js.UndefOr[Double] = js.undefined
}
object IClusterPlacemarkOptionsWithClusterPrefix {
  
  inline def apply(): IClusterPlacemarkOptionsWithClusterPrefix = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IClusterPlacemarkOptionsWithClusterPrefix]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IClusterPlacemarkOptionsWithClusterPrefix] (val x: Self) extends AnyVal {
    
    inline def setClusterBalloonContentLayout(value: IClassConstructor[ILayout] | ClusterLayoutKey): Self = StObject.set(x, "clusterBalloonContentLayout", value.asInstanceOf[js.Any])
    
    inline def setClusterBalloonContentLayoutHeight(value: Double): Self = StObject.set(x, "clusterBalloonContentLayoutHeight", value.asInstanceOf[js.Any])
    
    inline def setClusterBalloonContentLayoutHeightUndefined: Self = StObject.set(x, "clusterBalloonContentLayoutHeight", js.undefined)
    
    inline def setClusterBalloonContentLayoutUndefined: Self = StObject.set(x, "clusterBalloonContentLayout", js.undefined)
    
    inline def setClusterBalloonContentLayoutWidth(value: Double): Self = StObject.set(x, "clusterBalloonContentLayoutWidth", value.asInstanceOf[js.Any])
    
    inline def setClusterBalloonContentLayoutWidthUndefined: Self = StObject.set(x, "clusterBalloonContentLayoutWidth", js.undefined)
    
    inline def setClusterBalloonItemContentLayout(value: ILayout | ClusterContentLayoutKey): Self = StObject.set(x, "clusterBalloonItemContentLayout", value.asInstanceOf[js.Any])
    
    inline def setClusterBalloonItemContentLayoutUndefined: Self = StObject.set(x, "clusterBalloonItemContentLayout", js.undefined)
    
    inline def setClusterBalloonPanelContentLayout(value: IClassConstructor[ILayout] | ClusterLayoutKey): Self = StObject.set(x, "clusterBalloonPanelContentLayout", value.asInstanceOf[js.Any])
    
    inline def setClusterBalloonPanelContentLayoutUndefined: Self = StObject.set(x, "clusterBalloonPanelContentLayout", js.undefined)
    
    inline def setClusterCursor(value: String): Self = StObject.set(x, "clusterCursor", value.asInstanceOf[js.Any])
    
    inline def setClusterCursorUndefined: Self = StObject.set(x, "clusterCursor", js.undefined)
    
    inline def setClusterDisableClickZoom(value: Boolean): Self = StObject.set(x, "clusterDisableClickZoom", value.asInstanceOf[js.Any])
    
    inline def setClusterDisableClickZoomUndefined: Self = StObject.set(x, "clusterDisableClickZoom", js.undefined)
    
    inline def setClusterHideIconOnBalloonOpen(value: Boolean): Self = StObject.set(x, "clusterHideIconOnBalloonOpen", value.asInstanceOf[js.Any])
    
    inline def setClusterHideIconOnBalloonOpenUndefined: Self = StObject.set(x, "clusterHideIconOnBalloonOpen", js.undefined)
    
    inline def setClusterIconColor(value: String): Self = StObject.set(x, "clusterIconColor", value.asInstanceOf[js.Any])
    
    inline def setClusterIconColorUndefined: Self = StObject.set(x, "clusterIconColor", js.undefined)
    
    inline def setClusterIconContentLayout(value: IClassConstructor[ILayout] | String): Self = StObject.set(x, "clusterIconContentLayout", value.asInstanceOf[js.Any])
    
    inline def setClusterIconContentLayoutUndefined: Self = StObject.set(x, "clusterIconContentLayout", js.undefined)
    
    inline def setClusterIconLayout(value: IClassConstructor[ILayout] | String): Self = StObject.set(x, "clusterIconLayout", value.asInstanceOf[js.Any])
    
    inline def setClusterIconLayoutUndefined: Self = StObject.set(x, "clusterIconLayout", js.undefined)
    
    inline def setClusterIconShape(value: IGeometryJson): Self = StObject.set(x, "clusterIconShape", value.asInstanceOf[js.Any])
    
    inline def setClusterIconShapeUndefined: Self = StObject.set(x, "clusterIconShape", js.undefined)
    
    inline def setClusterIcons(value: js.Array[Href]): Self = StObject.set(x, "clusterIcons", value.asInstanceOf[js.Any])
    
    inline def setClusterIconsUndefined: Self = StObject.set(x, "clusterIcons", js.undefined)
    
    inline def setClusterIconsVarargs(value: Href*): Self = StObject.set(x, "clusterIcons", js.Array(value*))
    
    inline def setClusterInteractivityModel(value: InteractivityModelKey): Self = StObject.set(x, "clusterInteractivityModel", value.asInstanceOf[js.Any])
    
    inline def setClusterInteractivityModelUndefined: Self = StObject.set(x, "clusterInteractivityModel", js.undefined)
    
    inline def setClusterNumbers(value: js.Array[Double]): Self = StObject.set(x, "clusterNumbers", value.asInstanceOf[js.Any])
    
    inline def setClusterNumbersUndefined: Self = StObject.set(x, "clusterNumbers", js.undefined)
    
    inline def setClusterNumbersVarargs(value: Double*): Self = StObject.set(x, "clusterNumbers", js.Array(value*))
    
    inline def setClusterOpenBalloonOnClick(value: Boolean): Self = StObject.set(x, "clusterOpenBalloonOnClick", value.asInstanceOf[js.Any])
    
    inline def setClusterOpenBalloonOnClickUndefined: Self = StObject.set(x, "clusterOpenBalloonOnClick", js.undefined)
    
    inline def setClusterOpenEmptyHint(value: Boolean): Self = StObject.set(x, "clusterOpenEmptyHint", value.asInstanceOf[js.Any])
    
    inline def setClusterOpenEmptyHintUndefined: Self = StObject.set(x, "clusterOpenEmptyHint", js.undefined)
    
    inline def setClusterOpenHintOnHover(value: Boolean): Self = StObject.set(x, "clusterOpenHintOnHover", value.asInstanceOf[js.Any])
    
    inline def setClusterOpenHintOnHoverUndefined: Self = StObject.set(x, "clusterOpenHintOnHover", js.undefined)
    
    inline def setClusterZIndexHover(value: Double): Self = StObject.set(x, "clusterZIndexHover", value.asInstanceOf[js.Any])
    
    inline def setClusterZIndexHoverUndefined: Self = StObject.set(x, "clusterZIndexHover", js.undefined)
  }
}
