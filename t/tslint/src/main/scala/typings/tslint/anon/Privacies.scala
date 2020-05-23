package typings.tslint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Privacies extends js.Object {
  var locations: Enum
  var overloads: Type
  var privacies: Enum
  var tags: Properties
}

object Privacies {
  @scala.inline
  def apply(locations: Enum, overloads: Type, privacies: Enum, tags: Properties): Privacies = {
    val __obj = js.Dynamic.literal(locations = locations.asInstanceOf[js.Any], overloads = overloads.asInstanceOf[js.Any], privacies = privacies.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Privacies]
  }
}

