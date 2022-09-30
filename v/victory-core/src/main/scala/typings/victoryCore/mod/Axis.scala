package typings.victoryCore.mod

import typings.victoryCore.anon.`1`
import typings.victoryCore.propTypesMod.D3Scale
import typings.victoryCore.victoryCoreStrings.negative
import typings.victoryCore.victoryCoreStrings.positive
import typings.victoryCore.victoryCoreStrings.x
import typings.victoryCore.victoryCoreStrings.y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Axis {
  
  @JSImport("victory-core/lib", "Axis")
  @js.native
  val ^ : js.Any = js.native
  
  inline def findAxisComponents(childComponents: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("findAxisComponents")(childComponents.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def findAxisComponents(childComponents: Any, predicate: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("findAxisComponents")(childComponents.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getAxis(props: Any): x | y = ^.asInstanceOf[js.Dynamic].applyDynamic("getAxis")(props.asInstanceOf[js.Any]).asInstanceOf[x | y]
  
  inline def getAxisComponent(childComponents: Any, axis: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getAxisComponent")(childComponents.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getAxisComponentsWithParent(childComponents: Any, `type`: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getAxisComponentsWithParent")(childComponents.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getAxisValue(props: Any, axis: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getAxisValue")(props.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getDomain(props: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getDomain")(props.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def getDomain(props: Any, axis: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getDomain")(props.asInstanceOf[js.Any], axis.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getOrigin(domain: Any): `1` = ^.asInstanceOf[js.Dynamic].applyDynamic("getOrigin")(domain.asInstanceOf[js.Any]).asInstanceOf[`1`]
  
  inline def getOriginSign(origin: Any, domain: Any): positive | negative = (^.asInstanceOf[js.Dynamic].applyDynamic("getOriginSign")(origin.asInstanceOf[js.Any], domain.asInstanceOf[js.Any])).asInstanceOf[positive | negative]
  
  inline def getTickFormat(props: Any, scale: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getTickFormat")(props.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getTicks(props: Any, scale: D3Scale[Any]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTicks")(props.asInstanceOf[js.Any], scale.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def getTicks(props: Any, scale: D3Scale[Any], filterZero: Boolean): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("getTicks")(props.asInstanceOf[js.Any], scale.asInstanceOf[js.Any], filterZero.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def isVertical(props: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("isVertical")(props.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def modifyProps(props: Any, fallbackProps: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("modifyProps")(props.asInstanceOf[js.Any], fallbackProps.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def stringTicks(props: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("stringTicks")(props.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
