package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Issue extends js.Object {
  var category: String
  var data: StringDictionary[String]
  var message: String
  var `type`: IssueType
}

object Issue {
  @scala.inline
  def apply(category: String, data: StringDictionary[String], message: String, `type`: IssueType): Issue = {
    val __obj = js.Dynamic.literal(category = category, data = data, message = message)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Issue]
  }
}

