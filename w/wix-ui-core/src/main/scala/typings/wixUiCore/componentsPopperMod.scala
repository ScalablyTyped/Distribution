package typings.wixUiCore

import org.scalablytyped.runtime.Shortcut
import typings.popperJs.mod.Boundary
import typings.popperJs.mod.Placement
import typings.react.mod.FC
import typings.react.mod.ReactNode
import typings.std.Element
import typings.wixUiCore.utilsGetModifiersMod.MoveBy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsPopperMod extends Shortcut {
  
  @JSImport("wix-ui-core/dist/standalone/src/components/popover-next/components/Popper", JSImport.Default)
  @js.native
  val default: FC[PopperProps] = js.native
  
  /* Inlined wix-ui-core.wix-ui-core/dist/standalone/src/components/popover/utils/getModifiers.ModifiersParams & std.Pick<wix-ui-core.wix-ui-core/dist/standalone/src/components/popover-next/popover-next.PopoverNextProps, 'maxWidth' | 'showArrow' | 'zIndex' | 'moveArrowTo' | 'customArrow' | 'id' | 'role'> & {  contentHook :string | undefined, grabScheduleUpdater (scheduler : react-popper.react-popper.PopperChildrenProps['scheduleUpdate']): void} */
  trait PopperProps extends StObject {
    
    var appendTo: js.UndefOr[Boundary | Element] = js.undefined
    
    var contentHook: js.UndefOr[String] = js.undefined
    
    var customArrow: js.UndefOr[js.Function2[/* placement */ Placement, /* arrowProps */ js.Object, ReactNode]] = js.undefined
    
    var dynamicWidth: js.UndefOr[Boolean] = js.undefined
    
    var fixed: js.UndefOr[Boolean] = js.undefined
    
    var flip: js.UndefOr[Boolean] = js.undefined
    
    @JSName("grabScheduleUpdater")
    def grabScheduleUpdater_scheduleUpdate(
      scheduler: /* import warning: importer.ImportType#apply Failed type conversion: react-popper.react-popper.PopperChildrenProps['scheduleUpdate'] */ js.Any
    ): Unit
    
    var id: js.UndefOr[String] = js.undefined
    
    var isTestEnv: Boolean
    
    var maxWidth: js.UndefOr[Double | String] = js.undefined
    
    var minWidth: js.UndefOr[String | Double] = js.undefined
    
    var moveArrowTo: js.UndefOr[Double] = js.undefined
    
    var moveBy: js.UndefOr[MoveBy] = js.undefined
    
    var placement: Placement
    
    var role: js.UndefOr[String] = js.undefined
    
    var shouldAnimate: Boolean
    
    var showArrow: js.UndefOr[Boolean] = js.undefined
    
    var width: js.UndefOr[String | Double] = js.undefined
    
    var zIndex: js.UndefOr[Double] = js.undefined
  }
  object PopperProps {
    
    inline def apply(
      grabScheduleUpdater: /* import warning: importer.ImportType#apply Failed type conversion: react-popper.react-popper.PopperChildrenProps['scheduleUpdate'] */ js.Any => Unit,
      isTestEnv: Boolean,
      placement: Placement,
      shouldAnimate: Boolean
    ): PopperProps = {
      val __obj = js.Dynamic.literal(grabScheduleUpdater = js.Any.fromFunction1(grabScheduleUpdater), isTestEnv = isTestEnv.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], shouldAnimate = shouldAnimate.asInstanceOf[js.Any])
      __obj.asInstanceOf[PopperProps]
    }
    
    extension [Self <: PopperProps](x: Self) {
      
      inline def setAppendTo(value: Boundary | Element): Self = StObject.set(x, "appendTo", value.asInstanceOf[js.Any])
      
      inline def setAppendToUndefined: Self = StObject.set(x, "appendTo", js.undefined)
      
      inline def setContentHook(value: String): Self = StObject.set(x, "contentHook", value.asInstanceOf[js.Any])
      
      inline def setContentHookUndefined: Self = StObject.set(x, "contentHook", js.undefined)
      
      inline def setCustomArrow(value: (/* placement */ Placement, /* arrowProps */ js.Object) => ReactNode): Self = StObject.set(x, "customArrow", js.Any.fromFunction2(value))
      
      inline def setCustomArrowUndefined: Self = StObject.set(x, "customArrow", js.undefined)
      
      inline def setDynamicWidth(value: Boolean): Self = StObject.set(x, "dynamicWidth", value.asInstanceOf[js.Any])
      
      inline def setDynamicWidthUndefined: Self = StObject.set(x, "dynamicWidth", js.undefined)
      
      inline def setFixed(value: Boolean): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      inline def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
      
      inline def setFlip(value: Boolean): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
      
      inline def setFlipUndefined: Self = StObject.set(x, "flip", js.undefined)
      
      inline def setGrabScheduleUpdater(
        value: /* import warning: importer.ImportType#apply Failed type conversion: react-popper.react-popper.PopperChildrenProps['scheduleUpdate'] */ js.Any => Unit
      ): Self = StObject.set(x, "grabScheduleUpdater", js.Any.fromFunction1(value))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setIsTestEnv(value: Boolean): Self = StObject.set(x, "isTestEnv", value.asInstanceOf[js.Any])
      
      inline def setMaxWidth(value: Double | String): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      inline def setMinWidth(value: String | Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      inline def setMoveArrowTo(value: Double): Self = StObject.set(x, "moveArrowTo", value.asInstanceOf[js.Any])
      
      inline def setMoveArrowToUndefined: Self = StObject.set(x, "moveArrowTo", js.undefined)
      
      inline def setMoveBy(value: MoveBy): Self = StObject.set(x, "moveBy", value.asInstanceOf[js.Any])
      
      inline def setMoveByUndefined: Self = StObject.set(x, "moveBy", js.undefined)
      
      inline def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setShouldAnimate(value: Boolean): Self = StObject.set(x, "shouldAnimate", value.asInstanceOf[js.Any])
      
      inline def setShowArrow(value: Boolean): Self = StObject.set(x, "showArrow", value.asInstanceOf[js.Any])
      
      inline def setShowArrowUndefined: Self = StObject.set(x, "showArrow", js.undefined)
      
      inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  type _To = FC[PopperProps]
  
  /* This means you don't have to write `default`, but can instead just say `componentsPopperMod.foo` */
  override def _to: FC[PopperProps] = default
}
