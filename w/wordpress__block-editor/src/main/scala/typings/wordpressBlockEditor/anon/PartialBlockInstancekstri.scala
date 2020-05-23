package typings.wordpressBlockEditor.anon

import org.scalablytyped.runtime.StringDictionary
import typings.wordpressBlocks.mod.BlockInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@wordpress/blocks.@wordpress/blocks.BlockInstance<{[k: string] : any}>> */
trait PartialBlockInstancekstri extends js.Object {
  var attributes: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  var clientId: js.UndefOr[String] = js.undefined
  var innerBlocks: js.UndefOr[js.Array[BlockInstance[StringDictionary[_]]]] = js.undefined
  var isValid: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var originalContent: js.UndefOr[String] = js.undefined
}

object PartialBlockInstancekstri {
  @scala.inline
  def apply(
    attributes: StringDictionary[js.Any] = null,
    clientId: String = null,
    innerBlocks: js.Array[BlockInstance[StringDictionary[_]]] = null,
    isValid: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    originalContent: String = null
  ): PartialBlockInstancekstri = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    if (innerBlocks != null) __obj.updateDynamic("innerBlocks")(innerBlocks.asInstanceOf[js.Any])
    if (!js.isUndefined(isValid)) __obj.updateDynamic("isValid")(isValid.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (originalContent != null) __obj.updateDynamic("originalContent")(originalContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialBlockInstancekstri]
  }
}

