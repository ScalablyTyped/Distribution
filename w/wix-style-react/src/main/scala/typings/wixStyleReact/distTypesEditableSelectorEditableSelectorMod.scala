package typings.wixStyleReact

import typings.propTypes.mod.InferProps
import typings.propTypes.mod.Requireable
import typings.react.mod.PureComponent
import typings.react.mod.global.JSX.Element
import typings.wixStyleReact.anon.AddingNewRow
import typings.wixStyleReact.anon.Index
import typings.wixStyleReact.anon.IsSelected
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesEditableSelectorEditableSelectorMod {
  
  @JSImport("wix-style-react/dist/types/EditableSelector/EditableSelector", JSImport.Default)
  @js.native
  open class default protected () extends EditableSelector {
    def this(props: Any) = this()
    def this(props: Any, context: Any) = this()
  }
  object default {
    
    /* static member */
    object defaultProps {
      
      @JSImport("wix-style-react/dist/types/EditableSelector/EditableSelector", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("wix-style-react/dist/types/EditableSelector/EditableSelector", "default.defaultProps.editButtonText")
      @js.native
      def editButtonText: String = js.native
      inline def editButtonText_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("editButtonText")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/EditableSelector/EditableSelector", "default.defaultProps.newRowLabel")
      @js.native
      def newRowLabel: String = js.native
      inline def newRowLabel_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("newRowLabel")(x.asInstanceOf[js.Any])
      
      @JSImport("wix-style-react/dist/types/EditableSelector/EditableSelector", "default.defaultProps.toggleType")
      @js.native
      def toggleType: String = js.native
      inline def toggleType_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toggleType")(x.asInstanceOf[js.Any])
    }
    
    @JSImport("wix-style-react/dist/types/EditableSelector/EditableSelector", "default.displayName")
    @js.native
    val displayName: String = js.native
    
    /* static member */
    object propTypes {
      
      @JSImport("wix-style-react/dist/types/EditableSelector/EditableSelector", "default.propTypes")
      @js.native
      val ^ : js.Any = js.native
      
      /** Applied as data-hook HTML attribute that can be used in the tests */
      @JSImport("wix-style-react/dist/types/EditableSelector/EditableSelector", "default.propTypes.dataHook")
      @js.native
      def dataHook: Requireable[String] = js.native
      inline def dataHook_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dataHook")(x.asInstanceOf[js.Any])
      
      /** Text for the edit button */
      @JSImport("wix-style-react/dist/types/EditableSelector/EditableSelector", "default.propTypes.editButtonText")
      @js.native
      def editButtonText: Requireable[String] = js.native
      inline def editButtonText_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("editButtonText")(x.asInstanceOf[js.Any])
      
      /** Text for the add new row button */
      @JSImport("wix-style-react/dist/types/EditableSelector/EditableSelector", "default.propTypes.newRowLabel")
      @js.native
      def newRowLabel: Requireable[String] = js.native
      inline def newRowLabel_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("newRowLabel")(x.asInstanceOf[js.Any])
      
      /** New option added callback function */
      @JSImport("wix-style-react/dist/types/EditableSelector/EditableSelector", "default.propTypes.onOptionAdded")
      @js.native
      def onOptionAdded: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onOptionAdded_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onOptionAdded")(x.asInstanceOf[js.Any])
      
      /** Option deleted callback function */
      @JSImport("wix-style-react/dist/types/EditableSelector/EditableSelector", "default.propTypes.onOptionDelete")
      @js.native
      def onOptionDelete: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onOptionDelete_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onOptionDelete")(x.asInstanceOf[js.Any])
      
      /** Option edited callback function */
      @JSImport("wix-style-react/dist/types/EditableSelector/EditableSelector", "default.propTypes.onOptionEdit")
      @js.native
      def onOptionEdit: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onOptionEdit_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onOptionEdit")(x.asInstanceOf[js.Any])
      
      /** Option toggled callback function */
      @JSImport("wix-style-react/dist/types/EditableSelector/EditableSelector", "default.propTypes.onOptionToggle")
      @js.native
      def onOptionToggle: Requireable[js.Function1[/* repeated */ Any, Any]] = js.native
      inline def onOptionToggle_=(x: Requireable[js.Function1[/* repeated */ Any, Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onOptionToggle")(x.asInstanceOf[js.Any])
      
      /** Array of objects:
        * * `title` - the title of the option.
        * * `isSelected` - whether this option is selected or not.
        */
      @JSImport("wix-style-react/dist/types/EditableSelector/EditableSelector", "default.propTypes.options")
      @js.native
      def options: Requireable[js.Array[js.UndefOr[InferProps[IsSelected] | Null]]] = js.native
      inline def options_=(x: Requireable[js.Array[js.UndefOr[InferProps[IsSelected] | Null]]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("options")(x.asInstanceOf[js.Any])
      
      /** The editable selector's title */
      @JSImport("wix-style-react/dist/types/EditableSelector/EditableSelector", "default.propTypes.title")
      @js.native
      def title: Requireable[String] = js.native
      inline def title_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("title")(x.asInstanceOf[js.Any])
      
      /** Specifies the type of the toggle */
      @JSImport("wix-style-react/dist/types/EditableSelector/EditableSelector", "default.propTypes.toggleType")
      @js.native
      def toggleType: Requireable[String] = js.native
      inline def toggleType_=(x: Requireable[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("toggleType")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait EditableSelector extends PureComponent[Any, Any, Any] {
    
    def _addNewRow(): Unit = js.native
    
    def _deleteItem(index: Any): Unit = js.native
    
    def _editItem(index: Any): Unit = js.native
    
    def _onNewOptionApprove(param0: Index): Unit = js.native
    
    def _onNewOptionCancel(): Unit = js.native
    
    def _onOptionToggle(id: Any): Unit = js.native
    
    def _renderInput(title: Any, index: Any): Element = js.native
    
    @JSName("state")
    var state_EditableSelector: AddingNewRow = js.native
  }
}
