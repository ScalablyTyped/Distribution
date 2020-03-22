package typings.typedoc.serializationEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SerializeEventData extends js.Object {
  var outputDirectory: js.UndefOr[String] = js.undefined
  var outputFile: js.UndefOr[String] = js.undefined
}

object SerializeEventData {
  @scala.inline
  def apply(outputDirectory: String = null, outputFile: String = null): SerializeEventData = {
    val __obj = js.Dynamic.literal()
    if (outputDirectory != null) __obj.updateDynamic("outputDirectory")(outputDirectory.asInstanceOf[js.Any])
    if (outputFile != null) __obj.updateDynamic("outputFile")(outputFile.asInstanceOf[js.Any])
    __obj.asInstanceOf[SerializeEventData]
  }
}

