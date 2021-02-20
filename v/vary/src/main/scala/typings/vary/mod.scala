package typings.vary

import typings.node.httpMod.ServerResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("vary", JSImport.Namespace)
  @js.native
  def apply(res: ServerResponse, field: String): Unit = js.native
  @JSImport("vary", JSImport.Namespace)
  @js.native
  def apply(res: ServerResponse, field: js.Array[String]): Unit = js.native
  
  @JSImport("vary", "append")
  @js.native
  def append(header: String, field: String): String = js.native
  @JSImport("vary", "append")
  @js.native
  def append(header: String, field: js.Array[String]): String = js.native
}
