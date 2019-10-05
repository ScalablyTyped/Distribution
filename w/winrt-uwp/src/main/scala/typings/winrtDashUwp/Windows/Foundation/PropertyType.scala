package typings.winrtDashUwp.Windows.Foundation

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
  sealed trait boolean extends PropertyType
  
  /** An array of Boolean values. */
  @js.native
  sealed trait booleanArray extends PropertyType
  
  /** An unsigned 16-bit (2-byte) code point. */
  @js.native
  sealed trait char16 extends PropertyType
  
  /** An array of Char values. */
  @js.native
  sealed trait char16Array extends PropertyType
  
  /** An instant in time, typically expressed as a date and time of day. */
  @js.native
  sealed trait dateTime extends PropertyType
  
  /** An array of DateTime values. */
  @js.native
  sealed trait dateTimeArray extends PropertyType
  
  /** A signed 64-bit (8-byte) floating-point number. */
  @js.native
  sealed trait double extends PropertyType
  
  /** An array of Double values. */
  @js.native
  sealed trait doubleArray extends PropertyType
  
  /** No type is specified. */
  @js.native
  sealed trait empty extends PropertyType
  
  /** A globally unique identifier. */
  @js.native
  sealed trait guid extends PropertyType
  
  /** An array of Guid values. */
  @js.native
  sealed trait guidArray extends PropertyType
  
  /** An object implementing the IInspectable interface. */
  @js.native
  sealed trait inspectable extends PropertyType
  
  /** An array of Inspectable values. */
  @js.native
  sealed trait inspectableArray extends PropertyType
  
  /** A signed 16-bit (2-byte) integer. */
  @js.native
  sealed trait int16 extends PropertyType
  
  /** An array of Int16 values. */
  @js.native
  sealed trait int16Array extends PropertyType
  
  /** A signed 32-bit (4-byte) integer. */
  @js.native
  sealed trait int32 extends PropertyType
  
  /** An array of Int32 values. */
  @js.native
  sealed trait int32Array extends PropertyType
  
  /** A signed 64-bit (8-byte) integer. */
  @js.native
  sealed trait int64 extends PropertyType
  
  /** An array of Int64 values. */
  @js.native
  sealed trait int64Array extends PropertyType
  
  /** A type not specified in this enumeration. */
  @js.native
  sealed trait otherType extends PropertyType
  
  /** An array of an unspecified type. */
  @js.native
  sealed trait otherTypeArray extends PropertyType
  
  /** An ordered pair of floating-point x- and y-coordinates that defines a point in a two-dimensional plane. */
  @js.native
  sealed trait point extends PropertyType
  
  /** An array of Point structures. */
  @js.native
  sealed trait pointArray extends PropertyType
  
  /** A set of four floating-point numbers that represent the location and size of a rectangle. */
  @js.native
  sealed trait rect extends PropertyType
  
  /** An array of Rect structures. */
  @js.native
  sealed trait rectArray extends PropertyType
  
  /** A signed 32-bit (4-byte) floating-point number. */
  @js.native
  sealed trait single extends PropertyType
  
  /** An array of Single values. */
  @js.native
  sealed trait singleArray extends PropertyType
  
  /** An ordered pair of float-point numbers that specify a height and width. */
  @js.native
  sealed trait size extends PropertyType
  
  /** An array of Size structures. */
  @js.native
  sealed trait sizeArray extends PropertyType
  
  /** A Windows Runtime HSTRING . */
  @js.native
  sealed trait string extends PropertyType
  
  /** An array of String values. */
  @js.native
  sealed trait stringArray extends PropertyType
  
  /** A time interval. */
  @js.native
  sealed trait timeSpan extends PropertyType
  
  /** An array of TimeSpan values. */
  @js.native
  sealed trait timeSpanArray extends PropertyType
  
  /** An unsigned 16-bit (2-byte) integer. */
  @js.native
  sealed trait uint16 extends PropertyType
  
  /** An array of UInt16 values. */
  @js.native
  sealed trait uint16Array extends PropertyType
  
  /** An unsigned 32-bit (4-byte) integer. */
  @js.native
  sealed trait uint32 extends PropertyType
  
  /** An array of UInt32 values. */
  @js.native
  sealed trait uint32Array extends PropertyType
  
  /** An unsigned 64-bit (8-byte) integer. */
  @js.native
  sealed trait uint64 extends PropertyType
  
  /** An array of UInt64 values. */
  @js.native
  sealed trait uint64Array extends PropertyType
  
  /** A byte. */
  @js.native
  sealed trait uint8 extends PropertyType
  
  /** An array of Byte values. */
  @js.native
  sealed trait uint8Array extends PropertyType
  
  /* 11 */ val boolean: typings.winrtDashUwp.Windows.Foundation.PropertyType.boolean with Double = js.native
  /* 31 */ val booleanArray: typings.winrtDashUwp.Windows.Foundation.PropertyType.booleanArray with Double = js.native
  /* 10 */ val char16: typings.winrtDashUwp.Windows.Foundation.PropertyType.char16 with Double = js.native
  /* 30 */ val char16Array: typings.winrtDashUwp.Windows.Foundation.PropertyType.char16Array with Double = js.native
  /* 14 */ val dateTime: typings.winrtDashUwp.Windows.Foundation.PropertyType.dateTime with Double = js.native
  /* 34 */ val dateTimeArray: typings.winrtDashUwp.Windows.Foundation.PropertyType.dateTimeArray with Double = js.native
  /* 9 */ val double: typings.winrtDashUwp.Windows.Foundation.PropertyType.double with Double = js.native
  /* 29 */ val doubleArray: typings.winrtDashUwp.Windows.Foundation.PropertyType.doubleArray with Double = js.native
  /* 0 */ val empty: typings.winrtDashUwp.Windows.Foundation.PropertyType.empty with Double = js.native
  /* 16 */ val guid: typings.winrtDashUwp.Windows.Foundation.PropertyType.guid with Double = js.native
  /* 36 */ val guidArray: typings.winrtDashUwp.Windows.Foundation.PropertyType.guidArray with Double = js.native
  /* 13 */ val inspectable: typings.winrtDashUwp.Windows.Foundation.PropertyType.inspectable with Double = js.native
  /* 33 */ val inspectableArray: typings.winrtDashUwp.Windows.Foundation.PropertyType.inspectableArray with Double = js.native
  /* 2 */ val int16: typings.winrtDashUwp.Windows.Foundation.PropertyType.int16 with Double = js.native
  /* 22 */ val int16Array: typings.winrtDashUwp.Windows.Foundation.PropertyType.int16Array with Double = js.native
  /* 4 */ val int32: typings.winrtDashUwp.Windows.Foundation.PropertyType.int32 with Double = js.native
  /* 24 */ val int32Array: typings.winrtDashUwp.Windows.Foundation.PropertyType.int32Array with Double = js.native
  /* 6 */ val int64: typings.winrtDashUwp.Windows.Foundation.PropertyType.int64 with Double = js.native
  /* 26 */ val int64Array: typings.winrtDashUwp.Windows.Foundation.PropertyType.int64Array with Double = js.native
  /* 20 */ val otherType: typings.winrtDashUwp.Windows.Foundation.PropertyType.otherType with Double = js.native
  /* 40 */ val otherTypeArray: typings.winrtDashUwp.Windows.Foundation.PropertyType.otherTypeArray with Double = js.native
  /* 17 */ val point: typings.winrtDashUwp.Windows.Foundation.PropertyType.point with Double = js.native
  /* 37 */ val pointArray: typings.winrtDashUwp.Windows.Foundation.PropertyType.pointArray with Double = js.native
  /* 19 */ val rect: typings.winrtDashUwp.Windows.Foundation.PropertyType.rect with Double = js.native
  /* 39 */ val rectArray: typings.winrtDashUwp.Windows.Foundation.PropertyType.rectArray with Double = js.native
  /* 8 */ val single: typings.winrtDashUwp.Windows.Foundation.PropertyType.single with Double = js.native
  /* 28 */ val singleArray: typings.winrtDashUwp.Windows.Foundation.PropertyType.singleArray with Double = js.native
  /* 18 */ val size: typings.winrtDashUwp.Windows.Foundation.PropertyType.size with Double = js.native
  /* 38 */ val sizeArray: typings.winrtDashUwp.Windows.Foundation.PropertyType.sizeArray with Double = js.native
  /* 12 */ val string: typings.winrtDashUwp.Windows.Foundation.PropertyType.string with Double = js.native
  /* 32 */ val stringArray: typings.winrtDashUwp.Windows.Foundation.PropertyType.stringArray with Double = js.native
  /* 15 */ val timeSpan: typings.winrtDashUwp.Windows.Foundation.PropertyType.timeSpan with Double = js.native
  /* 35 */ val timeSpanArray: typings.winrtDashUwp.Windows.Foundation.PropertyType.timeSpanArray with Double = js.native
  /* 3 */ val uint16: typings.winrtDashUwp.Windows.Foundation.PropertyType.uint16 with Double = js.native
  /* 23 */ val uint16Array: typings.winrtDashUwp.Windows.Foundation.PropertyType.uint16Array with Double = js.native
  /* 5 */ val uint32: typings.winrtDashUwp.Windows.Foundation.PropertyType.uint32 with Double = js.native
  /* 25 */ val uint32Array: typings.winrtDashUwp.Windows.Foundation.PropertyType.uint32Array with Double = js.native
  /* 7 */ val uint64: typings.winrtDashUwp.Windows.Foundation.PropertyType.uint64 with Double = js.native
  /* 27 */ val uint64Array: typings.winrtDashUwp.Windows.Foundation.PropertyType.uint64Array with Double = js.native
  /* 1 */ val uint8: typings.winrtDashUwp.Windows.Foundation.PropertyType.uint8 with Double = js.native
  /* 21 */ val uint8Array: typings.winrtDashUwp.Windows.Foundation.PropertyType.uint8Array with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PropertyType with Double] = js.native
}

