package typings.tv4.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JsonSchema
  extends /* key */ StringDictionary[js.Any] {
  @JSName("$schema")
  var $schema: js.UndefOr[String] = js.native
  var additionalProperties: js.UndefOr[Boolean] = js.native
  var default: js.UndefOr[js.Any] = js.native
  var definitions: js.UndefOr[js.Any] = js.native
            // used for humans only, and not used for computation
  var description: js.UndefOr[String] = js.native
      // used for humans only, and not used for computation
  var id: js.UndefOr[String] = js.native
  var items: js.UndefOr[js.Any] = js.native
  var patternProperties: js.UndefOr[js.Any] = js.native
  var properties: js.UndefOr[js.Any] = js.native
  var required: js.UndefOr[js.Array[String]] = js.native
  var title: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String | js.Array[String]] = js.native
}

