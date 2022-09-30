package typings.victoryCore

import typings.react.mod.global.JSX.Element
import typings.victoryCore.typesMod.VictoryPrimitiveShapeProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pathMod {
  
  @JSImport("victory-core/lib/victory-primitives/path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def Path(props: VictoryPrimitiveShapeProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("Path")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
}
