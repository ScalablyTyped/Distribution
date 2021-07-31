package typings.wdioConfig

import typings.wdioConfig.anon.After
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object constantsMod {
  
  @JSImport("@wdio/config/build/constants", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def DEFAULT_CONFIGS(): After = ^.asInstanceOf[js.Dynamic].applyDynamic("DEFAULT_CONFIGS")().asInstanceOf[After]
  
  @JSImport("@wdio/config/build/constants", "SUPPORTED_FILE_EXTENSIONS")
  @js.native
  val SUPPORTED_FILE_EXTENSIONS: js.Array[String] = js.native
  
  @JSImport("@wdio/config/build/constants", "SUPPORTED_HOOKS")
  @js.native
  val SUPPORTED_HOOKS: js.Array[/* keyof @wdio/config.@wdio/config/build/types.Hooks */ String] = js.native
}
