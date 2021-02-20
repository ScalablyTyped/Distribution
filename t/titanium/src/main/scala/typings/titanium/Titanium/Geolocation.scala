package typings.titanium.Titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The top level Geolocation module. The Geolocation module is used for accessing device location based information.
  */
object Geolocation {
  
  /**
    * Module for Android-specific geolocation functionality.
    */
  object Android {
    
    /**
      * Represents a source of location information, such as GPS.
      */
    @js.native
    trait LocationProvider extends Proxy {
      
      /**
        * Gets the value of the <Titanium.Geolocation.Android.LocationProvider.minUpdateDistance> property.
        * @deprecated Access <Titanium.Geolocation.Android.LocationProvider.minUpdateDistance> instead.
        */
      def getMinUpdateDistance(): Double = js.native
      
      /**
        * Gets the value of the <Titanium.Geolocation.Android.LocationProvider.minUpdateTime> property.
        * @deprecated Access <Titanium.Geolocation.Android.LocationProvider.minUpdateTime> instead.
        */
      def getMinUpdateTime(): Double = js.native
      
      /**
        * Gets the value of the <Titanium.Geolocation.Android.LocationProvider.name> property.
        * @deprecated Access <Titanium.Geolocation.Android.LocationProvider.name> instead.
        */
      def getName(): String = js.native
      
      /**
        * Don't send a location update unless the location has changed at least `minUpdateDistance`
        * meters since the previous update.
        */
      var minUpdateDistance: Double = js.native
      
      /**
        * Limits the frequency of location updates to no more than one per `minUpdateTime` seconds.
        */
      var minUpdateTime: Double = js.native
      
      /**
        * Type of location provider: [PROVIDER_GPS](Titanium.Geolocation.Android.PROVIDER_GPS),
        * [PROVIDER_NETWORK](Titanium.Geolocation.Android.PROVIDER_NETWORK), or
        * [PROVIDER_PASSIVE](Titanium.Geolocation.Android.PROVIDER_PASSIVE).
        */
      var name: String = js.native
      
      /**
        * Sets the value of the <Titanium.Geolocation.Android.LocationProvider.minUpdateDistance> property.
        * @deprecated Set the value using <Titanium.Geolocation.Android.LocationProvider.minUpdateDistance> instead.
        */
      def setMinUpdateDistance(minUpdateDistance: Double): Unit = js.native
      
      /**
        * Sets the value of the <Titanium.Geolocation.Android.LocationProvider.minUpdateTime> property.
        * @deprecated Set the value using <Titanium.Geolocation.Android.LocationProvider.minUpdateTime> instead.
        */
      def setMinUpdateTime(minUpdateTime: Double): Unit = js.native
      
      /**
        * Sets the value of the <Titanium.Geolocation.Android.LocationProvider.name> property.
        * @deprecated Set the value using <Titanium.Geolocation.Android.LocationProvider.name> instead.
        */
      def setName(name: String): Unit = js.native
    }
    
    /**
      * A location rule to filter the results returned by location providers.
      */
    @js.native
    trait LocationRule extends Proxy {
      
      /**
        * Minimum accuracy required for a location update.
        */
      var accuracy: Double = js.native
      
      /**
        * Gets the value of the <Titanium.Geolocation.Android.LocationRule.accuracy> property.
        * @deprecated Access <Titanium.Geolocation.Android.LocationRule.accuracy> instead.
        */
      def getAccuracy(): Double = js.native
      
      /**
        * Gets the value of the <Titanium.Geolocation.Android.LocationRule.maxAge> property.
        * @deprecated Access <Titanium.Geolocation.Android.LocationRule.maxAge> instead.
        */
      def getMaxAge(): Double = js.native
      
      /**
        * Gets the value of the <Titanium.Geolocation.Android.LocationRule.minAge> property.
        * @deprecated Access <Titanium.Geolocation.Android.LocationRule.minAge> instead.
        */
      def getMinAge(): Double = js.native
      
      /**
        * Gets the value of the <Titanium.Geolocation.Android.LocationRule.name> property.
        * @deprecated Access <Titanium.Geolocation.Android.LocationRule.name> instead.
        */
      def getName(): String = js.native
      
      /**
        * Controls the freshness of location updates. Do not forward an update
        * unless it is newer than `maxAge` milliseconds.
        */
      var maxAge: Double = js.native
      
      /**
        * Controls the frequency of location updates.
        */
      var minAge: Double = js.native
      
      /**
        * If specified, this rule only applies to updates generated
        * by the specified provider. If `null`, this rule applies to all updates.
        */
      var name: String = js.native
      
      /**
        * Sets the value of the <Titanium.Geolocation.Android.LocationRule.accuracy> property.
        * @deprecated Set the value using <Titanium.Geolocation.Android.LocationRule.accuracy> instead.
        */
      def setAccuracy(accuracy: Double): Unit = js.native
      
      /**
        * Sets the value of the <Titanium.Geolocation.Android.LocationRule.maxAge> property.
        * @deprecated Set the value using <Titanium.Geolocation.Android.LocationRule.maxAge> instead.
        */
      def setMaxAge(maxAge: Double): Unit = js.native
      
      /**
        * Sets the value of the <Titanium.Geolocation.Android.LocationRule.minAge> property.
        * @deprecated Set the value using <Titanium.Geolocation.Android.LocationRule.minAge> instead.
        */
      def setMinAge(minAge: Double): Unit = js.native
      
      /**
        * Sets the value of the <Titanium.Geolocation.Android.LocationRule.name> property.
        * @deprecated Set the value using <Titanium.Geolocation.Android.LocationRule.name> instead.
        */
      def setName(name: String): Unit = js.native
    }
  }
  /**
    * Module for Android-specific geolocation functionality.
    */
  type Android = Module
}
