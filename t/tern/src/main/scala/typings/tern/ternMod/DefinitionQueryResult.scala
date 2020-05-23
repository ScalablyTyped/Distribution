package typings.tern.ternMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefinitionQueryResult extends js.Object {
  /** A slice of the code in front of the definition Can be used to find a definition’s location in a modified file. */
  var context: js.UndefOr[String] = js.undefined
  /** The offset from the start of the context to the actual definition. Can be used to find a definition’s location in a modified file. */
  var contextOffset: js.UndefOr[Double] = js.undefined
  /** If the definition had documentation associated with it, these will also be returned. */
  var doc: js.UndefOr[String] = js.undefined
  /** The end position of the expression. */
  var end: js.UndefOr[Double | Position] = js.undefined
  /** The file in which the definition was defined. */
  var file: js.UndefOr[String] = js.undefined
  /** If the definition had origin information associated with it, these will also be returned. */
  var origin: js.UndefOr[String] = js.undefined
  /** The start position of the expression. */
  var start: js.UndefOr[Double | Position] = js.undefined
  /** If the definition had urls associated with it, these will also be returned. */
  var url: js.UndefOr[String] = js.undefined
}

object DefinitionQueryResult {
  @scala.inline
  def apply(
    context: String = null,
    contextOffset: js.UndefOr[Double] = js.undefined,
    doc: String = null,
    end: Double | Position = null,
    file: String = null,
    origin: String = null,
    start: Double | Position = null,
    url: String = null
  ): DefinitionQueryResult = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (!js.isUndefined(contextOffset)) __obj.updateDynamic("contextOffset")(contextOffset.get.asInstanceOf[js.Any])
    if (doc != null) __obj.updateDynamic("doc")(doc.asInstanceOf[js.Any])
    if (end != null) __obj.updateDynamic("end")(end.asInstanceOf[js.Any])
    if (file != null) __obj.updateDynamic("file")(file.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionQueryResult]
  }
}

