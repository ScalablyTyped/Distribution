package typings.webicon.iconOptionsAliasOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AliasOptions extends js.Object {
  /**
    * The icon-set this alias refers to.
    */
  var alias: String
}

object AliasOptions {
  @scala.inline
  def apply(alias: String): AliasOptions = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AliasOptions]
  }
}

