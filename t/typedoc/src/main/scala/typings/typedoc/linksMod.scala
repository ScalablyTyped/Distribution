package typings.typedoc

import typings.typedoc.libUtilsMod.Logger
import typings.typedoc.modelsMod.ProjectReflection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object linksMod {
  
  @JSImport("typedoc/dist/lib/validation/links", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def validateLinks(project: ProjectReflection, logger: Logger): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateLinks")(project.asInstanceOf[js.Any], logger.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
