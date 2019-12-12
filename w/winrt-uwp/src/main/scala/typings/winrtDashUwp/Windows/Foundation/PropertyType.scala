package typings.winrtDashUwp.Windows.Foundation

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Foundation.PropertyType.boolean
import typings.winrtDashUwp.Windows.Foundation.PropertyType.booleanArray
import typings.winrtDashUwp.Windows.Foundation.PropertyType.char16
import typings.winrtDashUwp.Windows.Foundation.PropertyType.char16Array
import typings.winrtDashUwp.Windows.Foundation.PropertyType.dateTime
import typings.winrtDashUwp.Windows.Foundation.PropertyType.dateTimeArray
import typings.winrtDashUwp.Windows.Foundation.PropertyType.double
import typings.winrtDashUwp.Windows.Foundation.PropertyType.doubleArray
import typings.winrtDashUwp.Windows.Foundation.PropertyType.empty
import typings.winrtDashUwp.Windows.Foundation.PropertyType.guid
import typings.winrtDashUwp.Windows.Foundation.PropertyType.guidArray
import typings.winrtDashUwp.Windows.Foundation.PropertyType.inspectable
import typings.winrtDashUwp.Windows.Foundation.PropertyType.inspectableArray
import typings.winrtDashUwp.Windows.Foundation.PropertyType.int16
import typings.winrtDashUwp.Windows.Foundation.PropertyType.int16Array
import typings.winrtDashUwp.Windows.Foundation.PropertyType.int32
import typings.winrtDashUwp.Windows.Foundation.PropertyType.int32Array
import typings.winrtDashUwp.Windows.Foundation.PropertyType.int64
import typings.winrtDashUwp.Windows.Foundation.PropertyType.int64Array
import typings.winrtDashUwp.Windows.Foundation.PropertyType.otherType
import typings.winrtDashUwp.Windows.Foundation.PropertyType.otherTypeArray
import typings.winrtDashUwp.Windows.Foundation.PropertyType.point
import typings.winrtDashUwp.Windows.Foundation.PropertyType.pointArray
import typings.winrtDashUwp.Windows.Foundation.PropertyType.rect
import typings.winrtDashUwp.Windows.Foundation.PropertyType.rectArray
import typings.winrtDashUwp.Windows.Foundation.PropertyType.single
import typings.winrtDashUwp.Windows.Foundation.PropertyType.singleArray
import typings.winrtDashUwp.Windows.Foundation.PropertyType.size
import typings.winrtDashUwp.Windows.Foundation.PropertyType.sizeArray
import typings.winrtDashUwp.Windows.Foundation.PropertyType.string
import typings.winrtDashUwp.Windows.Foundation.PropertyType.stringArray
import typings.winrtDashUwp.Windows.Foundation.PropertyType.timeSpan
import typings.winrtDashUwp.Windows.Foundation.PropertyType.timeSpanArray
import typings.winrtDashUwp.Windows.Foundation.PropertyType.uint16
import typings.winrtDashUwp.Windows.Foundation.PropertyType.uint16Array
import typings.winrtDashUwp.Windows.Foundation.PropertyType.uint32
import typings.winrtDashUwp.Windows.Foundation.PropertyType.uint32Array
import typings.winrtDashUwp.Windows.Foundation.PropertyType.uint64
import typings.winrtDashUwp.Windows.Foundation.PropertyType.uint64Array
import typings.winrtDashUwp.Windows.Foundation.PropertyType.uint8
import typings.winrtDashUwp.Windows.Foundation.PropertyType.uint8Array
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PropertyType with Double] = js.native
  /* 11 */ @js.native
  object boolean extends TopLevel[boolean with Double]
  
  /* 31 */ @js.native
  object booleanArray extends TopLevel[booleanArray with Double]
  
  /* 10 */ @js.native
  object char16 extends TopLevel[char16 with Double]
  
  /* 30 */ @js.native
  object char16Array extends TopLevel[char16Array with Double]
  
  /* 14 */ @js.native
  object dateTime extends TopLevel[dateTime with Double]
  
  /* 34 */ @js.native
  object dateTimeArray extends TopLevel[dateTimeArray with Double]
  
  /* 9 */ @js.native
  object double extends TopLevel[double with Double]
  
  /* 29 */ @js.native
  object doubleArray extends TopLevel[doubleArray with Double]
  
  /* 0 */ @js.native
  object empty extends TopLevel[empty with Double]
  
  /* 16 */ @js.native
  object guid extends TopLevel[guid with Double]
  
  /* 36 */ @js.native
  object guidArray extends TopLevel[guidArray with Double]
  
  /* 13 */ @js.native
  object inspectable extends TopLevel[inspectable with Double]
  
  /* 33 */ @js.native
  object inspectableArray extends TopLevel[inspectableArray with Double]
  
  /* 2 */ @js.native
  object int16 extends TopLevel[int16 with Double]
  
  /* 22 */ @js.native
  object int16Array extends TopLevel[int16Array with Double]
  
  /* 4 */ @js.native
  object int32 extends TopLevel[int32 with Double]
  
  /* 24 */ @js.native
  object int32Array extends TopLevel[int32Array with Double]
  
  /* 6 */ @js.native
  object int64 extends TopLevel[int64 with Double]
  
  /* 26 */ @js.native
  object int64Array extends TopLevel[int64Array with Double]
  
  /* 20 */ @js.native
  object otherType extends TopLevel[otherType with Double]
  
  /* 40 */ @js.native
  object otherTypeArray extends TopLevel[otherTypeArray with Double]
  
  /* 17 */ @js.native
  object point extends TopLevel[point with Double]
  
  /* 37 */ @js.native
  object pointArray extends TopLevel[pointArray with Double]
  
  /* 19 */ @js.native
  object rect extends TopLevel[rect with Double]
  
  /* 39 */ @js.native
  object rectArray extends TopLevel[rectArray with Double]
  
  /* 8 */ @js.native
  object single extends TopLevel[single with Double]
  
  /* 28 */ @js.native
  object singleArray extends TopLevel[singleArray with Double]
  
  /* 18 */ @js.native
  object size extends TopLevel[size with Double]
  
  /* 38 */ @js.native
  object sizeArray extends TopLevel[sizeArray with Double]
  
  /* 12 */ @js.native
  object string extends TopLevel[string with Double]
  
  /* 32 */ @js.native
  object stringArray extends TopLevel[stringArray with Double]
  
  /* 15 */ @js.native
  object timeSpan extends TopLevel[timeSpan with Double]
  
  /* 35 */ @js.native
  object timeSpanArray extends TopLevel[timeSpanArray with Double]
  
  /* 3 */ @js.native
  object uint16 extends TopLevel[uint16 with Double]
  
  /* 23 */ @js.native
  object uint16Array extends TopLevel[uint16Array with Double]
  
  /* 5 */ @js.native
  object uint32 extends TopLevel[uint32 with Double]
  
  /* 25 */ @js.native
  object uint32Array extends TopLevel[uint32Array with Double]
  
  /* 7 */ @js.native
  object uint64 extends TopLevel[uint64 with Double]
  
  /* 27 */ @js.native
  object uint64Array extends TopLevel[uint64Array with Double]
  
  /* 1 */ @js.native
  object uint8 extends TopLevel[uint8 with Double]
  
  /* 21 */ @js.native
  object uint8Array extends TopLevel[uint8Array with Double]
  
}

