package typings.vscodeLanguageserverProtocol.protocolMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InitializeResult
  extends /**
  * Custom initialization results.
  */
/* custom */ StringDictionary[js.Any] {
  /**
    * The capabilities the language server provides.
    */
  var capabilities: ServerCapabilities
}

object InitializeResult {
  @scala.inline
  def apply(
    capabilities: ServerCapabilities,
    StringDictionary: /**
    * Custom initialization results.
    */
  /* custom */ StringDictionary[js.Any] = null
  ): InitializeResult = {
    val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    __obj.asInstanceOf[InitializeResult]
  }
}

