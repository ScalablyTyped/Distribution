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
    val __obj = js.Dynamic.literal(attributes = attributes, rel = rel, url = url)
  
    __obj.asInstanceOf[Link]
  }
}

