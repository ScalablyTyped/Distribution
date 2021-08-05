package typings.timestampNano

import typings.std.Date
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("timestamp-nano", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with Timestamp {
    /**
      * @param time - Milliseconds from epoch
      * @param nano - Offset number for nanosecond precision
      * @param year - Offset number for year which must be a multiple of 400 to avoid leap year calculation
      */
    def this(time: Double) = this()
    def this(time: Double, nano: Double) = this()
    def this(time: Double, nano: Double, year: Double) = this()
    def this(time: Double, nano: Unit, year: Double) = this()
  }
  @JSImport("timestamp-nano", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromDate(date: Double): Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any]).asInstanceOf[Timestamp]
  /**
    * Creates a Timestamp instance from Date instance or milliseconds since epoch.
    *
    * @param date - Milliseconds since epoch
    */
  /* static member */
  inline def fromDate(date: Date): Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDate")(date.asInstanceOf[js.Any]).asInstanceOf[Timestamp]
  
  /* static member */
  inline def fromInt64BE(time: js.Array[Double]): Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("fromInt64BE")(time.asInstanceOf[js.Any]).asInstanceOf[Timestamp]
  inline def fromInt64BE(time: js.Array[Double], offset: Double): Timestamp = (^.asInstanceOf[js.Dynamic].applyDynamic("fromInt64BE")(time.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Timestamp]
  /**
    * Creates a Timestamp instance from big endian 64bit time_t of 8 bytes sequence.
    *
    * @param buffer - Buffer, Array, Uint8Array, etc.
    * @param offset
    */
  /* static member */
  inline def fromInt64BE(time: Uint8Array): Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("fromInt64BE")(time.asInstanceOf[js.Any]).asInstanceOf[Timestamp]
  inline def fromInt64BE(time: Uint8Array, offset: Double): Timestamp = (^.asInstanceOf[js.Dynamic].applyDynamic("fromInt64BE")(time.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Timestamp]
  
  /* static member */
  inline def fromInt64LE(time: js.Array[Double]): Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("fromInt64LE")(time.asInstanceOf[js.Any]).asInstanceOf[Timestamp]
  inline def fromInt64LE(time: js.Array[Double], offset: Double): Timestamp = (^.asInstanceOf[js.Dynamic].applyDynamic("fromInt64LE")(time.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Timestamp]
  /**
    * Creates a Timestamp instance from little endian 64bit time_t of 8 bytes sequence.
    *
    * @param buffer - Buffer, Array, Uint8Array, etc.
    * @param offset
    */
  /* static member */
  inline def fromInt64LE(time: Uint8Array): Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("fromInt64LE")(time.asInstanceOf[js.Any]).asInstanceOf[Timestamp]
  inline def fromInt64LE(time: Uint8Array, offset: Double): Timestamp = (^.asInstanceOf[js.Dynamic].applyDynamic("fromInt64LE")(time.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Timestamp]
  
  /**
    * Creates a Timestamp instance from string like: "2017-11-26T11:27:58.737Z"
    *
    * @see https://www.w3.org/TR/NOTE-datetime
    * @param string - W3C Date and Time Formats
    */
  /* static member */
  inline def fromString(string: String): Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(string.asInstanceOf[js.Any]).asInstanceOf[Timestamp]
  
  /**
    * Creates a Timestamp instance from seconds since epoch aka time_t.
    *
    * @param time - Seconds since epoch
    */
  /* static member */
  inline def fromTimeT(time: Double): Timestamp = ^.asInstanceOf[js.Dynamic].applyDynamic("fromTimeT")(time.asInstanceOf[js.Any]).asInstanceOf[Timestamp]
  
  @js.native
  trait Timestamp extends StObject {
    
    /**
      * Adds offset in nanosecond precision.
      *
      * @param nano - offset number for nanosecond precision in addition.
      */
    def addNano(nano: Double): this.type = js.native
    
    /**
      * Returns a number, between 0 and 999999999, representing the nanoseconds.
      */
    def getNano(): Double = js.native
    
    /**
      * Returns a number representing the seconds since epoch aka time_t.
      *
      * JavaScript has the Double precision per default.
      * Instead, Call Timestamp#writeInt64BE to retrieve 64bit long long precision time_t.
      */
    def getTimeT(): Double = js.native
    
    /**
      * Returns a number representing the year like Date#getUTCFullYear.
      */
    def getYear(): Double = js.native
    
    /**
      * Returns a Date instance.
      *
      * Do not call Date#getUTCFullYear nor Date#getFullYear with the Date instance.
      * Any properties other than those two are correct.
      * Instead, Call Timestamp#getYear to retrieve the year as Timestamp has year offset.
      */
    def toDate(): Date = js.native
    
    /**
      * Returns a JSON string representation like: "2017-11-26T11:27:58.737Z"
      */
    def toJSON(): String = js.native
    
    def toString(format: String): String = js.native
    
    def writeInt64BE(): js.Array[Double] = js.native
    def writeInt64BE(buffer: js.Array[Double]): js.Array[Double] = js.native
    def writeInt64BE(buffer: js.Array[Double], offset: Double): js.Array[Double] = js.native
    def writeInt64BE(buffer: Unit, offset: Double): js.Array[Double] = js.native
    /**
      * Writes big endian 64bit time_t of 8 bytes sequence.
      *
      * @param buffer - Buffer, Array, Uint8Array, etc.
      * @param offset
      */
    def writeInt64BE(buffer: Uint8Array): Uint8Array = js.native
    def writeInt64BE(buffer: Uint8Array, offset: Double): Uint8Array = js.native
    
    def writeInt64LE(): js.Array[Double] = js.native
    def writeInt64LE(buffer: js.Array[Double]): js.Array[Double] = js.native
    def writeInt64LE(buffer: js.Array[Double], offset: Double): js.Array[Double] = js.native
    def writeInt64LE(buffer: Unit, offset: Double): js.Array[Double] = js.native
    /**
      * Writes little endian 64bit time_t of 8 bytes sequence.
      *
      * @param buffer - Buffer, Array, Uint8Array, etc.
      * @param offset
      */
    def writeInt64LE(buffer: Uint8Array): Uint8Array = js.native
    def writeInt64LE(buffer: Uint8Array, offset: Double): Uint8Array = js.native
  }
}
