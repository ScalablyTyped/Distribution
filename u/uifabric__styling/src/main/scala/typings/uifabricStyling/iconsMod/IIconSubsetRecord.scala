package typings.uifabricStyling.iconsMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IIconSubsetRecord extends IIconSubset {
  var className: js.UndefOr[String] = js.native
  var isRegistered: js.UndefOr[Boolean] = js.native
}

object IIconSubsetRecord {
  @scala.inline
  def apply(icons: StringDictionary[String | Element]): IIconSubsetRecord = {
    val __obj = js.Dynamic.literal(icons = icons.asInstanceOf[js.Any])
    __obj.asInstanceOf[IIconSubsetRecord]
  }
  @scala.inline
  implicit class IIconSubsetRecordOps[Self <: IIconSubsetRecord] (val x: Self) extends AnyVal {
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setIsRegistered(value: Boolean): Self = this.set("isRegistered", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsRegistered: Self = this.set("isRegistered", js.undefined)
  }
  
}

