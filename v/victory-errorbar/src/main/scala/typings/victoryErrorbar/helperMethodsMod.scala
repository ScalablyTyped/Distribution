package typings.victoryErrorbar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helperMethodsMod {
  
  @JSImport("victory-errorbar/lib/helper-methods", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getBaseProps(props: Any, fallbackProps: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getBaseProps")(props.asInstanceOf[js.Any], fallbackProps.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getData(props: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getData")(props.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def getDomain(props: Any, axis: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getDomain")(props.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[Any]
}
