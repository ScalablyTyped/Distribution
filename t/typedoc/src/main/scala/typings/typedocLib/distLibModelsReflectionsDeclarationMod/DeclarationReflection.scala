package typings
package typedocLib.distLibModelsReflectionsDeclarationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* RemoveMultipleInheritance: Dropped parents List(typedocLib.distLibModelsReflectionsAbstractMod.TypeParameterContainer because Would inherit conflicting mutable fields List(_alias, _aliases, anchor, comment, cssClasses, decorates, decorators, flags, hasOwnDocument, id, kind, kindString, name, originalName, parent, sources, url), typedocLib.distLibModelsReflectionsAbstractMod.TypeContainer because Would inherit conflicting mutable fields List(_alias, _aliases, anchor, comment, cssClasses, decorates, decorators, flags, hasOwnDocument, id, kind, kindString, name, originalName, parent, sources, url), typedocLib.distLibModelsReflectionsAbstractMod.DefaultValueContainer because Would inherit conflicting mutable fields List(_alias, _aliases, anchor, comment, cssClasses, decorates, decorators, flags, hasOwnDocument, id, kind, kindString, name, originalName, parent, sources, url))*/
@JSImport("typedoc/dist/lib/models/reflections/declaration", "DeclarationReflection")
@js.native
class DeclarationReflection ()
  extends typedocLib.distLibModelsReflectionsContainerMod.ContainerReflection {
  var defaultValue: js.UndefOr[java.lang.String] = js.native
  var extendedBy: js.UndefOr[js.Array[typedocLib.distLibModelsTypesMod.Type]] = js.native
  var extendedTypes: js.UndefOr[js.Array[typedocLib.distLibModelsTypesMod.Type]] = js.native
  var getSignature: js.UndefOr[typedocLib.distLibModelsReflectionsSignatureMod.SignatureReflection] = js.native
  var implementationOf: js.UndefOr[typedocLib.distLibModelsTypesMod.Type] = js.native
  var implementedBy: js.UndefOr[js.Array[typedocLib.distLibModelsTypesMod.Type]] = js.native
  var implementedTypes: js.UndefOr[js.Array[typedocLib.distLibModelsTypesMod.Type]] = js.native
  var indexSignature: js.UndefOr[typedocLib.distLibModelsReflectionsSignatureMod.SignatureReflection] = js.native
  var inheritedFrom: js.UndefOr[typedocLib.distLibModelsTypesMod.Type] = js.native
  var overwrites: js.UndefOr[typedocLib.distLibModelsTypesMod.Type] = js.native
  var setSignature: js.UndefOr[typedocLib.distLibModelsReflectionsSignatureMod.SignatureReflection] = js.native
  var signatures: js.UndefOr[js.Array[typedocLib.distLibModelsReflectionsSignatureMod.SignatureReflection]] = js.native
  var `type`: js.UndefOr[typedocLib.distLibModelsTypesMod.Type] = js.native
  var typeHierarchy: js.UndefOr[DeclarationHierarchy] = js.native
  var typeParameters: js.UndefOr[
    js.Array[typedocLib.distLibModelsReflectionsTypeDashParameterMod.TypeParameterReflection]
  ] = js.native
  def getAllSignatures(): js.Array[typedocLib.distLibModelsReflectionsSignatureMod.SignatureReflection] = js.native
}

