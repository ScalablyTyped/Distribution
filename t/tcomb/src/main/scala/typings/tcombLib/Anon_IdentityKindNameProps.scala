package typings
package tcombLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IdentityKindNameProps extends js.Object {
  var identity: scala.Boolean
  var kind: java.lang.String
  var name: java.lang.String
  var props: StructProps
  var strict: scala.Boolean
}

object Anon_IdentityKindNameProps {
  @scala.inline
  def apply(
    identity: scala.Boolean,
    kind: java.lang.String,
    name: java.lang.String,
    props: StructProps,
    strict: scala.Boolean
  ): Anon_IdentityKindNameProps = {
    val __obj = js.Dynamic.literal(identity = identity, kind = kind, name = name, props = props, strict = strict)
  
    __obj.asInstanceOf[Anon_IdentityKindNameProps]
  }
}

