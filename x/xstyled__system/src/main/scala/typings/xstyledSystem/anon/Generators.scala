package typings.xstyledSystem.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Generators extends js.Object {
  var generators: js.UndefOr[js.Array[_]] = js.undefined
  var getStyle: js.Any
  var props: js.Array[String]
}

object Generators {
  @scala.inline
  def apply(getStyle: js.Any, props: js.Array[String], generators: js.Array[_] = null): Generators = {
    val __obj = js.Dynamic.literal(getStyle = getStyle.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    if (generators != null) __obj.updateDynamic("generators")(generators.asInstanceOf[js.Any])
    __obj.asInstanceOf[Generators]
  }
}

