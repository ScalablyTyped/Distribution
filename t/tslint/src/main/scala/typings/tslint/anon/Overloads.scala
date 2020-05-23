package typings.tslint.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Overloads extends js.Object {
  var overloads: Type
  var privacies: Enum
  var tags: Properties
}

object Overloads {
  @scala.inline
  def apply(overloads: Type, privacies: Enum, tags: Properties): Overloads = {
    val __obj = js.Dynamic.literal(overloads = overloads.asInstanceOf[js.Any], privacies = privacies.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[Overloads]
  }
}

