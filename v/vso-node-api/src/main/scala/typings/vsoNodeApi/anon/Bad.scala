package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Bad extends js.Object {
  var bad: scala.Double = js.native
  var blob: scala.Double = js.native
  var commit: scala.Double = js.native
  var ext2: scala.Double = js.native
  var ofsDelta: scala.Double = js.native
  var refDelta: scala.Double = js.native
  var tag: scala.Double = js.native
  var tree: scala.Double = js.native
}

object Bad {
  @scala.inline
  def apply(
    bad: scala.Double,
    blob: scala.Double,
    commit: scala.Double,
    ext2: scala.Double,
    ofsDelta: scala.Double,
    refDelta: scala.Double,
    tag: scala.Double,
    tree: scala.Double
  ): Bad = {
    val __obj = js.Dynamic.literal(bad = bad.asInstanceOf[js.Any], blob = blob.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], ext2 = ext2.asInstanceOf[js.Any], ofsDelta = ofsDelta.asInstanceOf[js.Any], refDelta = refDelta.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bad]
  }
  @scala.inline
  implicit class BadOps[Self <: Bad] (val x: Self) extends AnyVal {
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
    def setBad(value: scala.Double): Self = this.set("bad", value.asInstanceOf[js.Any])
    @scala.inline
    def setBlob(value: scala.Double): Self = this.set("blob", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommit(value: scala.Double): Self = this.set("commit", value.asInstanceOf[js.Any])
    @scala.inline
    def setExt2(value: scala.Double): Self = this.set("ext2", value.asInstanceOf[js.Any])
    @scala.inline
    def setOfsDelta(value: scala.Double): Self = this.set("ofsDelta", value.asInstanceOf[js.Any])
    @scala.inline
    def setRefDelta(value: scala.Double): Self = this.set("refDelta", value.asInstanceOf[js.Any])
    @scala.inline
    def setTag(value: scala.Double): Self = this.set("tag", value.asInstanceOf[js.Any])
    @scala.inline
    def setTree(value: scala.Double): Self = this.set("tree", value.asInstanceOf[js.Any])
  }
  
}

