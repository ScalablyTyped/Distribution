package typings.weixinApp.wx

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EventTarget extends js.Object {
  var dataset: StringDictionary[String] = js.native
  var id: String = js.native
  var tagName: String = js.native
}

object EventTarget {
  @scala.inline
  def apply(dataset: StringDictionary[String], id: String, tagName: String): EventTarget = {
    val __obj = js.Dynamic.literal(dataset = dataset.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], tagName = tagName.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventTarget]
  }
  @scala.inline
  implicit class EventTargetOps[Self <: EventTarget] (val x: Self) extends AnyVal {
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
    def setDataset(value: StringDictionary[String]): Self = this.set("dataset", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setTagName(value: String): Self = this.set("tagName", value.asInstanceOf[js.Any])
  }
  
}

