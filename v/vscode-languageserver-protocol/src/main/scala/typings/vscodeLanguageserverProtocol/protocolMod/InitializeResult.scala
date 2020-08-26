package typings.vscodeLanguageserverProtocol.protocolMod

import org.scalablytyped.runtime.StringDictionary
import typings.vscodeLanguageserverProtocol.anon.Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InitializeResult[T]
  extends /**
  * Custom initialization results.
  */
/* custom */ StringDictionary[js.Any] {
  /**
    * The capabilities the language server provides.
    */
  var capabilities: ServerCapabilities[T] = js.native
  /**
    * Information about the server.
    *
    * @since 3.15.0
    */
  var serverInfo: js.UndefOr[Name] = js.native
}

object InitializeResult {
  @scala.inline
  def apply[T](capabilities: ServerCapabilities[T]): InitializeResult[T] = {
    val __obj = js.Dynamic.literal(capabilities = capabilities.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitializeResult[T]]
  }
  @scala.inline
  implicit class InitializeResultOps[Self <: InitializeResult[_], T] (val x: Self with InitializeResult[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCapabilities(value: ServerCapabilities[T]): Self = this.set("capabilities", value.asInstanceOf[js.Any])
    @scala.inline
    def setServerInfo(value: Name): Self = this.set("serverInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServerInfo: Self = this.set("serverInfo", js.undefined)
  }
  
}

