package typings.webfontloader.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Custom extends js.Object {
  var families: js.UndefOr[js.Array[String]] = js.native
  var testStrings: js.UndefOr[StringDictionary[String]] = js.native
  var urls: js.UndefOr[js.Array[String]] = js.native
}

object Custom {
  @scala.inline
  def apply(): Custom = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Custom]
  }
  @scala.inline
  implicit class CustomOps[Self <: Custom] (val x: Self) extends AnyVal {
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
    def setFamiliesVarargs(value: String*): Self = this.set("families", js.Array(value :_*))
    @scala.inline
    def setFamilies(value: js.Array[String]): Self = this.set("families", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFamilies: Self = this.set("families", js.undefined)
    @scala.inline
    def setTestStrings(value: StringDictionary[String]): Self = this.set("testStrings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTestStrings: Self = this.set("testStrings", js.undefined)
    @scala.inline
    def setUrlsVarargs(value: String*): Self = this.set("urls", js.Array(value :_*))
    @scala.inline
    def setUrls(value: js.Array[String]): Self = this.set("urls", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrls: Self = this.set("urls", js.undefined)
  }
  
}

