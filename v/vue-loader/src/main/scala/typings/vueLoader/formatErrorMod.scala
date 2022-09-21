package typings.vueLoader

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatErrorMod {
  
  @JSImport("vue-loader/dist/formatError", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatError(err: js.SyntaxError, source: String, file: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("formatError")(err.asInstanceOf[js.Any], source.asInstanceOf[js.Any], file.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def formatError(
    err: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CompilerError */ Any,
    source: String,
    file: String
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("formatError")(err.asInstanceOf[js.Any], source.asInstanceOf[js.Any], file.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
