package typings.winrtUwp.Windows.Foundation

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
  
}

