package typings.tensorflowModelsUniversalSentenceEncoder

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object trieMod {
  
  @JSImport("@tensorflow-models/universal-sentence-encoder/dist/tokenizer/trie", "Trie")
  @js.native
  class Trie () extends StObject {
    
    /**
      * Returns an array of all tokens starting with ss.
      *
      * @param ss The prefix to match on.
      */
    def commonPrefixSearch(ss: js.Array[String]): js.Array[OutputNode] = js.native
    
    /**
      * Inserts a token into the trie.
      */
    def insert(word: String, score: Double, index: Double): Unit = js.native
    
    var root: TrieNode = js.native
  }
  
  type OutputNode = js.Tuple3[js.Array[String], Double, Double]
  
  trait TrieNode extends StObject {
    
    var children: StringDictionary[TrieNode]
    
    var end: Boolean
    
    var parent: TrieNode
    
    var word: OutputNode
  }
  object TrieNode {
    
    @scala.inline
    def apply(children: StringDictionary[TrieNode], end: Boolean, parent: TrieNode, word: OutputNode): TrieNode = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], word = word.asInstanceOf[js.Any])
      __obj.asInstanceOf[TrieNode]
    }
    
    @scala.inline
    implicit class TrieNodeMutableBuilder[Self <: TrieNode] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: StringDictionary[TrieNode]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnd(value: Boolean): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParent(value: TrieNode): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWord(value: OutputNode): Self = StObject.set(x, "word", value.asInstanceOf[js.Any])
    }
  }
}
