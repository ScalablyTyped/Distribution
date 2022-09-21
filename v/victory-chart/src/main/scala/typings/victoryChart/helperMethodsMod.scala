package typings.victoryChart

import typings.react.mod.DetailedReactHTMLElement
import typings.react.mod.ReactElement
import typings.react.mod.ReactFragment
import typings.react.mod.ReactPortal
import typings.std.HTMLElement
import typings.victoryChart.anon.Categories
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helperMethodsMod {
  
  @JSImport("victory-chart/lib/helper-methods", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getBackgroundWithProps(props: Any, calculatedProps: Any): DetailedReactHTMLElement[Any, HTMLElement] = (^.asInstanceOf[js.Dynamic].applyDynamic("getBackgroundWithProps")(props.asInstanceOf[js.Any], calculatedProps.asInstanceOf[js.Any])).asInstanceOf[DetailedReactHTMLElement[Any, HTMLElement]]
  
  inline def getCalculatedProps(props: Any, childComponents: Any): Categories = (^.asInstanceOf[js.Dynamic].applyDynamic("getCalculatedProps")(props.asInstanceOf[js.Any], childComponents.asInstanceOf[js.Any])).asInstanceOf[Categories]
  
  inline def getChildComponents(props: Any): js.Array[String | Double | ReactElement | ReactFragment | ReactPortal] = ^.asInstanceOf[js.Dynamic].applyDynamic("getChildComponents")(props.asInstanceOf[js.Any]).asInstanceOf[js.Array[String | Double | ReactElement | ReactFragment | ReactPortal]]
  inline def getChildComponents(props: Any, defaultAxes: Any): js.Array[String | Double | ReactElement | ReactFragment | ReactPortal] = (^.asInstanceOf[js.Dynamic].applyDynamic("getChildComponents")(props.asInstanceOf[js.Any], defaultAxes.asInstanceOf[js.Any])).asInstanceOf[js.Array[String | Double | ReactElement | ReactFragment | ReactPortal]]
  
  inline def getChildren(props: Any, childComponents: Any, calculatedProps: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getChildren")(props.asInstanceOf[js.Any], childComponents.asInstanceOf[js.Any], calculatedProps.asInstanceOf[js.Any])).asInstanceOf[Any]
}
