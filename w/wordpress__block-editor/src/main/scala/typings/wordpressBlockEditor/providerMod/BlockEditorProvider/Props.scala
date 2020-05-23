package typings.wordpressBlockEditor.providerMod.BlockEditorProvider

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import typings.wordpressBlockEditor.anon.PartialEditorSettingsEdit
import typings.wordpressBlocks.mod.BlockInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  /**
    * Children elements for which the BlockEditorProvider context should apply.
    */
  var children: ReactNode
  /**
    * A callback invoked when the blocks have been modified in a persistent manner. Contrasted
    * with `onInput`, a "persistent" change is one which is not an extension of a composed
    * input. Any update to a distinct block or block attribute is treated as persistent.
    *
    * @remarks
    * The distinction between these two callbacks is akin to the differences between `input`
    * and `change` events in the DOM API:
    *
    * > The input event is fired every time the value of the element changes. **This is unlike
    * the change event, which only fires when the value is committed**, such as by pressing the
    * enter key, selecting a value from a list of options, and the like.
    *
    * In the context of an editor, an example usage of this distinction is for managing a
    * history of blocks values (an "Undo"/"Redo" mechanism). While value updates should always
    * be reflected immediately (`onInput`), you may only want history entries to reflect change
    * milestones (`onChange`).
    */
  var onChange: js.UndefOr[js.Function1[/* blocks */ js.Array[BlockInstance[StringDictionary[_]]], Unit]] = js.undefined
  /**
    * A callback invoked when the blocks have been modified in a non-persistent manner.
    * Contrasted with `onChange`, a "non-persistent" change is one which is part of a composed
    * input. Any sequence of updates to the same block attribute are treated as non-persistent,
    * except for the first.
    */
  var onInput: js.UndefOr[js.Function1[/* blocks */ js.Array[BlockInstance[StringDictionary[_]]], Unit]] = js.undefined
  var settings: js.UndefOr[PartialEditorSettingsEdit] = js.undefined
  var useSubRegistry: js.UndefOr[Boolean] = js.undefined
  /**
    * The current array of blocks.
    */
  var value: js.UndefOr[js.Array[BlockInstance[StringDictionary[_]]]] = js.undefined
}

object Props {
  @scala.inline
  def apply(
    children: ReactNode = null,
    onChange: /* blocks */ js.Array[BlockInstance[StringDictionary[_]]] => Unit = null,
    onInput: /* blocks */ js.Array[BlockInstance[StringDictionary[_]]] => Unit = null,
    settings: PartialEditorSettingsEdit = null,
    useSubRegistry: js.UndefOr[Boolean] = js.undefined,
    value: js.Array[BlockInstance[StringDictionary[_]]] = null
  ): Props = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onInput != null) __obj.updateDynamic("onInput")(js.Any.fromFunction1(onInput))
    if (settings != null) __obj.updateDynamic("settings")(settings.asInstanceOf[js.Any])
    if (!js.isUndefined(useSubRegistry)) __obj.updateDynamic("useSubRegistry")(useSubRegistry.get.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Props]
  }
}

