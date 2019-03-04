package typings
package typedocLib.distLibOutputThemesDefaultThemeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateMapping extends js.Object {
  var directory: java.lang.String
  var isLeaf: scala.Boolean
  var kind: js.Array[typedocLib.distLibModelsReflectionsAbstractMod.ReflectionKind]
  var template: java.lang.String
}

object TemplateMapping {
  @scala.inline
  def apply(
    directory: java.lang.String,
    isLeaf: scala.Boolean,
    kind: js.Array[typedocLib.distLibModelsReflectionsAbstractMod.ReflectionKind],
    template: java.lang.String
  ): TemplateMapping = {
    val __obj = js.Dynamic.literal(directory = directory, isLeaf = isLeaf, kind = kind, template = template)
  
    __obj.asInstanceOf[TemplateMapping]
  }
}

