package typings
package vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkspaceSymbolParams extends js.Object {
  /**
    * A non-empty query string
    */
  var query: java.lang.String
}

object WorkspaceSymbolParams {
  @scala.inline
  def apply(query: java.lang.String): WorkspaceSymbolParams = {
    val __obj = js.Dynamic.literal(query = query)
  
    __obj.asInstanceOf[WorkspaceSymbolParams]
  }
}

