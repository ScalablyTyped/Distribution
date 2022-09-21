package typings.victoryBrushContainer

import typings.lodash.mod.DebouncedFunc
import typings.victoryBrushContainer.anon.Bottom
import typings.victoryBrushContainer.anon.X
import typings.victoryBrushContainer.anon.X1
import typings.victoryBrushContainer.anon.X1X2
import typings.victoryBrushContainer.anon.Y
import typings.victoryBrushContainer.anon.Y2
import typings.victoryBrushContainer.victoryBrushContainerNumbers.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object brushHelpersMod {
  
  object BrushHelpers {
    
    @JSImport("victory-brush-container/lib/brush-helpers", "BrushHelpers")
    @js.native
    val ^ : js.Any = js.native
    
    inline def constrainBox(box: Any, fullDomainBox: Any): X1X2 = (^.asInstanceOf[js.Dynamic].applyDynamic("constrainBox")(box.asInstanceOf[js.Any], fullDomainBox.asInstanceOf[js.Any])).asInstanceOf[X1X2]
    
    inline def constrainPoint(point: Any, fullDomainBox: Any): Y = (^.asInstanceOf[js.Dynamic].applyDynamic("constrainPoint")(point.asInstanceOf[js.Any], fullDomainBox.asInstanceOf[js.Any])).asInstanceOf[Y]
    
    inline def getActiveHandles(point: Any, props: Any, domainBox: Any): `0` | js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getActiveHandles")(point.asInstanceOf[js.Any], props.asInstanceOf[js.Any], domainBox.asInstanceOf[js.Any])).asInstanceOf[`0` | js.Array[String]]
    
    inline def getDefaultBrushArea(targetProps: Any, cachedDomain: Any, evt: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultBrushArea")(targetProps.asInstanceOf[js.Any], cachedDomain.asInstanceOf[js.Any], evt.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def getDimension(props: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getDimension")(props.asInstanceOf[js.Any]).asInstanceOf[Any]
    
    inline def getDomainBox(props: Any, fullDomain: Any): X1 = (^.asInstanceOf[js.Dynamic].applyDynamic("getDomainBox")(props.asInstanceOf[js.Any], fullDomain.asInstanceOf[js.Any])).asInstanceOf[X1]
    inline def getDomainBox(props: Any, fullDomain: Any, selectedDomain: Any): X1 = (^.asInstanceOf[js.Dynamic].applyDynamic("getDomainBox")(props.asInstanceOf[js.Any], fullDomain.asInstanceOf[js.Any], selectedDomain.asInstanceOf[js.Any])).asInstanceOf[X1]
    
    inline def getHandles(props: Any, domainBox: Any): Bottom = (^.asInstanceOf[js.Dynamic].applyDynamic("getHandles")(props.asInstanceOf[js.Any], domainBox.asInstanceOf[js.Any])).asInstanceOf[Bottom]
    
    inline def getMinimumDomain(): X = ^.asInstanceOf[js.Dynamic].applyDynamic("getMinimumDomain")().asInstanceOf[X]
    
    inline def getResizeMutation(box: Any, handles: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getResizeMutation")(box.asInstanceOf[js.Any], handles.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    inline def getSelectionMutation(point: Any, box: Any, brushDimension: Any): Y2 = (^.asInstanceOf[js.Dynamic].applyDynamic("getSelectionMutation")(point.asInstanceOf[js.Any], box.asInstanceOf[js.Any], brushDimension.asInstanceOf[js.Any])).asInstanceOf[Y2]
    
    inline def hasMoved(props: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasMoved")(props.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    @JSImport("victory-brush-container/lib/brush-helpers", "BrushHelpers.onGlobalMouseMove")
    @js.native
    def onGlobalMouseMove: DebouncedFunc[js.Function2[/* evt */ Any, /* targetProps */ Any, js.Object]] = js.native
    inline def onGlobalMouseMove_=(x: DebouncedFunc[js.Function2[/* evt */ Any, /* targetProps */ Any, js.Object]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onGlobalMouseMove")(x.asInstanceOf[js.Any])
    
    inline def onGlobalMouseUp(evt: Any, targetProps: Any): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("onGlobalMouseUp")(evt.asInstanceOf[js.Any], targetProps.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    
    inline def onMouseDown(evt: Any, targetProps: Any): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("onMouseDown")(evt.asInstanceOf[js.Any], targetProps.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    
    inline def panBox(props: Any, point: Any): X1 = (^.asInstanceOf[js.Dynamic].applyDynamic("panBox")(props.asInstanceOf[js.Any], point.asInstanceOf[js.Any])).asInstanceOf[X1]
    
    inline def withinBounds(point: Any, bounds: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("withinBounds")(point.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def withinBounds(point: Any, bounds: Any, padding: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("withinBounds")(point.asInstanceOf[js.Any], bounds.asInstanceOf[js.Any], padding.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
}
