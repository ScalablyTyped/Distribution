package typings.unistUtilStringifyPosition

import typings.unist.mod.Node
import typings.unist.mod.Point
import typings.unist.mod.Position
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(value: Node): String = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(value: Point): String = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(value: Position): String = ^.asInstanceOf[js.Dynamic].apply(value.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSImport("unist-util-stringify-position", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
