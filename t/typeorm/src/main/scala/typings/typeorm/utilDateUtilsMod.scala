package typings.typeorm

import typings.std.Date
import typings.typeorm.metadataColumnMetadataMod.ColumnMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilDateUtilsMod {
  
  @JSImport("typeorm/util/DateUtils", "DateUtils")
  @js.native
  class DateUtils () extends StObject
  /* static members */
  object DateUtils {
    
    @JSImport("typeorm/util/DateUtils", "DateUtils")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Formats given number to "0x" format, e.g. if it is 1 then it will return "01".
      */
    @JSImport("typeorm/util/DateUtils", "DateUtils.formatMilliseconds")
    @js.native
    def formatMilliseconds: js.Any = js.native
    @scala.inline
    def formatMilliseconds_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formatMilliseconds")(x.asInstanceOf[js.Any])
    
    /**
      * Formats given number to "0x" format, e.g. if it is 1 then it will return "01".
      */
    @JSImport("typeorm/util/DateUtils", "DateUtils.formatZerolessValue")
    @js.native
    def formatZerolessValue: js.Any = js.native
    @scala.inline
    def formatZerolessValue_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formatZerolessValue")(x.asInstanceOf[js.Any])
    
    @JSImport("typeorm/util/DateUtils", "DateUtils.mixedDateToDate")
    @js.native
    def mixedDateToDate(mixedDate: String): Date = js.native
    @JSImport("typeorm/util/DateUtils", "DateUtils.mixedDateToDate")
    @js.native
    def mixedDateToDate(mixedDate: String, toUtc: js.UndefOr[scala.Nothing], useMilliseconds: Boolean): Date = js.native
    @JSImport("typeorm/util/DateUtils", "DateUtils.mixedDateToDate")
    @js.native
    def mixedDateToDate(mixedDate: String, toUtc: Boolean): Date = js.native
    @JSImport("typeorm/util/DateUtils", "DateUtils.mixedDateToDate")
    @js.native
    def mixedDateToDate(mixedDate: String, toUtc: Boolean, useMilliseconds: Boolean): Date = js.native
    /**
      * Converts given value into date object.
      */
    @JSImport("typeorm/util/DateUtils", "DateUtils.mixedDateToDate")
    @js.native
    def mixedDateToDate(mixedDate: Date): Date = js.native
    @JSImport("typeorm/util/DateUtils", "DateUtils.mixedDateToDate")
    @js.native
    def mixedDateToDate(mixedDate: Date, toUtc: js.UndefOr[scala.Nothing], useMilliseconds: Boolean): Date = js.native
    @JSImport("typeorm/util/DateUtils", "DateUtils.mixedDateToDate")
    @js.native
    def mixedDateToDate(mixedDate: Date, toUtc: Boolean): Date = js.native
    @JSImport("typeorm/util/DateUtils", "DateUtils.mixedDateToDate")
    @js.native
    def mixedDateToDate(mixedDate: Date, toUtc: Boolean, useMilliseconds: Boolean): Date = js.native
    
    @JSImport("typeorm/util/DateUtils", "DateUtils.mixedDateToDateString")
    @js.native
    def mixedDateToDateString(value: js.Any): String | js.Any = js.native
    /**
      * Converts given value into date string in a "YYYY-MM-DD" format.
      */
    @JSImport("typeorm/util/DateUtils", "DateUtils.mixedDateToDateString")
    @js.native
    def mixedDateToDateString(value: Date): String | js.Any = js.native
    
    @JSImport("typeorm/util/DateUtils", "DateUtils.mixedDateToDatetimeString")
    @js.native
    def mixedDateToDatetimeString(value: js.Any): String | js.Any = js.native
    @JSImport("typeorm/util/DateUtils", "DateUtils.mixedDateToDatetimeString")
    @js.native
    def mixedDateToDatetimeString(value: js.Any, useMilliseconds: Boolean): String | js.Any = js.native
    /**
      * Converts given value into datetime string in a "YYYY-MM-DD HH-mm-ss" format.
      */
    @JSImport("typeorm/util/DateUtils", "DateUtils.mixedDateToDatetimeString")
    @js.native
    def mixedDateToDatetimeString(value: Date): String | js.Any = js.native
    @JSImport("typeorm/util/DateUtils", "DateUtils.mixedDateToDatetimeString")
    @js.native
    def mixedDateToDatetimeString(value: Date, useMilliseconds: Boolean): String | js.Any = js.native
    
    @JSImport("typeorm/util/DateUtils", "DateUtils.mixedDateToTimeString")
    @js.native
    def mixedDateToTimeString(value: js.Any): String | js.Any = js.native
    @JSImport("typeorm/util/DateUtils", "DateUtils.mixedDateToTimeString")
    @js.native
    def mixedDateToTimeString(value: js.Any, skipSeconds: Boolean): String | js.Any = js.native
    /**
      * Converts given value into time string in a "HH:mm:ss" format.
      */
    @JSImport("typeorm/util/DateUtils", "DateUtils.mixedDateToTimeString")
    @js.native
    def mixedDateToTimeString(value: Date): String | js.Any = js.native
    @JSImport("typeorm/util/DateUtils", "DateUtils.mixedDateToTimeString")
    @js.native
    def mixedDateToTimeString(value: Date, skipSeconds: Boolean): String | js.Any = js.native
    
    @JSImport("typeorm/util/DateUtils", "DateUtils.mixedDateToUtcDatetimeString")
    @js.native
    def mixedDateToUtcDatetimeString(value: js.Any): String | js.Any = js.native
    /**
      * Converts given value into utc datetime string in a "YYYY-MM-DD HH-mm-ss.sss" format.
      */
    @JSImport("typeorm/util/DateUtils", "DateUtils.mixedDateToUtcDatetimeString")
    @js.native
    def mixedDateToUtcDatetimeString(value: Date): String | js.Any = js.native
    
    @JSImport("typeorm/util/DateUtils", "DateUtils.mixedTimeToDate")
    @js.native
    def mixedTimeToDate(value: js.Any): String | js.Any = js.native
    /**
      * Converts given value into time string in a "HH:mm:ss" format.
      */
    @JSImport("typeorm/util/DateUtils", "DateUtils.mixedTimeToDate")
    @js.native
    def mixedTimeToDate(value: Date): String | js.Any = js.native
    
    /**
      * Converts given string value with "-" separator into a "HH:mm:ss" format.
      */
    @JSImport("typeorm/util/DateUtils", "DateUtils.mixedTimeToString")
    @js.native
    def mixedTimeToString(value: String): String | js.Any = js.native
    @JSImport("typeorm/util/DateUtils", "DateUtils.mixedTimeToString")
    @js.native
    def mixedTimeToString(value: String, skipSeconds: Boolean): String | js.Any = js.native
    @JSImport("typeorm/util/DateUtils", "DateUtils.mixedTimeToString")
    @js.native
    def mixedTimeToString(value: js.Any): String | js.Any = js.native
    @JSImport("typeorm/util/DateUtils", "DateUtils.mixedTimeToString")
    @js.native
    def mixedTimeToString(value: js.Any, skipSeconds: Boolean): String | js.Any = js.native
    
    /**
      * Normalizes date object hydrated from the database.
      */
    @JSImport("typeorm/util/DateUtils", "DateUtils.normalizeHydratedDate")
    @js.native
    def normalizeHydratedDate(): js.UndefOr[Date | String] = js.native
    @JSImport("typeorm/util/DateUtils", "DateUtils.normalizeHydratedDate")
    @js.native
    def normalizeHydratedDate(mixedDate: String): js.UndefOr[Date | String] = js.native
    @JSImport("typeorm/util/DateUtils", "DateUtils.normalizeHydratedDate")
    @js.native
    def normalizeHydratedDate(mixedDate: Date): js.UndefOr[Date | String] = js.native
    
    @JSImport("typeorm/util/DateUtils", "DateUtils.simpleArrayToString")
    @js.native
    def simpleArrayToString(value: js.Any): js.Array[String] | js.Any = js.native
    /**
      * Converts each item in the given array to string joined by "," separator.
      */
    @JSImport("typeorm/util/DateUtils", "DateUtils.simpleArrayToString")
    @js.native
    def simpleArrayToString(value: js.Array[_]): js.Array[String] | js.Any = js.native
    
    @JSImport("typeorm/util/DateUtils", "DateUtils.simpleEnumToString")
    @js.native
    def simpleEnumToString(value: js.Any): String = js.native
    
    @JSImport("typeorm/util/DateUtils", "DateUtils.simpleJsonToString")
    @js.native
    def simpleJsonToString(value: js.Any): String = js.native
    
    /**
      * Converts given string to simple array split by "," separator.
      */
    @JSImport("typeorm/util/DateUtils", "DateUtils.stringToSimpleArray")
    @js.native
    def stringToSimpleArray(value: String): String | js.Any = js.native
    @JSImport("typeorm/util/DateUtils", "DateUtils.stringToSimpleArray")
    @js.native
    def stringToSimpleArray(value: js.Any): String | js.Any = js.native
    
    @JSImport("typeorm/util/DateUtils", "DateUtils.stringToSimpleEnum")
    @js.native
    def stringToSimpleEnum(value: js.Any, columnMetadata: ColumnMetadata): js.Any = js.native
    
    @JSImport("typeorm/util/DateUtils", "DateUtils.stringToSimpleJson")
    @js.native
    def stringToSimpleJson(value: js.Any): js.Any = js.native
  }
}
