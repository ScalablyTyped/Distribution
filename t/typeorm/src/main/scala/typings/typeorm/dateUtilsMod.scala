package typings.typeorm

import typings.std.Date
import typings.typeorm.columnMetadataMod.ColumnMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dateUtilsMod {
  
  @JSImport("typeorm/browser/util/DateUtils", "DateUtils")
  @js.native
  class DateUtils () extends StObject
  /* static members */
  object DateUtils {
    
    @JSImport("typeorm/browser/util/DateUtils", "DateUtils")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Formats given number to "0x" format, e.g. if it is 1 then it will return "01".
      */
    @JSImport("typeorm/browser/util/DateUtils", "DateUtils.formatMilliseconds")
    @js.native
    def formatMilliseconds: js.Any = js.native
    @scala.inline
    def formatMilliseconds_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formatMilliseconds")(x.asInstanceOf[js.Any])
    
    /**
      * Formats given number to "0x" format, e.g. if it is 1 then it will return "01".
      */
    @JSImport("typeorm/browser/util/DateUtils", "DateUtils.formatZerolessValue")
    @js.native
    def formatZerolessValue: js.Any = js.native
    @scala.inline
    def formatZerolessValue_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("formatZerolessValue")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def mixedDateToDate(mixedDate: String): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("mixedDateToDate")(mixedDate.asInstanceOf[js.Any]).asInstanceOf[Date]
    @scala.inline
    def mixedDateToDate(mixedDate: String, toUtc: Boolean): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("mixedDateToDate")(mixedDate.asInstanceOf[js.Any], toUtc.asInstanceOf[js.Any])).asInstanceOf[Date]
    @scala.inline
    def mixedDateToDate(mixedDate: String, toUtc: Boolean, useMilliseconds: Boolean): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("mixedDateToDate")(mixedDate.asInstanceOf[js.Any], toUtc.asInstanceOf[js.Any], useMilliseconds.asInstanceOf[js.Any])).asInstanceOf[Date]
    @scala.inline
    def mixedDateToDate(mixedDate: String, toUtc: Unit, useMilliseconds: Boolean): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("mixedDateToDate")(mixedDate.asInstanceOf[js.Any], toUtc.asInstanceOf[js.Any], useMilliseconds.asInstanceOf[js.Any])).asInstanceOf[Date]
    /**
      * Converts given value into date object.
      */
    @scala.inline
    def mixedDateToDate(mixedDate: Date): Date = ^.asInstanceOf[js.Dynamic].applyDynamic("mixedDateToDate")(mixedDate.asInstanceOf[js.Any]).asInstanceOf[Date]
    @scala.inline
    def mixedDateToDate(mixedDate: Date, toUtc: Boolean): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("mixedDateToDate")(mixedDate.asInstanceOf[js.Any], toUtc.asInstanceOf[js.Any])).asInstanceOf[Date]
    @scala.inline
    def mixedDateToDate(mixedDate: Date, toUtc: Boolean, useMilliseconds: Boolean): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("mixedDateToDate")(mixedDate.asInstanceOf[js.Any], toUtc.asInstanceOf[js.Any], useMilliseconds.asInstanceOf[js.Any])).asInstanceOf[Date]
    @scala.inline
    def mixedDateToDate(mixedDate: Date, toUtc: Unit, useMilliseconds: Boolean): Date = (^.asInstanceOf[js.Dynamic].applyDynamic("mixedDateToDate")(mixedDate.asInstanceOf[js.Any], toUtc.asInstanceOf[js.Any], useMilliseconds.asInstanceOf[js.Any])).asInstanceOf[Date]
    
    @scala.inline
    def mixedDateToDateString(value: js.Any): String | js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("mixedDateToDateString")(value.asInstanceOf[js.Any]).asInstanceOf[String | js.Any]
    /**
      * Converts given value into date string in a "YYYY-MM-DD" format.
      */
    @scala.inline
    def mixedDateToDateString(value: Date): String | js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("mixedDateToDateString")(value.asInstanceOf[js.Any]).asInstanceOf[String | js.Any]
    
    @scala.inline
    def mixedDateToDatetimeString(value: js.Any): String | js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("mixedDateToDatetimeString")(value.asInstanceOf[js.Any]).asInstanceOf[String | js.Any]
    @scala.inline
    def mixedDateToDatetimeString(value: js.Any, useMilliseconds: Boolean): String | js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mixedDateToDatetimeString")(value.asInstanceOf[js.Any], useMilliseconds.asInstanceOf[js.Any])).asInstanceOf[String | js.Any]
    /**
      * Converts given value into datetime string in a "YYYY-MM-DD HH-mm-ss" format.
      */
    @scala.inline
    def mixedDateToDatetimeString(value: Date): String | js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("mixedDateToDatetimeString")(value.asInstanceOf[js.Any]).asInstanceOf[String | js.Any]
    @scala.inline
    def mixedDateToDatetimeString(value: Date, useMilliseconds: Boolean): String | js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mixedDateToDatetimeString")(value.asInstanceOf[js.Any], useMilliseconds.asInstanceOf[js.Any])).asInstanceOf[String | js.Any]
    
    @scala.inline
    def mixedDateToTimeString(value: js.Any): String | js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("mixedDateToTimeString")(value.asInstanceOf[js.Any]).asInstanceOf[String | js.Any]
    @scala.inline
    def mixedDateToTimeString(value: js.Any, skipSeconds: Boolean): String | js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mixedDateToTimeString")(value.asInstanceOf[js.Any], skipSeconds.asInstanceOf[js.Any])).asInstanceOf[String | js.Any]
    /**
      * Converts given value into time string in a "HH:mm:ss" format.
      */
    @scala.inline
    def mixedDateToTimeString(value: Date): String | js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("mixedDateToTimeString")(value.asInstanceOf[js.Any]).asInstanceOf[String | js.Any]
    @scala.inline
    def mixedDateToTimeString(value: Date, skipSeconds: Boolean): String | js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mixedDateToTimeString")(value.asInstanceOf[js.Any], skipSeconds.asInstanceOf[js.Any])).asInstanceOf[String | js.Any]
    
    @scala.inline
    def mixedDateToUtcDatetimeString(value: js.Any): String | js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("mixedDateToUtcDatetimeString")(value.asInstanceOf[js.Any]).asInstanceOf[String | js.Any]
    /**
      * Converts given value into utc datetime string in a "YYYY-MM-DD HH-mm-ss.sss" format.
      */
    @scala.inline
    def mixedDateToUtcDatetimeString(value: Date): String | js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("mixedDateToUtcDatetimeString")(value.asInstanceOf[js.Any]).asInstanceOf[String | js.Any]
    
    @scala.inline
    def mixedTimeToDate(value: js.Any): String | js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("mixedTimeToDate")(value.asInstanceOf[js.Any]).asInstanceOf[String | js.Any]
    /**
      * Converts given value into time string in a "HH:mm:ss" format.
      */
    @scala.inline
    def mixedTimeToDate(value: Date): String | js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("mixedTimeToDate")(value.asInstanceOf[js.Any]).asInstanceOf[String | js.Any]
    
    /**
      * Converts given string value with "-" separator into a "HH:mm:ss" format.
      */
    @scala.inline
    def mixedTimeToString(value: String): String | js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("mixedTimeToString")(value.asInstanceOf[js.Any]).asInstanceOf[String | js.Any]
    @scala.inline
    def mixedTimeToString(value: String, skipSeconds: Boolean): String | js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mixedTimeToString")(value.asInstanceOf[js.Any], skipSeconds.asInstanceOf[js.Any])).asInstanceOf[String | js.Any]
    @scala.inline
    def mixedTimeToString(value: js.Any): String | js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("mixedTimeToString")(value.asInstanceOf[js.Any]).asInstanceOf[String | js.Any]
    @scala.inline
    def mixedTimeToString(value: js.Any, skipSeconds: Boolean): String | js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mixedTimeToString")(value.asInstanceOf[js.Any], skipSeconds.asInstanceOf[js.Any])).asInstanceOf[String | js.Any]
    
    /**
      * Normalizes date object hydrated from the database.
      */
    @scala.inline
    def normalizeHydratedDate(): js.UndefOr[Date | String] = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeHydratedDate")().asInstanceOf[js.UndefOr[Date | String]]
    @scala.inline
    def normalizeHydratedDate(mixedDate: String): js.UndefOr[Date | String] = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeHydratedDate")(mixedDate.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Date | String]]
    @scala.inline
    def normalizeHydratedDate(mixedDate: Date): js.UndefOr[Date | String] = ^.asInstanceOf[js.Dynamic].applyDynamic("normalizeHydratedDate")(mixedDate.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Date | String]]
    
    @scala.inline
    def simpleArrayToString(value: js.Any): js.Array[String] | js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("simpleArrayToString")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[String] | js.Any]
    /**
      * Converts each item in the given array to string joined by "," separator.
      */
    @scala.inline
    def simpleArrayToString(value: js.Array[js.Any]): js.Array[String] | js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("simpleArrayToString")(value.asInstanceOf[js.Any]).asInstanceOf[js.Array[String] | js.Any]
    
    @scala.inline
    def simpleEnumToString(value: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("simpleEnumToString")(value.asInstanceOf[js.Any]).asInstanceOf[String]
    
    @scala.inline
    def simpleJsonToString(value: js.Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("simpleJsonToString")(value.asInstanceOf[js.Any]).asInstanceOf[String]
    
    /**
      * Converts given string to simple array split by "," separator.
      */
    @scala.inline
    def stringToSimpleArray(value: String): String | js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("stringToSimpleArray")(value.asInstanceOf[js.Any]).asInstanceOf[String | js.Any]
    @scala.inline
    def stringToSimpleArray(value: js.Any): String | js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("stringToSimpleArray")(value.asInstanceOf[js.Any]).asInstanceOf[String | js.Any]
    
    @scala.inline
    def stringToSimpleEnum(value: js.Any, columnMetadata: ColumnMetadata): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("stringToSimpleEnum")(value.asInstanceOf[js.Any], columnMetadata.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @scala.inline
    def stringToSimpleJson(value: js.Any): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("stringToSimpleJson")(value.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  }
}
