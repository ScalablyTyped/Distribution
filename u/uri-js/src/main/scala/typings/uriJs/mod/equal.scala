package typings.uriJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("uri-js", "equal")
@js.native
object equal extends js.Object {
  
  def apply(uriA: String, uriB: String): Boolean = js.native
  def apply(uriA: String, uriB: String, options: URIOptions): Boolean = js.native
  def apply(uriA: URIComponents, uriB: URIComponents): Boolean = js.native
  def apply(uriA: URIComponents, uriB: URIComponents, options: URIOptions): Boolean = js.native
}
