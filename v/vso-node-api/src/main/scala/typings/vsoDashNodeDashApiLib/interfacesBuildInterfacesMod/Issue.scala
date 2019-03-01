package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Issue extends js.Object {
  /**
    * The category.
    */
  var category: java.lang.String
  var data: org.scalablytyped.runtime.StringDictionary[java.lang.String]
  /**
    * A description of the issue.
    */
  var message: java.lang.String
  /**
    * The type (error, warning) of the issue.
    */
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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("category")(category)
    __obj.updateDynamic("data")(data)
    __obj.updateDynamic("message")(message)
    __obj.asInstanceOf[Issue]
  }
}

