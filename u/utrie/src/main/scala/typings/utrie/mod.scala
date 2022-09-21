package typings.utrie

import typings.utrie.trieMod.int
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("utrie", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("utrie", "Trie")
  @js.native
  open class Trie protected ()
    extends typings.utrie.trieMod.Trie {
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
  }
  
  @JSImport("utrie", "TrieBuilder")
  @js.native
  open class TrieBuilder ()
    extends typings.utrie.trieBuilderMod.TrieBuilder {
    def this(initialValue: int) = this()
    def this(initialValue: Unit, errorValue: int) = this()
    def this(initialValue: int, errorValue: int) = this()
  }
  
  inline def createTrieFromBase64(base64: String, _byteLength: Double): typings.utrie.trieMod.Trie = (^.asInstanceOf[js.Dynamic].applyDynamic("createTrieFromBase64")(base64.asInstanceOf[js.Any], _byteLength.asInstanceOf[js.Any])).asInstanceOf[typings.utrie.trieMod.Trie]
  
  inline def serializeBase64(trie: typings.utrie.trieMod.Trie): js.Tuple2[String, Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("serializeBase64")(trie.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[String, Double]]
}
