package typings.tcomb.anon

import typings.tcomb.mod.Constructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Codomain[T] extends js.Object {
  var codomain: T
  var domain: Constructor[String]
  var identity: Boolean
  var kind: String
  var name: String
}

object Codomain {
  @scala.inline
  def apply[T](codomain: T, domain: Constructor[String], identity: Boolean, kind: String, name: String): Codomain[T] = {
    val __obj = js.Dynamic.literal(codomain = codomain.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Codomain[T]]
  }
}

