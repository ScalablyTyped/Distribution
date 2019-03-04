package typings
package tcombLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Codomain[T] extends js.Object {
  var codomain: T
  var domain: Constructor[java.lang.String]
  var identity: scala.Boolean
  var kind: java.lang.String
  var name: java.lang.String
}

object Anon_Codomain {
  @scala.inline
  def apply[T](
    codomain: T,
    domain: Constructor[java.lang.String],
    identity: scala.Boolean,
    kind: java.lang.String,
    name: java.lang.String
  ): Anon_Codomain[T] = {
    val __obj = js.Dynamic.literal(codomain = codomain.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], identity = identity, kind = kind, name = name)
  
    __obj.asInstanceOf[Anon_Codomain[T]]
  }
}

