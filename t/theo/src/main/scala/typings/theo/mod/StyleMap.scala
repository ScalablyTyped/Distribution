package typings.theo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StyleMap extends js.Object {
  var aliases: Aliases = js.native
  var global: js.UndefOr[Props] = js.native
  var imports: js.UndefOr[js.Array[String]] = js.native
  var meta: Meta = js.native
  var options: js.Object = js.native
  var props: Props = js.native
}

object StyleMap {
  @scala.inline
  def apply(aliases: Aliases, meta: Meta, options: js.Object, props: Props): StyleMap = {
    val __obj = js.Dynamic.literal(aliases = aliases.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[StyleMap]
  }
  @scala.inline
  implicit class StyleMapOps[Self <: StyleMap] (val x: Self) extends AnyVal {
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
    def setAliases(value: Aliases): Self = this.set("aliases", value.asInstanceOf[js.Any])
    @scala.inline
    def setMeta(value: Meta): Self = this.set("meta", value.asInstanceOf[js.Any])
    @scala.inline
    def setOptions(value: js.Object): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def setProps(value: Props): Self = this.set("props", value.asInstanceOf[js.Any])
    @scala.inline
    def setGlobal(value: Props): Self = this.set("global", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGlobal: Self = this.set("global", js.undefined)
    @scala.inline
    def setImportsVarargs(value: String*): Self = this.set("imports", js.Array(value :_*))
    @scala.inline
    def setImports(value: js.Array[String]): Self = this.set("imports", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImports: Self = this.set("imports", js.undefined)
  }
  
}

