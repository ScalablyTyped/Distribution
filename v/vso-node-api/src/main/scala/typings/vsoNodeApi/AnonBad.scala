package typings.vsoNodeApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBad extends js.Object {
  var bad: Double
  var blob: Double
  var commit: Double
  var ext2: Double
  var ofsDelta: Double
  var refDelta: Double
  var tag: Double
  var tree: Double
}

object AnonBad {
  @scala.inline
  def apply(
    bad: Double,
    blob: Double,
    commit: Double,
    ext2: Double,
    ofsDelta: Double,
    refDelta: Double,
    tag: Double,
    tree: Double
  ): AnonBad = {
    val __obj = js.Dynamic.literal(bad = bad.asInstanceOf[js.Any], blob = blob.asInstanceOf[js.Any], commit = commit.asInstanceOf[js.Any], ext2 = ext2.asInstanceOf[js.Any], ofsDelta = ofsDelta.asInstanceOf[js.Any], refDelta = refDelta.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any], tree = tree.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBad]
  }
}

