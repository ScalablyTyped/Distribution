package typings.typescript.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EscapedIdentifier extends js.Object {
  var __escapedIdentifier: Unit = js.native
}

object EscapedIdentifier {
  @scala.inline
  def apply(__escapedIdentifier: Unit): EscapedIdentifier = {
    val __obj = js.Dynamic.literal(__escapedIdentifier = __escapedIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[EscapedIdentifier]
  }
  @scala.inline
  implicit class EscapedIdentifierOps[Self <: EscapedIdentifier] (val x: Self) extends AnyVal {
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
    def set__escapedIdentifier(value: Unit): Self = this.set("__escapedIdentifier", value.asInstanceOf[js.Any])
  }
  
}

