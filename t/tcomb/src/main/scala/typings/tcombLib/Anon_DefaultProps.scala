package typings
package tcombLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DefaultProps extends js.Object {
  var defaultProps: js.Object
  var identity: scala.Boolean
  var kind: java.lang.String
  var name: java.lang.String
  var props: StructProps
  var strict: scala.Boolean
}

object Anon_DefaultProps {
  @scala.inline
  def apply(
    defaultProps: js.Object,
    identity: scala.Boolean,
    kind: java.lang.String,
    name: java.lang.String,
    props: StructProps,
    strict: scala.Boolean
  ): Anon_DefaultProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("defaultProps")(defaultProps)
    __obj.updateDynamic("identity")(identity)
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("props")(props)
    __obj.updateDynamic("strict")(strict)
    __obj.asInstanceOf[Anon_DefaultProps]
  }
}

