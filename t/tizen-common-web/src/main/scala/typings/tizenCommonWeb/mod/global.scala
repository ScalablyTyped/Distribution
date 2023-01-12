package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("WebAPIError")
  @js.native
  val WebAPIError: typings.tizenCommonWeb.mod.WebAPIException = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSGlobal("WebAPIException")
  @js.native
  open class WebAPIException ()
    extends typings.tizenCommonWeb.mod.WebAPIException {
    def this(code: Double) = this()
    def this(code: Double, message: String) = this()
    def this(code: Null, message: String) = this()
    def this(code: Double, message: String, name: String) = this()
    def this(code: Double, message: Null, name: String) = this()
    def this(code: Null, message: String, name: String) = this()
    def this(code: Null, message: Null, name: String) = this()
  }
  @JSGlobal("WebAPIException")
  @js.native
  val WebAPIException: WebAPIExceptionConstructor = js.native
  
  /**
    * This API provides common Tizen functionality.
    *
    * The API provides the basic definitions that are used in the Tizen Web Device API.
    * These include generic callbacks that are invoked when the operations succeed or fail,
    * WebAPIError and WebAPIException that give information of the platform's error and
    * filter interfaces that are used to make query statements for searching.
    *
    * Additionally, this API specifies the location in the ECMAScript hierarchy in which
    * the Tizen Web Device API is instantiated (_window.tizen_).
    *
    * For more information on the Tizen features, see [Tizen Guide](/application/web/guides/index).
    * @since 1.0
    */
  object tizen extends Shortcut {
    
    @JSGlobal("tizen")
    @js.native
    val ^ : Tizen = js.native
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("tizen.AlarmAbsolute")
    @js.native
    open class AlarmAbsolute protected ()
      extends typings.tizenCommonWeb.mod.AlarmAbsolute {
      def this(date: js.Date) = this()
      // tslint:disable-line:unified-signatures
      def this(date: js.Date, daysOfTheWeek: js.Array[ByDayValue]) = this()
      // tslint:disable-line:unified-signatures
      def this(date: js.Date, period: Double) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("tizen.AlarmRelative")
    @js.native
    open class AlarmRelative protected ()
      extends typings.tizenCommonWeb.mod.AlarmRelative {
      def this(delay: Double) = this()
      def this(delay: Double, period: Double) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("tizen.ApplicationControl")
    @js.native
    open class ApplicationControl protected ()
      extends typings.tizenCommonWeb.mod.ApplicationControl {
      def this(
        operation: String,
        uri: js.UndefOr[String | Null],
        mime: js.UndefOr[String | Null],
        category: js.UndefOr[String | Null],
        data: js.UndefOr[js.Array[typings.tizenCommonWeb.mod.ApplicationControlData] | Null],
        launchMode: js.UndefOr[ApplicationControlLaunchMode | Null]
      ) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("tizen.ApplicationControlData")
    @js.native
    open class ApplicationControlData protected ()
      extends typings.tizenCommonWeb.mod.ApplicationControlData {
      def this(key: String, value: js.Array[String]) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("tizen.AttributeFilter")
    @js.native
    open class AttributeFilter protected ()
      extends typings.tizenCommonWeb.mod.AttributeFilter {
      def this(attributeName: String) = this()
      def this(attributeName: String, matchFlag: FilterMatchFlag) = this()
      def this(attributeName: String, matchFlag: Null, matchValue: Any) = this()
      def this(attributeName: String, matchFlag: Unit, matchValue: Any) = this()
      def this(attributeName: String, matchFlag: FilterMatchFlag, matchValue: Any) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("tizen.AttributeRangeFilter")
    @js.native
    open class AttributeRangeFilter protected ()
      extends typings.tizenCommonWeb.mod.AttributeRangeFilter {
      def this(attributeName: String) = this()
      def this(attributeName: String, initialValue: Any) = this()
      def this(attributeName: String, initialValue: Any, endValue: Any) = this()
      def this(attributeName: String, initialValue: Unit, endValue: Any) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("tizen.Bundle")
    @js.native
    open class Bundle ()
      extends typings.tizenCommonWeb.mod.Bundle {
      def this(json: Any) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("tizen.CompositeFilter")
    @js.native
    open class CompositeFilter protected ()
      extends typings.tizenCommonWeb.mod.CompositeFilter {
      def this(`type`: CompositeFilterType) = this()
      def this(`type`: CompositeFilterType, filters: js.Array[AbstractFilter]) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("tizen.DownloadRequest")
    @js.native
    open class DownloadRequest protected ()
      extends typings.tizenCommonWeb.mod.DownloadRequest {
      def this(
        url: String,
        destination: js.UndefOr[String | Null],
        fileName: js.UndefOr[String | Null],
        networkType: js.UndefOr[DownloadNetworkType | Null],
        httpHeader: js.UndefOr[DownloadHTTPHeaderFields | Null]
      ) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("tizen.ExifInformation")
    @js.native
    open class ExifInformation ()
      extends typings.tizenCommonWeb.mod.ExifInformation {
      def this(ExifInitDict: ExifInit) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("tizen.IotconOption")
    @js.native
    open class IotconOption protected ()
      extends typings.tizenCommonWeb.mod.IotconOption {
      def this(id: Double, data: String) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("tizen.Representation")
    @js.native
    open class Representation protected ()
      extends typings.tizenCommonWeb.mod.Representation {
      def this(uriPath: String) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("tizen.Response")
    @js.native
    open class Response protected ()
      extends typings.tizenCommonWeb.mod.Response {
      def this(request: Request) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("tizen.SimpleCoordinates")
    @js.native
    open class SimpleCoordinates protected ()
      extends typings.tizenCommonWeb.mod.SimpleCoordinates {
      def this(latitude: Double, longitude: Double) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("tizen.SortMode")
    @js.native
    open class SortMode protected ()
      extends typings.tizenCommonWeb.mod.SortMode {
      def this(attributeName: String) = this()
      def this(attributeName: String, order: SortModeOrder) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("tizen.TZDate")
    @js.native
    open class TZDate ()
      extends typings.tizenCommonWeb.mod.TZDate {
      def this(datetime: js.Date) = this()
      def this(datetime: js.Date, timezone: String) = this()
      def this(datetime: Null, timezone: String) = this()
      def this(datetime: Unit, timezone: String) = this()
      def this(
        year: Double,
        month: Double,
        day: Double,
        hours: js.UndefOr[Double | Null],
        minutes: js.UndefOr[Double | Null],
        seconds: js.UndefOr[Double | Null],
        milliseconds: js.UndefOr[Double | Null],
        timezone: js.UndefOr[String | Null]
      ) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("tizen.TimeDuration")
    @js.native
    open class TimeDuration protected ()
      extends typings.tizenCommonWeb.mod.TimeDuration {
      def this(length: Double) = this()
      def this(length: Double, unit: TimeDurationUnit) = this()
    }
    
    /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
    @JSGlobal("tizen.VoiceControlCommand")
    @js.native
    open class VoiceControlCommand protected ()
      extends typings.tizenCommonWeb.mod.VoiceControlCommand {
      def this(command: String) = this()
      def this(command: String, `type`: VoiceControlCommandType) = this()
    }
    
    type _To = Tizen
    
    /* This means you don't have to write `^`, but can instead just say `tizen.foo` */
    override def _to: Tizen = ^
  }
  
  /**
    * Defines the tizen interface as a part of the window global object.
    *
    * The _Tizen_ interface is always available within the _Window_ object in the ECMAScript hierarchy.
    */
  trait Window extends StObject {
    
    val WebAPIError: typings.tizenCommonWeb.mod.WebAPIException
    
    val WebAPIException: WebAPIExceptionConstructor
    
    /**
      * This API provides common Tizen functionality.
      *
      * The API provides the basic definitions that are used in the Tizen Web Device API.
      * These include generic callbacks that are invoked when the operations succeed or fail,
      * WebAPIError and WebAPIException that give information of the platform's error and
      * filter interfaces that are used to make query statements for searching.
      *
      * Additionally, this API specifies the location in the ECMAScript hierarchy in which
      * the Tizen Web Device API is instantiated (_window.tizen_).
      *
      * For more information on the Tizen features, see [Tizen Guide](/application/web/guides/index).
      * @since 1.0
      */
    val tizen: Tizen
  }
  object Window {
    
    inline def apply(
      WebAPIError: typings.tizenCommonWeb.mod.WebAPIException,
      WebAPIException: WebAPIExceptionConstructor,
      tizen: Tizen
    ): Window = {
      val __obj = js.Dynamic.literal(WebAPIError = WebAPIError.asInstanceOf[js.Any], WebAPIException = WebAPIException.asInstanceOf[js.Any], tizen = tizen.asInstanceOf[js.Any])
      __obj.asInstanceOf[Window]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
      
      inline def setTizen(value: Tizen): Self = StObject.set(x, "tizen", value.asInstanceOf[js.Any])
      
      inline def setWebAPIError(value: typings.tizenCommonWeb.mod.WebAPIException): Self = StObject.set(x, "WebAPIError", value.asInstanceOf[js.Any])
      
      inline def setWebAPIException(value: WebAPIExceptionConstructor): Self = StObject.set(x, "WebAPIException", value.asInstanceOf[js.Any])
    }
  }
}
