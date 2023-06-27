package typings.unistUtilPosition

import typings.unistUtilPosition.libMod.Node
import typings.unistUtilPosition.libMod.NodeLike
import typings.unistUtilPosition.libMod.Point
import typings.unistUtilPosition.libMod.Position_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("unist-util-position", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def pointEnd(): Point = ^.asInstanceOf[js.Dynamic].applyDynamic("pointEnd")().asInstanceOf[Point]
  inline def pointEnd(node: Node): Point = ^.asInstanceOf[js.Dynamic].applyDynamic("pointEnd")(node.asInstanceOf[js.Any]).asInstanceOf[Point]
  inline def pointEnd(node: NodeLike): Point = ^.asInstanceOf[js.Dynamic].applyDynamic("pointEnd")(node.asInstanceOf[js.Any]).asInstanceOf[Point]
  
  inline def pointStart(): Point = ^.asInstanceOf[js.Dynamic].applyDynamic("pointStart")().asInstanceOf[Point]
  inline def pointStart(node: Node): Point = ^.asInstanceOf[js.Dynamic].applyDynamic("pointStart")(node.asInstanceOf[js.Any]).asInstanceOf[Point]
  inline def pointStart(node: NodeLike): Point = ^.asInstanceOf[js.Dynamic].applyDynamic("pointStart")(node.asInstanceOf[js.Any]).asInstanceOf[Point]
  
  inline def position(): Position_ = ^.asInstanceOf[js.Dynamic].applyDynamic("position")().asInstanceOf[Position_]
  inline def position(node: Node): Position_ = ^.asInstanceOf[js.Dynamic].applyDynamic("position")(node.asInstanceOf[js.Any]).asInstanceOf[Position_]
  inline def position(node: NodeLike): Position_ = ^.asInstanceOf[js.Dynamic].applyDynamic("position")(node.asInstanceOf[js.Any]).asInstanceOf[Position_]
}
