package typings
package typedocLib.distLibModelsReflectionsSignatureMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(typedocLib.distLibModelsReflectionsAbstractMod.TypeParameterContainer because Would inherit conflicting mutable fields List(anchor, originalName, parent, name, kindString, url, flags, decorators, id, comment, _aliases, cssClasses, _alias, kind, sources, decorates, hasOwnDocument))*/
@JSImport("typedoc/dist/lib/models/reflections/signature", "SignatureReflection")
@js.native
class SignatureReflection ()
  extends typedocLib.distLibModelsReflectionsAbstractMod.TypeContainer {
  var implementationOf: typedocLib.distLibModelsTypesMod.Type = js.native
  var inheritedFrom: typedocLib.distLibModelsTypesMod.Type = js.native
  var overwrites: typedocLib.distLibModelsTypesMod.Type = js.native
  var parameters: js.Array[typedocLib.distLibModelsReflectionsParameterMod.ParameterReflection] = js.native
  @JSName("parent")
  var parent_SignatureReflection: typedocLib.distLibModelsReflectionsContainerMod.ContainerReflection = js.native
  var typeParameters: js.Array[typedocLib.distLibModelsReflectionsTypeDashParameterMod.TypeParameterReflection] = js.native
  def getParameterTypes(): js.Array[typedocLib.distLibModelsTypesMod.Type] = js.native
}

