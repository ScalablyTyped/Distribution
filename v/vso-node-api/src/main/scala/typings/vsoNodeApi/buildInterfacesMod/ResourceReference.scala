package typings.vsoNodeApi.buildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceReference extends js.Object {
  /**
    * An alias to be used when referencing the resource.
    */
  var alias: String
}

object ResourceReference {
  @scala.inline
  def apply(alias: String): ResourceReference = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ResourceReference]
  }
}

