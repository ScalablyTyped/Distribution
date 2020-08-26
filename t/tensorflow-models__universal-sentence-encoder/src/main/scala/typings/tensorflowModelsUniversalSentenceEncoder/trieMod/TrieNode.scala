package typings.tensorflowModelsUniversalSentenceEncoder.trieMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TrieNode extends js.Object {
  var children: StringDictionary[TrieNode] = js.native
  var end: Boolean = js.native
  var parent: TrieNode = js.native
  var word: OutputNode = js.native
}

object TrieNode {
  @scala.inline
  def apply(children: StringDictionary[TrieNode], end: Boolean, parent: TrieNode, word: OutputNode): TrieNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], word = word.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrieNode]
  }
  @scala.inline
  implicit class TrieNodeOps[Self <: TrieNode] (val x: Self) extends AnyVal {
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
    def setChildren(value: StringDictionary[TrieNode]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnd(value: Boolean): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: TrieNode): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setWord(value: OutputNode): Self = this.set("word", value.asInstanceOf[js.Any])
  }
  
}

