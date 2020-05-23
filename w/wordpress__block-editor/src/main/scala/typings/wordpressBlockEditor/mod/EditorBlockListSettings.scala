package typings.wordpressBlockEditor.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EditorBlockListSettings extends js.Object {
  var allowedBlocks: js.UndefOr[js.Array[String]] = js.undefined
  var templateLock: js.UndefOr[EditorTemplateLock] = js.undefined
}

object EditorBlockListSettings {
  @scala.inline
  def apply(allowedBlocks: js.Array[String] = null, templateLock: EditorTemplateLock = null): EditorBlockListSettings = {
    val __obj = js.Dynamic.literal()
    if (allowedBlocks != null) __obj.updateDynamic("allowedBlocks")(allowedBlocks.asInstanceOf[js.Any])
    if (templateLock != null) __obj.updateDynamic("templateLock")(templateLock.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditorBlockListSettings]
  }
}

