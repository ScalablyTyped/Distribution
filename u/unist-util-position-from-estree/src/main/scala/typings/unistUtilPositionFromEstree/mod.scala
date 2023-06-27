package typings.unistUtilPositionFromEstree

import typings.unistUtilPositionFromEstree.libMod.NodeLike
import typings.unistUtilPositionFromEstree.libMod.Position
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("unist-util-position-from-estree", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def positionFromEstree(): Position = ^.asInstanceOf[js.Dynamic].applyDynamic("positionFromEstree")().asInstanceOf[Position]
  inline def positionFromEstree(node: NodeLike): Position = ^.asInstanceOf[js.Dynamic].applyDynamic("positionFromEstree")(node.asInstanceOf[js.Any]).asInstanceOf[Position]
}
