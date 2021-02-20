package typings.viewportMercatorProject

import typings.viewportMercatorProject.mod.Coordinates
import typings.viewportMercatorProject.mod.CoordinatesZ
import typings.viewportMercatorProject.mod.DistanceScalesInput
import typings.viewportMercatorProject.mod.HighPrecisionDistanceScalesInput
import typings.viewportMercatorProject.mod.Padding
import typings.viewportMercatorProject.viewportMercatorProjectBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Altitude extends StObject {
    
    var altitude: Double = js.native
    
    var bearing: Double = js.native
    
    var center: js.UndefOr[CoordinatesZ] = js.native
    
    var flipY: js.UndefOr[Boolean] = js.native
    
    var height: Double = js.native
    
    var pitch: Double = js.native
  }
  object Altitude {
    
    @scala.inline
    def apply(altitude: Double, bearing: Double, height: Double, pitch: Double): Altitude = {
      val __obj = js.Dynamic.literal(altitude = altitude.asInstanceOf[js.Any], bearing = bearing.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], pitch = pitch.asInstanceOf[js.Any])
      __obj.asInstanceOf[Altitude]
    }
    
    @scala.inline
    implicit class AltitudeMutableBuilder[Self <: Altitude] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAltitude(value: Double): Self = StObject.set(x, "altitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBearing(value: Double): Self = StObject.set(x, "bearing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenter(value: CoordinatesZ): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
      
      @scala.inline
      def setFlipY(value: Boolean): Self = StObject.set(x, "flipY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlipYUndefined: Self = StObject.set(x, "flipY", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPitch(value: Double): Self = StObject.set(x, "pitch", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined viewport-mercator-project.viewport-mercator-project.BaseDistanceScalesInput & {  scale :number} */
  @js.native
  trait BaseDistanceScalesInputsc extends DistanceScalesInput {
    
    var latitude: Double = js.native
    
    var longitude: Double = js.native
    
    var scale: Double = js.native
  }
  object BaseDistanceScalesInputsc {
    
    @scala.inline
    def apply(latitude: Double, longitude: Double, scale: Double): BaseDistanceScalesInputsc = {
      val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseDistanceScalesInputsc]
    }
    
    @scala.inline
    implicit class BaseDistanceScalesInputscMutableBuilder[Self <: BaseDistanceScalesInputsc] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined viewport-mercator-project.viewport-mercator-project.BaseDistanceScalesInput & {  zoom :number} */
  @js.native
  trait BaseDistanceScalesInputzo extends DistanceScalesInput {
    
    var latitude: Double = js.native
    
    var longitude: Double = js.native
    
    var zoom: Double = js.native
  }
  object BaseDistanceScalesInputzo {
    
    @scala.inline
    def apply(latitude: Double, longitude: Double, zoom: Double): BaseDistanceScalesInputzo = {
      val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseDistanceScalesInputzo]
    }
    
    @scala.inline
    implicit class BaseDistanceScalesInputzoMutableBuilder[Self <: BaseDistanceScalesInputzo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined viewport-mercator-project.viewport-mercator-project.BaseHighPrecisionDistanceScalesInput & {  zoom :number} */
  @js.native
  trait BaseHighPrecisionDistance extends HighPrecisionDistanceScalesInput {
    
    var highPrecision: `true` = js.native
    
    var latitude: Double = js.native
    
    var longitude: Double = js.native
    
    var zoom: Double = js.native
  }
  object BaseHighPrecisionDistance {
    
    @scala.inline
    def apply(highPrecision: `true`, latitude: Double, longitude: Double, zoom: Double): BaseHighPrecisionDistance = {
      val __obj = js.Dynamic.literal(highPrecision = highPrecision.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], zoom = zoom.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseHighPrecisionDistance]
    }
    
    @scala.inline
    implicit class BaseHighPrecisionDistanceMutableBuilder[Self <: BaseHighPrecisionDistance] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHighPrecision(value: `true`): Self = StObject.set(x, "highPrecision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoom(value: Double): Self = StObject.set(x, "zoom", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined viewport-mercator-project.viewport-mercator-project.BaseHighPrecisionDistanceScalesInput & {  scale :number} */
  @js.native
  trait BaseHighPrecisionDistanceHighPrecision extends HighPrecisionDistanceScalesInput {
    
    var highPrecision: `true` = js.native
    
    var latitude: Double = js.native
    
    var longitude: Double = js.native
    
    var scale: Double = js.native
  }
  object BaseHighPrecisionDistanceHighPrecision {
    
    @scala.inline
    def apply(highPrecision: `true`, latitude: Double, longitude: Double, scale: Double): BaseHighPrecisionDistanceHighPrecision = {
      val __obj = js.Dynamic.literal(highPrecision = highPrecision.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseHighPrecisionDistanceHighPrecision]
    }
    
    @scala.inline
    implicit class BaseHighPrecisionDistanceHighPrecisionMutableBuilder[Self <: BaseHighPrecisionDistanceHighPrecision] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHighPrecision(value: `true`): Self = StObject.set(x, "highPrecision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Bottom extends StObject {
    
    var bottom: Double = js.native
    
    var left: Double = js.native
    
    var right: Double = js.native
    
    var top: Double = js.native
  }
  object Bottom {
    
    @scala.inline
    def apply(bottom: Double, left: Double, right: Double, top: Double): Bottom = {
      val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bottom]
    }
    
    @scala.inline
    implicit class BottomMutableBuilder[Self <: Bottom] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Bounds extends StObject {
    
    var bounds: typings.viewportMercatorProject.mod.Bounds = js.native
    
    var height: Double = js.native
    
    var offset: js.UndefOr[Coordinates] = js.native
    
    var padding: js.UndefOr[Padding] = js.native
    
    var width: Double = js.native
  }
  object Bounds {
    
    @scala.inline
    def apply(bounds: typings.viewportMercatorProject.mod.Bounds, height: Double, width: Double): Bounds = {
      val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bounds]
    }
    
    @scala.inline
    implicit class BoundsMutableBuilder[Self <: Bounds] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBounds(value: typings.viewportMercatorProject.mod.Bounds): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffset(value: Coordinates): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setPadding(value: Padding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Latitude extends StObject {
    
    var latitude: Double = js.native
  }
  object Latitude {
    
    @scala.inline
    def apply(latitude: Double): Latitude = {
      val __obj = js.Dynamic.literal(latitude = latitude.asInstanceOf[js.Any])
      __obj.asInstanceOf[Latitude]
    }
    
    @scala.inline
    implicit class LatitudeMutableBuilder[Self <: Latitude] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait LngLat extends StObject {
    
    var lngLat: Coordinates = js.native
    
    var pos: Coordinates = js.native
  }
  object LngLat {
    
    @scala.inline
    def apply(lngLat: Coordinates, pos: Coordinates): LngLat = {
      val __obj = js.Dynamic.literal(lngLat = lngLat.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
      __obj.asInstanceOf[LngLat]
    }
    
    @scala.inline
    implicit class LngLatMutableBuilder[Self <: LngLat] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLngLat(value: Coordinates): Self = StObject.set(x, "lngLat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPos(value: Coordinates): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Offset extends StObject {
    
    var offset: js.UndefOr[Coordinates] = js.native
    
    var padding: js.UndefOr[Padding] = js.native
  }
  object Offset {
    
    @scala.inline
    def apply(): Offset = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Offset]
    }
    
    @scala.inline
    implicit class OffsetMutableBuilder[Self <: Offset] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOffset(value: Coordinates): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setPadding(value: Padding): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
    }
  }
}
