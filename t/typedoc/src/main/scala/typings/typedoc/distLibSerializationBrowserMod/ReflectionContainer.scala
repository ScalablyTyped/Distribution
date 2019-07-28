package typings.typedoc.distLibSerializationBrowserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReflectionContainer extends js.Object {
  var flags: ReflectionFlagsObject
  var id: Double
  var kind: Double
  var kindString: String
  var name: String
  var originalName: js.UndefOr[String] = js.undefined
}

object ReflectionContainer {
  @scala.inline
  def apply(
    flags: ReflectionFlagsObject,
    id: Double,
    kind: Double,
    kindString: String,
    name: String,
    originalName: String = null
  ): ReflectionContainer = {
    val __obj = js.Dynamic.literal(flags = flags, id = id, kind = kind, kindString = kindString, name = name)
    if (originalName != null) __obj.updateDynamic("originalName")(originalName)
    __obj.asInstanceOf[ReflectionContainer]
  }
}

