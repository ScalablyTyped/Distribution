package typings
package webpackLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Id extends js.Object {
  var id: scala.Double | java.lang.String
  var identifier: java.lang.String
  var name: java.lang.String
  var profile: js.Any
}

object Anon_Id {
  @scala.inline
  def apply(
    id: scala.Double | java.lang.String,
    identifier: java.lang.String,
    name: java.lang.String,
    profile: js.Any
  ): Anon_Id = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], identifier = identifier, name = name, profile = profile)
  
    __obj.asInstanceOf[Anon_Id]
  }
}

