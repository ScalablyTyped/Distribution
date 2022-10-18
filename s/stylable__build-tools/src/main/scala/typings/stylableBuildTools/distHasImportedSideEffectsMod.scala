package typings.stylableBuildTools

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distHasImportedSideEffectsMod {
  
  @JSImport("@stylable/build-tools/dist/has-imported-side-effects", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hasImportedSideEffects(
    stylable: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Stylable */ Any,
    meta: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StylableMeta */ Any,
    imported: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Imported */ Any
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("hasImportedSideEffects")(stylable.asInstanceOf[js.Any], meta.asInstanceOf[js.Any], imported.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
