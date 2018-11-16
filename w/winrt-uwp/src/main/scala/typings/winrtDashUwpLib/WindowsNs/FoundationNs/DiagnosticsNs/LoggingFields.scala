package typings
package winrtDashUwpLib.WindowsNs.FoundationNs.DiagnosticsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a sequence of event fields and provides methods for adding fields to the sequence. */
@JSGlobal("Windows.Foundation.Diagnostics.LoggingFields")
@js.native
class LoggingFields () extends js.Object {
  /**
                   * Adds a boolean field with the specified field name.
                   * @param name Name of the event field.
                   * @param value Value of the event field.
                   */
  def addBoolean(name: java.lang.String, value: scala.Boolean): scala.Unit = js.native
  /**
                   * Adds a boolean field with the specified field name and format.
                   * @param name The name of the event field.
                   * @param value The value of the event field.
                   * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
                   */
  def addBoolean(name: java.lang.String, value: scala.Boolean, format: LoggingFieldFormat): scala.Unit = js.native
  /**
                   * Adds a boolean field with the specified field name, format, and tags.
                   * @param name The name of the event field.
                   * @param value The value of the event field.
                   * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
                   * @param tags The user-defined tag for the event field. Specifies up to twenty-eight bits of user-defined field processing metadata for use by a custom ETW processing tool. The top four bits are reserved and must be set to zero (0).
                   */
  def addBoolean(name: java.lang.String, value: scala.Boolean, format: LoggingFieldFormat, tags: scala.Double): scala.Unit = js.native
  /**
                   * Adds a boolean array field with the specified field name.
                   * @param name The name of the event field.
                   * @param value The array values for the event field.
                   */
  def addBooleanArray(name: java.lang.String, value: js.Array[scala.Boolean]): scala.Unit = js.native
  /**
                   * Adds a boolean array field with the specified field name and format.
                   * @param name The name of the event field.
                   * @param value The array of values for the event field.
                   * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
                   */
  def addBooleanArray(name: java.lang.String, value: js.Array[scala.Boolean], format: LoggingFieldFormat): scala.Unit = js.native
  /**
                   * Adds a boolean array field with the specified field name, format, and tag.
                   * @param name The name of the event field.
                   * @param value The array of values for the event field.
                   * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
                   * @param tags The user-defined tag for the event field. Specifies up to twenty-eight bits of user-defined field processing metadata for use by a custom ETW processing tool. The top four bits are reserved and must be set to zero (0).
                   */
  def addBooleanArray(
    name: java.lang.String,
    value: js.Array[scala.Boolean],
    format: LoggingFieldFormat,
    tags: scala.Double
  ): scala.Unit = js.native
  /**
                   * Adds a 16-bit character field with the specified field name.
                   * @param name The name of the event field.
                   * @param value The value of the event field.
                   */
  def addChar16(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
  /**
                   * Adds a 16-bit character field with the specified field name and format.
                   * @param name The name of the event field.
                   * @param value The value of the event field.
                   * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
                   */
  def addChar16(name: java.lang.String, value: java.lang.String, format: LoggingFieldFormat): scala.Unit = js.native
  /**
                   * Adds a 16-bit character field with the specified field name, format, and tag.
                   * @param name The name of the event field.
                   * @param value The value of the event field.
                   * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
                   * @param tags The user-defined tag for the event field. Specifies up to twenty-eight bits of user-defined field processing metadata for use by a custom ETW processing tool. The top four bits are reserved and must be set to zero (0).
                   */
  def addChar16(name: java.lang.String, value: java.lang.String, format: LoggingFieldFormat, tags: scala.Double): scala.Unit = js.native
  /**
                   * Adds a 16-bit character array field with the specified field name.
                   * @param name The name of the event field.
                   * @param value The array of values for the event field.
                   */
  def addChar16Array(name: java.lang.String, value: js.Array[java.lang.String]): scala.Unit = js.native
  /**
                   * Adds a 16-bit character array field with the specified field name and format.
                   * @param name The name of the event field.
                   * @param value The array of values for the event field.
                   * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
                   */
  def addChar16Array(name: java.lang.String, value: js.Array[java.lang.String], format: LoggingFieldFormat): scala.Unit = js.native
  /**
                   * Adds a 16-bit character array field with the specified field name and format, and tags.
                   * @param name The name of the event field.
                   * @param value The array of values for the event field.
                   * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
                   * @param tags The user-defined tag for the event field. Specifies up to twenty-eight bits of user-defined field processing metadata for use by a custom ETW processing tool. The top four bits are reserved and must be set to zero (0).
                   */
  def addChar16Array(
    name: java.lang.String,
    value: js.Array[java.lang.String],
    format: LoggingFieldFormat,
    tags: scala.Double
  ): scala.Unit = js.native
  /**
                   * Adds a DateTime field with the specified field name.
                   * @param name The name of the event field.
                   * @param value The value of the event field.
                   */
  def addDateTime(name: java.lang.String, value: stdLib.Date): scala.Unit = js.native
  /**
                   * Adds a DateTime field with the specified field name and format.
                   * @param name The name of the event field.
                   * @param value The value of the event field.
                   * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
                   */
  def addDateTime(name: java.lang.String, value: stdLib.Date, format: LoggingFieldFormat): scala.Unit = js.native
  /**
                   * Adds a DateTime field with the specified field name, format, and tags.
                   * @param name The name of the event field.
                   * @param value The value of the event field.
                   * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
                   * @param tags The user-defined tag for the event field. Specifies up to twenty-eight bits of user-defined field processing metadata for use by a custom ETW processing tool. The top four bits are reserved and must be set to zero (0).
                   */
  def addDateTime(name: java.lang.String, value: stdLib.Date, format: LoggingFieldFormat, tags: scala.Double): scala.Unit = js.native
  /**
                   * Adds a DateTime array field with the specified field name.
                   * @param name The name of the event field.
                   * @param value The array of values for the event field.
                   */
  def addDateTimeArray(name: java.lang.String, value: js.Array[stdLib.Date]): scala.Unit = js.native
  /**
                   * Adds a DateTime array field with the specified field name and format.
                   * @param name The name of the event field.
                   * @param value The array of values for the event field.
                   * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
                   */
  def addDateTimeArray(name: java.lang.String, value: js.Array[stdLib.Date], format: LoggingFieldFormat): scala.Unit = js.native
  /**
                   * Adds a DateTime array field with the specified field name, format, and tags.
                   * @param name The name of the event field.
                   * @param value The array of values for the event field.
                   * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
                   * @param tags The user-defined tag for the event field. Specifies up to twenty-eight bits of user-defined field processing metadata for use by a custom ETW processing tool. The top four bits are reserved and must be set to zero (0).
                   */
  def addDateTimeArray(
    name: java.lang.String,
    value: js.Array[stdLib.Date],
    format: LoggingFieldFormat,
    tags: scala.Double
  ): scala.Unit = js.native
  /**
                   * Adds a Double field with the specified field name.
                   * @param name Name of the event field.
                   * @param value Value of the event field.
                   */
  def addDouble(name: java.lang.String, value: scala.Double): scala.Unit = js.native
  /**
                   * Adds a Double field with the specified field name and format.
                   * @param name Name of the event field.
                   * @param value Value of the event field.
                   * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
                   */
  def addDouble(name: java.lang.String, value: scala.Double, format: LoggingFieldFormat): scala.Unit = js.native
  /**
                   * Adds a Double field with the specified field name, format, and tags.
                   * @param name Name of the event field.
                   * @param value Value of the event field.
                   * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
                   * @param tags The user-defined tag for the event field. Specifies up to twenty-eight bits of user-defined field processing metadata for use by a custom ETW processing tool. The top four bits are reserved and must be set to zero (0).
                   */
  def addDouble(name: java.lang.String, value: scala.Double, format: LoggingFieldFormat, tags: scala.Double): scala.Unit = js.native
  /**
                   * Adds a Double array field with the specified field name.
                   * @param name Name of the event field.
                   * @param value The array of values for the event field.
                   */
  def addDoubleArray(name: java.lang.String, value: stdLib.Float64Array): scala.Unit = js.native
  /**
                   * Adds a Double array field with the specified field name and format.
                   * @param name Name of the event field.
                   * @param value The array of values for the event field.
                   * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
                   */
  def addDoubleArray(name: java.lang.String, value: stdLib.Float64Array, format: LoggingFieldFormat): scala.Unit = js.native
  /**
                   * Adds a Double array field with the specified field name, format, and tags.
                   * @param name Name of the event field.
                   * @param value The array of values for the event field.
                   * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
                   * @param tags The user-defined tag for the event field. Specifies up to twenty-eight bits of user-defined field processing metadata for use by a custom ETW processing tool. The top four bits are reserved and must be set to zero (0).
                   */
  def addDoubleArray(name: java.lang.String, value: stdLib.Float64Array, format: LoggingFieldFormat, tags: scala.Double): scala.Unit = js.native
  /**
                   * Adds an empty field.
                   * @param name Name of the event field.
                   */
  def addEmpty(name: java.lang.String): scala.Unit = js.native
  /**
                   * Adds an empty field.
                   * @param name Name of the event field.
                   * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
                   */
  def addEmpty(name: java.lang.String, format: LoggingFieldFormat): scala.Unit = js.native
  /**
                   * Adds an empty field.
                   * @param name Name of the event field.
                   * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
                   * @param tags The user-defined tag for the event field. Specifies up to twenty-eight bits of user-defined field processing metadata for use by a custom ETW processing tool. The top four bits are reserved and must be set to zero (0).
                   */
  def addEmpty(name: java.lang.String, format: LoggingFieldFormat, tags: scala.Double): scala.Unit = js.native
  /**
                   * Adds a GUID field with the specified field name.
                   * @param name Name of the event field.
                   * @param value Value of the event field.
                   */
  def addGuid(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
  /**
                   * Adds a GUID field with the specified field name and format.
                   * @param name Name of the event field.
                   * @param value Value of the event field.
                   * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
                   */
  def addGuid(name: java.lang.String, value: java.lang.String, format: LoggingFieldFormat): scala.Unit = js.native
  /**
                   * Adds a GUID field with the specified field name, format, and tags.
                   * @param name Name of the event field.
                   * @param value Value of the event field.
                   * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
                   * @param tags The user-defined tag for the event field. Specifies up to twenty-eight bits of user-defined field processing metadata for use by a custom ETW processing tool. The top four bits are reserved and must be set to zero (0).
                   */
  def addGuid(name: java.lang.String, value: java.lang.String, format: LoggingFieldFormat, tags: scala.Double): scala.Unit = js.native
  /**
                   * Adds a GUID array field with the specified field name.
                   * @param name Name of the event field.
                   * @param value The array values for the event field.
                   */
  def addGuidArray(name: java.lang.String, value: js.Array[java.lang.String]): scala.Unit = js.native
  /**
                   * Adds a GUID array field with the specified field name and format
                   * @param name Name of the event field.
                   * @param value The array values for the event field.
                   * @param format The format of the event field.
                   */
  def addGuidArray(name: java.lang.String, value: js.Array[java.lang.String], format: LoggingFieldFormat): scala.Unit = js.native
  /**
                   * Adds a GUID array field with the specified field name, format, and tags.
                   * @param name Name of the event field.
                   * @param value The array values for the event field.
                   * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
                   * @param tags The user-defined tag for the event field. Specifies up to twenty-eight bits of user-defined field processing metadata for use by a custom ETW processing tool. The top four bits are reserved and must be set to zero (0).
                   */
  def addGuidArray(
    name: java.lang.String,
    value: js.Array[java.lang.String],
    format: LoggingFieldFormat,
    tags: scala.Double
  ): scala.Unit = js.native
  /**
                   * Adds a 16-bit integer field with the specified field name.
                   * @param name Name of the event field.
                   * @param value Value of the event field.
                   */
  def addInt16(name: java.lang.String, value: scala.Double): scala.Unit = js.native
  /**
                   * Adds a 16-bit integer field with the specified field name and format.
                   * @param name Name of the event field.
                   * @param value Value of the event field.
                   * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
                   */
  def addInt16(name: java.lang.String, value: scala.Double, format: LoggingFieldFormat): scala.Unit = js.native
  /**
                   * Adds a 16-bit integer field with the specified field name, format, and tags.
                   * @param name Name of the event field.
                   * @param value Value of the event field.
                   * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
                   * @param tags The user-defined tag for the event field. Specifies up to twenty-eight bits of user-defined field processing metadata for use by a custom ETW processing tool. The top four bits are reserved and must be set to zero (0).
                   */
  def addInt16(name: java.lang.String, value: scala.Double, format: LoggingFieldFormat, tags: scala.Double): scala.Unit = js.native
  /**
                   * Adds a 16-bit integer array field with the specified field name.
                   * @param name Name of the event field.
                   * @param value Value of the event field.
                   */
  def addInt16Array(name: java.lang.String, value: stdLib.Int16Array): scala.Unit = js.native
  /**
                   * Adds a 16-bit integer array field with the specified field name and format.
                   * @param name Name of the event field.
                   * @param value Value of the event field.
                   * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
                   */
  def addInt16Array(name: java.lang.String, value: stdLib.Int16Array, format: LoggingFieldFormat): scala.Unit = js.native
  /**
                   * Adds a 16-bit integer array field with the specified field name, format, and tags.
                   * @param name Name of the event field.
                   * @param value Value of the event field.
                   * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
                   * @param tags The user-defined tag for the event field. Specifies up to twenty-eight bits of user-defined field processing metadata for use by a custom ETW processing tool. The top four bits are reserved and must be set to zero (0).
                   */
  def addInt16Array(name: java.lang.String, value: stdLib.Int16Array, format: LoggingFieldFormat, tags: scala.Double): scala.Unit = js.native
  /**
                   * Adds a 32-bit integer array field with the specified field name.
                   * @param name Name of the event field.
                   * @param value Value of the event field.
                   */
  def addInt32(name: java.lang.String, value: scala.Double): scala.Unit = js.native
  /**
                   * Adds a 32-bit integer array field with the specified field name and format.
                   * @param name Name of the event field.
                   * @param value Value of the event field.
                   * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
                   */
  def addInt32(name: java.lang.String, value: scala.Double, format: LoggingFieldFormat): scala.Unit = js.native
  /**
                   * Adds a 32-bit integer array field with the specified field name, format, and tags.
                   * @param name Name of the event field.
                   * @param value The array values for the event field.
                   * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
                   * @param tags The user-defined tag for the event field. Specifies up to twenty-eight bits of user-defined field processing metadata for use by a custom ETW processing tool. The top four bits are reserved and must be set to zero (0).
                   */
  def addInt32(name: java.lang.String, value: scala.Double, format: LoggingFieldFormat, tags: scala.Double): scala.Unit = js.native
  /**
                   * Adds a 32-bit integer array field with the specified field name.
                   * @param name Name of the event field.
                   * @param value The array values for the event field.
                   */
  def addInt32Array(name: java.lang.String, value: stdLib.Int32Array): scala.Unit = js.native
  /**
                   * Adds a 32-bit integer array field with the specified field name and format.
                   * @param name Name of the event field.
                   * @param value The array values for the event field.
                   * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
                   */
  def addInt32Array(name: java.lang.String, value: stdLib.Int32Array, format: LoggingFieldFormat): scala.Unit = js.native
  /**
                   * Adds a 32-bit integer array field with the specified field name, format, and tags.
                   * @param name Name of the event field.
                   * @param value The array values for the event field.
                   * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
                   * @param tags The user-defined tag for the event field. Specifies up to twenty-eight bits of user-defined field processing metadata for use by a custom ETW processing tool. The top four bits are reserved and must be set to zero (0).
                   */
  def addInt32Array(name: java.lang.String, value: stdLib.Int32Array, format: LoggingFieldFormat, tags: scala.Double): scala.Unit = js.native
  /**
                   * Adds a 64-bit integer array field with the specified field name.
                   * @param name Name of the event field.
                   * @param value The array values for the event field.
                   */
  def addInt64(name: java.lang.String, value: scala.Double): scala.Unit = js.native
  /**
                   * Adds a 64-bit integer array field with the specified field name and format.
                   * @param name Name of the event field.
                   * @param value The array values for the event field.
                   * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
                   */
  def addInt64(name: java.lang.String, value: scala.Double, format: LoggingFieldFormat): scala.Unit = js.native
  /**
                   * Adds a 64-bit integer field with the specified field name, format, and tags.
                   * @param name Name of the event field.
                   * @param value The value for the event field.
                   * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
                   * @param tags The user-defined tag for the event field. Specifies up to twenty-eight bits of user-defined field processing metadata for use by a custom ETW processing tool. The top four bits are reserved and must be set to zero (0).
                   */
  def addInt64(name: java.lang.String, value: scala.Double, format: LoggingFieldFormat, tags: scala.Double): scala.Unit = js.native
  /**
                   * Adds a 64-bit integer array field with the specified field name.
                   * @param name Name of the event field.
                   * @param value The array values for the event field.
                   */
  def addInt64Array(name: java.lang.String, value: js.Array[scala.Double]): scala.Unit = js.native
  /**
                   * Adds a 64-bit integer array field with the specified field name and format.
                   * @param name Name of the event field.
                   * @param value The array values for the event field.
                   * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
                   */
  def addInt64Array(name: java.lang.String, value: js.Array[scala.Double], format: LoggingFieldFormat): scala.Unit = js.native
  /**
                   * Adds a 64-bit integer array field with the specified field name, format, and tags.
                   * @param name Name of the event field.
                   * @param value The array values for the event field.
                   * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
                   * @param tags The user-defined tag for the event field. Specifies up to twenty-eight bits of user-defined field processing metadata for use by a custom ETW processing tool. The top four bits are reserved and must be set to zero (0).
                   */
  def addInt64Array(
    name: java.lang.String,
    value: js.Array[scala.Double],
    format: LoggingFieldFormat,
    tags: scala.Double
  ): scala.Unit = js.native
  /**
                   * Adds a Point field with the specified name.
                   * @param name Name of the event field.
                   * @param value The value for the event field.
                   */
  def addPoint(name: java.lang.String, value: winrtDashUwpLib.WindowsNs.FoundationNs.Point): scala.Unit = js.native
  /**
                   * Adds a Point field with the specified name and format.
                   * @param name Name of the event field.
                   * @param value The value for the event field.
                   * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
                   */
  def addPoint(
    name: java.lang.String,
    value: winrtDashUwpLib.WindowsNs.FoundationNs.Point,
    format: LoggingFieldFormat
  ): scala.Unit = js.native
  /**
                   * Adds a Point field with the specified name, format, and tags.
                   * @param name Name of the event field.
                   * @param value The value for the event field.
                   * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
                   * @param tags The user-defined tag for the event field. Specifies up to twenty-eight bits of user-defined field processing metadata for use by a custom ETW processing tool. The top four bits are reserved and must be set to zero (0).
                   */
  def addPoint(
    name: java.lang.String,
    value: winrtDashUwpLib.WindowsNs.FoundationNs.Point,
    format: LoggingFieldFormat,
    tags: scala.Double
  ): scala.Unit = js.native
  /**
                   * Adds a Point array field with the specified field name.
                   * @param name Name of the event field.
                   * @param value The value for the event field.
                   */
  def addPointArray(name: java.lang.String, value: winrtDashUwpLib.WindowsNs.FoundationNs.Point): scala.Unit = js.native
  /**
                   * Adds a Point array field with the specified field name and format.
                   * @param name Name of the event field.
                   * @param value The value for the event field.
                   * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
                   */
  def addPointArray(
    name: java.lang.String,
    value: winrtDashUwpLib.WindowsNs.FoundationNs.Point,
    format: LoggingFieldFormat
  ): scala.Unit = js.native
  /**
                   * Adds a Point array field with the specified field name, format, and tags.
                   * @param name Name of the event field.
                   * @param value The value for the event field.
                   * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
                   * @param tags The user-defined tag for the event field. Specifies up to twenty-eight bits of user-defined field processing metadata for use by a custom ETW processing tool. The top four bits are reserved and must be set to zero (0).
                   */
  def addPointArray(
    name: java.lang.String,
    value: winrtDashUwpLib.WindowsNs.FoundationNs.Point,
    format: LoggingFieldFormat,
    tags: scala.Double
  ): scala.Unit = js.native
  /**
                   * Adds a Rect field with the specified field name.
                   * @param name Name of the event field.
                   * @param value The value for the event field.
                   */
  def addRect(name: java.lang.String, value: winrtDashUwpLib.WindowsNs.FoundationNs.Rect): scala.Unit = js.native
  /**
                   * Adds a Rect field with the specified field name, and format.
                   * @param name Name of the event field.
                   * @param value The value for the event field.
                   * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
                   */
  def addRect(
    name: java.lang.String,
    value: winrtDashUwpLib.WindowsNs.FoundationNs.Rect,
    format: LoggingFieldFormat
  ): scala.Unit = js.native
  /**
                   * Adds a Rect field with the specified field name, format, and tags.
                   * @param name Name of the event field.
                   * @param value The value for the event field.
                   * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
                   * @param tags The user-defined tag for the event field. Specifies up to twenty-eight bits of user-defined field processing metadata for use by a custom ETW processing tool. The top four bits are reserved and must be set to zero (0).
                   */
  def addRect(
    name: java.lang.String,
    value: winrtDashUwpLib.WindowsNs.FoundationNs.Rect,
    format: LoggingFieldFormat,
    tags: scala.Double
  ): scala.Unit = js.native
  /**
                   * Adds a Rect array field with the specified field name.
                   * @param name Name of the event field.
                   * @param value The value for the event field.
                   */
  def addRectArray(name: java.lang.String, value: winrtDashUwpLib.WindowsNs.FoundationNs.Rect): scala.Unit = js.native
  /**
                   * Adds a Rect array field with the specified field name and format.
                   * @param name Name of the event field.
                   * @param value The value for the event field.
                   * @param format The value for the event field.
                   */
  def addRectArray(
    name: java.lang.String,
    value: winrtDashUwpLib.WindowsNs.FoundationNs.Rect,
    format: LoggingFieldFormat
  ): scala.Unit = js.native
  /**
                   * Adds a Rect array field with the specified field name, format, and tags.
                   * @param name Name of the event field.
                   * @param value The value for the event field.
                   * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
                   * @param tags The user-defined tag for the event field. Specifies up to twenty-eight bits of user-defined field processing metadata for use by a custom ETW processing tool. The top four bits are reserved and must be set to zero (0).
                   */
  def addRectArray(
    name: java.lang.String,
    value: winrtDashUwpLib.WindowsNs.FoundationNs.Rect,
    format: LoggingFieldFormat,
    tags: scala.Double
  ): scala.Unit = js.native
  /**
                   * Adds a Single field with the specified field name.
                   * @param name Name of the event field.
                   * @param value The value for the event field.
                   */
  def addSingle(name: java.lang.String, value: scala.Double): scala.Unit = js.native
  /**
                   * Adds a Single field with the specified field name and format.
                   * @param name Name of the event field.
                   * @param value The value for the event field.
                   * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
                   */
  def addSingle(name: java.lang.String, value: scala.Double, format: LoggingFieldFormat): scala.Unit = js.native
  /**
                   * Adds a Single field with the specified field name, format, and tags.
                   * @param name Name of the event field.
                   * @param value The value for the event field.
                   * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
                   * @param tags The user-defined tag for the event field. Specifies up to twenty-eight bits of user-defined field processing metadata for use by a custom ETW processing tool. The top four bits are reserved and must be set to zero (0).
                   */
  def addSingle(name: java.lang.String, value: scala.Double, format: LoggingFieldFormat, tags: scala.Double): scala.Unit = js.native
  /**
                   * Adds a Single array field with the specified field name.
                   * @param name Name of the event field.
                   * @param value The value for the event field.
                   */
  def addSingleArray(name: java.lang.String, value: stdLib.Float32Array): scala.Unit = js.native
  /**
                   * Adds a Single array field with the specified field name and format.
                   * @param name Name of the event field.
                   * @param value The value for the event field.
                   * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
                   */
  def addSingleArray(name: java.lang.String, value: stdLib.Float32Array, format: LoggingFieldFormat): scala.Unit = js.native
  /**
                   * Adds a Single array field with the specified field name, format, and tags.
                   * @param name Name of the event field.
                   * @param value The value for the event field.
                   * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
                   * @param tags The user-defined tag for the event field. Specifies up to twenty-eight bits of user-defined field processing metadata for use by a custom ETW processing tool. The top four bits are reserved and must be set to zero (0).
                   */
  def addSingleArray(name: java.lang.String, value: stdLib.Float32Array, format: LoggingFieldFormat, tags: scala.Double): scala.Unit = js.native
  /**
                   * Adds a Size field with the specified field name.
                   * @param name Name of the event field.
                   * @param value The value for the event field.
                   */
  def addSize(name: java.lang.String, value: winrtDashUwpLib.WindowsNs.FoundationNs.Size): scala.Unit = js.native
  /**
                   * Adds a Size field with the specified field name and format.
                   * @param name Name of the event field.
                   * @param value The value for the event field.
                   * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
                   */
  def addSize(
    name: java.lang.String,
    value: winrtDashUwpLib.WindowsNs.FoundationNs.Size,
    format: LoggingFieldFormat
  ): scala.Unit = js.native
  /**
                   * Adds a Size field with the specified field name, format, and tags.
                   * @param name Name of the event field.
                   * @param value The value for the event field.
                   * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
                   * @param tags The user-defined tag for the event field. Specifies up to twenty-eight bits of user-defined field processing metadata for use by a custom ETW processing tool. The top four bits are reserved and must be set to zero (0).
                   */
  def addSize(
    name: java.lang.String,
    value: winrtDashUwpLib.WindowsNs.FoundationNs.Size,
    format: LoggingFieldFormat,
    tags: scala.Double
  ): scala.Unit = js.native
  /**
                   * Adds a Size array field with the specified field name.
                   * @param name The name of the field.
                   * @param value The value for the event field.
                   */
  def addSizeArray(name: java.lang.String, value: winrtDashUwpLib.WindowsNs.FoundationNs.Size): scala.Unit = js.native
  /**
                   * Adds a Size array field with the specified field name and format.
                   * @param name Name of the event field.
                   * @param value The value for the event field.
                   * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
                   */
  def addSizeArray(
    name: java.lang.String,
    value: winrtDashUwpLib.WindowsNs.FoundationNs.Size,
    format: LoggingFieldFormat
  ): scala.Unit = js.native
  /**
                   * Adds a Size array field with the specified field name, format, and tags.
                   * @param name Name of the event field.
                   * @param value The value for the event field.
                   * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
                   * @param tags The user-defined tag for the event field. Specifies up to twenty-eight bits of user-defined field processing metadata for use by a custom ETW processing tool. The top four bits are reserved and must be set to zero (0).
                   */
  def addSizeArray(
    name: java.lang.String,
    value: winrtDashUwpLib.WindowsNs.FoundationNs.Size,
    format: LoggingFieldFormat,
    tags: scala.Double
  ): scala.Unit = js.native
  /**
                   * Adds a String field with the specified field name.
                   * @param name Name of the event field.
                   * @param value The value for the event field.
                   */
  def addString(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
  /**
                   * Adds a String field with the specified field name and format.
                   * @param name Name of the event field.
                   * @param value The value for the event field.
                   * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
                   */
  def addString(name: java.lang.String, value: java.lang.String, format: LoggingFieldFormat): scala.Unit = js.native
  /**
                   * Adds a String field with the specified field name, format, and tags.
                   * @param name Name of the event field.
                   * @param value The value for the event field.
                   * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
                   * @param tags The user-defined tag for the event field. Specifies up to twenty-eight bits of user-defined field processing metadata for use by a custom ETW processing tool. The top four bits are reserved and must be set to zero (0).
                   */
  def addString(name: java.lang.String, value: java.lang.String, format: LoggingFieldFormat, tags: scala.Double): scala.Unit = js.native
  /**
                   * Adds a String array field with the specified field name.
                   * @param name Name of the event field.
                   * @param value The value for the event field.
                   */
  def addStringArray(name: java.lang.String, value: js.Array[java.lang.String]): scala.Unit = js.native
  /**
                   * Adds a String array field with the specified field name and format.
                   * @param name Name of the event field.
                   * @param value The value for the event field.
                   * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
                   */
  def addStringArray(name: java.lang.String, value: js.Array[java.lang.String], format: LoggingFieldFormat): scala.Unit = js.native
  /**
                   * Adds a String array field with the specified field name, format, and tags.
                   * @param name Name of the event field.
                   * @param value The value for the event field.
                   * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
                   * @param tags The user-defined tag for the event field. Specifies up to twenty-eight bits of user-defined field processing metadata for use by a custom ETW processing tool. The top four bits are reserved and must be set to zero (0).
                   */
  def addStringArray(
    name: java.lang.String,
    value: js.Array[java.lang.String],
    format: LoggingFieldFormat,
    tags: scala.Double
  ): scala.Unit = js.native
  /**
                   * Adds a time span field with the specified field name.
                   * @param name Name of the event field.
                   * @param value The value for the event field.
                   */
  def addTimeSpan(name: java.lang.String, value: scala.Double): scala.Unit = js.native
  /**
                   * Adds a time span field with the specified field name and format.
                   * @param name Name of the event field.
                   * @param value The value for the event field.
                   * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
                   */
  def addTimeSpan(name: java.lang.String, value: scala.Double, format: LoggingFieldFormat): scala.Unit = js.native
  /**
                   * Adds a time span field with the specified field name, format, and tags.
                   * @param name Name of the event field.
                   * @param value The value for the event field.
                   * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
                   * @param tags The user-defined tag for the event field. Specifies up to twenty-eight bits of user-defined field processing metadata for use by a custom ETW processing tool. The top four bits are reserved and must be set to zero (0).
                   */
  def addTimeSpan(name: java.lang.String, value: scala.Double, format: LoggingFieldFormat, tags: scala.Double): scala.Unit = js.native
  /**
                   * Adds a time span array field with the specified field name.
                   * @param name Name of the event field.
                   * @param value The value for the event field.
                   */
  def addTimeSpanArray(name: java.lang.String, value: js.Array[scala.Double]): scala.Unit = js.native
  /**
                   * Adds a time span array field with the specified field name and format.
                   * @param name Name of the event field.
                   * @param value The value for the event field.
                   * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
                   */
  def addTimeSpanArray(name: java.lang.String, value: js.Array[scala.Double], format: LoggingFieldFormat): scala.Unit = js.native
  /**
                   * Adds a time span array field with the specified field name, format, and tags.
                   * @param name Name of the event field.
                   * @param value The value for the event field.
                   * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
                   * @param tags The user-defined tag for the event field. Specifies up to twenty-eight bits of user-defined field processing metadata for use by a custom ETW processing tool. The top four bits are reserved and must be set to zero (0).
                   */
  def addTimeSpanArray(
    name: java.lang.String,
    value: js.Array[scala.Double],
    format: LoggingFieldFormat,
    tags: scala.Double
  ): scala.Unit = js.native
  /**
                   * Adds a 16-bit unsigned integer field with the specified field name.
                   * @param name Name of the event field.
                   * @param value The value for the event field.
                   */
  def addUInt16(name: java.lang.String, value: scala.Double): scala.Unit = js.native
  /**
                   * Adds a 16-bit unsigned integer field with the specified field name and format.
                   * @param name Name of the event field.
                   * @param value The value for the event field.
                   * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
                   */
  def addUInt16(name: java.lang.String, value: scala.Double, format: LoggingFieldFormat): scala.Unit = js.native
  /**
                   * Adds a 16-bit unsigned integer field with the specified field name, format, and tags.
                   * @param name Name of the event field.
                   * @param value The value for the event field.
                   * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
                   * @param tags The user-defined tag for the event field. Specifies up to twenty-eight bits of user-defined field processing metadata for use by a custom ETW processing tool. The top four bits are reserved and must be set to zero (0).
                   */
  def addUInt16(name: java.lang.String, value: scala.Double, format: LoggingFieldFormat, tags: scala.Double): scala.Unit = js.native
  /**
                   * Adds a16-bit unsigned integer field with the specified field name.
                   * @param name Name of the event field.
                   * @param value The value for the event field. The default format for the array is binary. See the remarks section for other formats that may be specified.
                   */
  def addUInt16Array(name: java.lang.String, value: stdLib.Uint16Array): scala.Unit = js.native
  /**
                   * Adds a 16-bit unsigned integer array field with the specified field name and format.
                   * @param name Name of the event field.
                   * @param value The value for the event field. The default format for the array is binary. See the remarks section for other formats that may be specified.
                   * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
                   */
  def addUInt16Array(name: java.lang.String, value: stdLib.Uint16Array, format: LoggingFieldFormat): scala.Unit = js.native
  /**
                   * Adds a 16-bit unsigned integer array field with the specified field name, format, and tags.
                   * @param name Name of the event field.
                   * @param value The value for the event field. The default format for the array is binary. See the remarks section for other formats that may be specified.
                   * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
                   * @param tags The user-defined tag for the event field. Specifies up to twenty-eight bits of user-defined field processing metadata for use by a custom ETW processing tool. The top four bits are reserved and must be set to zero (0).
                   */
  def addUInt16Array(name: java.lang.String, value: stdLib.Uint16Array, format: LoggingFieldFormat, tags: scala.Double): scala.Unit = js.native
  /**
                   * Adds a 32-bit unsigned integer field with the specified field name.
                   * @param name Name of the event field.
                   * @param value The value for the event field.
                   */
  def addUInt32(name: java.lang.String, value: scala.Double): scala.Unit = js.native
  /**
                   * Adds a 32-bit unsigned integer field with the specified field name and format.
                   * @param name Name of the event field.
                   * @param value The value for the event field.
                   * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
                   */
  def addUInt32(name: java.lang.String, value: scala.Double, format: LoggingFieldFormat): scala.Unit = js.native
  /**
                   * Adds a 32-bit unsigned integer field with the specified field name, format, and tags.
                   * @param name Name of the event field.
                   * @param value The value for the event field.
                   * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
                   * @param tags The user-defined tag for the event field. Specifies up to twenty-eight bits of user-defined field processing metadata for use by a custom ETW processing tool. The top four bits are reserved and must be set to zero (0).
                   */
  def addUInt32(name: java.lang.String, value: scala.Double, format: LoggingFieldFormat, tags: scala.Double): scala.Unit = js.native
  /**
                   * Adds a 32-bit unsigned integer array field with the specified field name.
                   * @param name Name of the event field.
                   * @param value The value for the event field.
                   */
  def addUInt32Array(name: java.lang.String, value: stdLib.Uint32Array): scala.Unit = js.native
  /**
                   * Adds a 32-bit unsigned integer array field with the specified field name and format.
                   * @param name Name of the event field.
                   * @param value The value for the event field.
                   * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
                   */
  def addUInt32Array(name: java.lang.String, value: stdLib.Uint32Array, format: LoggingFieldFormat): scala.Unit = js.native
  /**
                   * Adds a 32-bit unsigned integer array field with the specified field name, format, and tags.
                   * @param name Name of the event field.
                   * @param value The value for the event field.
                   * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
                   * @param tags The user-defined tag for the event field. Specifies up to twenty-eight bits of user-defined field processing metadata for use by a custom ETW processing tool. The top four bits are reserved and must be set to zero (0).
                   */
  def addUInt32Array(name: java.lang.String, value: stdLib.Uint32Array, format: LoggingFieldFormat, tags: scala.Double): scala.Unit = js.native
  /**
                   * Adds a 64-bit unsigned integer field with the specified field name.
                   * @param name Name of the event field.
                   * @param value The value for the event field.
                   */
  def addUInt64(name: java.lang.String, value: scala.Double): scala.Unit = js.native
  /**
                   * Adds a 64-bit unsigned integer field with the specified field name and format.
                   * @param name Name of the event field.
                   * @param value The value for the event field.
                   * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
                   */
  def addUInt64(name: java.lang.String, value: scala.Double, format: LoggingFieldFormat): scala.Unit = js.native
  /**
                   * Adds a 64-bit unsigned integer field with the specified field name, format, and tags.
                   * @param name Name of the event field.
                   * @param value The value for the event field.
                   * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
                   * @param tags The user-defined tag for the event field. Specifies up to twenty-eight bits of user-defined field processing metadata for use by a custom ETW processing tool. The top four bits are reserved and must be set to zero (0).
                   */
  def addUInt64(name: java.lang.String, value: scala.Double, format: LoggingFieldFormat, tags: scala.Double): scala.Unit = js.native
  /**
                   * Adds a 64-bit unsigned integer array field with the specified field name.
                   * @param name Name of the event field.
                   * @param value The value for the event field.
                   */
  def addUInt64Array(name: java.lang.String, value: js.Array[scala.Double]): scala.Unit = js.native
  /**
                   * Adds a 64-bit unsigned integer array field with the specified field name and format.
                   * @param name Name of the event field.
                   * @param value The value for the event field.
                   * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
                   */
  def addUInt64Array(name: java.lang.String, value: js.Array[scala.Double], format: LoggingFieldFormat): scala.Unit = js.native
  /**
                   * Adds a 64-bit unsigned integer array field with the specified field name, format, and tags.
                   * @param name Name of the event field.
                   * @param value The value for the event field.
                   * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
                   * @param tags The user-defined tag for the event field. Specifies up to twenty-eight bits of user-defined field processing metadata for use by a custom ETW processing tool. The top four bits are reserved and must be set to zero (0).
                   */
  def addUInt64Array(
    name: java.lang.String,
    value: js.Array[scala.Double],
    format: LoggingFieldFormat,
    tags: scala.Double
  ): scala.Unit = js.native
  /**
                   * Adds an 8-bit unsigned integer field with the specified field name.
                   * @param name Name of the event field.
                   * @param value The value for the event field.
                   */
  def addUInt8(name: java.lang.String, value: scala.Double): scala.Unit = js.native
  /**
                   * Adds an 8-bit unsigned integer field with the specified field name and format.
                   * @param name Name of the event field.
                   * @param value The value for the event field.
                   * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
                   */
  def addUInt8(name: java.lang.String, value: scala.Double, format: LoggingFieldFormat): scala.Unit = js.native
  /**
                   * Adds an 8-bit unsigned integer field with the specified field name, format, and tags.
                   * @param name Name of the event field.
                   * @param value The value for the event field.
                   * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
                   * @param tags The user-defined tag for the event field. Specifies up to twenty-eight bits of user-defined field processing metadata for use by a custom ETW processing tool. The top four bits are reserved and must be set to zero (0).
                   */
  def addUInt8(name: java.lang.String, value: scala.Double, format: LoggingFieldFormat, tags: scala.Double): scala.Unit = js.native
  /**
                   * Adds an 8-bit unsigned integer array field with the specified field name.
                   * @param name Name of the event field.
                   * @param value The value for the event field. The format for the array is binary.
                   */
  def addUInt8Array(name: java.lang.String, value: js.Array[scala.Double]): scala.Unit = js.native
  /**
                   * Adds an 8-bit unsigned integer array field with the specified field name and format.
                   * @param name Name of the event field.
                   * @param value The value for the event field. The default format for the array is binary. See the remarks section for other formats that may be specified.
                   * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
                   */
  def addUInt8Array(name: java.lang.String, value: js.Array[scala.Double], format: LoggingFieldFormat): scala.Unit = js.native
  /**
                   * Adds an 8-bit unsigned integer array field with the specified field name, format, and tags.
                   * @param name Name of the event field.
                   * @param value The value for the event field. The default format for the array is binary. See the remarks section for other formats that may be specified.
                   * @param format The format of the event field. Specifies an optional formatting hint that may be used by Event Tracing for Windows (ETW) tools.
                   * @param tags The user-defined tag for the event field. Specifies up to twenty-eight bits of user-defined field processing metadata for use by a custom ETW processing tool. The top four bits are reserved and must be set to zero (0).
                   */
  def addUInt8Array(
    name: java.lang.String,
    value: js.Array[scala.Double],
    format: LoggingFieldFormat,
    tags: scala.Double
  ): scala.Unit = js.native
  /**
                   * Begins a new structured field with the specified field name.
                   * @param name Name of the structured field.
                   */
  def beginStruct(name: java.lang.String): scala.Unit = js.native
  /**
                   * Begins a new structured field with the specified field name and tags.
                   * @param name Name of the structured field.
                   * @param tags Specifies up to twenty-eight bits of user-defined field metadata. The top four bits are reserved and must be set to zero (0).
                   */
  def beginStruct(name: java.lang.String, tags: scala.Double): scala.Unit = js.native
  /** Removes all fields stored in the object and resets the object to its newly-constructed state. */
  def clear(): scala.Unit = js.native
  /** Ends a structured field. */
  def endStruct(): scala.Unit = js.native
}

