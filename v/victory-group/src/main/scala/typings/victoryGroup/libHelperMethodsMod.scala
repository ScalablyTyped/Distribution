package typings.victoryGroup

import typings.victoryGroup.anon.Categories
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHelperMethodsMod {
  
  @JSImport("victory-group/lib/helper-methods", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getCalculatedProps(props: Any, childComponents: Any): Categories = (^.asInstanceOf[js.Dynamic].applyDynamic("getCalculatedProps")(props.asInstanceOf[js.Any], childComponents.asInstanceOf[js.Any])).asInstanceOf[Categories]
  
  inline def getChildren(props: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getChildren")(props.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def getChildren(props: Any, childComponents: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getChildren")(props.asInstanceOf[js.Any], childComponents.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getChildren(props: Any, childComponents: Any, calculatedProps: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getChildren")(props.asInstanceOf[js.Any], childComponents.asInstanceOf[js.Any], calculatedProps.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getChildren(props: Any, childComponents: Unit, calculatedProps: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getChildren")(props.asInstanceOf[js.Any], childComponents.asInstanceOf[js.Any], calculatedProps.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def useMemoizedProps(initialProps: Any): Categories = ^.asInstanceOf[js.Dynamic].applyDynamic("useMemoizedProps")(initialProps.asInstanceOf[js.Any]).asInstanceOf[Categories]
}
