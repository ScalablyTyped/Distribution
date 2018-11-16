package typings
package typedocLib.distLibModelsReflectionsDeclarationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(typedocLib.distLibModelsReflectionsAbstractMod.TypeParameterContainer because Would inherit conflicting mutable fields List(anchor, originalName, parent, name, kindString, url, flags, decorators, id, comment, _aliases, cssClasses, _alias, kind, sources, decorates, hasOwnDocument), typedocLib.distLibModelsReflectionsAbstractMod.TypeContainer because Would inherit conflicting mutable fields List(anchor, originalName, parent, name, kindString, url, flags, decorators, id, comment, _aliases, cssClasses, _alias, kind, sources, decorates, hasOwnDocument), typedocLib.distLibModelsReflectionsAbstractMod.DefaultValueContainer because Would inherit conflicting mutable fields List(anchor, originalName, parent, name, kindString, url, flags, decorators, id, comment, _aliases, cssClasses, _alias, kind, sources, decorates, hasOwnDocument))*/
@JSImport("typedoc/dist/lib/models/reflections/declaration", "DeclarationReflection")
@js.native
class DeclarationReflection ()
  extends typedocLib.distLibModelsReflectionsContainerMod.ContainerReflection {
  var defaultValue: java.lang.String = js.native
  var extendedBy: js.Array[typedocLib.distLibModelsTypesMod.Type] = js.native
  var extendedTypes: js.Array[typedocLib.distLibModelsTypesMod.Type] = js.native
  var getSignature: typedocLib.distLibModelsReflectionsSignatureMod.SignatureReflection = js.native
  var implementationOf: typedocLib.distLibModelsTypesMod.Type = js.native
  var implementedBy: js.Array[typedocLib.distLibModelsTypesMod.Type] = js.native
  var implementedTypes: js.Array[typedocLib.distLibModelsTypesMod.Type] = js.native
  var indexSignature: typedocLib.distLibModelsReflectionsSignatureMod.SignatureReflection = js.native
  var inheritedFrom: typedocLib.distLibModelsTypesMod.Type = js.native
  var overwrites: typedocLib.distLibModelsTypesMod.Type = js.native
  var setSignature: typedocLib.distLibModelsReflectionsSignatureMod.SignatureReflection = js.native
  var signatures: js.Array[typedocLib.distLibModelsReflectionsSignatureMod.SignatureReflection] = js.native
  var `type`: typedocLib.distLibModelsTypesMod.Type = js.native
  var typeHierarchy: DeclarationHierarchy = js.native
  var typeParameters: js.Array[typedocLib.distLibModelsReflectionsTypeDashParameterMod.TypeParameterReflection] = js.native
  def getAllSignatures(): js.Array[typedocLib.distLibModelsReflectionsSignatureMod.SignatureReflection] = js.native
}

