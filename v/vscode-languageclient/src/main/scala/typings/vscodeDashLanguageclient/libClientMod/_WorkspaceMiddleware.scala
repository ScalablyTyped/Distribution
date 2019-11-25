package typings.vscodeDashLanguageclient.libClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _WorkspaceMiddleware extends js.Object {
  var didChangeConfiguration: js.UndefOr[
    js.ThisFunction2[
      /* this */ Unit, 
      /* sections */ js.UndefOr[js.Array[String]], 
      /* next */ DidChangeConfigurationSignature, 
      Unit
    ]
  ] = js.undefined
}

object _WorkspaceMiddleware {
  @scala.inline
  def apply(
    didChangeConfiguration: js.ThisFunction2[
      /* this */ Unit, 
      /* sections */ js.UndefOr[js.Array[String]], 
      /* next */ DidChangeConfigurationSignature, 
      Unit
    ] = null
  ): _WorkspaceMiddleware = {
    val __obj = js.Dynamic.literal()
    if (didChangeConfiguration != null) __obj.updateDynamic("didChangeConfiguration")(didChangeConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[_WorkspaceMiddleware]
  }
}

