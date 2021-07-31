package typings.winrtUwp.Windows.Foundation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait PropertyType extends StObject
/** Specifies property value types. */
@JSGlobal("Windows.Foundation.PropertyType")
@js.native
object PropertyType extends StObject {
  
  /** A value that can be only true or false. */
  @js.native
  sealed trait boolean
    extends StObject
       with PropertyType
  
  /** An array of Boolean values. */
  @js.native
  sealed trait booleanArray
    extends StObject
       with PropertyType
  
  /** An unsigned 16-bit (2-byte) code point. */
  @js.native
  sealed trait char16
    extends StObject
       with PropertyType
  
  /** An array of Char values. */
  @js.native
  sealed trait char16Array
    extends StObject
       with PropertyType
  
  /** An instant in time, typically expressed as a date and time of day. */
  @js.native
  sealed trait dateTime
    extends StObject
       with PropertyType
  
  /** An array of DateTime values. */
  @js.native
  sealed trait dateTimeArray
    extends StObject
       with PropertyType
  
  /** A signed 64-bit (8-byte) floating-point number. */
  @js.native
  sealed trait double
    extends StObject
       with PropertyType
  
  /** An array of Double values. */
  @js.native
  sealed trait doubleArray
    extends StObject
       with PropertyType
  
  /** No type is specified. */
  @js.native
  sealed trait empty
    extends StObject
       with PropertyType
  
  /** A globally unique identifier. */
  @js.native
  sealed trait guid
    extends StObject
       with PropertyType
  
  /** An array of Guid values. */
  @js.native
  sealed trait guidArray
    extends StObject
       with PropertyType
  
  /** An object implementing the IInspectable interface. */
  @js.native
  sealed trait inspectable
    extends StObject
       with PropertyType
  
  /** An array of Inspectable values. */
  @js.native
  sealed trait inspectableArray
    extends StObject
       with PropertyType
  
  /** A signed 16-bit (2-byte) integer. */
  @js.native
  sealed trait int16
    extends StObject
       with PropertyType
  
  /** An array of Int16 values. */
  @js.native
  sealed trait int16Array
    extends StObject
       with PropertyType
  
  /** A signed 32-bit (4-byte) integer. */
  @js.native
  sealed trait int32
    extends StObject
       with PropertyType
  
  /** An array of Int32 values. */
  @js.native
  sealed trait int32Array
    extends StObject
       with PropertyType
  
  /** A signed 64-bit (8-byte) integer. */
  @js.native
  sealed trait int64
    extends StObject
       with PropertyType
  
  /** An array of Int64 values. */
  @js.native
  sealed trait int64Array
    extends StObject
       with PropertyType
  
  /** A type not specified in this enumeration. */
  @js.native
  sealed trait otherType
    extends StObject
       with PropertyType
  
  /** An array of an unspecified type. */
  @js.native
  sealed trait otherTypeArray
    extends StObject
       with PropertyType
  
  /** An ordered pair of floating-point x- and y-coordinates that defines a point in a two-dimensional plane. */
  @js.native
  sealed trait point
    extends StObject
       with PropertyType
  
  /** An array of Point structures. */
  @js.native
  sealed trait pointArray
    extends StObject
       with PropertyType
  
  /** A set of four floating-point numbers that represent the location and size of a rectangle. */
  @js.native
  sealed trait rect
    extends StObject
       with PropertyType
  
  /** An array of Rect structures. */
  @js.native
  sealed trait rectArray
    extends StObject
       with PropertyType
  
  /** A signed 32-bit (4-byte) floating-point number. */
  @js.native
  sealed trait single
    extends StObject
       with PropertyType
  
  /** An array of Single values. */
  @js.native
  sealed trait singleArray
    extends StObject
       with PropertyType
  
  /** An ordered pair of float-point numbers that specify a height and width. */
  @js.native
  sealed trait size
    extends StObject
       with PropertyType
  
  /** An array of Size structures. */
  @js.native
  sealed trait sizeArray
    extends StObject
       with PropertyType
  
  /** A Windows Runtime HSTRING . */
  @js.native
  sealed trait string
    extends StObject
       with PropertyType
  
  /** An array of String values. */
  @js.native
  sealed trait stringArray
    extends StObject
       with PropertyType
  
  /** A time interval. */
  @js.native
  sealed trait timeSpan
    extends StObject
       with PropertyType
  
  /** An array of TimeSpan values. */
  @js.native
  sealed trait timeSpanArray
    extends StObject
       with PropertyType
  
  /** An unsigned 16-bit (2-byte) integer. */
  @js.native
  sealed trait uint16
    extends StObject
       with PropertyType
  
  /** An array of UInt16 values. */
  @js.native
  sealed trait uint16Array
    extends StObject
       with PropertyType
  
  /** An unsigned 32-bit (4-byte) integer. */
  @js.native
  sealed trait uint32
    extends StObject
       with PropertyType
  
  /** An array of UInt32 values. */
  @js.native
  sealed trait uint32Array
    extends StObject
       with PropertyType
  
  /** An unsigned 64-bit (8-byte) integer. */
  @js.native
  sealed trait uint64
    extends StObject
       with PropertyType
  
  /** An array of UInt64 values. */
  @js.native
  sealed trait uint64Array
    extends StObject
       with PropertyType
  
  /** A byte. */
  @js.native
  sealed trait uint8
    extends StObject
       with PropertyType
  
  /** An array of Byte values. */
  @js.native
  sealed trait uint8Array
    extends StObject
       with PropertyType
}
