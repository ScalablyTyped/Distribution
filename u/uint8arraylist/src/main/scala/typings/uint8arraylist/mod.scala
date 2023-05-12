package typings.uint8arraylist

import typings.std.Generator
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("uint8arraylist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("uint8arraylist", "Uint8ArrayList")
  @js.native
  open class Uint8ArrayList protected ()
    extends StObject
       with Iterable[js.typedarray.Uint8Array] {
    def this(data: Appendable*) = this()
    
    /* private */ var _subList: Any = js.native
    
    /**
      * Add one or more `bufs` to the end of this Uint8ArrayList
      */
    def append(bufs: Appendable*): Unit = js.native
    
    /**
      * Add all `bufs` to the end of this Uint8ArrayList
      */
    def appendAll(bufs: js.Array[Appendable]): Unit = js.native
    
    /* private */ var bufs: Any = js.native
    
    def byteLength: Double = js.native
    
    /**
      * Remove bytes from the front of the pool
      */
    def consume(bytes: Double): Unit = js.native
    
    /**
      * Read the value at `index`
      */
    def get(index: Double): Double = js.native
    
    def getBigInt64(byteOffset: Double): js.BigInt = js.native
    def getBigInt64(byteOffset: Double, littleEndian: Boolean): js.BigInt = js.native
    
    def getBigUint64(byteOffset: Double): js.BigInt = js.native
    def getBigUint64(byteOffset: Double, littleEndian: Boolean): js.BigInt = js.native
    
    def getFloat32(byteOffset: Double): Double = js.native
    def getFloat32(byteOffset: Double, littleEndian: Boolean): Double = js.native
    
    def getFloat64(byteOffset: Double): Double = js.native
    def getFloat64(byteOffset: Double, littleEndian: Boolean): Double = js.native
    
    def getInt16(byteOffset: Double): Double = js.native
    def getInt16(byteOffset: Double, littleEndian: Boolean): Double = js.native
    
    def getInt32(byteOffset: Double): Double = js.native
    def getInt32(byteOffset: Double, littleEndian: Boolean): Double = js.native
    
    def getInt8(byteOffset: Double): Double = js.native
    
    def getUint16(byteOffset: Double): Double = js.native
    def getUint16(byteOffset: Double, littleEndian: Boolean): Double = js.native
    
    def getUint32(byteOffset: Double): Double = js.native
    def getUint32(byteOffset: Double, littleEndian: Boolean): Double = js.native
    
    def getUint8(byteOffset: Double): Double = js.native
    
    def indexOf(search: js.typedarray.Uint8Array): Double = js.native
    def indexOf(search: js.typedarray.Uint8Array, offset: Double): Double = js.native
    def indexOf(search: Uint8ArrayList): Double = js.native
    def indexOf(search: Uint8ArrayList, offset: Double): Double = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator_Uint8ArrayList: js.Function0[Generator[js.typedarray.Uint8Array, Unit, Unit]] = js.native
    
    var length: Double = js.native
    
    /**
      * Add one or more `bufs` to the start of this Uint8ArrayList
      */
    def prepend(bufs: Appendable*): Unit = js.native
    
    /**
      * Add all `bufs` to the start of this Uint8ArrayList
      */
    def prependAll(bufs: js.Array[Appendable]): Unit = js.native
    
    /**
      * Set the value at `index` to `value`
      */
    def set(index: Double, value: Double): Unit = js.native
    
    def setBigInt64(byteOffset: Double, value: js.BigInt): Unit = js.native
    def setBigInt64(byteOffset: Double, value: js.BigInt, littleEndian: Boolean): Unit = js.native
    
    def setBigUint64(byteOffset: Double, value: js.BigInt): Unit = js.native
    def setBigUint64(byteOffset: Double, value: js.BigInt, littleEndian: Boolean): Unit = js.native
    
    def setFloat32(byteOffset: Double, value: Double): Unit = js.native
    def setFloat32(byteOffset: Double, value: Double, littleEndian: Boolean): Unit = js.native
    
    def setFloat64(byteOffset: Double, value: Double): Unit = js.native
    def setFloat64(byteOffset: Double, value: Double, littleEndian: Boolean): Unit = js.native
    
    def setInt16(byteOffset: Double, value: Double): Unit = js.native
    def setInt16(byteOffset: Double, value: Double, littleEndian: Boolean): Unit = js.native
    
    def setInt32(byteOffset: Double, value: Double): Unit = js.native
    def setInt32(byteOffset: Double, value: Double, littleEndian: Boolean): Unit = js.native
    
    def setInt8(byteOffset: Double, value: Double): Unit = js.native
    
    def setUint16(byteOffset: Double, value: Double): Unit = js.native
    def setUint16(byteOffset: Double, value: Double, littleEndian: Boolean): Unit = js.native
    
    def setUint32(byteOffset: Double, value: Double): Unit = js.native
    def setUint32(byteOffset: Double, value: Double, littleEndian: Boolean): Unit = js.native
    
    def setUint8(byteOffset: Double, value: Double): Unit = js.native
    
    /**
      * Extracts a section of an array and returns a new array.
      *
      * This is a copy operation as it is with Uint8Arrays and Arrays
      * - note this is different to the behaviour of Node Buffers.
      */
    def slice(): js.typedarray.Uint8Array = js.native
    def slice(beginInclusive: Double): js.typedarray.Uint8Array = js.native
    def slice(beginInclusive: Double, endExclusive: Double): js.typedarray.Uint8Array = js.native
    def slice(beginInclusive: Unit, endExclusive: Double): js.typedarray.Uint8Array = js.native
    
    /**
      * Returns a alloc from the given start and end element index.
      *
      * In the best case where the data extracted comes from a single Uint8Array
      * internally this is a no-copy operation otherwise it is a copy operation.
      */
    def subarray(): js.typedarray.Uint8Array = js.native
    def subarray(beginInclusive: Double): js.typedarray.Uint8Array = js.native
    def subarray(beginInclusive: Double, endExclusive: Double): js.typedarray.Uint8Array = js.native
    def subarray(beginInclusive: Unit, endExclusive: Double): js.typedarray.Uint8Array = js.native
    
    /**
      * Returns a allocList from the given start and end element index.
      *
      * This is a no-copy operation.
      */
    def sublist(): Uint8ArrayList = js.native
    def sublist(beginInclusive: Double): Uint8ArrayList = js.native
    def sublist(beginInclusive: Double, endExclusive: Double): Uint8ArrayList = js.native
    def sublist(beginInclusive: Unit, endExclusive: Double): Uint8ArrayList = js.native
    
    /**
      * Copy bytes from `buf` to the index specified by `offset`
      */
    def write(buf: Appendable): Unit = js.native
    def write(buf: Appendable, offset: Double): Unit = js.native
  }
  /* static members */
  object Uint8ArrayList {
    
    @JSImport("uint8arraylist", "Uint8ArrayList")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create a Uint8ArrayList from a pre-existing list of Uint8Arrays.  Use this
      * method if you know the total size of all the Uint8Arrays ahead of time.
      */
    inline def fromUint8Arrays(bufs: js.Array[js.typedarray.Uint8Array]): Uint8ArrayList = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUint8Arrays")(bufs.asInstanceOf[js.Any]).asInstanceOf[Uint8ArrayList]
    inline def fromUint8Arrays(bufs: js.Array[js.typedarray.Uint8Array], length: Double): Uint8ArrayList = (^.asInstanceOf[js.Dynamic].applyDynamic("fromUint8Arrays")(bufs.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Uint8ArrayList]
  }
  
  inline def isUint8ArrayList(value: Any): /* is uint8arraylist.uint8arraylist.Uint8ArrayList */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isUint8ArrayList")(value.asInstanceOf[js.Any]).asInstanceOf[/* is uint8arraylist.uint8arraylist.Uint8ArrayList */ Boolean]
  
  type Appendable = Uint8ArrayList | js.typedarray.Uint8Array
}
