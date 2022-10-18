package typings.stylableBuildTools

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distProcessUrlDependenciesMod {
  
  @JSImport("@stylable/build-tools/dist/process-url-dependencies", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def processUrlDependencies(
    meta: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StylableMeta */ Any,
    rootContext: String
  ): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("processUrlDependencies")(meta.asInstanceOf[js.Any], rootContext.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def processUrlDependencies(
    meta: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify StylableMeta */ Any,
    rootContext: String,
    filter: js.Function2[/* url */ String, /* context */ String, Boolean]
  ): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("processUrlDependencies")(meta.asInstanceOf[js.Any], rootContext.asInstanceOf[js.Any], filter.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
}
