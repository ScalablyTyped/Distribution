package typings.typescript.mod

import typings.typescript.typescriptBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnscopedEmitHelper extends EmitHelper {
  @JSName("scoped")
  val scoped_UnscopedEmitHelper: `false` = js.native
  @JSName("text")
  val text_UnscopedEmitHelper: java.lang.String = js.native
}

object UnscopedEmitHelper {
  @scala.inline
  def apply(name: java.lang.String, scoped: `false`, text: java.lang.String): UnscopedEmitHelper = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], scoped = scoped.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnscopedEmitHelper]
  }
  @scala.inline
  implicit class UnscopedEmitHelperOps[Self <: UnscopedEmitHelper] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setScoped(value: `false`): Self = this.set("scoped", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: java.lang.String): Self = this.set("text", value.asInstanceOf[js.Any])
  }
  
}

