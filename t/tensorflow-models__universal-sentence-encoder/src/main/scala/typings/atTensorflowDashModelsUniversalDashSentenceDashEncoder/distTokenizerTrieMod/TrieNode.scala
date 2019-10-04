package typings.atTensorflowDashModelsUniversalDashSentenceDashEncoder.distTokenizerTrieMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrieNode extends js.Object {
  var children: StringDictionary[TrieNode]
  var end: Boolean
  var parent: TrieNode
  var word: OutputNode
}

object TrieNode {
  @scala.inline
  def apply(children: StringDictionary[TrieNode], end: Boolean, parent: TrieNode, word: OutputNode): TrieNode = {
    val __obj = js.Dynamic.literal(children = children, end = end, parent = parent, word = word)
  
    __obj.asInstanceOf[TrieNode]
  }
}

