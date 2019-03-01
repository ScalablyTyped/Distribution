package typings
package vsoDashNodeDashApiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bad extends js.Object {
  var bad: scala.Double
  var blob: scala.Double
  var commit: scala.Double
  var ext2: scala.Double
  var ofsDelta: scala.Double
  var refDelta: scala.Double
  var tag: scala.Double
  var tree: scala.Double
}

object Anon_Bad {
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
  ): Anon_Bad = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bad")(bad)
    __obj.updateDynamic("blob")(blob)
    __obj.updateDynamic("commit")(commit)
    __obj.updateDynamic("ext2")(ext2)
    __obj.updateDynamic("ofsDelta")(ofsDelta)
    __obj.updateDynamic("refDelta")(refDelta)
    __obj.updateDynamic("tag")(tag)
    __obj.updateDynamic("tree")(tree)
    __obj.asInstanceOf[Anon_Bad]
  }
}

