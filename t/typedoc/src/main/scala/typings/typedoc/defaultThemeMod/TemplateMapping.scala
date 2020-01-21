package typings.typedoc.defaultThemeMod

import typings.typedoc.abstractMod.ReflectionKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateMapping extends js.Object {
  var directory: String
  var isLeaf: Boolean
  var kind: js.Array[ReflectionKind]
  var template: String
}

object TemplateMapping {
  @scala.inline
  def apply(directory: String, isLeaf: Boolean, kind: js.Array[ReflectionKind], template: String): TemplateMapping = {
    val __obj = js.Dynamic.literal(directory = directory.asInstanceOf[js.Any], isLeaf = isLeaf.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TemplateMapping]
  }
}

