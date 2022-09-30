package typings.victoryCore

import typings.react.mod.global.JSX.Element
import typings.victoryCore.typesMod.VictoryPrimitiveShapeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lineMod {
  
  @JSImport("victory-core/lib/victory-primitives/line", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Line(props: VictoryPrimitiveShapeProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Line")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
