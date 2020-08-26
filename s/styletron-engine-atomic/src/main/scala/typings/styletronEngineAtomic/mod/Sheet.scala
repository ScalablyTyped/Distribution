package typings.styletronEngineAtomic.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sheet extends js.Object {
  var attrs: StringDictionary[String] = js.native
  var css: String = js.native
}

object Sheet {
  @scala.inline
  def apply(attrs: StringDictionary[String], css: String): Sheet = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], css = css.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sheet]
  }
  @scala.inline
  implicit class SheetOps[Self <: Sheet] (val x: Self) extends AnyVal {
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
    def setAttrs(value: StringDictionary[String]): Self = this.set("attrs", value.asInstanceOf[js.Any])
    @scala.inline
    def setCss(value: String): Self = this.set("css", value.asInstanceOf[js.Any])
  }
  
}

