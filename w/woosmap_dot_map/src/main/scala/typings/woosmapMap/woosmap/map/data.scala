package typings.woosmapMap.woosmap.map

import typings.woosmapMap.woosmap.map.Data_.GeometryCollection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object data {
  
  @js.native
  trait Feature extends StObject {
    
    /**
      * Returns the feature geometry.
      */
    def getGeometry(): GeometryCollectionElement | GeometryCollection = js.native
    
    /**
      * Returns the feature id.
      */
    def getId(): String = js.native
    
    /**
      * Returns the feature property
      */
    def getProperty(name: String): Any = js.native
    
    /**
      * Removes property
      */
    def removeProperty(name: String): Unit = js.native
    
    def setGeometry(geometry: GeometryCollection): Unit = js.native
    /**
      * Set the feature geometry.
      */
    def setGeometry(geometry: GeometryCollectionElement): Unit = js.native
    
    /**
      * Sets the value of the specified property. If newValue is undefined this is equivalent to calling removeProperty.
      */
    def setProperty(name: String, newValue: Any): Unit = js.native
    
    /**
      * Exports the feature to a GeoJSON object.
      */
    def toGeoJson(callback: js.Function1[/* geojson */ GeoJSONFeature, Unit]): Unit = js.native
  }
}
