package typings.wixStyleReact

import typings.react.mod.Component
import typings.wixStyleReact.wixStyleReactStrings.checkbox
import typings.wixStyleReact.wixStyleReactStrings.radio
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesEditableSelectorMod {
  
  @JSImport("wix-style-react/dist/types/EditableSelector", JSImport.Default)
  @js.native
  open class default ()
    extends Component[EditableSelectorProps, js.Object, Any]
  
  type EditableSelector = Component[EditableSelectorProps, js.Object, Any]
  
  trait EditableSelectorOption extends StObject {
    
    var isSelected: js.UndefOr[Boolean] = js.undefined
    
    var title: String
  }
  object EditableSelectorOption {
    
    inline def apply(title: String): EditableSelectorOption = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[EditableSelectorOption]
    }
    
    extension [Self <: EditableSelectorOption](x: Self) {
      
      inline def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
      
      inline def setIsSelectedUndefined: Self = StObject.set(x, "isSelected", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    }
  }
  
  trait EditableSelectorProps extends StObject {
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var editButtonText: js.UndefOr[String] = js.undefined
    
    var newRowLabel: js.UndefOr[String] = js.undefined
    
    var onOptionAdded: js.UndefOr[js.Function1[/* title */ String, Unit]] = js.undefined
    
    var onOptionDelete: js.UndefOr[js.Function1[/* id */ Double, Unit]] = js.undefined
    
    var onOptionEdit: js.UndefOr[js.Function2[/* title */ String, /* id */ Double, Unit]] = js.undefined
    
    var onOptionToggle: js.UndefOr[js.Function1[/* id */ Double, Unit]] = js.undefined
    
    var options: js.UndefOr[js.Array[EditableSelectorOption]] = js.undefined
    
    var styles: js.UndefOr[String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
    
    var toggleType: js.UndefOr[checkbox | radio] = js.undefined
  }
  object EditableSelectorProps {
    
    inline def apply(): EditableSelectorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EditableSelectorProps]
    }
    
    extension [Self <: EditableSelectorProps](x: Self) {
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setEditButtonText(value: String): Self = StObject.set(x, "editButtonText", value.asInstanceOf[js.Any])
      
      inline def setEditButtonTextUndefined: Self = StObject.set(x, "editButtonText", js.undefined)
      
      inline def setNewRowLabel(value: String): Self = StObject.set(x, "newRowLabel", value.asInstanceOf[js.Any])
      
      inline def setNewRowLabelUndefined: Self = StObject.set(x, "newRowLabel", js.undefined)
      
      inline def setOnOptionAdded(value: /* title */ String => Unit): Self = StObject.set(x, "onOptionAdded", js.Any.fromFunction1(value))
      
      inline def setOnOptionAddedUndefined: Self = StObject.set(x, "onOptionAdded", js.undefined)
      
      inline def setOnOptionDelete(value: /* id */ Double => Unit): Self = StObject.set(x, "onOptionDelete", js.Any.fromFunction1(value))
      
      inline def setOnOptionDeleteUndefined: Self = StObject.set(x, "onOptionDelete", js.undefined)
      
      inline def setOnOptionEdit(value: (/* title */ String, /* id */ Double) => Unit): Self = StObject.set(x, "onOptionEdit", js.Any.fromFunction2(value))
      
      inline def setOnOptionEditUndefined: Self = StObject.set(x, "onOptionEdit", js.undefined)
      
      inline def setOnOptionToggle(value: /* id */ Double => Unit): Self = StObject.set(x, "onOptionToggle", js.Any.fromFunction1(value))
      
      inline def setOnOptionToggleUndefined: Self = StObject.set(x, "onOptionToggle", js.undefined)
      
      inline def setOptions(value: js.Array[EditableSelectorOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setOptionsVarargs(value: EditableSelectorOption*): Self = StObject.set(x, "options", js.Array(value*))
      
      inline def setStyles(value: String): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setToggleType(value: checkbox | radio): Self = StObject.set(x, "toggleType", value.asInstanceOf[js.Any])
      
      inline def setToggleTypeUndefined: Self = StObject.set(x, "toggleType", js.undefined)
    }
  }
}
