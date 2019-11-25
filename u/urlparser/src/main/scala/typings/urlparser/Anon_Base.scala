package typings.urlparser

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Base extends js.Object {
  var base: String
  var hash: String
  var name: String
}

object Anon_Base {
  @scala.inline
  def apply(base: String, hash: String, name: String): Anon_Base = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Base]
  }
}

