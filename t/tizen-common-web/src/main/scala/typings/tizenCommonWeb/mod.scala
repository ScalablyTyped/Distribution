package typings.tizenCommonWeb

import org.scalablytyped.runtime.Shortcut
import typings.std.Date
import typings.tizenCommonWeb.applicationMod.ApplicationControlConstructor
import typings.tizenCommonWeb.applicationMod.ApplicationControlDataConstructor
import typings.tizenCommonWeb.applicationMod.ApplicationControlLaunchMode
import typings.tizenCommonWeb.applicationMod.ApplicationManager
import typings.tizenCommonWeb.downloadMod.DownloadHTTPHeaderFields
import typings.tizenCommonWeb.downloadMod.DownloadManager
import typings.tizenCommonWeb.downloadMod.DownloadNetworkType
import typings.tizenCommonWeb.downloadMod.DownloadRequestConstructor
import typings.tizenCommonWeb.filesystemMod.FilesystemManager
import typings.tizenCommonWeb.packageMod.PackageManager
import typings.tizenCommonWeb.systeminfoMod.SystemInfoManager
import typings.tizenCommonWeb.timeMod.TZDateConstructor
import typings.tizenCommonWeb.timeMod.TimeDurationConstructor
import typings.tizenCommonWeb.timeMod.TimeDurationUnit
import typings.tizenCommonWeb.timeMod.TimeUtil
import typings.tizenCommonWeb.tizenCommonWebStrings.ALL
import typings.tizenCommonWeb.tizenCommonWebStrings.ASC
import typings.tizenCommonWeb.tizenCommonWebStrings.CELLULAR
import typings.tizenCommonWeb.tizenCommonWebStrings.CONTAINS
import typings.tizenCommonWeb.tizenCommonWebStrings.DESC
import typings.tizenCommonWeb.tizenCommonWebStrings.ENDSWITH
import typings.tizenCommonWeb.tizenCommonWebStrings.EXACTLY
import typings.tizenCommonWeb.tizenCommonWebStrings.EXISTS
import typings.tizenCommonWeb.tizenCommonWebStrings.FULLSTRING
import typings.tizenCommonWeb.tizenCommonWebStrings.GROUP
import typings.tizenCommonWeb.tizenCommonWebStrings.INTERSECTION
import typings.tizenCommonWeb.tizenCommonWebStrings.SINGLE
import typings.tizenCommonWeb.tizenCommonWebStrings.STARTSWITH
import typings.tizenCommonWeb.tizenCommonWebStrings.UNION
import typings.tizenCommonWeb.tizenCommonWebStrings.WIFI
import typings.tizenCommonWeb.tizenMod.AbstractFilter
import typings.tizenCommonWeb.tizenMod.AttributeFilterConstructor
import typings.tizenCommonWeb.tizenMod.AttributeRangeFilterConstructor
import typings.tizenCommonWeb.tizenMod.BundleConstructor
import typings.tizenCommonWeb.tizenMod.CompositeFilterConstructor
import typings.tizenCommonWeb.tizenMod.CompositeFilterType
import typings.tizenCommonWeb.tizenMod.FilterMatchFlag
import typings.tizenCommonWeb.tizenMod.SimpleCoordinatesConstructor
import typings.tizenCommonWeb.tizenMod.SortModeConstructor
import typings.tizenCommonWeb.tizenMod.SortModeOrder
import typings.tizenCommonWeb.tizenMod.WebAPIException
import typings.tizenCommonWeb.tvaudiocontrolMod.TVAudioControlManager
import typings.tizenCommonWeb.tvdisplaycontrolMod.TVDisplayControlManager
import typings.tizenCommonWeb.tvinfoMod.TVInfoManager
import typings.tizenCommonWeb.tvinputdeviceMod.TVInputDeviceManager
import typings.tizenCommonWeb.tvwindowMod.TVWindowManager
import typings.tizenCommonWeb.websettingMod.WebSettingManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("tizen-common-web", JSImport.Namespace)
  @js.native
  val ^ : Tizen = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("tizen-common-web", "ApplicationControl")
  @js.native
  class ApplicationControl protected ()
    extends typings.tizenCommonWeb.applicationMod.ApplicationControl {
    def this(
      operation: String,
      uri: js.UndefOr[String],
      mime: js.UndefOr[String],
      category: js.UndefOr[String],
      data: js.UndefOr[js.Array[typings.tizenCommonWeb.applicationMod.ApplicationControlData]],
      launchMode: js.UndefOr[ApplicationControlLaunchMode | SINGLE | GROUP]
    ) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("tizen-common-web", "ApplicationControlData")
  @js.native
  class ApplicationControlData protected ()
    extends typings.tizenCommonWeb.applicationMod.ApplicationControlData {
    def this(key: String, value: js.Array[String]) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("tizen-common-web", "AttributeFilter")
  @js.native
  class AttributeFilter protected ()
    extends typings.tizenCommonWeb.tizenMod.AttributeFilter {
    def this(attributeName: String) = this()
    def this(attributeName: String, matchFlag: CONTAINS) = this()
    def this(attributeName: String, matchFlag: ENDSWITH) = this()
    def this(attributeName: String, matchFlag: EXACTLY) = this()
    def this(attributeName: String, matchFlag: EXISTS) = this()
    def this(attributeName: String, matchFlag: FULLSTRING) = this()
    def this(attributeName: String, matchFlag: STARTSWITH) = this()
    def this(attributeName: String, matchFlag: FilterMatchFlag) = this()
    def this(attributeName: String, matchFlag: Unit, matchValue: js.Any) = this()
    def this(attributeName: String, matchFlag: CONTAINS, matchValue: js.Any) = this()
    def this(attributeName: String, matchFlag: ENDSWITH, matchValue: js.Any) = this()
    def this(attributeName: String, matchFlag: EXACTLY, matchValue: js.Any) = this()
    def this(attributeName: String, matchFlag: EXISTS, matchValue: js.Any) = this()
    def this(attributeName: String, matchFlag: FULLSTRING, matchValue: js.Any) = this()
    def this(attributeName: String, matchFlag: STARTSWITH, matchValue: js.Any) = this()
    def this(attributeName: String, matchFlag: FilterMatchFlag, matchValue: js.Any) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("tizen-common-web", "AttributeRangeFilter")
  @js.native
  class AttributeRangeFilter protected ()
    extends typings.tizenCommonWeb.tizenMod.AttributeRangeFilter {
    def this(attributeName: String) = this()
    def this(attributeName: String, initialValue: js.Any) = this()
    def this(attributeName: String, initialValue: js.Any, endValue: js.Any) = this()
    def this(attributeName: String, initialValue: Unit, endValue: js.Any) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("tizen-common-web", "Bundle")
  @js.native
  class Bundle ()
    extends typings.tizenCommonWeb.tizenMod.Bundle
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("tizen-common-web", "CompositeFilter")
  @js.native
  class CompositeFilter protected ()
    extends typings.tizenCommonWeb.tizenMod.CompositeFilter {
    def this(`type`: INTERSECTION) = this()
    def this(`type`: UNION) = this()
    def this(`type`: CompositeFilterType) = this()
    def this(`type`: INTERSECTION, filters: js.Array[AbstractFilter]) = this()
    def this(`type`: UNION, filters: js.Array[AbstractFilter]) = this()
    def this(`type`: CompositeFilterType, filters: js.Array[AbstractFilter]) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("tizen-common-web", "DownloadRequest")
  @js.native
  class DownloadRequest protected ()
    extends typings.tizenCommonWeb.downloadMod.DownloadRequest {
    /**
      * @param url An attribute to store the URL of the object to download.
      * @param destination? An attribute to store the folder path of the destination folder to which a requested file object will be downloaded.
      * If the destination is not specified or is an empty string, the file will be downloaded to the default storage: "Downloads". For more information, see Filesystem API
      * The default value is an empty string.
      * @param fileName? An attribute to store the file name for the specified URL.
      * If the file name is not given or is an empty string, the original file name from the URL is used.
      * The default value is an empty string.
      * @param networkType? An attribute to store the allowed network type.
      * If the network type is not given, all network types are allowed.
      * The default value is ***ALL***
      * @since 2.1
      * @param httpHeader? An attribute to store extra HTTP header fields.
      * @since 2.1
      * For more information about HTTP header fields, see [RFC-2616](http://www.w3.org/Protocols/rfc2616/rfc2616-sec4.html#sec4.2)
      * The default value is an empty object.
      */
    def this(url: String) = this()
    def this(url: String, destination: String) = this()
    def this(url: String, destination: String, fileName: String) = this()
    def this(url: String, destination: Unit, fileName: String) = this()
    def this(url: String, destination: String, fileName: String, networkType: DownloadNetworkType) = this()
    def this(url: String, destination: String, fileName: String, networkType: ALL) = this()
    def this(url: String, destination: String, fileName: String, networkType: CELLULAR) = this()
    def this(url: String, destination: String, fileName: String, networkType: WIFI) = this()
    def this(url: String, destination: String, fileName: Unit, networkType: DownloadNetworkType) = this()
    def this(url: String, destination: String, fileName: Unit, networkType: ALL) = this()
    def this(url: String, destination: String, fileName: Unit, networkType: CELLULAR) = this()
    def this(url: String, destination: String, fileName: Unit, networkType: WIFI) = this()
    def this(url: String, destination: Unit, fileName: String, networkType: DownloadNetworkType) = this()
    def this(url: String, destination: Unit, fileName: String, networkType: ALL) = this()
    def this(url: String, destination: Unit, fileName: String, networkType: CELLULAR) = this()
    def this(url: String, destination: Unit, fileName: String, networkType: WIFI) = this()
    def this(url: String, destination: Unit, fileName: Unit, networkType: DownloadNetworkType) = this()
    def this(url: String, destination: Unit, fileName: Unit, networkType: ALL) = this()
    def this(url: String, destination: Unit, fileName: Unit, networkType: CELLULAR) = this()
    def this(url: String, destination: Unit, fileName: Unit, networkType: WIFI) = this()
    def this(
      url: String,
      destination: String,
      fileName: String,
      networkType: Unit,
      httpHeader: DownloadHTTPHeaderFields
    ) = this()
    def this(
      url: String,
      destination: String,
      fileName: String,
      networkType: DownloadNetworkType,
      httpHeader: DownloadHTTPHeaderFields
    ) = this()
    def this(
      url: String,
      destination: String,
      fileName: String,
      networkType: ALL,
      httpHeader: DownloadHTTPHeaderFields
    ) = this()
    def this(
      url: String,
      destination: String,
      fileName: String,
      networkType: CELLULAR,
      httpHeader: DownloadHTTPHeaderFields
    ) = this()
    def this(
      url: String,
      destination: String,
      fileName: String,
      networkType: WIFI,
      httpHeader: DownloadHTTPHeaderFields
    ) = this()
    def this(
      url: String,
      destination: String,
      fileName: Unit,
      networkType: Unit,
      httpHeader: DownloadHTTPHeaderFields
    ) = this()
    def this(
      url: String,
      destination: String,
      fileName: Unit,
      networkType: DownloadNetworkType,
      httpHeader: DownloadHTTPHeaderFields
    ) = this()
    def this(
      url: String,
      destination: String,
      fileName: Unit,
      networkType: ALL,
      httpHeader: DownloadHTTPHeaderFields
    ) = this()
    def this(
      url: String,
      destination: String,
      fileName: Unit,
      networkType: CELLULAR,
      httpHeader: DownloadHTTPHeaderFields
    ) = this()
    def this(
      url: String,
      destination: String,
      fileName: Unit,
      networkType: WIFI,
      httpHeader: DownloadHTTPHeaderFields
    ) = this()
    def this(
      url: String,
      destination: Unit,
      fileName: String,
      networkType: Unit,
      httpHeader: DownloadHTTPHeaderFields
    ) = this()
    def this(
      url: String,
      destination: Unit,
      fileName: String,
      networkType: DownloadNetworkType,
      httpHeader: DownloadHTTPHeaderFields
    ) = this()
    def this(
      url: String,
      destination: Unit,
      fileName: String,
      networkType: ALL,
      httpHeader: DownloadHTTPHeaderFields
    ) = this()
    def this(
      url: String,
      destination: Unit,
      fileName: String,
      networkType: CELLULAR,
      httpHeader: DownloadHTTPHeaderFields
    ) = this()
    def this(
      url: String,
      destination: Unit,
      fileName: String,
      networkType: WIFI,
      httpHeader: DownloadHTTPHeaderFields
    ) = this()
    def this(
      url: String,
      destination: Unit,
      fileName: Unit,
      networkType: Unit,
      httpHeader: DownloadHTTPHeaderFields
    ) = this()
    def this(
      url: String,
      destination: Unit,
      fileName: Unit,
      networkType: DownloadNetworkType,
      httpHeader: DownloadHTTPHeaderFields
    ) = this()
    def this(
      url: String,
      destination: Unit,
      fileName: Unit,
      networkType: ALL,
      httpHeader: DownloadHTTPHeaderFields
    ) = this()
    def this(
      url: String,
      destination: Unit,
      fileName: Unit,
      networkType: CELLULAR,
      httpHeader: DownloadHTTPHeaderFields
    ) = this()
    def this(
      url: String,
      destination: Unit,
      fileName: Unit,
      networkType: WIFI,
      httpHeader: DownloadHTTPHeaderFields
    ) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("tizen-common-web", "SimpleCoordinates")
  @js.native
  class SimpleCoordinates protected ()
    extends typings.tizenCommonWeb.tizenMod.SimpleCoordinates {
    def this(latitude: Double, longitude: Double) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("tizen-common-web", "SortMode")
  @js.native
  class SortMode protected ()
    extends typings.tizenCommonWeb.tizenMod.SortMode {
    def this(attributeName: String) = this()
    def this(attributeName: String, order: ASC) = this()
    def this(attributeName: String, order: DESC) = this()
    def this(attributeName: String, order: SortModeOrder) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("tizen-common-web", "TZDate")
  @js.native
  /**
    * @param datetime Date and time passed as a javascript Date object. If this parameter is omitted, current date and time will be used.
    * @param timezone The time zone identifier, e.g. "Seoul/Korea" or "Europe/Berlin". If this parameter is omitted, the device's default time zone will be used.
    */
  class TZDate ()
    extends typings.tizenCommonWeb.timeMod.TZDate {
    def this(datetime: Date) = this()
    def this(datetime: Unit, timezone: String) = this()
    def this(datetime: Date, timezone: String) = this()
    def this(year: Double, month: Double, day: Double) = this()
    def this(year: Double, month: Double, day: Double, hours: Double) = this()
    def this(year: Double, month: Double, day: Double, hours: Double, minutes: Double) = this()
    def this(year: Double, month: Double, day: Double, hours: Unit, minutes: Double) = this()
    def this(year: Double, month: Double, day: Double, hours: Double, minutes: Double, seconds: Double) = this()
    def this(year: Double, month: Double, day: Double, hours: Double, minutes: Unit, seconds: Double) = this()
    def this(year: Double, month: Double, day: Double, hours: Unit, minutes: Double, seconds: Double) = this()
    def this(year: Double, month: Double, day: Double, hours: Unit, minutes: Unit, seconds: Double) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hours: Double,
      minutes: Double,
      seconds: Double,
      milliseconds: Double
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hours: Double,
      minutes: Double,
      seconds: Unit,
      milliseconds: Double
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hours: Double,
      minutes: Unit,
      seconds: Double,
      milliseconds: Double
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hours: Double,
      minutes: Unit,
      seconds: Unit,
      milliseconds: Double
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hours: Unit,
      minutes: Double,
      seconds: Double,
      milliseconds: Double
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hours: Unit,
      minutes: Double,
      seconds: Unit,
      milliseconds: Double
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hours: Unit,
      minutes: Unit,
      seconds: Double,
      milliseconds: Double
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hours: Unit,
      minutes: Unit,
      seconds: Unit,
      milliseconds: Double
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hours: Double,
      minutes: Double,
      seconds: Double,
      milliseconds: Double,
      timezone: String
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hours: Double,
      minutes: Double,
      seconds: Double,
      milliseconds: Unit,
      timezone: String
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hours: Double,
      minutes: Double,
      seconds: Unit,
      milliseconds: Double,
      timezone: String
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hours: Double,
      minutes: Double,
      seconds: Unit,
      milliseconds: Unit,
      timezone: String
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hours: Double,
      minutes: Unit,
      seconds: Double,
      milliseconds: Double,
      timezone: String
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hours: Double,
      minutes: Unit,
      seconds: Double,
      milliseconds: Unit,
      timezone: String
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hours: Double,
      minutes: Unit,
      seconds: Unit,
      milliseconds: Double,
      timezone: String
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hours: Double,
      minutes: Unit,
      seconds: Unit,
      milliseconds: Unit,
      timezone: String
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hours: Unit,
      minutes: Double,
      seconds: Double,
      milliseconds: Double,
      timezone: String
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hours: Unit,
      minutes: Double,
      seconds: Double,
      milliseconds: Unit,
      timezone: String
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hours: Unit,
      minutes: Double,
      seconds: Unit,
      milliseconds: Double,
      timezone: String
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hours: Unit,
      minutes: Double,
      seconds: Unit,
      milliseconds: Unit,
      timezone: String
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hours: Unit,
      minutes: Unit,
      seconds: Double,
      milliseconds: Double,
      timezone: String
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hours: Unit,
      minutes: Unit,
      seconds: Double,
      milliseconds: Unit,
      timezone: String
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hours: Unit,
      minutes: Unit,
      seconds: Unit,
      milliseconds: Double,
      timezone: String
    ) = this()
    def this(
      year: Double,
      month: Double,
      day: Double,
      hours: Unit,
      minutes: Unit,
      seconds: Unit,
      milliseconds: Unit,
      timezone: String
    ) = this()
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("tizen-common-web", "TimeDuration")
  @js.native
  class TimeDuration protected ()
    extends typings.tizenCommonWeb.timeMod.TimeDuration {
    def this(length: Double, unit: TimeDurationUnit) = this()
  }
  
  object global {
    
    object tizen extends Shortcut {
      
      @JSGlobal("tizen")
      @js.native
      val ^ : Tizen = js.native
      
      /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
      @JSGlobal("tizen.ApplicationControl")
      @js.native
      class ApplicationControl protected ()
        extends typings.tizenCommonWeb.applicationMod.ApplicationControl {
        def this(
          operation: String,
          uri: js.UndefOr[String],
          mime: js.UndefOr[String],
          category: js.UndefOr[String],
          data: js.UndefOr[js.Array[typings.tizenCommonWeb.applicationMod.ApplicationControlData]],
          launchMode: js.UndefOr[ApplicationControlLaunchMode | SINGLE | GROUP]
        ) = this()
      }
      
      /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
      @JSGlobal("tizen.ApplicationControlData")
      @js.native
      class ApplicationControlData protected ()
        extends typings.tizenCommonWeb.applicationMod.ApplicationControlData {
        def this(key: String, value: js.Array[String]) = this()
      }
      
      /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
      @JSGlobal("tizen.AttributeFilter")
      @js.native
      class AttributeFilter protected ()
        extends typings.tizenCommonWeb.tizenMod.AttributeFilter {
        def this(attributeName: String) = this()
        def this(attributeName: String, matchFlag: CONTAINS) = this()
        def this(attributeName: String, matchFlag: ENDSWITH) = this()
        def this(attributeName: String, matchFlag: EXACTLY) = this()
        def this(attributeName: String, matchFlag: EXISTS) = this()
        def this(attributeName: String, matchFlag: FULLSTRING) = this()
        def this(attributeName: String, matchFlag: STARTSWITH) = this()
        def this(attributeName: String, matchFlag: FilterMatchFlag) = this()
        def this(attributeName: String, matchFlag: Unit, matchValue: js.Any) = this()
        def this(attributeName: String, matchFlag: CONTAINS, matchValue: js.Any) = this()
        def this(attributeName: String, matchFlag: ENDSWITH, matchValue: js.Any) = this()
        def this(attributeName: String, matchFlag: EXACTLY, matchValue: js.Any) = this()
        def this(attributeName: String, matchFlag: EXISTS, matchValue: js.Any) = this()
        def this(attributeName: String, matchFlag: FULLSTRING, matchValue: js.Any) = this()
        def this(attributeName: String, matchFlag: STARTSWITH, matchValue: js.Any) = this()
        def this(attributeName: String, matchFlag: FilterMatchFlag, matchValue: js.Any) = this()
      }
      
      /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
      @JSGlobal("tizen.AttributeRangeFilter")
      @js.native
      class AttributeRangeFilter protected ()
        extends typings.tizenCommonWeb.tizenMod.AttributeRangeFilter {
        def this(attributeName: String) = this()
        def this(attributeName: String, initialValue: js.Any) = this()
        def this(attributeName: String, initialValue: js.Any, endValue: js.Any) = this()
        def this(attributeName: String, initialValue: Unit, endValue: js.Any) = this()
      }
      
      /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
      @JSGlobal("tizen.Bundle")
      @js.native
      class Bundle ()
        extends typings.tizenCommonWeb.tizenMod.Bundle
      
      /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
      @JSGlobal("tizen.CompositeFilter")
      @js.native
      class CompositeFilter protected ()
        extends typings.tizenCommonWeb.tizenMod.CompositeFilter {
        def this(`type`: INTERSECTION) = this()
        def this(`type`: UNION) = this()
        def this(`type`: CompositeFilterType) = this()
        def this(`type`: INTERSECTION, filters: js.Array[AbstractFilter]) = this()
        def this(`type`: UNION, filters: js.Array[AbstractFilter]) = this()
        def this(`type`: CompositeFilterType, filters: js.Array[AbstractFilter]) = this()
      }
      
      /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
      @JSGlobal("tizen.DownloadRequest")
      @js.native
      class DownloadRequest protected ()
        extends typings.tizenCommonWeb.downloadMod.DownloadRequest {
        /**
          * @param url An attribute to store the URL of the object to download.
          * @param destination? An attribute to store the folder path of the destination folder to which a requested file object will be downloaded.
          * If the destination is not specified or is an empty string, the file will be downloaded to the default storage: "Downloads". For more information, see Filesystem API
          * The default value is an empty string.
          * @param fileName? An attribute to store the file name for the specified URL.
          * If the file name is not given or is an empty string, the original file name from the URL is used.
          * The default value is an empty string.
          * @param networkType? An attribute to store the allowed network type.
          * If the network type is not given, all network types are allowed.
          * The default value is ***ALL***
          * @since 2.1
          * @param httpHeader? An attribute to store extra HTTP header fields.
          * @since 2.1
          * For more information about HTTP header fields, see [RFC-2616](http://www.w3.org/Protocols/rfc2616/rfc2616-sec4.html#sec4.2)
          * The default value is an empty object.
          */
        def this(url: String) = this()
        def this(url: String, destination: String) = this()
        def this(url: String, destination: String, fileName: String) = this()
        def this(url: String, destination: Unit, fileName: String) = this()
        def this(url: String, destination: String, fileName: String, networkType: DownloadNetworkType) = this()
        def this(url: String, destination: String, fileName: String, networkType: ALL) = this()
        def this(url: String, destination: String, fileName: String, networkType: CELLULAR) = this()
        def this(url: String, destination: String, fileName: String, networkType: WIFI) = this()
        def this(url: String, destination: String, fileName: Unit, networkType: DownloadNetworkType) = this()
        def this(url: String, destination: String, fileName: Unit, networkType: ALL) = this()
        def this(url: String, destination: String, fileName: Unit, networkType: CELLULAR) = this()
        def this(url: String, destination: String, fileName: Unit, networkType: WIFI) = this()
        def this(url: String, destination: Unit, fileName: String, networkType: DownloadNetworkType) = this()
        def this(url: String, destination: Unit, fileName: String, networkType: ALL) = this()
        def this(url: String, destination: Unit, fileName: String, networkType: CELLULAR) = this()
        def this(url: String, destination: Unit, fileName: String, networkType: WIFI) = this()
        def this(url: String, destination: Unit, fileName: Unit, networkType: DownloadNetworkType) = this()
        def this(url: String, destination: Unit, fileName: Unit, networkType: ALL) = this()
        def this(url: String, destination: Unit, fileName: Unit, networkType: CELLULAR) = this()
        def this(url: String, destination: Unit, fileName: Unit, networkType: WIFI) = this()
        def this(
          url: String,
          destination: String,
          fileName: String,
          networkType: Unit,
          httpHeader: DownloadHTTPHeaderFields
        ) = this()
        def this(
          url: String,
          destination: String,
          fileName: String,
          networkType: DownloadNetworkType,
          httpHeader: DownloadHTTPHeaderFields
        ) = this()
        def this(
          url: String,
          destination: String,
          fileName: String,
          networkType: ALL,
          httpHeader: DownloadHTTPHeaderFields
        ) = this()
        def this(
          url: String,
          destination: String,
          fileName: String,
          networkType: CELLULAR,
          httpHeader: DownloadHTTPHeaderFields
        ) = this()
        def this(
          url: String,
          destination: String,
          fileName: String,
          networkType: WIFI,
          httpHeader: DownloadHTTPHeaderFields
        ) = this()
        def this(
          url: String,
          destination: String,
          fileName: Unit,
          networkType: Unit,
          httpHeader: DownloadHTTPHeaderFields
        ) = this()
        def this(
          url: String,
          destination: String,
          fileName: Unit,
          networkType: DownloadNetworkType,
          httpHeader: DownloadHTTPHeaderFields
        ) = this()
        def this(
          url: String,
          destination: String,
          fileName: Unit,
          networkType: ALL,
          httpHeader: DownloadHTTPHeaderFields
        ) = this()
        def this(
          url: String,
          destination: String,
          fileName: Unit,
          networkType: CELLULAR,
          httpHeader: DownloadHTTPHeaderFields
        ) = this()
        def this(
          url: String,
          destination: String,
          fileName: Unit,
          networkType: WIFI,
          httpHeader: DownloadHTTPHeaderFields
        ) = this()
        def this(
          url: String,
          destination: Unit,
          fileName: String,
          networkType: Unit,
          httpHeader: DownloadHTTPHeaderFields
        ) = this()
        def this(
          url: String,
          destination: Unit,
          fileName: String,
          networkType: DownloadNetworkType,
          httpHeader: DownloadHTTPHeaderFields
        ) = this()
        def this(
          url: String,
          destination: Unit,
          fileName: String,
          networkType: ALL,
          httpHeader: DownloadHTTPHeaderFields
        ) = this()
        def this(
          url: String,
          destination: Unit,
          fileName: String,
          networkType: CELLULAR,
          httpHeader: DownloadHTTPHeaderFields
        ) = this()
        def this(
          url: String,
          destination: Unit,
          fileName: String,
          networkType: WIFI,
          httpHeader: DownloadHTTPHeaderFields
        ) = this()
        def this(
          url: String,
          destination: Unit,
          fileName: Unit,
          networkType: Unit,
          httpHeader: DownloadHTTPHeaderFields
        ) = this()
        def this(
          url: String,
          destination: Unit,
          fileName: Unit,
          networkType: DownloadNetworkType,
          httpHeader: DownloadHTTPHeaderFields
        ) = this()
        def this(
          url: String,
          destination: Unit,
          fileName: Unit,
          networkType: ALL,
          httpHeader: DownloadHTTPHeaderFields
        ) = this()
        def this(
          url: String,
          destination: Unit,
          fileName: Unit,
          networkType: CELLULAR,
          httpHeader: DownloadHTTPHeaderFields
        ) = this()
        def this(
          url: String,
          destination: Unit,
          fileName: Unit,
          networkType: WIFI,
          httpHeader: DownloadHTTPHeaderFields
        ) = this()
      }
      
      /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
      @JSGlobal("tizen.SimpleCoordinates")
      @js.native
      class SimpleCoordinates protected ()
        extends typings.tizenCommonWeb.tizenMod.SimpleCoordinates {
        def this(latitude: Double, longitude: Double) = this()
      }
      
      /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
      @JSGlobal("tizen.SortMode")
      @js.native
      class SortMode protected ()
        extends typings.tizenCommonWeb.tizenMod.SortMode {
        def this(attributeName: String) = this()
        def this(attributeName: String, order: ASC) = this()
        def this(attributeName: String, order: DESC) = this()
        def this(attributeName: String, order: SortModeOrder) = this()
      }
      
      /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
      @JSGlobal("tizen.TZDate")
      @js.native
      /**
        * @param datetime Date and time passed as a javascript Date object. If this parameter is omitted, current date and time will be used.
        * @param timezone The time zone identifier, e.g. "Seoul/Korea" or "Europe/Berlin". If this parameter is omitted, the device's default time zone will be used.
        */
      class TZDate ()
        extends typings.tizenCommonWeb.timeMod.TZDate {
        def this(datetime: Date) = this()
        def this(datetime: Unit, timezone: String) = this()
        def this(datetime: Date, timezone: String) = this()
        def this(year: Double, month: Double, day: Double) = this()
        def this(year: Double, month: Double, day: Double, hours: Double) = this()
        def this(year: Double, month: Double, day: Double, hours: Double, minutes: Double) = this()
        def this(year: Double, month: Double, day: Double, hours: Unit, minutes: Double) = this()
        def this(year: Double, month: Double, day: Double, hours: Double, minutes: Double, seconds: Double) = this()
        def this(year: Double, month: Double, day: Double, hours: Double, minutes: Unit, seconds: Double) = this()
        def this(year: Double, month: Double, day: Double, hours: Unit, minutes: Double, seconds: Double) = this()
        def this(year: Double, month: Double, day: Double, hours: Unit, minutes: Unit, seconds: Double) = this()
        def this(
          year: Double,
          month: Double,
          day: Double,
          hours: Double,
          minutes: Double,
          seconds: Double,
          milliseconds: Double
        ) = this()
        def this(
          year: Double,
          month: Double,
          day: Double,
          hours: Double,
          minutes: Double,
          seconds: Unit,
          milliseconds: Double
        ) = this()
        def this(
          year: Double,
          month: Double,
          day: Double,
          hours: Double,
          minutes: Unit,
          seconds: Double,
          milliseconds: Double
        ) = this()
        def this(
          year: Double,
          month: Double,
          day: Double,
          hours: Double,
          minutes: Unit,
          seconds: Unit,
          milliseconds: Double
        ) = this()
        def this(
          year: Double,
          month: Double,
          day: Double,
          hours: Unit,
          minutes: Double,
          seconds: Double,
          milliseconds: Double
        ) = this()
        def this(
          year: Double,
          month: Double,
          day: Double,
          hours: Unit,
          minutes: Double,
          seconds: Unit,
          milliseconds: Double
        ) = this()
        def this(
          year: Double,
          month: Double,
          day: Double,
          hours: Unit,
          minutes: Unit,
          seconds: Double,
          milliseconds: Double
        ) = this()
        def this(
          year: Double,
          month: Double,
          day: Double,
          hours: Unit,
          minutes: Unit,
          seconds: Unit,
          milliseconds: Double
        ) = this()
        def this(
          year: Double,
          month: Double,
          day: Double,
          hours: Double,
          minutes: Double,
          seconds: Double,
          milliseconds: Double,
          timezone: String
        ) = this()
        def this(
          year: Double,
          month: Double,
          day: Double,
          hours: Double,
          minutes: Double,
          seconds: Double,
          milliseconds: Unit,
          timezone: String
        ) = this()
        def this(
          year: Double,
          month: Double,
          day: Double,
          hours: Double,
          minutes: Double,
          seconds: Unit,
          milliseconds: Double,
          timezone: String
        ) = this()
        def this(
          year: Double,
          month: Double,
          day: Double,
          hours: Double,
          minutes: Double,
          seconds: Unit,
          milliseconds: Unit,
          timezone: String
        ) = this()
        def this(
          year: Double,
          month: Double,
          day: Double,
          hours: Double,
          minutes: Unit,
          seconds: Double,
          milliseconds: Double,
          timezone: String
        ) = this()
        def this(
          year: Double,
          month: Double,
          day: Double,
          hours: Double,
          minutes: Unit,
          seconds: Double,
          milliseconds: Unit,
          timezone: String
        ) = this()
        def this(
          year: Double,
          month: Double,
          day: Double,
          hours: Double,
          minutes: Unit,
          seconds: Unit,
          milliseconds: Double,
          timezone: String
        ) = this()
        def this(
          year: Double,
          month: Double,
          day: Double,
          hours: Double,
          minutes: Unit,
          seconds: Unit,
          milliseconds: Unit,
          timezone: String
        ) = this()
        def this(
          year: Double,
          month: Double,
          day: Double,
          hours: Unit,
          minutes: Double,
          seconds: Double,
          milliseconds: Double,
          timezone: String
        ) = this()
        def this(
          year: Double,
          month: Double,
          day: Double,
          hours: Unit,
          minutes: Double,
          seconds: Double,
          milliseconds: Unit,
          timezone: String
        ) = this()
        def this(
          year: Double,
          month: Double,
          day: Double,
          hours: Unit,
          minutes: Double,
          seconds: Unit,
          milliseconds: Double,
          timezone: String
        ) = this()
        def this(
          year: Double,
          month: Double,
          day: Double,
          hours: Unit,
          minutes: Double,
          seconds: Unit,
          milliseconds: Unit,
          timezone: String
        ) = this()
        def this(
          year: Double,
          month: Double,
          day: Double,
          hours: Unit,
          minutes: Unit,
          seconds: Double,
          milliseconds: Double,
          timezone: String
        ) = this()
        def this(
          year: Double,
          month: Double,
          day: Double,
          hours: Unit,
          minutes: Unit,
          seconds: Double,
          milliseconds: Unit,
          timezone: String
        ) = this()
        def this(
          year: Double,
          month: Double,
          day: Double,
          hours: Unit,
          minutes: Unit,
          seconds: Unit,
          milliseconds: Double,
          timezone: String
        ) = this()
        def this(
          year: Double,
          month: Double,
          day: Double,
          hours: Unit,
          minutes: Unit,
          seconds: Unit,
          milliseconds: Unit,
          timezone: String
        ) = this()
      }
      
      /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
      @JSGlobal("tizen.TimeDuration")
      @js.native
      class TimeDuration protected ()
        extends typings.tizenCommonWeb.timeMod.TimeDuration {
        def this(length: Double, unit: TimeDurationUnit) = this()
      }
      
      type _To = Tizen
      
      /* This means you don't have to write `^`, but can instead just say `tizen.foo` */
      override def _to: Tizen = ^
    }
    
    trait Window extends StObject {
      
      var WebAPIError: WebAPIException
      
      var WebAPIException: typings.tizenCommonWeb.tizenMod.WebAPIException
      
      var tizen: Tizen
    }
    object Window {
      
      @scala.inline
      def apply(WebAPIError: WebAPIException, WebAPIException: WebAPIException, tizen: Tizen): Window = {
        val __obj = js.Dynamic.literal(WebAPIError = WebAPIError.asInstanceOf[js.Any], WebAPIException = WebAPIException.asInstanceOf[js.Any], tizen = tizen.asInstanceOf[js.Any])
        __obj.asInstanceOf[Window]
      }
      
      @scala.inline
      implicit class WindowMutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setTizen(value: Tizen): Self = StObject.set(x, "tizen", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWebAPIError(value: WebAPIException): Self = StObject.set(x, "WebAPIError", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setWebAPIException(value: WebAPIException): Self = StObject.set(x, "WebAPIException", value.asInstanceOf[js.Any])
      }
    }
  }
  
  trait Tizen extends StObject {
    
    var ApplicationControl: ApplicationControlConstructor
    
    var ApplicationControlData: ApplicationControlDataConstructor
    
    var AttributeFilter: AttributeFilterConstructor
    
    var AttributeRangeFilter: AttributeRangeFilterConstructor
    
    var Bundle: BundleConstructor
    
    var CompositeFilter: CompositeFilterConstructor
    
    var DownloadRequest: DownloadRequestConstructor
    
    var SimpleCoordinates: SimpleCoordinatesConstructor
    
    var SortMode: SortModeConstructor
    
    var TZDate: TZDateConstructor
    
    var TimeDuration: TimeDurationConstructor
    
    @JSName("package")
    var _package: PackageManager
    
    var application: ApplicationManager
    
    var download: DownloadManager
    
    var filesystem: FilesystemManager
    
    var systeminfo: SystemInfoManager
    
    var time: TimeUtil
    
    var tvaudiocontrol: TVAudioControlManager
    
    var tvdisplaycontrol: TVDisplayControlManager
    
    var tvinfo: TVInfoManager
    
    var tvinputdevice: TVInputDeviceManager
    
    var tvwindow: TVWindowManager
    
    var websetting: WebSettingManager
  }
  object Tizen {
    
    @scala.inline
    def apply(
      ApplicationControl: ApplicationControlConstructor,
      ApplicationControlData: ApplicationControlDataConstructor,
      AttributeFilter: AttributeFilterConstructor,
      AttributeRangeFilter: AttributeRangeFilterConstructor,
      Bundle: BundleConstructor,
      CompositeFilter: CompositeFilterConstructor,
      DownloadRequest: DownloadRequestConstructor,
      SimpleCoordinates: SimpleCoordinatesConstructor,
      SortMode: SortModeConstructor,
      TZDate: TZDateConstructor,
      TimeDuration: TimeDurationConstructor,
      _package: PackageManager,
      application: ApplicationManager,
      download: DownloadManager,
      filesystem: FilesystemManager,
      systeminfo: SystemInfoManager,
      time: TimeUtil,
      tvaudiocontrol: TVAudioControlManager,
      tvdisplaycontrol: TVDisplayControlManager,
      tvinfo: TVInfoManager,
      tvinputdevice: TVInputDeviceManager,
      tvwindow: TVWindowManager,
      websetting: WebSettingManager
    ): Tizen = {
      val __obj = js.Dynamic.literal(ApplicationControl = ApplicationControl.asInstanceOf[js.Any], ApplicationControlData = ApplicationControlData.asInstanceOf[js.Any], AttributeFilter = AttributeFilter.asInstanceOf[js.Any], AttributeRangeFilter = AttributeRangeFilter.asInstanceOf[js.Any], Bundle = Bundle.asInstanceOf[js.Any], CompositeFilter = CompositeFilter.asInstanceOf[js.Any], DownloadRequest = DownloadRequest.asInstanceOf[js.Any], SimpleCoordinates = SimpleCoordinates.asInstanceOf[js.Any], SortMode = SortMode.asInstanceOf[js.Any], TZDate = TZDate.asInstanceOf[js.Any], TimeDuration = TimeDuration.asInstanceOf[js.Any], application = application.asInstanceOf[js.Any], download = download.asInstanceOf[js.Any], filesystem = filesystem.asInstanceOf[js.Any], systeminfo = systeminfo.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], tvaudiocontrol = tvaudiocontrol.asInstanceOf[js.Any], tvdisplaycontrol = tvdisplaycontrol.asInstanceOf[js.Any], tvinfo = tvinfo.asInstanceOf[js.Any], tvinputdevice = tvinputdevice.asInstanceOf[js.Any], tvwindow = tvwindow.asInstanceOf[js.Any], websetting = websetting.asInstanceOf[js.Any])
      __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tizen]
    }
    
    @scala.inline
    implicit class TizenMutableBuilder[Self <: Tizen] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApplication(value: ApplicationManager): Self = StObject.set(x, "application", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplicationControl(value: ApplicationControlConstructor): Self = StObject.set(x, "ApplicationControl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApplicationControlData(value: ApplicationControlDataConstructor): Self = StObject.set(x, "ApplicationControlData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributeFilter(value: AttributeFilterConstructor): Self = StObject.set(x, "AttributeFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributeRangeFilter(value: AttributeRangeFilterConstructor): Self = StObject.set(x, "AttributeRangeFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBundle(value: BundleConstructor): Self = StObject.set(x, "Bundle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompositeFilter(value: CompositeFilterConstructor): Self = StObject.set(x, "CompositeFilter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownload(value: DownloadManager): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownloadRequest(value: DownloadRequestConstructor): Self = StObject.set(x, "DownloadRequest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilesystem(value: FilesystemManager): Self = StObject.set(x, "filesystem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSimpleCoordinates(value: SimpleCoordinatesConstructor): Self = StObject.set(x, "SimpleCoordinates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortMode(value: SortModeConstructor): Self = StObject.set(x, "SortMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSysteminfo(value: SystemInfoManager): Self = StObject.set(x, "systeminfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTZDate(value: TZDateConstructor): Self = StObject.set(x, "TZDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTime(value: TimeUtil): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeDuration(value: TimeDurationConstructor): Self = StObject.set(x, "TimeDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTvaudiocontrol(value: TVAudioControlManager): Self = StObject.set(x, "tvaudiocontrol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTvdisplaycontrol(value: TVDisplayControlManager): Self = StObject.set(x, "tvdisplaycontrol", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTvinfo(value: TVInfoManager): Self = StObject.set(x, "tvinfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTvinputdevice(value: TVInputDeviceManager): Self = StObject.set(x, "tvinputdevice", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTvwindow(value: TVWindowManager): Self = StObject.set(x, "tvwindow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebsetting(value: WebSettingManager): Self = StObject.set(x, "websetting", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set_package(value: PackageManager): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = Tizen
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Tizen = ^
}
