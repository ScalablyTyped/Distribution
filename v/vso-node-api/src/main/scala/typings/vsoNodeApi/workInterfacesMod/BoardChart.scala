package typings.vsoNodeApi.workInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BoardChart extends BoardChartReference {
  /**
    * The links for the resource
    */
  var _links: js.Any = js.native
  /**
    * The settings for the resource
    */
  var settings: StringDictionary[js.Any] = js.native
}

object BoardChart {
  @scala.inline
  def apply(_links: js.Any, name: String, settings: StringDictionary[js.Any], url: String): BoardChart = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoardChart]
  }
  @scala.inline
  implicit class BoardChartOps[Self <: BoardChart] (val x: Self) extends AnyVal {
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
    def set_links(value: js.Any): Self = this.set("_links", value.asInstanceOf[js.Any])
    @scala.inline
    def setSettings(value: StringDictionary[js.Any]): Self = this.set("settings", value.asInstanceOf[js.Any])
  }
  
}

