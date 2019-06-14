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
  
  /* 11 */ val boolean: boolean with scala.Double = js.native
  /* 31 */ val booleanArray: booleanArray with scala.Double = js.native
  /* 10 */ val char16: char16 with scala.Double = js.native
  /* 30 */ val char16Array: char16Array with scala.Double = js.native
  /* 14 */ val dateTime: dateTime with scala.Double = js.native
  /* 34 */ val dateTimeArray: dateTimeArray with scala.Double = js.native
  /* 9 */ val double: double with scala.Double = js.native
  /* 29 */ val doubleArray: doubleArray with scala.Double = js.native
  /* 0 */ val empty: empty with scala.Double = js.native
  /* 16 */ val guid: guid with scala.Double = js.native
  /* 36 */ val guidArray: guidArray with scala.Double = js.native
  /* 13 */ val inspectable: inspectable with scala.Double = js.native
  /* 33 */ val inspectableArray: inspectableArray with scala.Double = js.native
  /* 2 */ val int16: int16 with scala.Double = js.native
  /* 22 */ val int16Array: int16Array with scala.Double = js.native
  /* 4 */ val int32: int32 with scala.Double = js.native
  /* 24 */ val int32Array: int32Array with scala.Double = js.native
  /* 6 */ val int64: int64 with scala.Double = js.native
  /* 26 */ val int64Array: int64Array with scala.Double = js.native
  /* 20 */ val otherType: otherType with scala.Double = js.native
  /* 40 */ val otherTypeArray: otherTypeArray with scala.Double = js.native
  /* 17 */ val point: point with scala.Double = js.native
  /* 37 */ val pointArray: pointArray with scala.Double = js.native
  /* 19 */ val rect: rect with scala.Double = js.native
  /* 39 */ val rectArray: rectArray with scala.Double = js.native
  /* 8 */ val single: single with scala.Double = js.native
  /* 28 */ val singleArray: singleArray with scala.Double = js.native
  /* 18 */ val size: size with scala.Double = js.native
  /* 38 */ val sizeArray: sizeArray with scala.Double = js.native
  /* 12 */ val string: string with scala.Double = js.native
  /* 32 */ val stringArray: stringArray with scala.Double = js.native
  /* 15 */ val timeSpan: timeSpan with scala.Double = js.native
  /* 35 */ val timeSpanArray: timeSpanArray with scala.Double = js.native
  /* 3 */ val uint16: uint16 with scala.Double = js.native
  /* 23 */ val uint16Array: uint16Array with scala.Double = js.native
  /* 5 */ val uint32: uint32 with scala.Double = js.native
  /* 25 */ val uint32Array: uint32Array with scala.Double = js.native
  /* 7 */ val uint64: uint64 with scala.Double = js.native
  /* 27 */ val uint64Array: uint64Array with scala.Double = js.native
  /* 1 */ val uint8: uint8 with scala.Double = js.native
  /* 21 */ val uint8Array: uint8Array with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.FoundationNs.PropertyType with scala.Double] = js.native
}

