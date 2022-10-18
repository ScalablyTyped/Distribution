package typings.typedoc.distLibModelsMod

import typings.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.CallSignature
import typings.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.ConstructorSignature
import typings.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.GetSignature
import typings.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.IndexSignature
import typings.typedoc.distLibModelsReflectionsKindMod.ReflectionKind.SetSignature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/models", "SignatureReflection")
@js.native
open class SignatureReflection protected ()
  extends typings.typedoc.distLibModelsReflectionsMod.SignatureReflection {
  def this(
    name: String,
    kind: CallSignature,
    parent: typings.typedoc.distLibModelsReflectionsDeclarationMod.DeclarationReflection
  ) = this()
  def this(
    name: String,
    kind: ConstructorSignature,
    parent: typings.typedoc.distLibModelsReflectionsDeclarationMod.DeclarationReflection
  ) = this()
  def this(
    name: String,
    kind: GetSignature,
    parent: typings.typedoc.distLibModelsReflectionsDeclarationMod.DeclarationReflection
  ) = this()
  def this(
    name: String,
    kind: IndexSignature,
    parent: typings.typedoc.distLibModelsReflectionsDeclarationMod.DeclarationReflection
  ) = this()
  def this(
    name: String,
    kind: SetSignature,
    parent: typings.typedoc.distLibModelsReflectionsDeclarationMod.DeclarationReflection
  ) = this()
}
