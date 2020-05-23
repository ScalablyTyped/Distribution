package typings.vscodeLanguageserverProtocol.protocolMod

import org.scalablytyped.runtime.StringDictionary
import typings.vscodeLanguageserverProtocol.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitializeResult[T]
  extends /**
  * Custom initialization results.
  */
/* custom */ StringDictionary[js.Any] {
  /**
    * The capabilities the language server provides.
    */
  var capabilities: ServerCapabilities[T]
  /**
    * Information about the server.
    *
    * @since 3.15.0
    */
  var serverInfo: js.UndefOr[Name] = js.undefined
}

object InitializeResult {
  @scala.inline
  def apply[T](
    capabilities: ServerCapabilities[T],
    StringDictionary: /* name */ StringDictionary[js.Any] = null,
    serverInfo: Name = null
  ): InitializeResult[T] = {
    val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (serverInfo != null) __obj.updateDynamic("serverInfo")(serverInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitializeResult[T]]
  }
}

