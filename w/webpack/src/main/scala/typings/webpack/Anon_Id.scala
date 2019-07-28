package typings.webpack

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Id extends js.Object {
  var id: Double | String
  var identifier: String
  var name: String
  var profile: js.Any
}

object Anon_Id {
  @scala.inline
  def apply(id: Double | String, identifier: String, name: String, profile: js.Any): Anon_Id = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], identifier = identifier, name = name, profile = profile)
  
    __obj.asInstanceOf[Anon_Id]
  }
}

