package typings.victoryCore

import typings.victoryCore.anon.XNumber
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dataMod {
  
  @JSImport("victory-core/lib/victory-util/data", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createStringMap(props: Any, axis: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("createStringMap")(props.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def downsample(data: Any, maxPoints: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("downsample")(data.asInstanceOf[js.Any], maxPoints.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def downsample(data: Any, maxPoints: Any, startingIndex: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("downsample")(data.asInstanceOf[js.Any], maxPoints.asInstanceOf[js.Any], startingIndex.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def formatData(dataset: js.Array[Any], props: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("formatData")(dataset.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def formatData(dataset: js.Array[Any], props: Any, expectedKeys: js.Array[String]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("formatData")(dataset.asInstanceOf[js.Any], props.asInstanceOf[js.Any], expectedKeys.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def formatDataFromDomain(dataset: Any, domain: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDataFromDomain")(dataset.asInstanceOf[js.Any], domain.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def formatDataFromDomain(dataset: Any, domain: Any, defaultBaseline: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("formatDataFromDomain")(dataset.asInstanceOf[js.Any], domain.asInstanceOf[js.Any], defaultBaseline.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def generateData(props: Any): js.Array[XNumber] = ^.asInstanceOf[js.Dynamic].applyDynamic("generateData")(props.asInstanceOf[js.Any]).asInstanceOf[js.Array[XNumber]]
  
  inline def getCategories(props: Any, axis: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getCategories")(props.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getData(props: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getData")(props.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getStringsFromAxes(props: Any, axis: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getStringsFromAxes")(props.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getStringsFromCategories(props: Any, axis: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getStringsFromCategories")(props.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getStringsFromData(props: Any, axis: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getStringsFromData")(props.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def isDataComponent(component: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDataComponent")(component.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
