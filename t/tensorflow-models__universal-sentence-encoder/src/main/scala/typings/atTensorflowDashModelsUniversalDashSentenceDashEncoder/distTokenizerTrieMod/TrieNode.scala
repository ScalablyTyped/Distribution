package typings.atTensorflowDashModelsUniversalDashSentenceDashEncoder.distTokenizerTrieMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrieNode extends js.Object {
  var children: StringDictionary[TrieNode]
  var end: Boolean
  var index: Double
  var key: js.Any
  var parent: TrieNode
  var score: Double
  def getWord(): OutputNode
}

object TrieNode {
  @scala.inline
  def apply(
    children: StringDictionary[TrieNode],
    end: Boolean,
    getWord: () => OutputNode,
    index: Double,
    key: js.Any,
    parent: TrieNode,
    score: Double
  ): TrieNode = {
    val __obj = js.Dynamic.literal(children = children, end = end, getWord = js.Any.fromFunction0(getWord), index = index, key = key, parent = parent, score = score)
  
    __obj.asInstanceOf[TrieNode]
  }
}

