package typings.vsoNodeApi.workInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BoardChart extends BoardChartReference {
  /**
    * The links for the resource
    */
  var _links: js.Any
  /**
    * The settings for the resource
    */
  var settings: StringDictionary[js.Any]
}

object BoardChart {
  @scala.inline
  def apply(_links: js.Any, name: String, settings: StringDictionary[js.Any], url: String): BoardChart = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], settings = settings.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[BoardChart]
  }
}

