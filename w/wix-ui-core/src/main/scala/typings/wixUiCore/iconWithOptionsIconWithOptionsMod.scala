package typings.wixUiCore

import typings.react.mod.FunctionComponent
import typings.react.mod.ReactNode
import typings.wixUiCore.dropdownConstantsMod.OPEN_TRIGGER_TYPE
import typings.wixUiCore.optionFactoryMod.Option
import typings.wixUiCore.popoverPopoverMod.Placement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconWithOptionsIconWithOptionsMod {
  
  @JSImport("wix-ui-core/dist/src/components/icon-with-options/IconWithOptions", "IconWithOptions")
  @js.native
  val IconWithOptions: FunctionComponent[IconWithOptionsProps] = js.native
  
  trait IconWithOptionsProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    /** An element that always appears at the bottom of the options */
    var fixedFooter: js.UndefOr[ReactNode] = js.undefined
    
    /** An element that always appears at the top of the options */
    var fixedHeader: js.UndefOr[ReactNode] = js.undefined
    
    /** Icon url to display */
    var iconUrl: String
    
    /** initial selected option ids */
    var initialSelectedIds: js.UndefOr[js.Array[String | Double]] = js.undefined
    
    /** set true for multiple selection, false for single */
    var multi: js.UndefOr[Boolean] = js.undefined
    
    /** Handler for when an option is deselected */
    var onDeselect: js.UndefOr[js.Function1[/* option */ Option, Unit]] = js.undefined
    
    /** Handler for when an option is selected */
    var onSelect: js.UndefOr[js.Function1[/* option */ Option, Unit]] = js.undefined
    
    /** Trigger type to open the content */
    var openTrigger: js.UndefOr[OPEN_TRIGGER_TYPE] = js.undefined
    
    /** The dropdown options array */
    var options: js.Array[Option]
    
    /** The location to display the content */
    var placement: js.UndefOr[Placement] = js.undefined
  }
  object IconWithOptionsProps {
    
    @scala.inline
    def apply(iconUrl: String, options: js.Array[Option]): IconWithOptionsProps = {
      val __obj = js.Dynamic.literal(iconUrl = iconUrl.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[IconWithOptionsProps]
    }
    
    @scala.inline
    implicit class IconWithOptionsPropsMutableBuilder[Self <: IconWithOptionsProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      @scala.inline
      def setFixedFooter(value: ReactNode): Self = StObject.set(x, "fixedFooter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedFooterUndefined: Self = StObject.set(x, "fixedFooter", js.undefined)
      
      @scala.inline
      def setFixedHeader(value: ReactNode): Self = StObject.set(x, "fixedHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedHeaderUndefined: Self = StObject.set(x, "fixedHeader", js.undefined)
      
      @scala.inline
      def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
      
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
      def setOnDeselect(value: /* option */ Option => Unit): Self = StObject.set(x, "onDeselect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDeselectUndefined: Self = StObject.set(x, "onDeselect", js.undefined)
      
      @scala.inline
      def setOnSelect(value: /* option */ Option => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setOpenTrigger(value: OPEN_TRIGGER_TYPE): Self = StObject.set(x, "openTrigger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenTriggerUndefined: Self = StObject.set(x, "openTrigger", js.undefined)
      
      @scala.inline
      def setOptions(value: js.Array[Option]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsVarargs(value: Option*): Self = StObject.set(x, "options", js.Array(value :_*))
      
      @scala.inline
      def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
    }
  }
}
