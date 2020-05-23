package typings.wordpressEditor.postPublishPanelMod.PostPublishPanel

import typings.react.mod.AllHTMLAttributes
import typings.react.mod.ClassAttributes
import typings.react.mod.ComponentType
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props
  extends AllHTMLAttributes[HTMLDivElement]
     with ClassAttributes[HTMLDivElement] {
  var PostPublishExtension: js.UndefOr[ComponentType[js.Object]] = js.undefined
  var PrePublishExtension: js.UndefOr[ComponentType[js.Object]] = js.undefined
  var forceIsDirty: js.UndefOr[Boolean] = js.undefined
  var forceIsSaving: js.UndefOr[Boolean] = js.undefined
  def onClose(): Unit
}

object Props {
  @scala.inline
  def apply(
    onClose: () => Unit,
    AllHTMLAttributes: AllHTMLAttributes[HTMLDivElement] = null,
    ClassAttributes: ClassAttributes[HTMLDivElement] = null,
    PostPublishExtension: ComponentType[js.Object] = null,
    PrePublishExtension: ComponentType[js.Object] = null,
    forceIsDirty: js.UndefOr[Boolean] = js.undefined,
    forceIsSaving: js.UndefOr[Boolean] = js.undefined
  ): Props = {
    val __obj = js.Dynamic.literal(onClose = js.Any.fromFunction0(onClose))
    if (AllHTMLAttributes != null) js.Dynamic.global.Object.assign(__obj, AllHTMLAttributes)
    if (ClassAttributes != null) js.Dynamic.global.Object.assign(__obj, ClassAttributes)
    if (PostPublishExtension != null) __obj.updateDynamic("PostPublishExtension")(PostPublishExtension.asInstanceOf[js.Any])
    if (PrePublishExtension != null) __obj.updateDynamic("PrePublishExtension")(PrePublishExtension.asInstanceOf[js.Any])
    if (!js.isUndefined(forceIsDirty)) __obj.updateDynamic("forceIsDirty")(forceIsDirty.get.asInstanceOf[js.Any])
    if (!js.isUndefined(forceIsSaving)) __obj.updateDynamic("forceIsSaving")(forceIsSaving.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

