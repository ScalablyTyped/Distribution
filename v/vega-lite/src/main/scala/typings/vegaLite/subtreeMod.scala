package typings.vegaLite

import typings.vegaLite.dataflowMod.DataFlowNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object subtreeMod {
  
  @JSImport("vega-lite/build/src/compile/data/subtree", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def moveFacetDown(node: DataFlowNode): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("moveFacetDown")(node.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
