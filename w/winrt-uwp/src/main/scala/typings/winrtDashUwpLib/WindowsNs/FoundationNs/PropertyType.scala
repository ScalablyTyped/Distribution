package typings
package winrtDashUwpLib.WindowsNs.FoundationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PropertyType extends js.Object

/** Specifies property value types. */
@JSGlobal("Windows.Foundation.PropertyType")
@js.native
object PropertyType extends js.Object {
  /** A value that can be only true or false. */
  @js.native
  sealed trait boolean
    extends winrtDashUwpLib.WindowsNs.FoundationNs.PropertyType
  
  /** An array of Boolean values. */
  @js.native
  sealed trait booleanArray
    extends winrtDashUwpLib.WindowsNs.FoundationNs.PropertyType
  
  /** An unsigned 16-bit (2-byte) code point. */
  @js.native
  sealed trait char16
    extends winrtDashUwpLib.WindowsNs.FoundationNs.PropertyType
  
  /** An array of Char values. */
  @js.native
  sealed trait char16Array
    extends winrtDashUwpLib.WindowsNs.FoundationNs.PropertyType
  
  /** An instant in time, typically expressed as a date and time of day. */
  @js.native
  sealed trait dateTime
    extends winrtDashUwpLib.WindowsNs.FoundationNs.PropertyType
  
  /** An array of DateTime values. */
  @js.native
  sealed trait dateTimeArray
    extends winrtDashUwpLib.WindowsNs.FoundationNs.PropertyType
  
  /** A signed 64-bit (8-byte) floating-point number. */
  @js.native
  sealed trait double
    extends winrtDashUwpLib.WindowsNs.FoundationNs.PropertyType
  
  /** An array of Double values. */
  @js.native
  sealed trait doubleArray
    extends winrtDashUwpLib.WindowsNs.FoundationNs.PropertyType
  
  /** No type is specified. */
  @js.native
  sealed trait empty
    extends winrtDashUwpLib.WindowsNs.FoundationNs.PropertyType
  
  /** A globally unique identifier. */
  @js.native
  sealed trait guid
    extends winrtDashUwpLib.WindowsNs.FoundationNs.PropertyType
  
  /** An array of Guid values. */
  @js.native
  sealed trait guidArray
    extends winrtDashUwpLib.WindowsNs.FoundationNs.PropertyType
  
  /** An object implementing the IInspectable interface. */
  @js.native
  sealed trait inspectable
    extends winrtDashUwpLib.WindowsNs.FoundationNs.PropertyType
  
  /** An array of Inspectable values. */
  @js.native
  sealed trait inspectableArray
    extends winrtDashUwpLib.WindowsNs.FoundationNs.PropertyType
  
  /** A signed 16-bit (2-byte) integer. */
  @js.native
  sealed trait int16
    extends winrtDashUwpLib.WindowsNs.FoundationNs.PropertyType
  
  /** An array of Int16 values. */
  @js.native
  sealed trait int16Array
    extends winrtDashUwpLib.WindowsNs.FoundationNs.PropertyType
  
  /** A signed 32-bit (4-byte) integer. */
  @js.native
  sealed trait int32
    extends winrtDashUwpLib.WindowsNs.FoundationNs.PropertyType
  
  /** An array of Int32 values. */
  @js.native
  sealed trait int32Array
    extends winrtDashUwpLib.WindowsNs.FoundationNs.PropertyType
  
  /** A signed 64-bit (8-byte) integer. */
  @js.native
  sealed trait int64
    extends winrtDashUwpLib.WindowsNs.FoundationNs.PropertyType
  
  /** An array of Int64 values. */
  @js.native
  sealed trait int64Array
    extends winrtDashUwpLib.WindowsNs.FoundationNs.PropertyType
  
  /** A type not specified in this enumeration. */
  @js.native
  sealed trait otherType
    extends winrtDashUwpLib.WindowsNs.FoundationNs.PropertyType
  
  /** An array of an unspecified type. */
  @js.native
  sealed trait otherTypeArray
    extends winrtDashUwpLib.WindowsNs.FoundationNs.PropertyType
  
  /** An ordered pair of floating-point x- and y-coordinates that defines a point in a two-dimensional plane. */
  @js.native
  sealed trait point
    extends winrtDashUwpLib.WindowsNs.FoundationNs.PropertyType
  
  /** An array of Point structures. */
  @js.native
  sealed trait pointArray
    extends winrtDashUwpLib.WindowsNs.FoundationNs.PropertyType
  
  /** A set of four floating-point numbers that represent the location and size of a rectangle. */
  @js.native
  sealed trait rect
    extends winrtDashUwpLib.WindowsNs.FoundationNs.PropertyType
  
  /** An array of Rect structures. */
  @js.native
  sealed trait rectArray
    extends winrtDashUwpLib.WindowsNs.FoundationNs.PropertyType
  
  /** A signed 32-bit (4-byte) floating-point number. */
  @js.native
  sealed trait single
    extends winrtDashUwpLib.WindowsNs.FoundationNs.PropertyType
  
  /** An array of Single values. */
  @js.native
  sealed trait singleArray
    extends winrtDashUwpLib.WindowsNs.FoundationNs.PropertyType
  
  /** An ordered pair of float-point numbers that specify a height and width. */
  @js.native
  sealed trait size
    extends winrtDashUwpLib.WindowsNs.FoundationNs.PropertyType
  
  /** An array of Size structures. */
  @js.native
  sealed trait sizeArray
    extends winrtDashUwpLib.WindowsNs.FoundationNs.PropertyType
  
  /** A Windows Runtime HSTRING . */
  @js.native
  sealed trait string
    extends winrtDashUwpLib.WindowsNs.FoundationNs.PropertyType
  
  /** An array of String values. */
  @js.native
  sealed trait stringArray
    extends winrtDashUwpLib.WindowsNs.FoundationNs.PropertyType
  
  /** A time interval. */
  @js.native
  sealed trait timeSpan
    extends winrtDashUwpLib.WindowsNs.FoundationNs.PropertyType
  
  /** An array of TimeSpan values. */
  @js.native
  sealed trait timeSpanArray
    extends winrtDashUwpLib.WindowsNs.FoundationNs.PropertyType
  
  /** An unsigned 16-bit (2-byte) integer. */
  @js.native
  sealed trait uint16
    extends winrtDashUwpLib.WindowsNs.FoundationNs.PropertyType
  
  /** An array of UInt16 values. */
  @js.native
  sealed trait uint16Array
    extends winrtDashUwpLib.WindowsNs.FoundationNs.PropertyType
  
  /** An unsigned 32-bit (4-byte) integer. */
  @js.native
  sealed trait uint32
    extends winrtDashUwpLib.WindowsNs.FoundationNs.PropertyType
  
  /** An array of UInt32 values. */
  @js.native
  sealed trait uint32Array
    extends winrtDashUwpLib.WindowsNs.FoundationNs.PropertyType
  
  /** An unsigned 64-bit (8-byte) integer. */
  @js.native
  sealed trait uint64
    extends winrtDashUwpLib.WindowsNs.FoundationNs.PropertyType
  
  /** An array of UInt64 values. */
  @js.native
  sealed trait uint64Array
    extends winrtDashUwpLib.WindowsNs.FoundationNs.PropertyType
  
  /** A byte. */
  @js.native
  sealed trait uint8
    extends winrtDashUwpLib.WindowsNs.FoundationNs.PropertyType
  
  /** An array of Byte values. */
  @js.native
  sealed trait uint8Array
    extends winrtDashUwpLib.WindowsNs.FoundationNs.PropertyType
  
  val boolean: boolean with java.lang.String = js.native
  val booleanArray: booleanArray with java.lang.String = js.native
  val char16: char16 with java.lang.String = js.native
  val char16Array: char16Array with java.lang.String = js.native
  val dateTime: dateTime with java.lang.String = js.native
  val dateTimeArray: dateTimeArray with java.lang.String = js.native
  val double: double with java.lang.String = js.native
  val doubleArray: doubleArray with java.lang.String = js.native
  val empty: empty with java.lang.String = js.native
  val guid: guid with java.lang.String = js.native
  val guidArray: guidArray with java.lang.String = js.native
  val inspectable: inspectable with java.lang.String = js.native
  val inspectableArray: inspectableArray with java.lang.String = js.native
  val int16: int16 with java.lang.String = js.native
  val int16Array: int16Array with java.lang.String = js.native
  val int32: int32 with java.lang.String = js.native
  val int32Array: int32Array with java.lang.String = js.native
  val int64: int64 with java.lang.String = js.native
  val int64Array: int64Array with java.lang.String = js.native
  val otherType: otherType with java.lang.String = js.native
  val otherTypeArray: otherTypeArray with java.lang.String = js.native
  val point: point with java.lang.String = js.native
  val pointArray: pointArray with java.lang.String = js.native
  val rect: rect with java.lang.String = js.native
  val rectArray: rectArray with java.lang.String = js.native
  val single: single with java.lang.String = js.native
  val singleArray: singleArray with java.lang.String = js.native
  val size: size with java.lang.String = js.native
  val sizeArray: sizeArray with java.lang.String = js.native
  val string: string with java.lang.String = js.native
  val stringArray: stringArray with java.lang.String = js.native
  val timeSpan: timeSpan with java.lang.String = js.native
  val timeSpanArray: timeSpanArray with java.lang.String = js.native
  val uint16: uint16 with java.lang.String = js.native
  val uint16Array: uint16Array with java.lang.String = js.native
  val uint32: uint32 with java.lang.String = js.native
  val uint32Array: uint32Array with java.lang.String = js.native
  val uint64: uint64 with java.lang.String = js.native
  val uint64Array: uint64Array with java.lang.String = js.native
  val uint8: uint8 with java.lang.String = js.native
  val uint8Array: uint8Array with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtDashUwpLib.WindowsNs.FoundationNs.PropertyType with java.lang.String] = js.native
}

