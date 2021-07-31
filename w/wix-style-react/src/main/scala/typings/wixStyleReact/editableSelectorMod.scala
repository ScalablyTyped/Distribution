package typings.wixStyleReact

import typings.react.mod.Component
import typings.wixStyleReact.wixStyleReactStrings.checkbox
import typings.wixStyleReact.wixStyleReactStrings.radio
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object editableSelectorMod {
  
  @JSImport("wix-style-react/dist/es/src/EditableSelector", JSImport.Default)
  @js.native
  class default ()
    extends Component[EditableSelectorProps, js.Object, js.Any]
  
  type EditableSelector = Component[EditableSelectorProps, js.Object, js.Any]
  
  trait EditableSelectorOption extends StObject {
    
    var isSelected: js.UndefOr[Boolean] = js.undefined
    
    var title: String
  }
  object EditableSelectorOption {
    
    @scala.inline
    def apply(title: String): EditableSelectorOption = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
      __obj.asInstanceOf[EditableSelectorOption]
    }
    
    @scala.inline
    implicit class EditableSelectorOptionMutableBuilder[Self <: EditableSelectorOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSelectedUndefined: Self = StObject.set(x, "isSelected", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    def apply(): EditableSelectorProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EditableSelectorProps]
    }
    
    @scala.inline
    implicit class EditableSelectorPropsMutableBuilder[Self <: EditableSelectorProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      @scala.inline
      def setEditButtonText(value: String): Self = StObject.set(x, "editButtonText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEditButtonTextUndefined: Self = StObject.set(x, "editButtonText", js.undefined)
      
      @scala.inline
      def setNewRowLabel(value: String): Self = StObject.set(x, "newRowLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNewRowLabelUndefined: Self = StObject.set(x, "newRowLabel", js.undefined)
      
      @scala.inline
      def setOnOptionAdded(value: /* title */ String => Unit): Self = StObject.set(x, "onOptionAdded", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnOptionAddedUndefined: Self = StObject.set(x, "onOptionAdded", js.undefined)
      
      @scala.inline
      def setOnOptionDelete(value: /* id */ Double => Unit): Self = StObject.set(x, "onOptionDelete", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnOptionDeleteUndefined: Self = StObject.set(x, "onOptionDelete", js.undefined)
      
      @scala.inline
      def setOnOptionEdit(value: (/* title */ String, /* id */ Double) => Unit): Self = StObject.set(x, "onOptionEdit", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnOptionEditUndefined: Self = StObject.set(x, "onOptionEdit", js.undefined)
      
      @scala.inline
      def setOnOptionToggle(value: /* id */ Double => Unit): Self = StObject.set(x, "onOptionToggle", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnOptionToggleUndefined: Self = StObject.set(x, "onOptionToggle", js.undefined)
      
      @scala.inline
      def setOptions(value: js.Array[EditableSelectorOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setOptionsVarargs(value: EditableSelectorOption*): Self = StObject.set(x, "options", js.Array(value :_*))
      
      @scala.inline
      def setStyles(value: String): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setToggleType(value: checkbox | radio): Self = StObject.set(x, "toggleType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToggleTypeUndefined: Self = StObject.set(x, "toggleType", js.undefined)
    }
  }
}
