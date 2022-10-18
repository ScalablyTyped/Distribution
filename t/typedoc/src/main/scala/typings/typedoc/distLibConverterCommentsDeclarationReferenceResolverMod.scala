package typings.typedoc

import typings.typedoc.distLibConverterCommentsDeclarationReferenceMod.DeclarationReference
import typings.typedoc.distLibModelsMod.Reflection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibConverterCommentsDeclarationReferenceResolverMod {
  
  @JSImport("typedoc/dist/lib/converter/comments/declarationReferenceResolver", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def resolveDeclarationReference(reflection: Reflection, ref: DeclarationReference): js.UndefOr[Reflection] = (^.asInstanceOf[js.Dynamic].applyDynamic("resolveDeclarationReference")(reflection.asInstanceOf[js.Any], ref.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Reflection]]
}
