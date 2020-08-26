package typings.swiftclick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SwiftClickObject extends js.Object {
  def addNodeNamesToTrack(nodeNamesArray: js.Array[String]): Unit = js.native
  def replaceNodeNamesToTrack(nodeNamesArray: js.Array[String]): Unit = js.native
  def useCssParser(useParser: Boolean): Unit = js.native
}

object SwiftClickObject {
  @scala.inline
  def apply(
    addNodeNamesToTrack: js.Array[String] => Unit,
    replaceNodeNamesToTrack: js.Array[String] => Unit,
    useCssParser: Boolean => Unit
  ): SwiftClickObject = {
    val __obj = js.Dynamic.literal(addNodeNamesToTrack = js.Any.fromFunction1(addNodeNamesToTrack), replaceNodeNamesToTrack = js.Any.fromFunction1(replaceNodeNamesToTrack), useCssParser = js.Any.fromFunction1(useCssParser))
    __obj.asInstanceOf[SwiftClickObject]
  }
  @scala.inline
  implicit class SwiftClickObjectOps[Self <: SwiftClickObject] (val x: Self) extends AnyVal {
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
    def setAddNodeNamesToTrack(value: js.Array[String] => Unit): Self = this.set("addNodeNamesToTrack", js.Any.fromFunction1(value))
    @scala.inline
    def setReplaceNodeNamesToTrack(value: js.Array[String] => Unit): Self = this.set("replaceNodeNamesToTrack", js.Any.fromFunction1(value))
    @scala.inline
    def setUseCssParser(value: Boolean => Unit): Self = this.set("useCssParser", js.Any.fromFunction1(value))
  }
  
}

