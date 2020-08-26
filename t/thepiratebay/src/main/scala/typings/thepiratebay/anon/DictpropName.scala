package typings.thepiratebay.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DictpropName
  extends /* propName */ StringDictionary[js.Any] {
  var link: String = js.native
}

object DictpropName {
  @scala.inline
  def apply(link: String): DictpropName = {
    val __obj = js.Dynamic.literal(link = link.asInstanceOf[js.Any])
    __obj.asInstanceOf[DictpropName]
  }
  @scala.inline
  implicit class DictpropNameOps[Self <: DictpropName] (val x: Self) extends AnyVal {
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
    def setLink(value: String): Self = this.set("link", value.asInstanceOf[js.Any])
  }
  
}

