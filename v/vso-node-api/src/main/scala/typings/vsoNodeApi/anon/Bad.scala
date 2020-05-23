package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Bad extends js.Object {
  var bad: scala.Double
  var blob: scala.Double
  var commit: scala.Double
  var ext2: scala.Double
  var ofsDelta: scala.Double
  var refDelta: scala.Double
  var tag: scala.Double
  var tree: scala.Double
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
}

