package typings.typedoc

import typings.minimatch.mod.IMinimatch
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object pathsMod {
  
  @JSImport("typedoc/dist/lib/utils/paths", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createMinimatch(patterns: js.Array[String]): js.Array[IMinimatch] = ^.asInstanceOf[js.Dynamic].applyDynamic("createMinimatch")(patterns.asInstanceOf[js.Any]).asInstanceOf[js.Array[IMinimatch]]
}
