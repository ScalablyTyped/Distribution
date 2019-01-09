package typings
package typedocLib.distLibModelsReflectionsSignatureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typedocLib.distLibModelsReflectionsAbstractMod.TypeParameterContainer because var conflicts: _alias, _aliases, anchor, comment, cssClasses, decorates, decorators, flags, hasOwnDocument, id, kind, kindString, name, originalName, parent, sources, url. Inlined typeParameters */ @JSImport("typedoc/dist/lib/models/reflections/signature", "SignatureReflection")
@js.native
class SignatureReflection ()
  extends typedocLib.distLibModelsReflectionsAbstractMod.TypeContainer {
  var implementationOf: js.UndefOr[typedocLib.distLibModelsTypesMod.Type] = js.native
  var inheritedFrom: js.UndefOr[typedocLib.distLibModelsTypesMod.Type] = js.native
  var overwrites: js.UndefOr[typedocLib.distLibModelsTypesMod.Type] = js.native
  var parameters: js.UndefOr[js.Array[typedocLib.distLibModelsReflectionsParameterMod.ParameterReflection]] = js.native
  @JSName("parent")
  var parent_SignatureReflection: js.UndefOr[typedocLib.distLibModelsReflectionsContainerMod.ContainerReflection] = js.native
  var typeParameters: js.UndefOr[
    js.Array[typedocLib.distLibModelsReflectionsTypeDashParameterMod.TypeParameterReflection]
  ] = js.native
  def getParameterTypes(): js.Array[typedocLib.distLibModelsTypesMod.Type] = js.native
}

