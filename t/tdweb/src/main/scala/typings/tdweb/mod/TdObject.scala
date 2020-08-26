package typings.tdweb.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TdObject
  extends /* key */ StringDictionary[
      js.UndefOr[
        TdObject | (js.Array[Boolean | Double | String | TdObject]) | Double | String | Boolean
      ]
    ] {
  var `@extra`: js.UndefOr[String] = js.native
  var `@type`: String = js.native
}

object TdObject {
  @scala.inline
  def apply(`@type`: String): TdObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("@type")(`@type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TdObject]
  }
  @scala.inline
  implicit class TdObjectOps[Self <: TdObject] (val x: Self) extends AnyVal {
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
    def `set@type`(value: String): Self = this.set("@type", value.asInstanceOf[js.Any])
    @scala.inline
    def `set@extra`(value: String): Self = this.set("@extra", value.asInstanceOf[js.Any])
    @scala.inline
    def `delete@extra`: Self = this.set("@extra", js.undefined)
  }
  
}

