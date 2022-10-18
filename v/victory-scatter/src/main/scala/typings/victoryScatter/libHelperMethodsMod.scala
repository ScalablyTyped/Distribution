package typings.victoryScatter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHelperMethodsMod {
  
  @JSImport("victory-scatter/lib/helper-methods", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getBaseProps(props: Any, fallbackProps: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getBaseProps")(props.asInstanceOf[js.Any], fallbackProps.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getBubbleSize(datum: Any, props: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getBubbleSize")(datum.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getSize(datum: Any, props: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getSize")(datum.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getSymbol(data: Any, props: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getSymbol")(data.asInstanceOf[js.Any], props.asInstanceOf[js.Any])).asInstanceOf[Any]
}
