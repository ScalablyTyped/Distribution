package typings
package typedocLib.distLibSerializationBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParameterReflectionObject
  extends ReflectionObject
     with TypeContainer
     with DefaultValueContainer

object ParameterReflectionObject {
  @scala.inline
  def apply(
    defaultValue: java.lang.String,
    flags: ReflectionFlagsObject,
    id: scala.Double,
    kind: scala.Double,
    kindString: java.lang.String,
    name: java.lang.String,
    `type`: TypeObject,
    originalName: java.lang.String = null
  ): ParameterReflectionObject = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue, flags = flags, id = id, kind = kind, kindString = kindString, name = name)
    __obj.updateDynamic("type")(`type`)
    if (originalName != null) __obj.updateDynamic("originalName")(originalName)
    __obj.asInstanceOf[ParameterReflectionObject]
  }
}

