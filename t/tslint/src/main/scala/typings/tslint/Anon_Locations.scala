package typings.tslint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Locations extends js.Object {
  var locations: Anon_Enum
  var privacies: Anon_Enum
  var tags: Anon_Properties
}

object Anon_Locations {
  @scala.inline
  def apply(locations: Anon_Enum, privacies: Anon_Enum, tags: Anon_Properties): Anon_Locations = {
    val __obj = js.Dynamic.literal(locations = locations.asInstanceOf[js.Any], privacies = privacies.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Locations]
  }
}

