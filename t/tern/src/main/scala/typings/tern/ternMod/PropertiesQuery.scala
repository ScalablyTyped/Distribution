package typings.tern.ternMod

import typings.tern.ternStrings.properties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PropertiesQuery
  extends BaseQuery
     with Query {
  /** Causes the server to only return properties that start with the given string. */
  var prefix: js.UndefOr[String] = js.native
  /** Whether the result should be sorted. Default `true` */
  var sort: js.UndefOr[Boolean] = js.native
  /** Get a list of all known object property names (for any object). */
  @JSName("type")
  var type_PropertiesQuery: properties = js.native
}

object PropertiesQuery {
  @scala.inline
  def apply(`type`: properties): PropertiesQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertiesQuery]
  }
  @scala.inline
  implicit class PropertiesQueryOps[Self <: PropertiesQuery] (val x: Self) extends AnyVal {
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
    def setType(value: properties): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    @scala.inline
    def setSort(value: Boolean): Self = this.set("sort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
  }
  
}

