package typings.typedoc.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc", "TSConfigReader")
@js.native
open class TSConfigReader ()
  extends typings.typedoc.distLibUtilsMod.TSConfigReader
/* static members */
object TSConfigReader {
  
  @JSImport("typedoc", "TSConfigReader")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Not considered part of the public API. You can use it, but it might break.
    * @internal
    */
  inline def findConfigFile(file: String): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("findConfigFile")(file.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
}
