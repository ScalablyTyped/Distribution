package typings.typedoc

import typings.typedoc.abstractMod.TypeContainer
import typings.typedoc.containerMod.ContainerReflection
import typings.typedoc.modelsTypesMod.Type
import typings.typedoc.reflectionsParameterMod.ParameterReflection
import typings.typedoc.reflectionsTypeParameterMod.TypeParameterReflection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/models/reflections/signature", JSImport.Namespace)
@js.native
object reflectionsSignatureMod extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.typedoc.abstractMod.Reflection because Already inherited
  - typings.typedoc.abstractMod.TypeParameterContainer because var conflicts: _alias, _aliases, anchor, comment, cssClasses, decorates, decorators, flags, hasOwnDocument, id, kind, kindString, name, originalName, parent, sources, url. Inlined typeParameters */ @js.native
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

