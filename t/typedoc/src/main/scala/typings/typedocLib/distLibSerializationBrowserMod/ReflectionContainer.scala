package typings
package typedocLib.distLibSerializationBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReflectionContainer extends js.Object {
  var flags: ReflectionFlagsObject
  var id: scala.Double
  var kind: scala.Double
  var kindString: java.lang.String
  var name: java.lang.String
  var originalName: js.UndefOr[java.lang.String] = js.undefined
}

object ReflectionContainer {
  @scala.inline
  def apply(
    flags: ReflectionFlagsObject,
    id: scala.Double,
    kind: scala.Double,
    kindString: java.lang.String,
    name: java.lang.String,
    originalName: java.lang.String = null
  ): ReflectionContainer = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("flags")(flags)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("kindString")(kindString)
    __obj.updateDynamic("name")(name)
    if (originalName != null) __obj.updateDynamic("originalName")(originalName)
    __obj.asInstanceOf[ReflectionContainer]
  }
}

