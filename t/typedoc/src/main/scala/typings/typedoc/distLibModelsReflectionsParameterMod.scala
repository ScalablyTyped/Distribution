package typings.typedoc

import typings.typedoc.distLibModelsReflectionsAbstractMod.DefaultValueContainer
import typings.typedoc.distLibModelsReflectionsSignatureMod.SignatureReflection
import typings.typedoc.distLibModelsTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/models/reflections/parameter", JSImport.Namespace)
@js.native
object distLibModelsReflectionsParameterMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.typedoc.distLibModelsReflectionsAbstractMod.Reflection because Already inherited
  - typings.typedoc.distLibModelsReflectionsAbstractMod.TypeContainer because var conflicts: _alias, _aliases, anchor, comment, cssClasses, decorates, decorators, flags, hasOwnDocument, id, kind, kindString, name, originalName, parent, sources, url. Inlined `type` */ @js.native
  class ParameterReflection () extends DefaultValueContainer {
    @JSName("parent")
    var parent_ParameterReflection: js.UndefOr[SignatureReflection] = js.native
    var `type`: js.UndefOr[Type] = js.native
  }
  
}

