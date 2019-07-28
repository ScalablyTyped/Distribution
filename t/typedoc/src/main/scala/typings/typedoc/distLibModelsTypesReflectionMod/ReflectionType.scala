package typings.typedoc.distLibModelsTypesReflectionMod

import typings.typedoc.distLibModelsReflectionsDeclarationMod.DeclarationReflection
import typings.typedoc.distLibModelsTypesAbstractMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/models/types/reflection", "ReflectionType")
@js.native
class ReflectionType protected () extends Type {
  def this(declaration: DeclarationReflection) = this()
  var declaration: DeclarationReflection = js.native
  def equals(`type`: ReflectionType): Boolean = js.native
}

