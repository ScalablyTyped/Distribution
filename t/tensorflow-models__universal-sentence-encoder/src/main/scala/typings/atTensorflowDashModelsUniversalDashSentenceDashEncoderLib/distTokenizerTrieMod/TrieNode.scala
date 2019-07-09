package typings
package atTensorflowDashModelsUniversalDashSentenceDashEncoderLib.distTokenizerTrieMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TrieNode extends js.Object {
  var children: org.scalablytyped.runtime.StringDictionary[TrieNode]
  var end: scala.Boolean
  var index: scala.Double
  var key: js.Any
  var parent: TrieNode
  var score: scala.Double
  def getWord(): OutputNode
}

object TrieNode {
  @scala.inline
  def apply(
    children: org.scalablytyped.runtime.StringDictionary[TrieNode],
    end: scala.Boolean,
    getWord: () => OutputNode,
    index: scala.Double,
    key: js.Any,
    parent: TrieNode,
    score: scala.Double
  ): TrieNode = {
    val __obj = js.Dynamic.literal(children = children, end = end, getWord = js.Any.fromFunction0(getWord), index = index, key = key, parent = parent, score = score)
  
    __obj.asInstanceOf[TrieNode]
  }
}

