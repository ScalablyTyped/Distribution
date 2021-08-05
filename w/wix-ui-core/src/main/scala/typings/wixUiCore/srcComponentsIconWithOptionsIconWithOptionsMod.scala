package typings.wixUiCore

import typings.react.mod.FunctionComponent
import typings.react.mod.ReactNode
import typings.wixUiCore.componentsDropdownOptionOptionFactoryMod.Option
import typings.wixUiCore.srcComponentsPopoverPopoverMod.Placement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcComponentsIconWithOptionsIconWithOptionsMod {
  
  @JSImport("wix-ui-core/src/components/icon-with-options/IconWithOptions", "IconWithOptions")
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
    var openTrigger: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OPEN_TRIGGER_TYPE */ js.Any
      ] = js.undefined
    
    /** The dropdown options array */
    var options: js.Array[Option]
    
    /** The location to display the content */
    var placement: js.UndefOr[Placement] = js.undefined
  }
  object IconWithOptionsProps {
    
    inline def apply(iconUrl: String, options: js.Array[Option]): IconWithOptionsProps = {
      val __obj = js.Dynamic.literal(iconUrl = iconUrl.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[IconWithOptionsProps]
    }
    
    extension [Self <: IconWithOptionsProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setFixedFooter(value: ReactNode): Self = StObject.set(x, "fixedFooter", value.asInstanceOf[js.Any])
      
      inline def setFixedFooterUndefined: Self = StObject.set(x, "fixedFooter", js.undefined)
      
      inline def setFixedHeader(value: ReactNode): Self = StObject.set(x, "fixedHeader", value.asInstanceOf[js.Any])
      
      inline def setFixedHeaderUndefined: Self = StObject.set(x, "fixedHeader", js.undefined)
      
      inline def setIconUrl(value: String): Self = StObject.set(x, "iconUrl", value.asInstanceOf[js.Any])
      
      inline def setInitialSelectedIds(value: js.Array[String | Double]): Self = StObject.set(x, "initialSelectedIds", value.asInstanceOf[js.Any])
      
      inline def setInitialSelectedIdsUndefined: Self = StObject.set(x, "initialSelectedIds", js.undefined)
      
      inline def setInitialSelectedIdsVarargs(value: (String | Double)*): Self = StObject.set(x, "initialSelectedIds", js.Array(value :_*))
      
      inline def setMulti(value: Boolean): Self = StObject.set(x, "multi", value.asInstanceOf[js.Any])
      
      inline def setMultiUndefined: Self = StObject.set(x, "multi", js.undefined)
      
      inline def setOnDeselect(value: /* option */ Option => Unit): Self = StObject.set(x, "onDeselect", js.Any.fromFunction1(value))
      
      inline def setOnDeselectUndefined: Self = StObject.set(x, "onDeselect", js.undefined)
      
      inline def setOnSelect(value: /* option */ Option => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setOpenTrigger(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OPEN_TRIGGER_TYPE */ js.Any
      ): Self = StObject.set(x, "openTrigger", value.asInstanceOf[js.Any])
      
      inline def setOpenTriggerUndefined: Self = StObject.set(x, "openTrigger", js.undefined)
      
      inline def setOptions(value: js.Array[Option]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsVarargs(value: Option*): Self = StObject.set(x, "options", js.Array(value :_*))
      
      inline def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
    }
  }
}
