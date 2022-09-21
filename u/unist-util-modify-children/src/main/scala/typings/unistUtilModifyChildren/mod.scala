package typings.unistUtilModifyChildren

import typings.unist.mod.Data
import typings.unist.mod.NodeData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("unist-util-modify-children", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def modifyChildren(callback: Modifier): Modify = ^.asInstanceOf[js.Dynamic].applyDynamic("modifyChildren")(callback.asInstanceOf[js.Any]).asInstanceOf[Modify]
  
  type Modifier = js.Function3[/* node */ Node, /* index */ Double, /* parent */ Parent, Double | Unit]
  
  type Modify = js.Function1[/* node */ Parent, Unit]
  
  type Node = typings.unist.mod.Node[Data]
  
  type Parent = typings.unist.mod.Parent[typings.unist.mod.Node[Data], NodeData[typings.unist.mod.Node[Data]]]
}
