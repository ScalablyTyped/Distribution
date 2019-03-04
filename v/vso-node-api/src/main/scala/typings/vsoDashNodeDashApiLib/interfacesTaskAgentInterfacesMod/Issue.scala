package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Issue extends js.Object {
  var category: java.lang.String
  var data: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  var message: java.lang.String
  var `type`: IssueType
}

object Issue {
  @scala.inline
  def apply(
    category: java.lang.String,
    data: org.scalablytyped.runtime.StringDictionary[java.lang.String],
    message: java.lang.String,
    `type`: IssueType
  ): Issue = {
    val __obj = js.Dynamic.literal(category = category, data = data, message = message)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Issue]
  }
}

