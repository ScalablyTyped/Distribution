package typings.vscode.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Recursive extends js.Object {
  var recursive: Boolean = js.native
}

object Recursive {
  @scala.inline
  def apply(recursive: Boolean): Recursive = {
    val __obj = js.Dynamic.literal(recursive = recursive.asInstanceOf[js.Any])
    __obj.asInstanceOf[Recursive]
  }
  @scala.inline
  implicit class RecursiveOps[Self <: Recursive] (val x: Self) extends AnyVal {
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
    def setRecursive(value: Boolean): Self = this.set("recursive", value.asInstanceOf[js.Any])
  }
  
}

