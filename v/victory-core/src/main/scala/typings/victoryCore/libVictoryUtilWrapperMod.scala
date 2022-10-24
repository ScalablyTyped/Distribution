package typings.victoryCore

import typings.victoryCore.anon.ChildComponents
import typings.victoryCore.anon.Labels
import typings.victoryCore.anon.XAny
import typings.victoryCore.anon.XArray
import typings.victoryCore.anon.XNumber
import typings.victoryCore.anon.YArray
import typings.victoryCore.libTypesPropTypesMod.D3Scale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libVictoryUtilWrapperMod {
  
  @JSImport("victory-core/lib/victory-util/wrapper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def addBinsToParentPropsIfHistogram(param0: ChildComponents): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("addBinsToParentPropsIfHistogram")(param0.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getAllEvents(props: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getAllEvents")(props.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getCategories(props: Any, childComponents: Any): XAny = (^.asInstanceOf[js.Dynamic].applyDynamic("getCategories")(props.asInstanceOf[js.Any], childComponents.asInstanceOf[js.Any])).asInstanceOf[XAny]
  inline def getCategories(props: Any, childComponents: Any, allStrings: Any): XAny = (^.asInstanceOf[js.Dynamic].applyDynamic("getCategories")(props.asInstanceOf[js.Any], childComponents.asInstanceOf[js.Any], allStrings.asInstanceOf[js.Any])).asInstanceOf[XAny]
  
  inline def getCategoryAndAxisStringsFromChildren(props: Any, axis: Any, childComponents: Any): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getCategoryAndAxisStringsFromChildren")(props.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], childComponents.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def getChildStyle(child: Any, index: Any, calculatedProps: Any): js.Array[Any] | Labels = (^.asInstanceOf[js.Dynamic].applyDynamic("getChildStyle")(child.asInstanceOf[js.Any], index.asInstanceOf[js.Any], calculatedProps.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any] | Labels]
  
  inline def getColor(calculatedProps: Any, child: Any, index: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getColor")(calculatedProps.asInstanceOf[js.Any], child.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getData(props: Any, childComponents: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getData")(props.asInstanceOf[js.Any], childComponents.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getDataFromChildren(props: Any, childComponents: Any): js.Array[js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDataFromChildren")(props.asInstanceOf[js.Any], childComponents.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[Any]]]
  
  inline def getDefaultDomainPadding(props: Any, axis: Any, childComponents: Any): js.UndefOr[XNumber] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultDomainPadding")(props.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], childComponents.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[XNumber]]
  
  inline def getDomain(props: Any, axis: Any, childComponents: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getDomain")(props.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], childComponents.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getDomainFromChildren(props: Any, axis: Any, childComponents: Any): js.Array[Double | js.Date] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDomainFromChildren")(props.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], childComponents.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double | js.Date]]
  
  inline def getScale(props: Any, axis: Any): D3Scale[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getScale")(props.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[D3Scale[Any]]
  inline def getScale(props: Any, axis: Any, childComponents: Any): D3Scale[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getScale")(props.asInstanceOf[js.Any], axis.asInstanceOf[js.Any], childComponents.asInstanceOf[js.Any])).asInstanceOf[D3Scale[Any]]
  
  inline def getStringsFromCategories(childComponents: Any, axis: Any): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getStringsFromCategories")(childComponents.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def getStringsFromChildren(props: Any, childComponents: Any): YArray = (^.asInstanceOf[js.Dynamic].applyDynamic("getStringsFromChildren")(props.asInstanceOf[js.Any], childComponents.asInstanceOf[js.Any])).asInstanceOf[YArray]
  
  inline def getStringsFromData(childComponents: Any): XArray = ^.asInstanceOf[js.Dynamic].applyDynamic("getStringsFromData")(childComponents.asInstanceOf[js.Any]).asInstanceOf[XArray]
  
  inline def getStyle(theme: Any, style: Any, role: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getStyle")(theme.asInstanceOf[js.Any], style.asInstanceOf[js.Any], role.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getWidth(props: Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getWidth")(props.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def getWidth(props: Any, groupLength: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getWidth")(props.asInstanceOf[js.Any], groupLength.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getWidth(props: Any, groupLength: Any, seriesLength: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getWidth")(props.asInstanceOf[js.Any], groupLength.asInstanceOf[js.Any], seriesLength.asInstanceOf[js.Any])).asInstanceOf[Double]
  inline def getWidth(props: Any, groupLength: Unit, seriesLength: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getWidth")(props.asInstanceOf[js.Any], groupLength.asInstanceOf[js.Any], seriesLength.asInstanceOf[js.Any])).asInstanceOf[Double]
}
