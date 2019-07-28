package typings.tcomb

import typings.tcomb.tcombMod.Constructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Codomain[T] extends js.Object {
  var codomain: T
  var domain: Constructor[String]
  var identity: Boolean
  var kind: String
  var name: String
}

object Anon_Codomain {
  @scala.inline
  def apply[T](codomain: T, domain: Constructor[String], identity: Boolean, kind: String, name: String): Anon_Codomain[T] = {
    val __obj = js.Dynamic.literal(codomain = codomain.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], identity = identity, kind = kind, name = name)
  
    __obj.asInstanceOf[Anon_Codomain[T]]
  }
}

