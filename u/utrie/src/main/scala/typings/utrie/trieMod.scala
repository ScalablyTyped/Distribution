package typings.utrie

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object trieMod {
  
  @JSImport("utrie/dist/types/Trie", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("utrie/dist/types/Trie", "Trie")
  @js.native
  open class Trie protected () extends StObject {
    def this(
      initialValue: int,
      errorValue: int,
      highStart: int,
      highValueIndex: int,
      index: js.Array[Double],
      data: js.Array[Double]
    ) = this()
    def this(
      initialValue: int,
      errorValue: int,
      highStart: int,
      highValueIndex: int,
      index: js.Array[Double],
      data: js.typedarray.Uint16Array
    ) = this()
    def this(
      initialValue: int,
      errorValue: int,
      highStart: int,
      highValueIndex: int,
      index: js.Array[Double],
      data: js.typedarray.Uint32Array
    ) = this()
    def this(
      initialValue: int,
      errorValue: int,
      highStart: int,
      highValueIndex: int,
      index: js.typedarray.Uint16Array,
      data: js.Array[Double]
    ) = this()
    def this(
      initialValue: int,
      errorValue: int,
      highStart: int,
      highValueIndex: int,
      index: js.typedarray.Uint16Array,
      data: js.typedarray.Uint16Array
    ) = this()
    def this(
      initialValue: int,
      errorValue: int,
      highStart: int,
      highValueIndex: int,
      index: js.typedarray.Uint16Array,
      data: js.typedarray.Uint32Array
    ) = this()
    
    var data: js.typedarray.Uint32Array | js.typedarray.Uint16Array | js.Array[Double] = js.native
    
    var errorValue: int = js.native
    
    /**
      * Get the value for a code point as stored in the Trie.
      *
      * @param codePoint the code point
      * @return the value
      */
    def get(codePoint: Double): Double = js.native
    
    var highStart: int = js.native
    
    var highValueIndex: int = js.native
    
    var index: js.typedarray.Uint16Array | js.Array[Double] = js.native
    
    var initialValue: int = js.native
  }
  
  @JSImport("utrie/dist/types/Trie", "UTRIE2_DATA_BLOCK_LENGTH")
  @js.native
  val UTRIE2_DATA_BLOCK_LENGTH: Double = js.native
  
  @JSImport("utrie/dist/types/Trie", "UTRIE2_DATA_MASK")
  @js.native
  val UTRIE2_DATA_MASK: Double = js.native
  
  @JSImport("utrie/dist/types/Trie", "UTRIE2_INDEX_1_OFFSET")
  @js.native
  val UTRIE2_INDEX_1_OFFSET: Double = js.native
  
  @JSImport("utrie/dist/types/Trie", "UTRIE2_INDEX_2_BLOCK_LENGTH")
  @js.native
  val UTRIE2_INDEX_2_BLOCK_LENGTH: Double = js.native
  
  @JSImport("utrie/dist/types/Trie", "UTRIE2_INDEX_2_BMP_LENGTH")
  @js.native
  val UTRIE2_INDEX_2_BMP_LENGTH: Double = js.native
  
  @JSImport("utrie/dist/types/Trie", "UTRIE2_INDEX_2_MASK")
  @js.native
  val UTRIE2_INDEX_2_MASK: Double = js.native
  
  @JSImport("utrie/dist/types/Trie", "UTRIE2_INDEX_SHIFT")
  @js.native
  val UTRIE2_INDEX_SHIFT: /* 2 */ Double = js.native
  
  @JSImport("utrie/dist/types/Trie", "UTRIE2_LSCP_INDEX_2_LENGTH")
  @js.native
  val UTRIE2_LSCP_INDEX_2_LENGTH: Double = js.native
  
  @JSImport("utrie/dist/types/Trie", "UTRIE2_LSCP_INDEX_2_OFFSET")
  @js.native
  val UTRIE2_LSCP_INDEX_2_OFFSET: Double = js.native
  
  @JSImport("utrie/dist/types/Trie", "UTRIE2_OMITTED_BMP_INDEX_1_LENGTH")
  @js.native
  val UTRIE2_OMITTED_BMP_INDEX_1_LENGTH: Double = js.native
  
  @JSImport("utrie/dist/types/Trie", "UTRIE2_SHIFT_1")
  @js.native
  val UTRIE2_SHIFT_1: Double = js.native
  
  @JSImport("utrie/dist/types/Trie", "UTRIE2_SHIFT_1_2")
  @js.native
  val UTRIE2_SHIFT_1_2: Double = js.native
  
  @JSImport("utrie/dist/types/Trie", "UTRIE2_SHIFT_2")
  @js.native
  val UTRIE2_SHIFT_2: /* 5 */ Double = js.native
  
  @JSImport("utrie/dist/types/Trie", "UTRIE2_UTF8_2B_INDEX_2_LENGTH")
  @js.native
  val UTRIE2_UTF8_2B_INDEX_2_LENGTH: Double = js.native
  
  @JSImport("utrie/dist/types/Trie", "UTRIE2_UTF8_2B_INDEX_2_OFFSET")
  @js.native
  val UTRIE2_UTF8_2B_INDEX_2_OFFSET: Double = js.native
  
  inline def createTrieFromBase64(base64: String, _byteLength: Double): Trie = (^.asInstanceOf[js.Dynamic].applyDynamic("createTrieFromBase64")(base64.asInstanceOf[js.Any], _byteLength.asInstanceOf[js.Any])).asInstanceOf[Trie]
  
  type int = Double
}
