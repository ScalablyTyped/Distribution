package typings.wordpressBlockEditor.providerMod.BlockEditorProvider

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import typings.wordpressBlockEditor.anon.PartialEditorSettingsEdit
import typings.wordpressBlocks.mod.BlockInstance
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Props extends js.Object {
  
  /**
    * Children elements for which the BlockEditorProvider context should apply.
    */
  var children: ReactNode = js.native
  
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
  var onChange: js.UndefOr[js.Function1[/* blocks */ js.Array[BlockInstance[StringDictionary[_]]], Unit]] = js.native
  
  /**
    * A callback invoked when the blocks have been modified in a non-persistent manner.
    * Contrasted with `onChange`, a "non-persistent" change is one which is part of a composed
    * input. Any sequence of updates to the same block attribute are treated as non-persistent,
    * except for the first.
    */
  var onInput: js.UndefOr[js.Function1[/* blocks */ js.Array[BlockInstance[StringDictionary[_]]], Unit]] = js.native
  
  var settings: js.UndefOr[PartialEditorSettingsEdit] = js.native
  
  var useSubRegistry: js.UndefOr[Boolean] = js.native
  
  /**
    * The current array of blocks.
    */
  var value: js.UndefOr[js.Array[BlockInstance[StringDictionary[_]]]] = js.native
}
object Props {
  
  @scala.inline
  def apply(): Props = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Props]
  }
  
  @scala.inline
  implicit class PropsOps[Self <: Props] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setOnChange(value: /* blocks */ js.Array[BlockInstance[StringDictionary[_]]] => Unit): Self = this.set("onChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    
    @scala.inline
    def setOnInput(value: /* blocks */ js.Array[BlockInstance[StringDictionary[_]]] => Unit): Self = this.set("onInput", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnInput: Self = this.set("onInput", js.undefined)
    
    @scala.inline
    def setSettings(value: PartialEditorSettingsEdit): Self = this.set("settings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSettings: Self = this.set("settings", js.undefined)
    
    @scala.inline
    def setUseSubRegistry(value: Boolean): Self = this.set("useSubRegistry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseSubRegistry: Self = this.set("useSubRegistry", js.undefined)
    
    @scala.inline
    def setValueVarargs(value: BlockInstance[StringDictionary[js.Any]]*): Self = this.set("value", js.Array(value :_*))
    
    @scala.inline
    def setValue(value: js.Array[BlockInstance[StringDictionary[_]]]): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
