package typings.wixUiCore

import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.wixUiCore.anon.InitialSelectedIds
import typings.wixUiCore.anon.IsDirty
import typings.wixUiCore.anon.PartialOption
import typings.wixUiCore.componentsDropdownOptionOptionFactoryMod.Option
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcComponentsLabelWithOptionsLabelWithOptionsMod {
  
  @JSImport("wix-ui-core/src/components/label-with-options/LabelWithOptions", "LabelWithOptions")
  @js.native
  class LabelWithOptions protected ()
    extends PureComponent[LabelWithOptionsProps, LabelWithOptionsState, js.Any] {
    def this(props: LabelWithOptionsProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: LabelWithOptionsProps, context: js.Any) = this()
    
    val createLabel: js.Any = js.native
    
    val createOptions: js.Any = js.native
    
    val onDeselect: js.Any = js.native
    
    val onInitialSelectedOptionsSet: js.Any = js.native
    
    val onSelect: js.Any = js.native
    
    @JSName("state")
    var state_LabelWithOptions: IsDirty = js.native
  }
  /* static members */
  object LabelWithOptions {
    
    @JSImport("wix-ui-core/src/components/label-with-options/LabelWithOptions", "LabelWithOptions")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def createDivider(): Option = ^.asInstanceOf[js.Dynamic].applyDynamic("createDivider")().asInstanceOf[Option]
    @scala.inline
    def createDivider(value: js.Any): Option = ^.asInstanceOf[js.Dynamic].applyDynamic("createDivider")(value.asInstanceOf[js.Any]).asInstanceOf[Option]
    
    @scala.inline
    def createOption(): Option = ^.asInstanceOf[js.Dynamic].applyDynamic("createOption")().asInstanceOf[Option]
    @scala.inline
    def createOption(option: PartialOption): Option = ^.asInstanceOf[js.Dynamic].applyDynamic("createOption")(option.asInstanceOf[js.Any]).asInstanceOf[Option]
    
    @JSImport("wix-ui-core/src/components/label-with-options/LabelWithOptions", "LabelWithOptions.defaultProps")
    @js.native
    def defaultProps: InitialSelectedIds = js.native
    @scala.inline
    def defaultProps_=(x: InitialSelectedIds): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/src/components/label-with-options/LabelWithOptions", "LabelWithOptions.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  trait LabelWithOptionsProps extends StObject {
    
    /** Display checkbox items in the dropdown menu*/
    var checkbox: js.UndefOr[Boolean] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    /** hook for testing purposes */
    var `data-hook`: js.UndefOr[String] = js.undefined
    
    /** Makes the component disabled */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /** If set to true, the label will display an ellipsis when overflowing */
    var ellipsis: js.UndefOr[Boolean] = js.undefined
    
    /** An element that always appears at the bottom of the options */
    var fixedFooter: js.UndefOr[ReactNode] = js.undefined
    
    /** An element that always appears at the top of the options */
    var fixedHeader: js.UndefOr[ReactNode] = js.undefined
    
    /** initial selected option ids */
    var initialSelectedIds: js.UndefOr[js.Array[String | Double]] = js.undefined
    
    /** set true for multiple selection, false for single */
    var multi: js.UndefOr[Boolean] = js.undefined
    
    /** Handler for when an option is deselected */
    var onDeselect: js.UndefOr[js.Function1[/* option */ Option | Null, Unit]] = js.undefined
    
    /** Handler for when an option is selected */
    var onSelect: js.UndefOr[js.Function1[/* option */ Option, Unit]] = js.undefined
    
    /** The dropdown options array */
    var options: js.Array[Option]
    
    /** Placeholder to display */
    var placeholder: js.UndefOr[String] = js.undefined
    
    /** Suffix */
    var renderSuffix: js.UndefOr[js.Function1[/* isError */ Boolean, ReactNode]] = js.undefined
    
    /** if set to true an error will be rendered when no options are selected */
    var required: js.UndefOr[Boolean] = js.undefined
  }
  object LabelWithOptionsProps {
    
    @scala.inline
    def apply(options: js.Array[Option]): LabelWithOptionsProps = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[LabelWithOptionsProps]
    }
    
    @scala.inline
    implicit class LabelWithOptionsPropsMutableBuilder[Self <: LabelWithOptionsProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCheckbox(value: Boolean): Self = StObject.set(x, "checkbox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckboxUndefined: Self = StObject.set(x, "checkbox", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def `setData-hook`(value: String): Self = StObject.set(x, "data-hook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setData-hookUndefined`: Self = StObject.set(x, "data-hook", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setEllipsis(value: Boolean): Self = StObject.set(x, "ellipsis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEllipsisUndefined: Self = StObject.set(x, "ellipsis", js.undefined)
      
      @scala.inline
      def setFixedFooter(value: ReactNode): Self = StObject.set(x, "fixedFooter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedFooterUndefined: Self = StObject.set(x, "fixedFooter", js.undefined)
      
      @scala.inline
      def setFixedHeader(value: ReactNode): Self = StObject.set(x, "fixedHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedHeaderUndefined: Self = StObject.set(x, "fixedHeader", js.undefined)
      
      @scala.inline
      def setInitialSelectedIds(value: js.Array[String | Double]): Self = StObject.set(x, "initialSelectedIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialSelectedIdsUndefined: Self = StObject.set(x, "initialSelectedIds", js.undefined)
      
      @scala.inline
      def setInitialSelectedIdsVarargs(value: (String | Double)*): Self = StObject.set(x, "initialSelectedIds", js.Array(value :_*))
      
      @scala.inline
      def setMulti(value: Boolean): Self = StObject.set(x, "multi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiUndefined: Self = StObject.set(x, "multi", js.undefined)
      
      @scala.inline
      def setOnDeselect(value: /* option */ Option | Null => Unit): Self = StObject.set(x, "onDeselect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDeselectUndefined: Self = StObject.set(x, "onDeselect", js.undefined)
      
      @scala.inline
      def setOnSelect(value: /* option */ Option => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setOptions(value: js.Array[Option]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsVarargs(value: Option*): Self = StObject.set(x, "options", js.Array(value :_*))
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setRenderSuffix(value: /* isError */ Boolean => ReactNode): Self = StObject.set(x, "renderSuffix", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRenderSuffixUndefined: Self = StObject.set(x, "renderSuffix", js.undefined)
      
      @scala.inline
      def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    }
  }
  
  trait LabelWithOptionsState extends StObject {
    
    var isDirty: Boolean
    
    var selectedIds: js.Array[String | Double]
  }
  object LabelWithOptionsState {
    
    @scala.inline
    def apply(isDirty: Boolean, selectedIds: js.Array[String | Double]): LabelWithOptionsState = {
      val __obj = js.Dynamic.literal(isDirty = isDirty.asInstanceOf[js.Any], selectedIds = selectedIds.asInstanceOf[js.Any])
      __obj.asInstanceOf[LabelWithOptionsState]
    }
    
    @scala.inline
    implicit class LabelWithOptionsStateMutableBuilder[Self <: LabelWithOptionsState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsDirty(value: Boolean): Self = StObject.set(x, "isDirty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedIds(value: js.Array[String | Double]): Self = StObject.set(x, "selectedIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedIdsVarargs(value: (String | Double)*): Self = StObject.set(x, "selectedIds", js.Array(value :_*))
    }
  }
}
