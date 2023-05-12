package typings.webpackSubresourceIntegrity

import typings.webpackSubresourceIntegrity.distCjsTypesMod.Graph
import typings.webpackSubresourceIntegrity.distCjsTypesMod.StronglyConnectedComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsSccMod {
  
  @JSImport("webpack-subresource-integrity/dist/cjs/scc", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createDAGfromGraph[T](graph: Graph[T]): Graph[StronglyConnectedComponent[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("createDAGfromGraph")(graph.asInstanceOf[js.Any]).asInstanceOf[Graph[StronglyConnectedComponent[T]]]
}
