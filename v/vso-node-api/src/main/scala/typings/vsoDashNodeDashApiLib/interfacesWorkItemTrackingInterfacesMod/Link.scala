package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Link extends js.Object {
  /**
    * Collection of link attributes.
    */
  var attributes: org.scalablytyped.runtime.StringDictionary[js.Any]
  /**
    * Relation type.
    */
  var rel: java.lang.String
  /**
    * Link url.
    */
  var url: java.lang.String
}

object Link {
  @scala.inline
  def apply(
    attributes: org.scalablytyped.runtime.StringDictionary[js.Any],
    rel: java.lang.String,
    url: java.lang.String
  ): Link = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attributes")(attributes)
    __obj.updateDynamic("rel")(rel)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Link]
  }
}

