package typings.typeorm

import typings.std.Date
import typings.typeorm.metadataColumnMetadataMod.ColumnMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    inline def formatMilliseconds_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formatMilliseconds")(x.asInstanceOf[js.Any])
    
    /**
      * Formats given number to "0x" format, e.g. if it is 1 then it will return "01".
      */
    @JSImport("typeorm/util/DateUtils", "DateUtils.formatZerolessValue")
    @js.native
    def formatZerolessValue: js.Any = js.native
    inline def formatZerolessValue_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formatZerolessValue")(x.asInstanceOf[js.Any])
    
    inline def mixedDateToDate(mixedDate: String): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("mixedDateToDate")(mixedDate.asInstanceOf[js.Any]).asInstanceOf[Date]
    inline def mixedDateToDate(mixedDate: String, toUtc: Boolean): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("mixedDateToDate")(mixedDate.asInstanceOf[js.Any], toUtc.asInstanceOf[js.Any])).asInstanceOf[Date]
    inline def mixedDateToDate(mixedDate: String, toUtc: Boolean, useMilliseconds: Boolean): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("mixedDateToDate")(mixedDate.asInstanceOf[js.Any], toUtc.asInstanceOf[js.Any], useMilliseconds.asInstanceOf[js.Any])).asInstanceOf[Date]
    inline def mixedDateToDate(mixedDate: String, toUtc: Unit, useMilliseconds: Boolean): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("mixedDateToDate")(mixedDate.asInstanceOf[js.Any], toUtc.asInstanceOf[js.Any], useMilliseconds.asInstanceOf[js.Any])).asInstanceOf[Date]
    /**
      * Converts given value into date object.
      */
    inline def mixedDateToDate(mixedDate: Date): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("mixedDateToDate")(mixedDate.asInstanceOf[js.Any]).asInstanceOf[Date]
    inline def mixedDateToDate(mixedDate: Date, toUtc: Boolean): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("mixedDateToDate")(mixedDate.asInstanceOf[js.Any], toUtc.asInstanceOf[js.Any])).asInstanceOf[Date]
    inline def mixedDateToDate(mixedDate: Date, toUtc: Boolean, useMilliseconds: Boolean): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("mixedDateToDate")(mixedDate.asInstanceOf[js.Any], toUtc.asInstanceOf[js.Any], useMilliseconds.asInstanceOf[js.Any])).asInstanceOf[Date]
    inline def mixedDateToDate(mixedDate: Date, toUtc: Unit, useMilliseconds: Boolean): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("mixedDateToDate")(mixedDate.asInstanceOf[js.Any], toUtc.asInstanceOf[js.Any], useMilliseconds.asInstanceOf[js.Any])).asInstanceOf[Date]
    
    inline def mixedDateToDateString(value: js.Any): String | js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("mixedDateToDateString")(value.asInstanceOf[js.Any]).asInstanceOf[String | js.Any]
    /**
      * Converts given value into date string in a "YYYY-MM-DD" format.
      */
    inline def mixedDateToDateString(value: Date): String | js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("mixedDateToDateString")(value.asInstanceOf[js.Any]).asInstanceOf[String | js.Any]
    
    inline def mixedDateToDatetimeString(value: js.Any): String | js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("mixedDateToDatetimeString")(value.asInstanceOf[js.Any]).asInstanceOf[String | js.Any]
    inline def mixedDateToDatetimeString(value: js.Any, useMilliseconds: Boolean): String | js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mixedDateToDatetimeString")(value.asInstanceOf[js.Any], useMilliseconds.asInstanceOf[js.Any])).asInstanceOf[String | js.Any]
    /**
      * Converts given value into datetime string in a "YYYY-MM-DD HH-mm-ss" format.
      */
    inline def mixedDateToDatetimeString(value: Date): String | js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("mixedDateToDatetimeString")(value.asInstanceOf[js.Any]).asInstanceOf[String | js.Any]
    inline def mixedDateToDatetimeString(value: Date, useMilliseconds: Boolean): String | js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mixedDateToDatetimeString")(value.asInstanceOf[js.Any], useMilliseconds.asInstanceOf[js.Any])).asInstanceOf[String | js.Any]
    
    inline def mixedDateToTimeString(value: js.Any): String | js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("mixedDateToTimeString")(value.asInstanceOf[js.Any]).asInstanceOf[String | js.Any]
    inline def mixedDateToTimeString(value: js.Any, skipSeconds: Boolean): String | js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mixedDateToTimeString")(value.asInstanceOf[js.Any], skipSeconds.asInstanceOf[js.Any])).asInstanceOf[String | js.Any]
    /**
      * Converts given value into time string in a "HH:mm:ss" format.
      */
    inline def mixedDateToTimeString(value: Date): String | js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("mixedDateToTimeString")(value.asInstanceOf[js.Any]).asInstanceOf[String | js.Any]
    inline def mixedDateToTimeString(value: Date, skipSeconds: Boolean): String | js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mixedDateToTimeString")(value.asInstanceOf[js.Any], skipSeconds.asInstanceOf[js.Any])).asInstanceOf[String | js.Any]
    
    inline def mixedDateToUtcDatetimeString(value: js.Any): String | js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("mixedDateToUtcDatetimeString")(value.asInstanceOf[js.Any]).asInstanceOf[String | js.Any]
    /**
      * Converts given value into utc datetime string in a "YYYY-MM-DD HH-mm-ss.sss" format.
      */
    inline def mixedDateToUtcDatetimeString(value: Date): String | js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("mixedDateToUtcDatetimeString")(value.asInstanceOf[js.Any]).asInstanceOf[String | js.Any]
    
    inline def mixedTimeToDate(value: js.Any): String | js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("mixedTimeToDate")(value.asInstanceOf[js.Any]).asInstanceOf[String | js.Any]
    /**
      * Converts given value into time string in a "HH:mm:ss" format.
      */
    inline def mixedTimeToDate(value: Date): String | js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("mixedTimeToDate")(value.asInstanceOf[js.Any]).asInstanceOf[String | js.Any]
    
    /**
      * Converts given string value with "-" separator into a "HH:mm:ss" format.
      */
    inline def mixedTimeToString(value: String): String | js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("mixedTimeToString")(value.asInstanceOf[js.Any]).asInstanceOf[String | js.Any]
    inline def mixedTimeToString(value: String, skipSeconds: Boolean): String | js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mixedTimeToString")(value.asInstanceOf[js.Any], skipSeconds.asInstanceOf[js.Any])).asInstanceOf[String | js.Any]
    inline def mixedTimeToString(value: js.Any): String | js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("mixedTimeToString")(value.asInstanceOf[js.Any]).asInstanceOf[String | js.Any]
    inline def mixedTimeToString(value: js.Any, skipSeconds: Boolean): String | js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mixedTimeToString")(value.asInstanceOf[js.Any], skipSeconds.asInstanceOf[js.Any])).asInstanceOf[String | js.Any]
    
    /**
      * Normalizes date object hydrated from the database.
      */
    inline def normalizeHydratedDate(): js.UndefOr[Date | String] = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeHydratedDate")().asInstanceOf[js.UndefOr[Date | String]]
    inline def normalizeHydratedDate(mixedDate: String): js.UndefOr[Date | String] = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeHydratedDate")(mixedDate.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Date | String]]
    inline def normalizeHydratedDate(mixedDate: Date): js.UndefOr[Date | String] = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeHydratedDate")(mixedDate.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Date | String]]
    
    inline def simpleArrayToString(value: js.Any): js.Array[String] | js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("simpleArrayToString")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[String] | js.Any]
    /**
      * Converts each item in the given array to string joined by "," separator.
      */
    inline def simpleArrayToString(value: js.Array[js.Any]): js.Array[String] | js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("simpleArrayToString")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[String] | js.Any]
    
    inline def simpleEnumToString(value: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("simpleEnumToString")(value.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def simpleJsonToString(value: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("simpleJsonToString")(value.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Converts given string to simple array split by "," separator.
      */
    inline def stringToSimpleArray(value: String): String | js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("stringToSimpleArray")(value.asInstanceOf[js.Any]).asInstanceOf[String | js.Any]
    inline def stringToSimpleArray(value: js.Any): String | js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("stringToSimpleArray")(value.asInstanceOf[js.Any]).asInstanceOf[String | js.Any]
    
    inline def stringToSimpleEnum(value: js.Any, columnMetadata: ColumnMetadata): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("stringToSimpleEnum")(value.asInstanceOf[js.Any], columnMetadata.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    inline def stringToSimpleJson(value: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("stringToSimpleJson")(value.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  }
}
