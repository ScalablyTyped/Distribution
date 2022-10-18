package typings.typedoc

import typings.typedoc.distLibModelsMod.ProjectReflection
import typings.typedoc.distLibUtilsMod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibValidationExportsMod {
  
  @JSImport("typedoc/dist/lib/validation/exports", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def validateExports(project: ProjectReflection, logger: Logger, intentionallyNotExported: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateExports")(project.asInstanceOf[js.Any], logger.asInstanceOf[js.Any], intentionallyNotExported.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
