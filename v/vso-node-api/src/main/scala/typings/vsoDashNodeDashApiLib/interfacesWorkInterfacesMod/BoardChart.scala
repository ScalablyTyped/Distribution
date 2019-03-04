package typings
package vsoDashNodeDashApiLib.interfacesWorkInterfacesMod

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
  var settings: org.scalablytyped.runtime.StringDictionary[js.Any]
}

object BoardChart {
  @scala.inline
  def apply(
    _links: js.Any,
    name: java.lang.String,
    settings: org.scalablytyped.runtime.StringDictionary[js.Any],
    url: java.lang.String
  ): BoardChart = {
    val __obj = js.Dynamic.literal(_links = _links, name = name, settings = settings, url = url)
  
    __obj.asInstanceOf[BoardChart]
  }
}

