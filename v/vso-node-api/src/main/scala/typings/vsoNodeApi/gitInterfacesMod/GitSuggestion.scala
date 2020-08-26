package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GitSuggestion extends js.Object {
  /**
    * Specific properties describing the suggestion.
    */
  var properties: StringDictionary[js.Any] = js.native
  /**
    * The type of suggestion (e.g. pull request).
    */
  var `type`: String = js.native
}

object GitSuggestion {
  @scala.inline
  def apply(properties: StringDictionary[js.Any], `type`: String): GitSuggestion = {
    val __obj = js.Dynamic.literal(properties = properties.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitSuggestion]
  }
  @scala.inline
  implicit class GitSuggestionOps[Self <: GitSuggestion] (val x: Self) extends AnyVal {
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
    def setProperties(value: StringDictionary[js.Any]): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

