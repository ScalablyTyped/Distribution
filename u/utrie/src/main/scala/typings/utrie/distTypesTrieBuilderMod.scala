package typings.utrie

import typings.utrie.distTypesTrieMod.Trie
import typings.utrie.distTypesTrieMod.int
import typings.utrie.utrieInts.`16`
import typings.utrie.utrieInts.`32`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTrieBuilderMod {
  
  @JSImport("utrie/dist/types/TrieBuilder", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("utrie/dist/types/TrieBuilder", "BITS_16")
  @js.native
  val BITS_16: /* 16 */ Double = js.native
  
  @JSImport("utrie/dist/types/TrieBuilder", "BITS_32")
  @js.native
  val BITS_32: /* 32 */ Double = js.native
  
  @JSImport("utrie/dist/types/TrieBuilder", "TrieBuilder")
  @js.native
  open class TrieBuilder () extends StObject {
    def this(initialValue: int) = this()
    def this(initialValue: Unit, errorValue: int) = this()
    def this(initialValue: int, errorValue: int) = this()
    
    def _get(c: int, fromLSCP: Boolean): int = js.native
    
    def _set(c: int, forLSCP: Boolean, value: int): this.type = js.native
    
    def allocDataBlock(copyBlock: int): int = js.native
    
    def allocIndex2Block(): int = js.native
    
    def compactData(): Unit = js.native
    
    def compactIndex2(): Unit = js.native
    
    def compactTrie(): Unit = js.native
    
    var data: js.typedarray.Uint32Array = js.native
    
    var dataCapacity: int = js.native
    
    var dataLength: int = js.native
    
    var dataNullOffset: int = js.native
    
    var errorValue: int = js.native
    
    def fillBlock(block: int, start: int, limit: int, value: int, initialValue: int, overwrite: Boolean): Unit = js.native
    
    def findHighStart(highValue: int): int = js.native
    
    def findSameDataBlock(dataLength: int, otherBlock: int, blockLength: int): int = js.native
    
    def findSameIndex2Block(index2Length: int, otherBlock: int): int = js.native
    
    var firstFreeBlock: int = js.native
    
    def freeze(): Trie = js.native
    def freeze(valueBits: `16` | `32`): Trie = js.native
    
    /**
      * Get the value for a code point as stored in the Trie2.
      *
      * @param codePoint the code point
      * @return the value
      */
    def get(codePoint: int): int = js.native
    
    def getDataBlock(c: int, forLSCP: Boolean): int = js.native
    
    def getIndex2Block(c: int, forLSCP: Boolean): int = js.native
    
    var highStart: int = js.native
    
    var index1: js.typedarray.Uint32Array = js.native
    
    var index2: js.typedarray.Uint32Array = js.native
    
    var index2Length: int = js.native
    
    var index2NullOffset: int = js.native
    
    var initialValue: int = js.native
    
    var isCompacted: Boolean = js.native
    
    def isInNullBlock(c: int, forLSCP: Boolean): Boolean = js.native
    
    def isWritableBlock(block: int): Boolean = js.native
    
    var map: js.typedarray.Uint32Array = js.native
    
    def releaseDataBlock(block: int): Unit = js.native
    
    /**
      * Set a value for a code point.
      *
      * @param c the code point
      * @param value the value
      */
    def set(c: int, value: int): TrieBuilder = js.native
    
    def setIndex2Entry(i2: int, block: int): Unit = js.native
    
    /**
      * Set a value in a range of code points [start..end].
      * All code points c with start<=c<=end will get the value if
      * overwrite is TRUE or if the old value is the initial value.
      *
      * @param start the first code point to get the value
      * @param end the last code point to get the value (inclusive)
      * @param value the value
      * @param overwrite flag for whether old non-initial values are to be overwritten
      */
    def setRange(start: int, end: int, value: int): TrieBuilder = js.native
    def setRange(start: int, end: int, value: int, overwrite: Boolean): TrieBuilder = js.native
    
    def writeBlock(block: int, value: int): Unit = js.native
  }
  
  inline def serializeBase64(trie: Trie): js.Tuple2[String, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeBase64")(trie.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[String, Double]]
}
