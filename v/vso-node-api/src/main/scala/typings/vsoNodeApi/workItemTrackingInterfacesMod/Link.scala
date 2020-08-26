package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Link extends js.Object {
  /**
    * Collection of link attributes.
    */
  var attributes: StringDictionary[js.Any] = js.native
  /**
    * Relation type.
    */
  var rel: String = js.native
  /**
    * Link url.
    */
  var url: String = js.native
}

object Link {
  @scala.inline
  def apply(attributes: StringDictionary[js.Any], rel: String, url: String): Link = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], rel = rel.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Link]
  }
  @scala.inline
  implicit class LinkOps[Self <: Link] (val x: Self) extends AnyVal {
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
    def setAttributes(value: StringDictionary[js.Any]): Self = this.set("attributes", value.asInstanceOf[js.Any])
    @scala.inline
    def setRel(value: String): Self = this.set("rel", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

