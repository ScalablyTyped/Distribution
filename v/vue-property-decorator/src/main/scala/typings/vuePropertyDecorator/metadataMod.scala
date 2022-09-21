package typings.vuePropertyDecorator

import typings.vueRuntimeCore.mod.PropOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object metadataMod {
  
  @JSImport("vue-property-decorator/lib/helpers/metadata", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def applyMetadata(
    options: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Constructor */ Any
    ],
    target: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ Any,
    key: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyMetadata")(options.asInstanceOf[js.Any], target.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def applyMetadata(
    options: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Constructor */ Any,
    target: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ Any,
    key: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyMetadata")(options.asInstanceOf[js.Any], target.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def applyMetadata(
    options: PropOptions[Any, Any],
    target: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Vue */ Any,
    key: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("applyMetadata")(options.asInstanceOf[js.Any], target.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
