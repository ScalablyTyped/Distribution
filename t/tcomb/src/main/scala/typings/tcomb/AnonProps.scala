package typings.tcomb

import typings.tcomb.mod.StructProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonProps extends js.Object {
  var identity: Boolean
  var kind: String
  var name: String
  var props: StructProps
  var strict: Boolean
}

object AnonProps {
  @scala.inline
  def apply(identity: Boolean, kind: String, name: String, props: StructProps, strict: Boolean): AnonProps = {
    val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], strict = strict.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonProps]
  }
}

