package typings.terminalImage.anon

import typings.node.Buffer
import typings.node.anon.Data
import typings.std.ArrayBufferLike
import typings.std.ArrayLike
import typings.std.IterableIterator
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<node.Buffer> */
@js.native
trait ReadonlyBuffer extends js.Object {
  val BYTES_PER_ELEMENT: Double = js.native
  val buffer: ArrayBufferLike = js.native
  val byteLength: Double = js.native
  val byteOffset: Double = js.native
  val length: Double = js.native
  def compare(otherBuffer: Uint8Array): Double = js.native
  def copy(targetBuffer: Uint8Array): Double = js.native
  def copyWithin(target: Double, start: Double): this.type = js.native
  def entries(): IterableIterator[js.Tuple2[Double, Double]] = js.native
  def equals(otherBuffer: Uint8Array): Boolean = js.native
  def every(callbackfn: js.Function3[/* value */ Double, /* index */ Double, /* array */ this.type, _]): Boolean = js.native
  def fill(value: String): this.type = js.native
  def filter(callbackfn: js.Function3[/* value */ Double, /* index */ Double, /* array */ this.type, _]): Uint8Array = js.native
  def find(predicate: js.Function3[/* value */ Double, /* index */ Double, /* obj */ this.type, Boolean]): js.UndefOr[Double] = js.native
  def findIndex(predicate: js.Function3[/* value */ Double, /* index */ Double, /* obj */ this.type, Boolean]): Double = js.native
  def forEach(callbackfn: js.Function3[/* value */ Double, /* index */ Double, /* array */ this.type, Unit]): Unit = js.native
  def includes(value: String): Boolean = js.native
  def indexOf(value: String): Double = js.native
  def join(): String = js.native
  def keys(): IterableIterator[Double] = js.native
  def lastIndexOf(value: String): Double = js.native
  def map(callbackfn: js.Function3[/* value */ Double, /* index */ Double, /* array */ this.type, Double]): Uint8Array = js.native
  def readDoubleBE(): Double = js.native
  def readDoubleLE(): Double = js.native
  def readFloatBE(): Double = js.native
  def readFloatLE(): Double = js.native
  def readInt16BE(): Double = js.native
  def readInt16LE(): Double = js.native
  def readInt32BE(): Double = js.native
  def readInt32LE(): Double = js.native
  def readInt8(): Double = js.native
  def readIntBE(offset: Double, byteLength: Double): Double = js.native
  def readIntLE(offset: Double, byteLength: Double): Double = js.native
  def readUInt16BE(): Double = js.native
  def readUInt16LE(): Double = js.native
  def readUInt32BE(): Double = js.native
  def readUInt32LE(): Double = js.native
  def readUInt8(): Double = js.native
  def readUIntBE(offset: Double, byteLength: Double): Double = js.native
  def readUIntLE(offset: Double, byteLength: Double): Double = js.native
  def reduce(
    callbackfn: js.Function4[
      /* previousValue */ Double, 
      /* currentValue */ Double, 
      /* currentIndex */ Double, 
      /* array */ this.type, 
      Double
    ]
  ): Double = js.native
  def reduceRight(
    callbackfn: js.Function4[
      /* previousValue */ Double, 
      /* currentValue */ Double, 
      /* currentIndex */ Double, 
      /* array */ this.type, 
      Double
    ]
  ): Double = js.native
  def reverse(): this.type = js.native
  def set(array: ArrayLike[Double]): Unit = js.native
  def slice(): Buffer = js.native
  def some(callbackfn: js.Function3[/* value */ Double, /* index */ Double, /* array */ this.type, _]): Boolean = js.native
  def sort(): this.type = js.native
  def subarray(): Buffer = js.native
  def swap16(): Buffer = js.native
  def swap32(): Buffer = js.native
  def swap64(): Buffer = js.native
  def toJSON(): Data = js.native
  def values(): IterableIterator[Double] = js.native
  def write(string: String): Double = js.native
  def writeDoubleBE(value: Double): Double = js.native
  def writeDoubleLE(value: Double): Double = js.native
  def writeFloatBE(value: Double): Double = js.native
  def writeFloatLE(value: Double): Double = js.native
  def writeInt16BE(value: Double): Double = js.native
  def writeInt16LE(value: Double): Double = js.native
  def writeInt32BE(value: Double): Double = js.native
  def writeInt32LE(value: Double): Double = js.native
  def writeInt8(value: Double): Double = js.native
  def writeIntBE(value: Double, offset: Double, byteLength: Double): Double = js.native
  def writeIntLE(value: Double, offset: Double, byteLength: Double): Double = js.native
  def writeUInt16BE(value: Double): Double = js.native
  def writeUInt16LE(value: Double): Double = js.native
  def writeUInt32BE(value: Double): Double = js.native
  def writeUInt32LE(value: Double): Double = js.native
  def writeUInt8(value: Double): Double = js.native
  def writeUIntBE(value: Double, offset: Double, byteLength: Double): Double = js.native
  def writeUIntLE(value: Double, offset: Double, byteLength: Double): Double = js.native
}

object ReadonlyBuffer {
  @scala.inline
  def apply(
    BYTES_PER_ELEMENT: Double,
    buffer: ArrayBufferLike,
    byteLength: Double,
    byteOffset: Double,
    compare: Uint8Array => Double,
    copy: Uint8Array => Double,
    copyWithin: (Double, Double) => ReadonlyBuffer,
    entries: () => IterableIterator[js.Tuple2[Double, Double]],
    equals: Uint8Array => Boolean,
    every: js.Function3[/* value */ Double, /* index */ Double, ReadonlyBuffer, _] => Boolean,
    fill: String => ReadonlyBuffer,
    filter: js.Function3[/* value */ Double, /* index */ Double, ReadonlyBuffer, _] => Uint8Array,
    find: js.Function3[/* value */ Double, /* index */ Double, ReadonlyBuffer, Boolean] => js.UndefOr[Double],
    findIndex: js.Function3[/* value */ Double, /* index */ Double, ReadonlyBuffer, Boolean] => Double,
    forEach: js.Function3[/* value */ Double, /* index */ Double, ReadonlyBuffer, Unit] => Unit,
    includes: String => Boolean,
    indexOf: String => Double,
    join: () => String,
    keys: () => IterableIterator[Double],
    lastIndexOf: String => Double,
    length: Double,
    map: js.Function3[/* value */ Double, /* index */ Double, ReadonlyBuffer, Double] => Uint8Array,
    readDoubleBE: () => Double,
    readDoubleLE: () => Double,
    readFloatBE: () => Double,
    readFloatLE: () => Double,
    readInt16BE: () => Double,
    readInt16LE: () => Double,
    readInt32BE: () => Double,
    readInt32LE: () => Double,
    readInt8: () => Double,
    readIntBE: (Double, Double) => Double,
    readIntLE: (Double, Double) => Double,
    readUInt16BE: () => Double,
    readUInt16LE: () => Double,
    readUInt32BE: () => Double,
    readUInt32LE: () => Double,
    readUInt8: () => Double,
    readUIntBE: (Double, Double) => Double,
    readUIntLE: (Double, Double) => Double,
    reduce: js.Function4[
      /* previousValue */ Double, 
      /* currentValue */ Double, 
      /* currentIndex */ Double, 
      ReadonlyBuffer, 
      Double
    ] => Double,
    reduceRight: js.Function4[
      /* previousValue */ Double, 
      /* currentValue */ Double, 
      /* currentIndex */ Double, 
      ReadonlyBuffer, 
      Double
    ] => Double,
    reverse: () => ReadonlyBuffer,
    set: ArrayLike[Double] => Unit,
    slice: () => Buffer,
    some: js.Function3[/* value */ Double, /* index */ Double, ReadonlyBuffer, _] => Boolean,
    sort: () => ReadonlyBuffer,
    subarray: () => Buffer,
    swap16: () => Buffer,
    swap32: () => Buffer,
    swap64: () => Buffer,
    toJSON: () => Data,
    values: () => IterableIterator[Double],
    write: String => Double,
    writeDoubleBE: Double => Double,
    writeDoubleLE: Double => Double,
    writeFloatBE: Double => Double,
    writeFloatLE: Double => Double,
    writeInt16BE: Double => Double,
    writeInt16LE: Double => Double,
    writeInt32BE: Double => Double,
    writeInt32LE: Double => Double,
    writeInt8: Double => Double,
    writeIntBE: (Double, Double, Double) => Double,
    writeIntLE: (Double, Double, Double) => Double,
    writeUInt16BE: Double => Double,
    writeUInt16LE: Double => Double,
    writeUInt32BE: Double => Double,
    writeUInt32LE: Double => Double,
    writeUInt8: Double => Double,
    writeUIntBE: (Double, Double, Double) => Double,
    writeUIntLE: (Double, Double, Double) => Double
  ): ReadonlyBuffer = {
    val __obj = js.Dynamic.literal(BYTES_PER_ELEMENT = BYTES_PER_ELEMENT.asInstanceOf[js.Any], buffer = buffer.asInstanceOf[js.Any], byteLength = byteLength.asInstanceOf[js.Any], byteOffset = byteOffset.asInstanceOf[js.Any], compare = js.Any.fromFunction1(compare), copy = js.Any.fromFunction1(copy), copyWithin = js.Any.fromFunction2(copyWithin), entries = js.Any.fromFunction0(entries), equals = js.Any.fromFunction1(equals), every = js.Any.fromFunction1(every), fill = js.Any.fromFunction1(fill), filter = js.Any.fromFunction1(filter), find = js.Any.fromFunction1(find), findIndex = js.Any.fromFunction1(findIndex), forEach = js.Any.fromFunction1(forEach), includes = js.Any.fromFunction1(includes), indexOf = js.Any.fromFunction1(indexOf), join = js.Any.fromFunction0(join), keys = js.Any.fromFunction0(keys), lastIndexOf = js.Any.fromFunction1(lastIndexOf), length = length.asInstanceOf[js.Any], map = js.Any.fromFunction1(map), readDoubleBE = js.Any.fromFunction0(readDoubleBE), readDoubleLE = js.Any.fromFunction0(readDoubleLE), readFloatBE = js.Any.fromFunction0(readFloatBE), readFloatLE = js.Any.fromFunction0(readFloatLE), readInt16BE = js.Any.fromFunction0(readInt16BE), readInt16LE = js.Any.fromFunction0(readInt16LE), readInt32BE = js.Any.fromFunction0(readInt32BE), readInt32LE = js.Any.fromFunction0(readInt32LE), readInt8 = js.Any.fromFunction0(readInt8), readIntBE = js.Any.fromFunction2(readIntBE), readIntLE = js.Any.fromFunction2(readIntLE), readUInt16BE = js.Any.fromFunction0(readUInt16BE), readUInt16LE = js.Any.fromFunction0(readUInt16LE), readUInt32BE = js.Any.fromFunction0(readUInt32BE), readUInt32LE = js.Any.fromFunction0(readUInt32LE), readUInt8 = js.Any.fromFunction0(readUInt8), readUIntBE = js.Any.fromFunction2(readUIntBE), readUIntLE = js.Any.fromFunction2(readUIntLE), reduce = js.Any.fromFunction1(reduce), reduceRight = js.Any.fromFunction1(reduceRight), reverse = js.Any.fromFunction0(reverse), set = js.Any.fromFunction1(set), slice = js.Any.fromFunction0(slice), some = js.Any.fromFunction1(some), sort = js.Any.fromFunction0(sort), subarray = js.Any.fromFunction0(subarray), swap16 = js.Any.fromFunction0(swap16), swap32 = js.Any.fromFunction0(swap32), swap64 = js.Any.fromFunction0(swap64), toJSON = js.Any.fromFunction0(toJSON), values = js.Any.fromFunction0(values), write = js.Any.fromFunction1(write), writeDoubleBE = js.Any.fromFunction1(writeDoubleBE), writeDoubleLE = js.Any.fromFunction1(writeDoubleLE), writeFloatBE = js.Any.fromFunction1(writeFloatBE), writeFloatLE = js.Any.fromFunction1(writeFloatLE), writeInt16BE = js.Any.fromFunction1(writeInt16BE), writeInt16LE = js.Any.fromFunction1(writeInt16LE), writeInt32BE = js.Any.fromFunction1(writeInt32BE), writeInt32LE = js.Any.fromFunction1(writeInt32LE), writeInt8 = js.Any.fromFunction1(writeInt8), writeIntBE = js.Any.fromFunction3(writeIntBE), writeIntLE = js.Any.fromFunction3(writeIntLE), writeUInt16BE = js.Any.fromFunction1(writeUInt16BE), writeUInt16LE = js.Any.fromFunction1(writeUInt16LE), writeUInt32BE = js.Any.fromFunction1(writeUInt32BE), writeUInt32LE = js.Any.fromFunction1(writeUInt32LE), writeUInt8 = js.Any.fromFunction1(writeUInt8), writeUIntBE = js.Any.fromFunction3(writeUIntBE), writeUIntLE = js.Any.fromFunction3(writeUIntLE))
    __obj.asInstanceOf[ReadonlyBuffer]
  }
  @scala.inline
  implicit class ReadonlyBufferOps[Self <: ReadonlyBuffer] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBYTES_PER_ELEMENT(value: Double): Self = this.set("BYTES_PER_ELEMENT", value.asInstanceOf[js.Any])
    @scala.inline
    def setBuffer(value: ArrayBufferLike): Self = this.set("buffer", value.asInstanceOf[js.Any])
    @scala.inline
    def setByteLength(value: Double): Self = this.set("byteLength", value.asInstanceOf[js.Any])
    @scala.inline
    def setByteOffset(value: Double): Self = this.set("byteOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def setCompare(value: Uint8Array => Double): Self = this.set("compare", js.Any.fromFunction1(value))
    @scala.inline
    def setCopy(value: Uint8Array => Double): Self = this.set("copy", js.Any.fromFunction1(value))
    @scala.inline
    def setCopyWithin(value: (Double, Double) => ReadonlyBuffer): Self = this.set("copyWithin", js.Any.fromFunction2(value))
    @scala.inline
    def setEntries(value: () => IterableIterator[js.Tuple2[Double, Double]]): Self = this.set("entries", js.Any.fromFunction0(value))
    @scala.inline
    def setEquals(value: Uint8Array => Boolean): Self = this.set("equals", js.Any.fromFunction1(value))
    @scala.inline
    def setEvery(value: js.Function3[/* value */ Double, /* index */ Double, ReadonlyBuffer, _] => Boolean): Self = this.set("every", js.Any.fromFunction1(value))
    @scala.inline
    def setFill(value: String => ReadonlyBuffer): Self = this.set("fill", js.Any.fromFunction1(value))
    @scala.inline
    def setFilter(value: js.Function3[/* value */ Double, /* index */ Double, ReadonlyBuffer, _] => Uint8Array): Self = this.set("filter", js.Any.fromFunction1(value))
    @scala.inline
    def setFind(
      value: js.Function3[/* value */ Double, /* index */ Double, ReadonlyBuffer, Boolean] => js.UndefOr[Double]
    ): Self = this.set("find", js.Any.fromFunction1(value))
    @scala.inline
    def setFindIndex(value: js.Function3[/* value */ Double, /* index */ Double, ReadonlyBuffer, Boolean] => Double): Self = this.set("findIndex", js.Any.fromFunction1(value))
    @scala.inline
    def setForEach(value: js.Function3[/* value */ Double, /* index */ Double, ReadonlyBuffer, Unit] => Unit): Self = this.set("forEach", js.Any.fromFunction1(value))
    @scala.inline
    def setIncludes(value: String => Boolean): Self = this.set("includes", js.Any.fromFunction1(value))
    @scala.inline
    def setIndexOf(value: String => Double): Self = this.set("indexOf", js.Any.fromFunction1(value))
    @scala.inline
    def setJoin(value: () => String): Self = this.set("join", js.Any.fromFunction0(value))
    @scala.inline
    def setKeys(value: () => IterableIterator[Double]): Self = this.set("keys", js.Any.fromFunction0(value))
    @scala.inline
    def setLastIndexOf(value: String => Double): Self = this.set("lastIndexOf", js.Any.fromFunction1(value))
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def setMap(value: js.Function3[/* value */ Double, /* index */ Double, ReadonlyBuffer, Double] => Uint8Array): Self = this.set("map", js.Any.fromFunction1(value))
    @scala.inline
    def setReadDoubleBE(value: () => Double): Self = this.set("readDoubleBE", js.Any.fromFunction0(value))
    @scala.inline
    def setReadDoubleLE(value: () => Double): Self = this.set("readDoubleLE", js.Any.fromFunction0(value))
    @scala.inline
    def setReadFloatBE(value: () => Double): Self = this.set("readFloatBE", js.Any.fromFunction0(value))
    @scala.inline
    def setReadFloatLE(value: () => Double): Self = this.set("readFloatLE", js.Any.fromFunction0(value))
    @scala.inline
    def setReadInt16BE(value: () => Double): Self = this.set("readInt16BE", js.Any.fromFunction0(value))
    @scala.inline
    def setReadInt16LE(value: () => Double): Self = this.set("readInt16LE", js.Any.fromFunction0(value))
    @scala.inline
    def setReadInt32BE(value: () => Double): Self = this.set("readInt32BE", js.Any.fromFunction0(value))
    @scala.inline
    def setReadInt32LE(value: () => Double): Self = this.set("readInt32LE", js.Any.fromFunction0(value))
    @scala.inline
    def setReadInt8(value: () => Double): Self = this.set("readInt8", js.Any.fromFunction0(value))
    @scala.inline
    def setReadIntBE(value: (Double, Double) => Double): Self = this.set("readIntBE", js.Any.fromFunction2(value))
    @scala.inline
    def setReadIntLE(value: (Double, Double) => Double): Self = this.set("readIntLE", js.Any.fromFunction2(value))
    @scala.inline
    def setReadUInt16BE(value: () => Double): Self = this.set("readUInt16BE", js.Any.fromFunction0(value))
    @scala.inline
    def setReadUInt16LE(value: () => Double): Self = this.set("readUInt16LE", js.Any.fromFunction0(value))
    @scala.inline
    def setReadUInt32BE(value: () => Double): Self = this.set("readUInt32BE", js.Any.fromFunction0(value))
    @scala.inline
    def setReadUInt32LE(value: () => Double): Self = this.set("readUInt32LE", js.Any.fromFunction0(value))
    @scala.inline
    def setReadUInt8(value: () => Double): Self = this.set("readUInt8", js.Any.fromFunction0(value))
    @scala.inline
    def setReadUIntBE(value: (Double, Double) => Double): Self = this.set("readUIntBE", js.Any.fromFunction2(value))
    @scala.inline
    def setReadUIntLE(value: (Double, Double) => Double): Self = this.set("readUIntLE", js.Any.fromFunction2(value))
    @scala.inline
    def setReduce(
      value: js.Function4[
          /* previousValue */ Double, 
          /* currentValue */ Double, 
          /* currentIndex */ Double, 
          ReadonlyBuffer, 
          Double
        ] => Double
    ): Self = this.set("reduce", js.Any.fromFunction1(value))
    @scala.inline
    def setReduceRight(
      value: js.Function4[
          /* previousValue */ Double, 
          /* currentValue */ Double, 
          /* currentIndex */ Double, 
          ReadonlyBuffer, 
          Double
        ] => Double
    ): Self = this.set("reduceRight", js.Any.fromFunction1(value))
    @scala.inline
    def setReverse(value: () => ReadonlyBuffer): Self = this.set("reverse", js.Any.fromFunction0(value))
    @scala.inline
    def setSet(value: ArrayLike[Double] => Unit): Self = this.set("set", js.Any.fromFunction1(value))
    @scala.inline
    def setSlice(value: () => Buffer): Self = this.set("slice", js.Any.fromFunction0(value))
    @scala.inline
    def setSome(value: js.Function3[/* value */ Double, /* index */ Double, ReadonlyBuffer, _] => Boolean): Self = this.set("some", js.Any.fromFunction1(value))
    @scala.inline
    def setSort(value: () => ReadonlyBuffer): Self = this.set("sort", js.Any.fromFunction0(value))
    @scala.inline
    def setSubarray(value: () => Buffer): Self = this.set("subarray", js.Any.fromFunction0(value))
    @scala.inline
    def setSwap16(value: () => Buffer): Self = this.set("swap16", js.Any.fromFunction0(value))
    @scala.inline
    def setSwap32(value: () => Buffer): Self = this.set("swap32", js.Any.fromFunction0(value))
    @scala.inline
    def setSwap64(value: () => Buffer): Self = this.set("swap64", js.Any.fromFunction0(value))
    @scala.inline
    def setToJSON(value: () => Data): Self = this.set("toJSON", js.Any.fromFunction0(value))
    @scala.inline
    def setValues(value: () => IterableIterator[Double]): Self = this.set("values", js.Any.fromFunction0(value))
    @scala.inline
    def setWrite(value: String => Double): Self = this.set("write", js.Any.fromFunction1(value))
    @scala.inline
    def setWriteDoubleBE(value: Double => Double): Self = this.set("writeDoubleBE", js.Any.fromFunction1(value))
    @scala.inline
    def setWriteDoubleLE(value: Double => Double): Self = this.set("writeDoubleLE", js.Any.fromFunction1(value))
    @scala.inline
    def setWriteFloatBE(value: Double => Double): Self = this.set("writeFloatBE", js.Any.fromFunction1(value))
    @scala.inline
    def setWriteFloatLE(value: Double => Double): Self = this.set("writeFloatLE", js.Any.fromFunction1(value))
    @scala.inline
    def setWriteInt16BE(value: Double => Double): Self = this.set("writeInt16BE", js.Any.fromFunction1(value))
    @scala.inline
    def setWriteInt16LE(value: Double => Double): Self = this.set("writeInt16LE", js.Any.fromFunction1(value))
    @scala.inline
    def setWriteInt32BE(value: Double => Double): Self = this.set("writeInt32BE", js.Any.fromFunction1(value))
    @scala.inline
    def setWriteInt32LE(value: Double => Double): Self = this.set("writeInt32LE", js.Any.fromFunction1(value))
    @scala.inline
    def setWriteInt8(value: Double => Double): Self = this.set("writeInt8", js.Any.fromFunction1(value))
    @scala.inline
    def setWriteIntBE(value: (Double, Double, Double) => Double): Self = this.set("writeIntBE", js.Any.fromFunction3(value))
    @scala.inline
    def setWriteIntLE(value: (Double, Double, Double) => Double): Self = this.set("writeIntLE", js.Any.fromFunction3(value))
    @scala.inline
    def setWriteUInt16BE(value: Double => Double): Self = this.set("writeUInt16BE", js.Any.fromFunction1(value))
    @scala.inline
    def setWriteUInt16LE(value: Double => Double): Self = this.set("writeUInt16LE", js.Any.fromFunction1(value))
    @scala.inline
    def setWriteUInt32BE(value: Double => Double): Self = this.set("writeUInt32BE", js.Any.fromFunction1(value))
    @scala.inline
    def setWriteUInt32LE(value: Double => Double): Self = this.set("writeUInt32LE", js.Any.fromFunction1(value))
    @scala.inline
    def setWriteUInt8(value: Double => Double): Self = this.set("writeUInt8", js.Any.fromFunction1(value))
    @scala.inline
    def setWriteUIntBE(value: (Double, Double, Double) => Double): Self = this.set("writeUIntBE", js.Any.fromFunction3(value))
    @scala.inline
    def setWriteUIntLE(value: (Double, Double, Double) => Double): Self = this.set("writeUIntLE", js.Any.fromFunction3(value))
  }
  
}

