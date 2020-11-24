package typings.typeorm

import typings.std.Date
import typings.typeorm.metadataColumnMetadataMod.ColumnMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typeorm/util/DateUtils", JSImport.Namespace)
@js.native
object utilDateUtilsMod extends js.Object {
  
  @js.native
  class DateUtils () extends js.Object
  /* static members */
  @js.native
  object DateUtils extends js.Object {
    
    /**
      * Formats given number to "0x" format, e.g. if it is 1 then it will return "01".
      */
    var formatMilliseconds: js.Any = js.native
    
    /**
      * Formats given number to "0x" format, e.g. if it is 1 then it will return "01".
      */
    var formatZerolessValue: js.Any = js.native
    
    def mixedDateToDate(mixedDate: String): Date = js.native
    def mixedDateToDate(mixedDate: String, toUtc: js.UndefOr[scala.Nothing], useMilliseconds: Boolean): Date = js.native
    def mixedDateToDate(mixedDate: String, toUtc: Boolean): Date = js.native
    def mixedDateToDate(mixedDate: String, toUtc: Boolean, useMilliseconds: Boolean): Date = js.native
    /**
      * Converts given value into date object.
      */
    def mixedDateToDate(mixedDate: Date): Date = js.native
    def mixedDateToDate(mixedDate: Date, toUtc: js.UndefOr[scala.Nothing], useMilliseconds: Boolean): Date = js.native
    def mixedDateToDate(mixedDate: Date, toUtc: Boolean): Date = js.native
    def mixedDateToDate(mixedDate: Date, toUtc: Boolean, useMilliseconds: Boolean): Date = js.native
    
    def mixedDateToDateString(value: js.Any): String | js.Any = js.native
    /**
      * Converts given value into date string in a "YYYY-MM-DD" format.
      */
    def mixedDateToDateString(value: Date): String | js.Any = js.native
    
    def mixedDateToDatetimeString(value: js.Any): String | js.Any = js.native
    def mixedDateToDatetimeString(value: js.Any, useMilliseconds: Boolean): String | js.Any = js.native
    /**
      * Converts given value into datetime string in a "YYYY-MM-DD HH-mm-ss" format.
      */
    def mixedDateToDatetimeString(value: Date): String | js.Any = js.native
    def mixedDateToDatetimeString(value: Date, useMilliseconds: Boolean): String | js.Any = js.native
    
    def mixedDateToTimeString(value: js.Any): String | js.Any = js.native
    def mixedDateToTimeString(value: js.Any, skipSeconds: Boolean): String | js.Any = js.native
    /**
      * Converts given value into time string in a "HH:mm:ss" format.
      */
    def mixedDateToTimeString(value: Date): String | js.Any = js.native
    def mixedDateToTimeString(value: Date, skipSeconds: Boolean): String | js.Any = js.native
    
    def mixedDateToUtcDatetimeString(value: js.Any): String | js.Any = js.native
    /**
      * Converts given value into utc datetime string in a "YYYY-MM-DD HH-mm-ss.sss" format.
      */
    def mixedDateToUtcDatetimeString(value: Date): String | js.Any = js.native
    
    def mixedTimeToDate(value: js.Any): String | js.Any = js.native
    /**
      * Converts given value into time string in a "HH:mm:ss" format.
      */
    def mixedTimeToDate(value: Date): String | js.Any = js.native
    
    /**
      * Converts given string value with "-" separator into a "HH:mm:ss" format.
      */
    def mixedTimeToString(value: String): String | js.Any = js.native
    def mixedTimeToString(value: String, skipSeconds: Boolean): String | js.Any = js.native
    def mixedTimeToString(value: js.Any): String | js.Any = js.native
    def mixedTimeToString(value: js.Any, skipSeconds: Boolean): String | js.Any = js.native
    
    /**
      * Normalizes date object hydrated from the database.
      */
    def normalizeHydratedDate(): js.UndefOr[Date | String] = js.native
    def normalizeHydratedDate(mixedDate: String): js.UndefOr[Date | String] = js.native
    def normalizeHydratedDate(mixedDate: Date): js.UndefOr[Date | String] = js.native
    
    def simpleArrayToString(value: js.Any): js.Array[String] | js.Any = js.native
    /**
      * Converts each item in the given array to string joined by "," separator.
      */
    def simpleArrayToString(value: js.Array[_]): js.Array[String] | js.Any = js.native
    
    def simpleEnumToString(value: js.Any): String = js.native
    
    def simpleJsonToString(value: js.Any): String = js.native
    
    /**
      * Converts given string to simple array split by "," separator.
      */
    def stringToSimpleArray(value: String): String | js.Any = js.native
    def stringToSimpleArray(value: js.Any): String | js.Any = js.native
    
    def stringToSimpleEnum(value: js.Any, columnMetadata: ColumnMetadata): js.Any = js.native
    
    def stringToSimpleJson(value: js.Any): js.Any = js.native
  }
}
