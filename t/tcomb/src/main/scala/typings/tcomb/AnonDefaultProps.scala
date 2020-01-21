package typings.tcomb

import typings.tcomb.mod.StructProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefaultProps extends js.Object {
  var defaultProps: js.Object
  var identity: Boolean
  var kind: String
  var name: String
  var props: StructProps
  var strict: Boolean
}

object AnonDefaultProps {
  @scala.inline
  def apply(
    defaultProps: js.Object,
    identity: Boolean,
    kind: String,
    name: String,
    props: StructProps,
    strict: Boolean
  ): AnonDefaultProps = {
    val __obj = js.Dynamic.literal(defaultProps = defaultProps.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], strict = strict.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDefaultProps]
  }
}

