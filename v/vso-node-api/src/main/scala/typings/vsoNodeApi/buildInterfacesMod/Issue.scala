package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Issue extends js.Object {
  /**
    * The category.
    */
  var category: String = js.native
  var data: StringDictionary[String] = js.native
  /**
    * A description of the issue.
    */
  var message: String = js.native
  /**
    * The type (error, warning) of the issue.
    */
  var `type`: IssueType = js.native
}

object Issue {
  @scala.inline
  def apply(category: String, data: StringDictionary[String], message: String, `type`: IssueType): Issue = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Issue]
  }
  @scala.inline
  implicit class IssueOps[Self <: Issue] (val x: Self) extends AnyVal {
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
    def setCategory(value: String): Self = this.set("category", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: StringDictionary[String]): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: IssueType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

