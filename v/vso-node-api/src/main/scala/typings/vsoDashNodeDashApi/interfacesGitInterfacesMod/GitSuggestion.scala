package typings.vsoDashNodeDashApi.interfacesGitInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitSuggestion extends js.Object {
  /**
    * Specific properties describing the suggestion.
    */
  var properties: StringDictionary[js.Any]
  /**
    * The type of suggestion (e.g. pull request).
    */
  var `type`: String
}

object GitSuggestion {
  @scala.inline
  def apply(properties: StringDictionary[js.Any], `type`: String): GitSuggestion = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitSuggestion]
  }
}

