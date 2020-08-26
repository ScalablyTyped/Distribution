package typings.typedoc.defaultThemeMod

import typings.typedoc.abstractMod.ReflectionKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateMapping extends js.Object {
  var directory: String = js.native
  var isLeaf: Boolean = js.native
  var kind: js.Array[ReflectionKind] = js.native
  var template: String = js.native
}

object TemplateMapping {
  @scala.inline
  def apply(directory: String, isLeaf: Boolean, kind: js.Array[ReflectionKind], template: String): TemplateMapping = {
    val __obj = js.Dynamic.literal(directory = directory.asInstanceOf[js.Any], isLeaf = isLeaf.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateMapping]
  }
  @scala.inline
  implicit class TemplateMappingOps[Self <: TemplateMapping] (val x: Self) extends AnyVal {
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
    def setDirectory(value: String): Self = this.set("directory", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsLeaf(value: Boolean): Self = this.set("isLeaf", value.asInstanceOf[js.Any])
    @scala.inline
    def setKindVarargs(value: ReflectionKind*): Self = this.set("kind", js.Array(value :_*))
    @scala.inline
    def setKind(value: js.Array[ReflectionKind]): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
  }
  
}

