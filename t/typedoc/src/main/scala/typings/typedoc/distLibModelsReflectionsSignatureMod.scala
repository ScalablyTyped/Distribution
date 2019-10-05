package typings.typedoc

import typings.typedoc.distLibModelsReflectionsAbstractMod.TypeContainer
import typings.typedoc.distLibModelsReflectionsContainerMod.ContainerReflection
import typings.typedoc.distLibModelsReflectionsParameterMod.ParameterReflection
import typings.typedoc.distLibModelsReflectionsTypeDashParameterMod.TypeParameterReflection
import typings.typedoc.distLibModelsTypesMod.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/models/reflections/signature", JSImport.Namespace)
@js.native
object distLibModelsReflectionsSignatureMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.typedoc.distLibModelsReflectionsAbstractMod.Reflection because Already inherited
  - typings.typedoc.distLibModelsReflectionsAbstractMod.TypeParameterContainer because var conflicts: _alias, _aliases, anchor, comment, cssClasses, decorates, decorators, flags, hasOwnDocument, id, kind, kindString, name, originalName, parent, sources, url. Inlined typeParameters */ @js.native
  class SignatureReflection () extends TypeContainer {
    var implementationOf: js.UndefOr[Type] = js.native
    var inheritedFrom: js.UndefOr[Type] = js.native
    var overwrites: js.UndefOr[Type] = js.native
    var parameters: js.UndefOr[js.Array[ParameterReflection]] = js.native
    @JSName("parent")
    var parent_SignatureReflection: js.UndefOr[ContainerReflection] = js.native
    var typeParameters: js.UndefOr[js.Array[TypeParameterReflection]] = js.native
    def getParameterTypes(): js.Array[Type] = js.native
  }
  
}

