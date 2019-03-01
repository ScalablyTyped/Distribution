package typings
package vsoDashNodeDashApiLib.interfacesGitInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitSuggestion extends js.Object {
  /**
    * Specific properties describing the suggestion.
    */
  var properties: org.scalablytyped.runtime.StringDictionary[js.Any]
  /**
    * The type of suggestion (e.g. pull request).
    */
  var `type`: java.lang.String
}

object GitSuggestion {
  @scala.inline
  def apply(properties: org.scalablytyped.runtime.StringDictionary[js.Any], `type`: java.lang.String): GitSuggestion = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("properties")(properties)
    __obj.asInstanceOf[GitSuggestion]
  }
}

