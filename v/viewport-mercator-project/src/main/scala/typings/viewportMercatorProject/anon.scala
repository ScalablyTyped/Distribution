package typings.viewportMercatorProject

import typings.viewportMercatorProject.mod.Coordinates
import typings.viewportMercatorProject.mod.CoordinatesZ
import typings.viewportMercatorProject.mod.DistanceScalesInput
import typings.viewportMercatorProject.mod.HighPrecisionDistanceScalesInput
import typings.viewportMercatorProject.mod.Padding
import typings.viewportMercatorProject.viewportMercatorProjectBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Altitude extends StObject {
    
    var altitude: Double
    
    var bearing: Double
    
    var center: js.UndefOr[CoordinatesZ] = js.undefined
    
    var flipY: js.UndefOr[Boolean] = js.undefined
    
    var height: Double
    
    var pitch: Double
  }
  object Altitude {
    
    inline def apply(altitude: Double, bearing: Double, height: Double, pitch: Double): Altitude = {
      val __obj = js.Dynamic.literal(altitude = altitude.asInstanceOf[js.Any], bearing = bearing.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], pitch = pitch.asInstanceOf[js.Any])
      __obj.asInstanceOf[Altitude]
    }
    
    extension [Self <: Altitude](x: Self) {
      
      inline def setAltitude(value: Double): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
      
      inline def setBearing(value: Double): Self = StObject.set(x, "bearing", value.asInstanceOf[js.Any])
      
      inline def setCenter(value: CoordinatesZ): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
      
      inline def setFlipY(value: Boolean): Self = StObject.set(x, "flipY", value.asInstanceOf[js.Any])
      
      inline def setFlipYUndefined: Self = StObject.set(x, "flipY", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setPitch(value: Double): Self = StObject.set(x, "pitch", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined viewport-mercator-project.viewport-mercator-project.BaseDistanceScalesInput & {  scale :number} */
  trait BaseDistanceScalesInputsc
    extends StObject
       with DistanceScalesInput {
    
    var latitude: Double
    
    var longitude: Double
    
    var scale: Double
  }
  object BaseDistanceScalesInputsc {
    
    inline def apply(latitude: Double, longitude: Double, scale: Double): BaseDistanceScalesInputsc = {
      val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseDistanceScalesInputsc]
    }
    
    extension [Self <: BaseDistanceScalesInputsc](x: Self) {
      
      inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined viewport-mercator-project.viewport-mercator-project.BaseDistanceScalesInput & {  zoom :number} */
  trait BaseDistanceScalesInputzo
    extends StObject
       with DistanceScalesInput {
    
    var latitude: Double
    
    var longitude: Double
    
    var zoom: Double
  }
  object BaseDistanceScalesInputzo {
    
    inline def apply(latitude: Double, longitude: Double, zoom: Double): BaseDistanceScalesInputzo = {
      val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseDistanceScalesInputzo]
    }
    
    extension [Self <: BaseDistanceScalesInputzo](x: Self) {
      
      inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
      
      inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined viewport-mercator-project.viewport-mercator-project.BaseHighPrecisionDistanceScalesInput & {  zoom :number} */
  trait BaseHighPrecisionDistance
    extends StObject
       with HighPrecisionDistanceScalesInput {
    
    var highPrecision: `true`
    
    var latitude: Double
    
    var longitude: Double
    
    var zoom: Double
  }
  object BaseHighPrecisionDistance {
    
    inline def apply(latitude: Double, longitude: Double, zoom: Double): BaseHighPrecisionDistance = {
      val __obj = js.Dynamic.literal(highPrecision = true, latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseHighPrecisionDistance]
    }
    
    extension [Self <: BaseHighPrecisionDistance](x: Self) {
      
      inline def setHighPrecision(value: `true`): Self = StObject.set(x, "highPrecision", value.asInstanceOf[js.Any])
      
      inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
      
      inline def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined viewport-mercator-project.viewport-mercator-project.BaseHighPrecisionDistanceScalesInput & {  scale :number} */
  trait BaseHighPrecisionDistanceHighPrecision
    extends StObject
       with HighPrecisionDistanceScalesInput {
    
    var highPrecision: `true`
    
    var latitude: Double
    
    var longitude: Double
    
    var scale: Double
  }
  object BaseHighPrecisionDistanceHighPrecision {
    
    inline def apply(latitude: Double, longitude: Double, scale: Double): BaseHighPrecisionDistanceHighPrecision = {
      val __obj = js.Dynamic.literal(highPrecision = true, latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseHighPrecisionDistanceHighPrecision]
    }
    
    extension [Self <: BaseHighPrecisionDistanceHighPrecision](x: Self) {
      
      inline def setHighPrecision(value: `true`): Self = StObject.set(x, "highPrecision", value.asInstanceOf[js.Any])
      
      inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
      
      inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    }
  }
  
  trait Bottom extends StObject {
    
    var bottom: Double
    
    var left: Double
    
    var right: Double
    
    var top: Double
  }
  object Bottom {
    
    inline def apply(bottom: Double, left: Double, right: Double, top: Double): Bottom = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bottom]
    }
    
    extension [Self <: Bottom](x: Self) {
      
      inline def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  trait Bounds extends StObject {
    
    var bounds: typings.viewportMercatorProject.mod.Bounds
    
    var height: Double
    
    var offset: js.UndefOr[Coordinates] = js.undefined
    
    var padding: js.UndefOr[Padding] = js.undefined
    
    var width: Double
  }
  object Bounds {
    
    inline def apply(bounds: typings.viewportMercatorProject.mod.Bounds, height: Double, width: Double): Bounds = {
      val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bounds]
    }
    
    extension [Self <: Bounds](x: Self) {
      
      inline def setBounds(value: typings.viewportMercatorProject.mod.Bounds): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Coordinates): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setPadding(value: Padding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait Latitude extends StObject {
    
    var latitude: Double
  }
  object Latitude {
    
    inline def apply(latitude: Double): Latitude = {
      val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any])
      __obj.asInstanceOf[Latitude]
    }
    
    extension [Self <: Latitude](x: Self) {
      
      inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    }
  }
  
  trait LngLat extends StObject {
    
    var lngLat: Coordinates
    
    var pos: Coordinates
  }
  object LngLat {
    
    inline def apply(lngLat: Coordinates, pos: Coordinates): LngLat = {
      val __obj = js.Dynamic.literal(lngLat = lngLat.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
      __obj.asInstanceOf[LngLat]
    }
    
    extension [Self <: LngLat](x: Self) {
      
      inline def setLngLat(value: Coordinates): Self = StObject.set(x, "lngLat", value.asInstanceOf[js.Any])
      
      inline def setPos(value: Coordinates): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
    }
  }
  
  trait Offset extends StObject {
    
    var offset: js.UndefOr[Coordinates] = js.undefined
    
    var padding: js.UndefOr[Padding] = js.undefined
  }
  object Offset {
    
    inline def apply(): Offset = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Offset]
    }
    
    extension [Self <: Offset](x: Self) {
      
      inline def setOffset(value: Coordinates): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      inline def setPadding(value: Padding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    }
  }
}
