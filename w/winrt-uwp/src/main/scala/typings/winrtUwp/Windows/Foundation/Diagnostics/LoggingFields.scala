package typings.winrtUwp.Windows.Foundation.Diagnostics

import typings.winrtUwp.Windows.Foundation.Point
import typings.winrtUwp.Windows.Foundation.Rect
import typings.winrtUwp.Windows.Foundation.Size
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a sequence of event fields and provides methods for adding fields to the sequence. */
@js.native
trait LoggingFields extends StObject {
  
  /**
    * Adds a boolean field with the specified field name.
    * @param name Name of the event field.
    * @param value Value of the event field.
    */
  def addBoolean(name: String, value: Boolean): Unit = js.native
  /**
    * Adds a boolean field with the specified field name and format.
    * @param name The name of the event field.
    * @param value The value of the event field.
    * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
    */
  def addBoolean(name: String, value: Boolean, format: LoggingFieldFormat): Unit = js.native
  /**
    * Adds a boolean field with the specified field name, format, and tags.
    * @param name The name of the event field.
    * @param value The value of the event field.
    * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
    * @param tags The user-defined tag for the event field. Specifies up to twenty-eight bits of user-defined field processing metadata for use by a custom ETW processing tool. The top four bits are reserved and must be set to zero (0).
    */
  def addBoolean(name: String, value: Boolean, format: LoggingFieldFormat, tags: Double): Unit = js.native
  
  /**
    * Adds a boolean array field with the specified field name.
    * @param name The name of the event field.
    * @param value The array values for the event field.
    */
  def addBooleanArray(name: String, value: js.Array[Boolean]): Unit = js.native
  /**
    * Adds a boolean array field with the specified field name and format.
    * @param name The name of the event field.
    * @param value The array of values for the event field.
    * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
    */
  def addBooleanArray(name: String, value: js.Array[Boolean], format: LoggingFieldFormat): Unit = js.native
  /**
    * Adds a boolean array field with the specified field name, format, and tag.
    * @param name The name of the event field.
    * @param value The array of values for the event field.
    * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
    * @param tags The user-defined tag for the event field. Specifies up to twenty-eight bits of user-defined field processing metadata for use by a custom ETW processing tool. The top four bits are reserved and must be set to zero (0).
    */
  def addBooleanArray(name: String, value: js.Array[Boolean], format: LoggingFieldFormat, tags: Double): Unit = js.native
  
  /**
    * Adds a 16-bit character field with the specified field name.
    * @param name The name of the event field.
    * @param value The value of the event field.
    */
  def addChar16(name: String, value: String): Unit = js.native
  /**
    * Adds a 16-bit character field with the specified field name and format.
    * @param name The name of the event field.
    * @param value The value of the event field.
    * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
    */
  def addChar16(name: String, value: String, format: LoggingFieldFormat): Unit = js.native
  /**
    * Adds a 16-bit character field with the specified field name, format, and tag.
    * @param name The name of the event field.
    * @param value The value of the event field.
    * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
    * @param tags The user-defined tag for the event field. Specifies up to twenty-eight bits of user-defined field processing metadata for use by a custom ETW processing tool. The top four bits are reserved and must be set to zero (0).
    */
  def addChar16(name: String, value: String, format: LoggingFieldFormat, tags: Double): Unit = js.native
  
  /**
    * Adds a 16-bit character array field with the specified field name.
    * @param name The name of the event field.
    * @param value The array of values for the event field.
    */
  def addChar16Array(name: String, value: js.Array[String]): Unit = js.native
  /**
    * Adds a 16-bit character array field with the specified field name and format.
    * @param name The name of the event field.
    * @param value The array of values for the event field.
    * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
    */
  def addChar16Array(name: String, value: js.Array[String], format: LoggingFieldFormat): Unit = js.native
  /**
    * Adds a 16-bit character array field with the specified field name and format, and tags.
    * @param name The name of the event field.
    * @param value The array of values for the event field.
    * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
    * @param tags The user-defined tag for the event field. Specifies up to twenty-eight bits of user-defined field processing metadata for use by a custom ETW processing tool. The top four bits are reserved and must be set to zero (0).
    */
  def addChar16Array(name: String, value: js.Array[String], format: LoggingFieldFormat, tags: Double): Unit = js.native
  
  /**
    * Adds a DateTime field with the specified field name.
    * @param name The name of the event field.
    * @param value The value of the event field.
    */
  def addDateTime(name: String, value: js.Date): Unit = js.native
  /**
    * Adds a DateTime field with the specified field name and format.
    * @param name The name of the event field.
    * @param value The value of the event field.
    * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
    */
  def addDateTime(name: String, value: js.Date, format: LoggingFieldFormat): Unit = js.native
  /**
    * Adds a DateTime field with the specified field name, format, and tags.
    * @param name The name of the event field.
    * @param value The value of the event field.
    * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
    * @param tags The user-defined tag for the event field. Specifies up to twenty-eight bits of user-defined field processing metadata for use by a custom ETW processing tool. The top four bits are reserved and must be set to zero (0).
    */
  def addDateTime(name: String, value: js.Date, format: LoggingFieldFormat, tags: Double): Unit = js.native
  
  /**
    * Adds a DateTime array field with the specified field name.
    * @param name The name of the event field.
    * @param value The array of values for the event field.
    */
  def addDateTimeArray(name: String, value: js.Array[js.Date]): Unit = js.native
  /**
    * Adds a DateTime array field with the specified field name and format.
    * @param name The name of the event field.
    * @param value The array of values for the event field.
    * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
    */
  def addDateTimeArray(name: String, value: js.Array[js.Date], format: LoggingFieldFormat): Unit = js.native
  /**
    * Adds a DateTime array field with the specified field name, format, and tags.
    * @param name The name of the event field.
    * @param value The array of values for the event field.
    * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
    * @param tags The user-defined tag for the event field. Specifies up to twenty-eight bits of user-defined field processing metadata for use by a custom ETW processing tool. The top four bits are reserved and must be set to zero (0).
    */
  def addDateTimeArray(name: String, value: js.Array[js.Date], format: LoggingFieldFormat, tags: Double): Unit = js.native
  
  /**
    * Adds a Double field with the specified field name.
    * @param name Name of the event field.
    * @param value Value of the event field.
    */
  def addDouble(name: String, value: Double): Unit = js.native
  /**
    * Adds a Double field with the specified field name and format.
    * @param name Name of the event field.
    * @param value Value of the event field.
    * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
    */
  def addDouble(name: String, value: Double, format: LoggingFieldFormat): Unit = js.native
  /**
    * Adds a Double field with the specified field name, format, and tags.
    * @param name Name of the event field.
    * @param value Value of the event field.
    * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
    * @param tags The user-defined tag for the event field. Specifies up to twenty-eight bits of user-defined field processing metadata for use by a custom ETW processing tool. The top four bits are reserved and must be set to zero (0).
    */
  def addDouble(name: String, value: Double, format: LoggingFieldFormat, tags: Double): Unit = js.native
  
  /**
    * Adds a Double array field with the specified field name.
    * @param name Name of the event field.
    * @param value The array of values for the event field.
    */
  def addDoubleArray(name: String, value: js.typedarray.Float64Array): Unit = js.native
  /**
    * Adds a Double array field with the specified field name and format.
    * @param name Name of the event field.
    * @param value The array of values for the event field.
    * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
    */
  def addDoubleArray(name: String, value: js.typedarray.Float64Array, format: LoggingFieldFormat): Unit = js.native
  /**
    * Adds a Double array field with the specified field name, format, and tags.
    * @param name Name of the event field.
    * @param value The array of values for the event field.
    * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
    * @param tags The user-defined tag for the event field. Specifies up to twenty-eight bits of user-defined field processing metadata for use by a custom ETW processing tool. The top four bits are reserved and must be set to zero (0).
    */
  def addDoubleArray(name: String, value: js.typedarray.Float64Array, format: LoggingFieldFormat, tags: Double): Unit = js.native
  
  /**
    * Adds an empty field.
    * @param name Name of the event field.
    */
  def addEmpty(name: String): Unit = js.native
  /**
    * Adds an empty field.
    * @param name Name of the event field.
    * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
    */
  def addEmpty(name: String, format: LoggingFieldFormat): Unit = js.native
  /**
    * Adds an empty field.
    * @param name Name of the event field.
    * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
    * @param tags The user-defined tag for the event field. Specifies up to twenty-eight bits of user-defined field processing metadata for use by a custom ETW processing tool. The top four bits are reserved and must be set to zero (0).
    */
  def addEmpty(name: String, format: LoggingFieldFormat, tags: Double): Unit = js.native
  
  /**
    * Adds a GUID field with the specified field name.
    * @param name Name of the event field.
    * @param value Value of the event field.
    */
  def addGuid(name: String, value: String): Unit = js.native
  /**
    * Adds a GUID field with the specified field name and format.
    * @param name Name of the event field.
    * @param value Value of the event field.
    * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
    */
  def addGuid(name: String, value: String, format: LoggingFieldFormat): Unit = js.native
  /**
    * Adds a GUID field with the specified field name, format, and tags.
    * @param name Name of the event field.
    * @param value Value of the event field.
    * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
    * @param tags The user-defined tag for the event field. Specifies up to twenty-eight bits of user-defined field processing metadata for use by a custom ETW processing tool. The top four bits are reserved and must be set to zero (0).
    */
  def addGuid(name: String, value: String, format: LoggingFieldFormat, tags: Double): Unit = js.native
  
  /**
    * Adds a GUID array field with the specified field name.
    * @param name Name of the event field.
    * @param value The array values for the event field.
    */
  def addGuidArray(name: String, value: js.Array[String]): Unit = js.native
  /**
    * Adds a GUID array field with the specified field name and format
    * @param name Name of the event field.
    * @param value The array values for the event field.
    * @param format The format of the event field.
    */
  def addGuidArray(name: String, value: js.Array[String], format: LoggingFieldFormat): Unit = js.native
  /**
    * Adds a GUID array field with the specified field name, format, and tags.
    * @param name Name of the event field.
    * @param value The array values for the event field.
    * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
    * @param tags The user-defined tag for the event field. Specifies up to twenty-eight bits of user-defined field processing metadata for use by a custom ETW processing tool. The top four bits are reserved and must be set to zero (0).
    */
  def addGuidArray(name: String, value: js.Array[String], format: LoggingFieldFormat, tags: Double): Unit = js.native
  
  /**
    * Adds a 16-bit integer field with the specified field name.
    * @param name Name of the event field.
    * @param value Value of the event field.
    */
  def addInt16(name: String, value: Double): Unit = js.native
  /**
    * Adds a 16-bit integer field with the specified field name and format.
    * @param name Name of the event field.
    * @param value Value of the event field.
    * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
    */
  def addInt16(name: String, value: Double, format: LoggingFieldFormat): Unit = js.native
  /**
    * Adds a 16-bit integer field with the specified field name, format, and tags.
    * @param name Name of the event field.
    * @param value Value of the event field.
    * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
    * @param tags The user-defined tag for the event field. Specifies up to twenty-eight bits of user-defined field processing metadata for use by a custom ETW processing tool. The top four bits are reserved and must be set to zero (0).
    */
  def addInt16(name: String, value: Double, format: LoggingFieldFormat, tags: Double): Unit = js.native
  
  /**
    * Adds a 16-bit integer array field with the specified field name.
    * @param name Name of the event field.
    * @param value Value of the event field.
    */
  def addInt16Array(name: String, value: js.typedarray.Int16Array): Unit = js.native
  /**
    * Adds a 16-bit integer array field with the specified field name and format.
    * @param name Name of the event field.
    * @param value Value of the event field.
    * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
    */
  def addInt16Array(name: String, value: js.typedarray.Int16Array, format: LoggingFieldFormat): Unit = js.native
  /**
    * Adds a 16-bit integer array field with the specified field name, format, and tags.
    * @param name Name of the event field.
    * @param value Value of the event field.
    * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
    * @param tags The user-defined tag for the event field. Specifies up to twenty-eight bits of user-defined field processing metadata for use by a custom ETW processing tool. The top four bits are reserved and must be set to zero (0).
    */
  def addInt16Array(name: String, value: js.typedarray.Int16Array, format: LoggingFieldFormat, tags: Double): Unit = js.native
  
  /**
    * Adds a 32-bit integer array field with the specified field name.
    * @param name Name of the event field.
    * @param value Value of the event field.
    */
  def addInt32(name: String, value: Double): Unit = js.native
  /**
    * Adds a 32-bit integer array field with the specified field name and format.
    * @param name Name of the event field.
    * @param value Value of the event field.
    * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
    */
  def addInt32(name: String, value: Double, format: LoggingFieldFormat): Unit = js.native
  /**
    * Adds a 32-bit integer array field with the specified field name, format, and tags.
    * @param name Name of the event field.
    * @param value The array values for the event field.
    * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
    * @param tags The user-defined tag for the event field. Specifies up to twenty-eight bits of user-defined field processing metadata for use by a custom ETW processing tool. The top four bits are reserved and must be set to zero (0).
    */
  def addInt32(name: String, value: Double, format: LoggingFieldFormat, tags: Double): Unit = js.native
  
  /**
    * Adds a 32-bit integer array field with the specified field name.
    * @param name Name of the event field.
    * @param value The array values for the event field.
    */
  def addInt32Array(name: String, value: js.typedarray.Int32Array): Unit = js.native
  /**
    * Adds a 32-bit integer array field with the specified field name and format.
    * @param name Name of the event field.
    * @param value The array values for the event field.
    * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
    */
  def addInt32Array(name: String, value: js.typedarray.Int32Array, format: LoggingFieldFormat): Unit = js.native
  /**
    * Adds a 32-bit integer array field with the specified field name, format, and tags.
    * @param name Name of the event field.
    * @param value The array values for the event field.
    * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
    * @param tags The user-defined tag for the event field. Specifies up to twenty-eight bits of user-defined field processing metadata for use by a custom ETW processing tool. The top four bits are reserved and must be set to zero (0).
    */
  def addInt32Array(name: String, value: js.typedarray.Int32Array, format: LoggingFieldFormat, tags: Double): Unit = js.native
  
  /**
    * Adds a 64-bit integer array field with the specified field name.
    * @param name Name of the event field.
    * @param value The array values for the event field.
    */
  def addInt64(name: String, value: Double): Unit = js.native
  /**
    * Adds a 64-bit integer array field with the specified field name and format.
    * @param name Name of the event field.
    * @param value The array values for the event field.
    * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
    */
  def addInt64(name: String, value: Double, format: LoggingFieldFormat): Unit = js.native
  /**
    * Adds a 64-bit integer field with the specified field name, format, and tags.
    * @param name Name of the event field.
    * @param value The value for the event field.
    * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
    * @param tags The user-defined tag for the event field. Specifies up to twenty-eight bits of user-defined field processing metadata for use by a custom ETW processing tool. The top four bits are reserved and must be set to zero (0).
    */
  def addInt64(name: String, value: Double, format: LoggingFieldFormat, tags: Double): Unit = js.native
  
  /**
    * Adds a 64-bit integer array field with the specified field name.
    * @param name Name of the event field.
    * @param value The array values for the event field.
    */
  def addInt64Array(name: String, value: js.Array[Double]): Unit = js.native
  /**
    * Adds a 64-bit integer array field with the specified field name and format.
    * @param name Name of the event field.
    * @param value The array values for the event field.
    * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
    */
  def addInt64Array(name: String, value: js.Array[Double], format: LoggingFieldFormat): Unit = js.native
  /**
    * Adds a 64-bit integer array field with the specified field name, format, and tags.
    * @param name Name of the event field.
    * @param value The array values for the event field.
    * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
    * @param tags The user-defined tag for the event field. Specifies up to twenty-eight bits of user-defined field processing metadata for use by a custom ETW processing tool. The top four bits are reserved and must be set to zero (0).
    */
  def addInt64Array(name: String, value: js.Array[Double], format: LoggingFieldFormat, tags: Double): Unit = js.native
  
  /**
    * Adds a Point field with the specified name.
    * @param name Name of the event field.
    * @param value The value for the event field.
    */
  def addPoint(name: String, value: Point): Unit = js.native
  /**
    * Adds a Point field with the specified name and format.
    * @param name Name of the event field.
    * @param value The value for the event field.
    * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
    */
  def addPoint(name: String, value: Point, format: LoggingFieldFormat): Unit = js.native
  /**
    * Adds a Point field with the specified name, format, and tags.
    * @param name Name of the event field.
    * @param value The value for the event field.
    * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
    * @param tags The user-defined tag for the event field. Specifies up to twenty-eight bits of user-defined field processing metadata for use by a custom ETW processing tool. The top four bits are reserved and must be set to zero (0).
    */
  def addPoint(name: String, value: Point, format: LoggingFieldFormat, tags: Double): Unit = js.native
  
  /**
    * Adds a Point array field with the specified field name.
    * @param name Name of the event field.
    * @param value The value for the event field.
    */
  def addPointArray(name: String, value: Point): Unit = js.native
  /**
    * Adds a Point array field with the specified field name and format.
    * @param name Name of the event field.
    * @param value The value for the event field.
    * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
    */
  def addPointArray(name: String, value: Point, format: LoggingFieldFormat): Unit = js.native
  /**
    * Adds a Point array field with the specified field name, format, and tags.
    * @param name Name of the event field.
    * @param value The value for the event field.
    * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
    * @param tags The user-defined tag for the event field. Specifies up to twenty-eight bits of user-defined field processing metadata for use by a custom ETW processing tool. The top four bits are reserved and must be set to zero (0).
    */
  def addPointArray(name: String, value: Point, format: LoggingFieldFormat, tags: Double): Unit = js.native
  
  /**
    * Adds a Rect field with the specified field name.
    * @param name Name of the event field.
    * @param value The value for the event field.
    */
  def addRect(name: String, value: Rect): Unit = js.native
  /**
    * Adds a Rect field with the specified field name, and format.
    * @param name Name of the event field.
    * @param value The value for the event field.
    * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
    */
  def addRect(name: String, value: Rect, format: LoggingFieldFormat): Unit = js.native
  /**
    * Adds a Rect field with the specified field name, format, and tags.
    * @param name Name of the event field.
    * @param value The value for the event field.
    * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
    * @param tags The user-defined tag for the event field. Specifies up to twenty-eight bits of user-defined field processing metadata for use by a custom ETW processing tool. The top four bits are reserved and must be set to zero (0).
    */
  def addRect(name: String, value: Rect, format: LoggingFieldFormat, tags: Double): Unit = js.native
  
  /**
    * Adds a Rect array field with the specified field name.
    * @param name Name of the event field.
    * @param value The value for the event field.
    */
  def addRectArray(name: String, value: Rect): Unit = js.native
  /**
    * Adds a Rect array field with the specified field name and format.
    * @param name Name of the event field.
    * @param value The value for the event field.
    * @param format The value for the event field.
    */
  def addRectArray(name: String, value: Rect, format: LoggingFieldFormat): Unit = js.native
  /**
    * Adds a Rect array field with the specified field name, format, and tags.
    * @param name Name of the event field.
    * @param value The value for the event field.
    * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
    * @param tags The user-defined tag for the event field. Specifies up to twenty-eight bits of user-defined field processing metadata for use by a custom ETW processing tool. The top four bits are reserved and must be set to zero (0).
    */
  def addRectArray(name: String, value: Rect, format: LoggingFieldFormat, tags: Double): Unit = js.native
  
  /**
    * Adds a Single field with the specified field name.
    * @param name Name of the event field.
    * @param value The value for the event field.
    */
  def addSingle(name: String, value: Double): Unit = js.native
  /**
    * Adds a Single field with the specified field name and format.
    * @param name Name of the event field.
    * @param value The value for the event field.
    * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
    */
  def addSingle(name: String, value: Double, format: LoggingFieldFormat): Unit = js.native
  /**
    * Adds a Single field with the specified field name, format, and tags.
    * @param name Name of the event field.
    * @param value The value for the event field.
    * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
    * @param tags The user-defined tag for the event field. Specifies up to twenty-eight bits of user-defined field processing metadata for use by a custom ETW processing tool. The top four bits are reserved and must be set to zero (0).
    */
  def addSingle(name: String, value: Double, format: LoggingFieldFormat, tags: Double): Unit = js.native
  
  /**
    * Adds a Single array field with the specified field name.
    * @param name Name of the event field.
    * @param value The value for the event field.
    */
  def addSingleArray(name: String, value: js.typedarray.Float32Array): Unit = js.native
  /**
    * Adds a Single array field with the specified field name and format.
    * @param name Name of the event field.
    * @param value The value for the event field.
    * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
    */
  def addSingleArray(name: String, value: js.typedarray.Float32Array, format: LoggingFieldFormat): Unit = js.native
  /**
    * Adds a Single array field with the specified field name, format, and tags.
    * @param name Name of the event field.
    * @param value The value for the event field.
    * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
    * @param tags The user-defined tag for the event field. Specifies up to twenty-eight bits of user-defined field processing metadata for use by a custom ETW processing tool. The top four bits are reserved and must be set to zero (0).
    */
  def addSingleArray(name: String, value: js.typedarray.Float32Array, format: LoggingFieldFormat, tags: Double): Unit = js.native
  
  /**
    * Adds a Size field with the specified field name.
    * @param name Name of the event field.
    * @param value The value for the event field.
    */
  def addSize(name: String, value: Size): Unit = js.native
  /**
    * Adds a Size field with the specified field name and format.
    * @param name Name of the event field.
    * @param value The value for the event field.
    * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
    */
  def addSize(name: String, value: Size, format: LoggingFieldFormat): Unit = js.native
  /**
    * Adds a Size field with the specified field name, format, and tags.
    * @param name Name of the event field.
    * @param value The value for the event field.
    * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
    * @param tags The user-defined tag for the event field. Specifies up to twenty-eight bits of user-defined field processing metadata for use by a custom ETW processing tool. The top four bits are reserved and must be set to zero (0).
    */
  def addSize(name: String, value: Size, format: LoggingFieldFormat, tags: Double): Unit = js.native
  
  /**
    * Adds a Size array field with the specified field name.
    * @param name The name of the field.
    * @param value The value for the event field.
    */
  def addSizeArray(name: String, value: Size): Unit = js.native
  /**
    * Adds a Size array field with the specified field name and format.
    * @param name Name of the event field.
    * @param value The value for the event field.
    * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
    */
  def addSizeArray(name: String, value: Size, format: LoggingFieldFormat): Unit = js.native
  /**
    * Adds a Size array field with the specified field name, format, and tags.
    * @param name Name of the event field.
    * @param value The value for the event field.
    * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
    * @param tags The user-defined tag for the event field. Specifies up to twenty-eight bits of user-defined field processing metadata for use by a custom ETW processing tool. The top four bits are reserved and must be set to zero (0).
    */
  def addSizeArray(name: String, value: Size, format: LoggingFieldFormat, tags: Double): Unit = js.native
  
  /**
    * Adds a String field with the specified field name.
    * @param name Name of the event field.
    * @param value The value for the event field.
    */
  def addString(name: String, value: String): Unit = js.native
  /**
    * Adds a String field with the specified field name and format.
    * @param name Name of the event field.
    * @param value The value for the event field.
    * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
    */
  def addString(name: String, value: String, format: LoggingFieldFormat): Unit = js.native
  /**
    * Adds a String field with the specified field name, format, and tags.
    * @param name Name of the event field.
    * @param value The value for the event field.
    * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
    * @param tags The user-defined tag for the event field. Specifies up to twenty-eight bits of user-defined field processing metadata for use by a custom ETW processing tool. The top four bits are reserved and must be set to zero (0).
    */
  def addString(name: String, value: String, format: LoggingFieldFormat, tags: Double): Unit = js.native
  
  /**
    * Adds a String array field with the specified field name.
    * @param name Name of the event field.
    * @param value The value for the event field.
    */
  def addStringArray(name: String, value: js.Array[String]): Unit = js.native
  /**
    * Adds a String array field with the specified field name and format.
    * @param name Name of the event field.
    * @param value The value for the event field.
    * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
    */
  def addStringArray(name: String, value: js.Array[String], format: LoggingFieldFormat): Unit = js.native
  /**
    * Adds a String array field with the specified field name, format, and tags.
    * @param name Name of the event field.
    * @param value The value for the event field.
    * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
    * @param tags The user-defined tag for the event field. Specifies up to twenty-eight bits of user-defined field processing metadata for use by a custom ETW processing tool. The top four bits are reserved and must be set to zero (0).
    */
  def addStringArray(name: String, value: js.Array[String], format: LoggingFieldFormat, tags: Double): Unit = js.native
  
  /**
    * Adds a time span field with the specified field name.
    * @param name Name of the event field.
    * @param value The value for the event field.
    */
  def addTimeSpan(name: String, value: Double): Unit = js.native
  /**
    * Adds a time span field with the specified field name and format.
    * @param name Name of the event field.
    * @param value The value for the event field.
    * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
    */
  def addTimeSpan(name: String, value: Double, format: LoggingFieldFormat): Unit = js.native
  /**
    * Adds a time span field with the specified field name, format, and tags.
    * @param name Name of the event field.
    * @param value The value for the event field.
    * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
    * @param tags The user-defined tag for the event field. Specifies up to twenty-eight bits of user-defined field processing metadata for use by a custom ETW processing tool. The top four bits are reserved and must be set to zero (0).
    */
  def addTimeSpan(name: String, value: Double, format: LoggingFieldFormat, tags: Double): Unit = js.native
  
  /**
    * Adds a time span array field with the specified field name.
    * @param name Name of the event field.
    * @param value The value for the event field.
    */
  def addTimeSpanArray(name: String, value: js.Array[Double]): Unit = js.native
  /**
    * Adds a time span array field with the specified field name and format.
    * @param name Name of the event field.
    * @param value The value for the event field.
    * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
    */
  def addTimeSpanArray(name: String, value: js.Array[Double], format: LoggingFieldFormat): Unit = js.native
  /**
    * Adds a time span array field with the specified field name, format, and tags.
    * @param name Name of the event field.
    * @param value The value for the event field.
    * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
    * @param tags The user-defined tag for the event field. Specifies up to twenty-eight bits of user-defined field processing metadata for use by a custom ETW processing tool. The top four bits are reserved and must be set to zero (0).
    */
  def addTimeSpanArray(name: String, value: js.Array[Double], format: LoggingFieldFormat, tags: Double): Unit = js.native
  
  /**
    * Adds a 16-bit unsigned integer field with the specified field name.
    * @param name Name of the event field.
    * @param value The value for the event field.
    */
  def addUInt16(name: String, value: Double): Unit = js.native
  /**
    * Adds a 16-bit unsigned integer field with the specified field name and format.
    * @param name Name of the event field.
    * @param value The value for the event field.
    * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
    */
  def addUInt16(name: String, value: Double, format: LoggingFieldFormat): Unit = js.native
  /**
    * Adds a 16-bit unsigned integer field with the specified field name, format, and tags.
    * @param name Name of the event field.
    * @param value The value for the event field.
    * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
    * @param tags The user-defined tag for the event field. Specifies up to twenty-eight bits of user-defined field processing metadata for use by a custom ETW processing tool. The top four bits are reserved and must be set to zero (0).
    */
  def addUInt16(name: String, value: Double, format: LoggingFieldFormat, tags: Double): Unit = js.native
  
  /**
    * Adds a16-bit unsigned integer field with the specified field name.
    * @param name Name of the event field.
    * @param value The value for the event field. The default format for the array is binary. See the remarks section for other formats that may be specified.
    */
  def addUInt16Array(name: String, value: js.typedarray.Uint16Array): Unit = js.native
  /**
    * Adds a 16-bit unsigned integer array field with the specified field name and format.
    * @param name Name of the event field.
    * @param value The value for the event field. The default format for the array is binary. See the remarks section for other formats that may be specified.
    * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
    */
  def addUInt16Array(name: String, value: js.typedarray.Uint16Array, format: LoggingFieldFormat): Unit = js.native
  /**
    * Adds a 16-bit unsigned integer array field with the specified field name, format, and tags.
    * @param name Name of the event field.
    * @param value The value for the event field. The default format for the array is binary. See the remarks section for other formats that may be specified.
    * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
    * @param tags The user-defined tag for the event field. Specifies up to twenty-eight bits of user-defined field processing metadata for use by a custom ETW processing tool. The top four bits are reserved and must be set to zero (0).
    */
  def addUInt16Array(name: String, value: js.typedarray.Uint16Array, format: LoggingFieldFormat, tags: Double): Unit = js.native
  
  /**
    * Adds a 32-bit unsigned integer field with the specified field name.
    * @param name Name of the event field.
    * @param value The value for the event field.
    */
  def addUInt32(name: String, value: Double): Unit = js.native
  /**
    * Adds a 32-bit unsigned integer field with the specified field name and format.
    * @param name Name of the event field.
    * @param value The value for the event field.
    * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
    */
  def addUInt32(name: String, value: Double, format: LoggingFieldFormat): Unit = js.native
  /**
    * Adds a 32-bit unsigned integer field with the specified field name, format, and tags.
    * @param name Name of the event field.
    * @param value The value for the event field.
    * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
    * @param tags The user-defined tag for the event field. Specifies up to twenty-eight bits of user-defined field processing metadata for use by a custom ETW processing tool. The top four bits are reserved and must be set to zero (0).
    */
  def addUInt32(name: String, value: Double, format: LoggingFieldFormat, tags: Double): Unit = js.native
  
  /**
    * Adds a 32-bit unsigned integer array field with the specified field name.
    * @param name Name of the event field.
    * @param value The value for the event field.
    */
  def addUInt32Array(name: String, value: js.typedarray.Uint32Array): Unit = js.native
  /**
    * Adds a 32-bit unsigned integer array field with the specified field name and format.
    * @param name Name of the event field.
    * @param value The value for the event field.
    * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
    */
  def addUInt32Array(name: String, value: js.typedarray.Uint32Array, format: LoggingFieldFormat): Unit = js.native
  /**
    * Adds a 32-bit unsigned integer array field with the specified field name, format, and tags.
    * @param name Name of the event field.
    * @param value The value for the event field.
    * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
    * @param tags The user-defined tag for the event field. Specifies up to twenty-eight bits of user-defined field processing metadata for use by a custom ETW processing tool. The top four bits are reserved and must be set to zero (0).
    */
  def addUInt32Array(name: String, value: js.typedarray.Uint32Array, format: LoggingFieldFormat, tags: Double): Unit = js.native
  
  /**
    * Adds a 64-bit unsigned integer field with the specified field name.
    * @param name Name of the event field.
    * @param value The value for the event field.
    */
  def addUInt64(name: String, value: Double): Unit = js.native
  /**
    * Adds a 64-bit unsigned integer field with the specified field name and format.
    * @param name Name of the event field.
    * @param value The value for the event field.
    * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
    */
  def addUInt64(name: String, value: Double, format: LoggingFieldFormat): Unit = js.native
  /**
    * Adds a 64-bit unsigned integer field with the specified field name, format, and tags.
    * @param name Name of the event field.
    * @param value The value for the event field.
    * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
    * @param tags The user-defined tag for the event field. Specifies up to twenty-eight bits of user-defined field processing metadata for use by a custom ETW processing tool. The top four bits are reserved and must be set to zero (0).
    */
  def addUInt64(name: String, value: Double, format: LoggingFieldFormat, tags: Double): Unit = js.native
  
  /**
    * Adds a 64-bit unsigned integer array field with the specified field name.
    * @param name Name of the event field.
    * @param value The value for the event field.
    */
  def addUInt64Array(name: String, value: js.Array[Double]): Unit = js.native
  /**
    * Adds a 64-bit unsigned integer array field with the specified field name and format.
    * @param name Name of the event field.
    * @param value The value for the event field.
    * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
    */
  def addUInt64Array(name: String, value: js.Array[Double], format: LoggingFieldFormat): Unit = js.native
  /**
    * Adds a 64-bit unsigned integer array field with the specified field name, format, and tags.
    * @param name Name of the event field.
    * @param value The value for the event field.
    * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
    * @param tags The user-defined tag for the event field. Specifies up to twenty-eight bits of user-defined field processing metadata for use by a custom ETW processing tool. The top four bits are reserved and must be set to zero (0).
    */
  def addUInt64Array(name: String, value: js.Array[Double], format: LoggingFieldFormat, tags: Double): Unit = js.native
  
  /**
    * Adds an 8-bit unsigned integer field with the specified field name.
    * @param name Name of the event field.
    * @param value The value for the event field.
    */
  def addUInt8(name: String, value: Double): Unit = js.native
  /**
    * Adds an 8-bit unsigned integer field with the specified field name and format.
    * @param name Name of the event field.
    * @param value The value for the event field.
    * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
    */
  def addUInt8(name: String, value: Double, format: LoggingFieldFormat): Unit = js.native
  /**
    * Adds an 8-bit unsigned integer field with the specified field name, format, and tags.
    * @param name Name of the event field.
    * @param value The value for the event field.
    * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
    * @param tags The user-defined tag for the event field. Specifies up to twenty-eight bits of user-defined field processing metadata for use by a custom ETW processing tool. The top four bits are reserved and must be set to zero (0).
    */
  def addUInt8(name: String, value: Double, format: LoggingFieldFormat, tags: Double): Unit = js.native
  
  /**
    * Adds an 8-bit unsigned integer array field with the specified field name.
    * @param name Name of the event field.
    * @param value The value for the event field. The format for the array is binary.
    */
  def addUInt8Array(name: String, value: js.Array[Double]): Unit = js.native
  /**
    * Adds an 8-bit unsigned integer array field with the specified field name and format.
    * @param name Name of the event field.
    * @param value The value for the event field. The default format for the array is binary. See the remarks section for other formats that may be specified.
    * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
    */
  def addUInt8Array(name: String, value: js.Array[Double], format: LoggingFieldFormat): Unit = js.native
  /**
    * Adds an 8-bit unsigned integer array field with the specified field name, format, and tags.
    * @param name Name of the event field.
    * @param value The value for the event field. The default format for the array is binary. See the remarks section for other formats that may be specified.
    * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
    * @param tags The user-defined tag for the event field. Specifies up to twenty-eight bits of user-defined field processing metadata for use by a custom ETW processing tool. The top four bits are reserved and must be set to zero (0).
    */
  def addUInt8Array(name: String, value: js.Array[Double], format: LoggingFieldFormat, tags: Double): Unit = js.native
  
  /**
    * Begins a new structured field with the specified field name.
    * @param name Name of the structured field.
    */
  def beginStruct(name: String): Unit = js.native
  /**
    * Begins a new structured field with the specified field name and tags.
    * @param name Name of the structured field.
    * @param tags Specifies up to twenty-eight bits of user-defined field metadata. The top four bits are reserved and must be set to zero (0).
    */
  def beginStruct(name: String, tags: Double): Unit = js.native
  
  /** Removes all fields stored in the object and resets the object to its newly-constructed state. */
  def clear(): Unit = js.native
  
  /** Ends a structured field. */
  def endStruct(): Unit = js.native
}
