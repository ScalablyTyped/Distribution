package typings.typescript.mod

import typings.typescript.typescriptStrings.file
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CombinedCodeFixScope extends js.Object {
  var fileName: java.lang.String = js.native
  var `type`: file = js.native
}

object CombinedCodeFixScope {
  @scala.inline
  def apply(fileName: java.lang.String, `type`: file): CombinedCodeFixScope = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CombinedCodeFixScope]
  }
  @scala.inline
  implicit class CombinedCodeFixScopeOps[Self <: CombinedCodeFixScope] (val x: Self) extends AnyVal {
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
    def setFileName(value: java.lang.String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: file): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

