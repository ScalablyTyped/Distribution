package typings.wordpressEditor.providerMod.EditorProvider

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import typings.std.Record
import typings.wordpressBlocks.mod.BlockInstance
import typings.wordpressEditor.anon.PartialEditorSettings
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var blocks: js.UndefOr[js.Array[BlockInstance[StringDictionary[_]]]] = js.undefined
  var children: ReactNode
  var initialEdits: js.UndefOr[js.Object] = js.undefined
  var post: Record[String, _]
  var settings: js.UndefOr[PartialEditorSettings] = js.undefined
  var useSubRegistry: js.UndefOr[Boolean] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    post: Record[String, _],
    blocks: js.Array[BlockInstance[StringDictionary[_]]] = null,
    children: ReactNode = null,
    initialEdits: js.Object = null,
    settings: PartialEditorSettings = null,
    useSubRegistry: js.UndefOr[Boolean] = js.undefined
  ): Props = {
    val __obj = js.Dynamic.literal(post = post.asInstanceOf[js.Any])
    if (blocks != null) __obj.updateDynamic("blocks")(blocks.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (initialEdits != null) __obj.updateDynamic("initialEdits")(initialEdits.asInstanceOf[js.Any])
    if (settings != null) __obj.updateDynamic("settings")(settings.asInstanceOf[js.Any])
    if (!js.isUndefined(useSubRegistry)) __obj.updateDynamic("useSubRegistry")(useSubRegistry.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

