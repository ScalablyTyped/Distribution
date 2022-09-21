package typings.typedoc.mod

import typings.typedoc.kindMod.ReflectionKind.CallSignature
import typings.typedoc.kindMod.ReflectionKind.ConstructorSignature
import typings.typedoc.kindMod.ReflectionKind.GetSignature
import typings.typedoc.kindMod.ReflectionKind.IndexSignature
import typings.typedoc.kindMod.ReflectionKind.SetSignature
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "SignatureReflection")
@js.native
open class SignatureReflection protected ()
  extends typings.typedoc.modelsMod.SignatureReflection {
  def this(name: String, kind: CallSignature, parent: typings.typedoc.declarationMod.DeclarationReflection) = this()
  def this(
    name: String,
    kind: ConstructorSignature,
    parent: typings.typedoc.declarationMod.DeclarationReflection
  ) = this()
  def this(name: String, kind: GetSignature, parent: typings.typedoc.declarationMod.DeclarationReflection) = this()
  def this(name: String, kind: IndexSignature, parent: typings.typedoc.declarationMod.DeclarationReflection) = this()
  def this(name: String, kind: SetSignature, parent: typings.typedoc.declarationMod.DeclarationReflection) = this()
}
