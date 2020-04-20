package typings.vsoNodeApi.profileInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttributesContainer extends js.Object {
  var attributes: StringDictionary[ProfileAttribute]
  var containerName: String
  var revision: Double
}

object AttributesContainer {
  @scala.inline
  def apply(attributes: StringDictionary[ProfileAttribute], containerName: String, revision: Double): AttributesContainer = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], containerName = containerName.asInstanceOf[js.Any], revision = revision.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributesContainer]
  }
}

