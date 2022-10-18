package typings.victoryCore.libMod

import typings.react.mod.SyntheticEvent
import typings.std.Element
import typings.std.Event
import typings.std.SVGElement
import typings.victoryCore.anon.PickSyntheticEventElement
import typings.victoryCore.anon.PickVictoryCommonPropssca
import typings.victoryCore.anon.XArray
import typings.victoryCore.libTypesPropTypesMod.DomainPropType
import typings.victoryCore.libTypesPropTypesMod.ScaleXYPropType
import typings.victoryCore.libVictoryUtilSelectionMod.ComputedCommonProps
import typings.victoryCore.libVictoryUtilSelectionMod.SVGCoordinateBounds
import typings.victoryCore.libVictoryUtilSelectionMod.SVGCoordinateType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Selection {
  
  @JSImport("victory-core/lib", "Selection")
  @js.native
  val ^ : js.Any = js.native
  
  inline def getBounds(props: ComputedCommonProps): SVGCoordinateBounds = ^.asInstanceOf[js.Dynamic].applyDynamic("getBounds")(props.asInstanceOf[js.Any]).asInstanceOf[SVGCoordinateBounds]
  
  inline def getDataCoordinates(props: Any, scale: ScaleXYPropType, x: Double, y: Double): SVGCoordinateType = (^.asInstanceOf[js.Dynamic].applyDynamic("getDataCoordinates")(props.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[SVGCoordinateType]
  
  inline def getDomainCoordinates(props: PickVictoryCommonPropssca): XArray = ^.asInstanceOf[js.Dynamic].applyDynamic("getDomainCoordinates")(props.asInstanceOf[js.Any]).asInstanceOf[XArray]
  inline def getDomainCoordinates(props: PickVictoryCommonPropssca, domain: DomainPropType): XArray = (^.asInstanceOf[js.Dynamic].applyDynamic("getDomainCoordinates")(props.asInstanceOf[js.Any], domain.asInstanceOf[js.Any])).asInstanceOf[XArray]
  
  inline def getParentSVG(evt: PickSyntheticEventElement): SVGElement = ^.asInstanceOf[js.Dynamic].applyDynamic("getParentSVG")(evt.asInstanceOf[js.Any]).asInstanceOf[SVGElement]
  
  inline def getSVGEventCoordinates(evt: SyntheticEvent[Element, Event]): SVGCoordinateType = ^.asInstanceOf[js.Dynamic].applyDynamic("getSVGEventCoordinates")(evt.asInstanceOf[js.Any]).asInstanceOf[SVGCoordinateType]
  inline def getSVGEventCoordinates(evt: SyntheticEvent[Element, Event], svg: SVGElement): SVGCoordinateType = (^.asInstanceOf[js.Dynamic].applyDynamic("getSVGEventCoordinates")(evt.asInstanceOf[js.Any], svg.asInstanceOf[js.Any])).asInstanceOf[SVGCoordinateType]
}
