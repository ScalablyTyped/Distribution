package typings
package vscodeDashLanguageclientLib.libClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _WorkspaceMiddleware extends js.Object {
  var didChangeConfiguration: js.UndefOr[
    js.ThisFunction2[
      /* this */ scala.Unit, 
      /* sections */ js.UndefOr[js.Array[java.lang.String]], 
      /* next */ DidChangeConfigurationSignature, 
      scala.Unit
    ]
  ] = js.undefined
}

object _WorkspaceMiddleware {
  @scala.inline
  def apply(
    didChangeConfiguration: js.ThisFunction2[
      /* this */ scala.Unit, 
      /* sections */ js.UndefOr[js.Array[java.lang.String]], 
      /* next */ DidChangeConfigurationSignature, 
      scala.Unit
    ] = null
  ): _WorkspaceMiddleware = {
    val __obj = js.Dynamic.literal()
    if (didChangeConfiguration != null) __obj.updateDynamic("didChangeConfiguration")(didChangeConfiguration)
    __obj.asInstanceOf[_WorkspaceMiddleware]
  }
}

