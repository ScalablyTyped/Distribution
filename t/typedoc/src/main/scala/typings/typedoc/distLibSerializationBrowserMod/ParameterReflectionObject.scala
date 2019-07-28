package typings.typedoc.distLibSerializationBrowserMod

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
    defaultValue: String,
    flags: ReflectionFlagsObject,
    id: Double,
    kind: Double,
    kindString: String,
    name: String,
    `type`: TypeObject,
    originalName: String = null
  ): ParameterReflectionObject = {
    val __obj = js.Dynamic.literal(defaultValue = defaultValue, flags = flags, id = id, kind = kind, kindString = kindString, name = name)
    __obj.updateDynamic("type")(`type`)
    if (originalName != null) __obj.updateDynamic("originalName")(originalName)
    __obj.asInstanceOf[ParameterReflectionObject]
  }
}

