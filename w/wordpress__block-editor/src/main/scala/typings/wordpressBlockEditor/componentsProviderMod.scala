package typings.wordpressBlockEditor

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.wordpressBlockEditor.anon.PartialEditorSettingsEdit
import typings.wordpressBlockEditor.componentsProviderMod.BlockEditorProvider.Props
import typings.wordpressBlocks.mod.BlockInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsProviderMod {
  
  object default extends Shortcut {
    
    @JSImport("@wordpress/block-editor/components/provider", JSImport.Default)
    @js.native
    val ^ : ComponentType[Props] = js.native
    
    type _To = ComponentType[Props]
    
    /* This means you don't have to write `^`, but can instead just say `default.foo` */
    override def _to: ComponentType[Props] = ^
  }
  
  object BlockEditorProvider {
    
    trait Props extends StObject {
      
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
      var onChange: js.UndefOr[js.Function1[/* blocks */ js.Array[BlockInstance[StringDictionary[Any]]], Unit]] = js.undefined
      
      /**
        * A callback invoked when the blocks have been modified in a non-persistent manner.
        * Contrasted with `onChange`, a "non-persistent" change is one which is part of a composed
        * input. Any sequence of updates to the same block attribute are treated as non-persistent,
        * except for the first.
        */
      var onInput: js.UndefOr[js.Function1[/* blocks */ js.Array[BlockInstance[StringDictionary[Any]]], Unit]] = js.undefined
      
      var settings: js.UndefOr[PartialEditorSettingsEdit] = js.undefined
      
      var useSubRegistry: js.UndefOr[Boolean] = js.undefined
      
      /**
        * The current array of blocks.
        */
      var value: js.UndefOr[js.Array[BlockInstance[StringDictionary[Any]]]] = js.undefined
    }
    object Props {
      
      inline def apply(): Props = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Props]
      }
      
      extension [Self <: Props](x: Self) {
        
        inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
        
        inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
        
        inline def setOnChange(value: /* blocks */ js.Array[BlockInstance[StringDictionary[Any]]] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
        
        inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
        
        inline def setOnInput(value: /* blocks */ js.Array[BlockInstance[StringDictionary[Any]]] => Unit): Self = StObject.set(x, "onInput", js.Any.fromFunction1(value))
        
        inline def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
        
        inline def setSettings(value: PartialEditorSettingsEdit): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
        
        inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
        
        inline def setUseSubRegistry(value: Boolean): Self = StObject.set(x, "useSubRegistry", value.asInstanceOf[js.Any])
        
        inline def setUseSubRegistryUndefined: Self = StObject.set(x, "useSubRegistry", js.undefined)
        
        inline def setValue(value: js.Array[BlockInstance[StringDictionary[Any]]]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
        
        inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
        
        inline def setValueVarargs(value: BlockInstance[StringDictionary[Any]]*): Self = StObject.set(x, "value", js.Array(value*))
      }
    }
  }
}
