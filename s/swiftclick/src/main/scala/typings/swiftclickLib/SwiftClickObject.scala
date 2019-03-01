package typings
package swiftclickLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwiftClickObject extends js.Object {
  def addNodeNamesToTrack(nodeNamesArray: js.Array[java.lang.String]): scala.Unit
  def replaceNodeNamesToTrack(nodeNamesArray: js.Array[java.lang.String]): scala.Unit
  def useCssParser(useParser: scala.Boolean): scala.Unit
}

object SwiftClickObject {
  @scala.inline
  def apply(
    addNodeNamesToTrack: js.Function1[js.Array[java.lang.String], scala.Unit],
    replaceNodeNamesToTrack: js.Function1[js.Array[java.lang.String], scala.Unit],
    useCssParser: js.Function1[scala.Boolean, scala.Unit]
  ): SwiftClickObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addNodeNamesToTrack")(addNodeNamesToTrack)
    __obj.updateDynamic("replaceNodeNamesToTrack")(replaceNodeNamesToTrack)
    __obj.updateDynamic("useCssParser")(useCssParser)
    __obj.asInstanceOf[SwiftClickObject]
  }
}

