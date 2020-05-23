package typings.typedoc.anon

import typings.typedoc.schemaMod.ModelToObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<typedoc.typedoc/dist/lib/serialization/schema.SourceReference> */
trait PartialSourceReference extends js.Object {
  var character: js.UndefOr[ModelToObject[Double] | Double] = js.undefined
  var fileName: js.UndefOr[ModelToObject[String] | String] = js.undefined
  var line: js.UndefOr[ModelToObject[Double] | Double] = js.undefined
}

object PartialSourceReference {
  @scala.inline
  def apply(
    character: ModelToObject[Double] | Double = null,
    fileName: ModelToObject[String] | String = null,
    line: ModelToObject[Double] | Double = null
  ): PartialSourceReference = {
    val __obj = js.Dynamic.literal()
    if (character != null) __obj.updateDynamic("character")(character.asInstanceOf[js.Any])
    if (fileName != null) __obj.updateDynamic("fileName")(fileName.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialSourceReference]
  }
}

