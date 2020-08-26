package typings.xstate.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Meta extends js.Object {
  var meta: /* import warning: importer.ImportType#apply Failed type conversion: infer D */ js.Any = js.native
}

object Meta {
  @scala.inline
  def apply(meta: /* import warning: importer.ImportType#apply Failed type conversion: infer D */ js.Any): Meta = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[Meta]
  }
  @scala.inline
  implicit class MetaOps[Self <: Meta] (val x: Self) extends AnyVal {
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
    def setMeta(value: /* import warning: importer.ImportType#apply Failed type conversion: infer D */ js.Any): Self = this.set("meta", value.asInstanceOf[js.Any])
  }
  
}

