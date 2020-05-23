package typings.typedoc.reflectionsDeclarationMod

import typings.typedoc.containerMod.ContainerReflection
import typings.typedoc.modelsTypesMod.Type
import typings.typedoc.reflectionsSignatureMod.SignatureReflection
import typings.typedoc.reflectionsTypeParameterMod.TypeParameterReflection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.typedoc.abstractMod.Reflection because Already inherited
- typings.typedoc.abstractMod.TypeParameterContainer because var conflicts: _alias, _aliases, anchor, comment, cssClasses, decorates, decorators, flags, hasOwnDocument, id, kind, kindString, name, originalName, parent, sources, url. Inlined typeParameters
- typings.typedoc.abstractMod.TypeContainer because var conflicts: _alias, _aliases, anchor, comment, cssClasses, decorates, decorators, flags, hasOwnDocument, id, kind, kindString, name, originalName, parent, sources, url. Inlined `type`
- typings.typedoc.abstractMod.DefaultValueContainer because var conflicts: _alias, _aliases, anchor, comment, cssClasses, decorates, decorators, flags, hasOwnDocument, id, kind, kindString, name, originalName, parent, sources, url. Inlined defaultValue */ @JSImport("typedoc/dist/lib/models/reflections/declaration", "DeclarationReflection")
@js.native
class DeclarationReflection () extends ContainerReflection {
  var defaultValue: js.UndefOr[String] = js.native
  var extendedBy: js.UndefOr[js.Array[Type]] = js.native
  var extendedTypes: js.UndefOr[js.Array[Type]] = js.native
  var getSignature: js.UndefOr[SignatureReflection] = js.native
  var implementationOf: js.UndefOr[Type] = js.native
  var implementedBy: js.UndefOr[js.Array[Type]] = js.native
  var implementedTypes: js.UndefOr[js.Array[Type]] = js.native
  var indexSignature: js.UndefOr[SignatureReflection] = js.native
  var inheritedFrom: js.UndefOr[Type] = js.native
  var overwrites: js.UndefOr[Type] = js.native
  var setSignature: js.UndefOr[SignatureReflection] = js.native
  var signatures: js.UndefOr[js.Array[SignatureReflection]] = js.native
  var `type`: js.UndefOr[Type] = js.native
  var typeHierarchy: js.UndefOr[DeclarationHierarchy] = js.native
  var typeParameters: js.UndefOr[js.Array[TypeParameterReflection]] = js.native
  def getAllSignatures(): js.Array[SignatureReflection] = js.native
}

