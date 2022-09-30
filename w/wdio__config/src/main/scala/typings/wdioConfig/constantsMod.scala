package typings.wdioConfig

import typings.wdioConfig.anon.OmitTestrunnercapabilitie
import typings.wdioConfig.wdioConfigStrings.after
import typings.wdioConfig.wdioConfigStrings.afterCommand
import typings.wdioConfig.wdioConfigStrings.afterHook
import typings.wdioConfig.wdioConfigStrings.afterSession
import typings.wdioConfig.wdioConfigStrings.afterSuite
import typings.wdioConfig.wdioConfigStrings.afterTest
import typings.wdioConfig.wdioConfigStrings.before
import typings.wdioConfig.wdioConfigStrings.beforeCommand
import typings.wdioConfig.wdioConfigStrings.beforeHook
import typings.wdioConfig.wdioConfigStrings.beforeSession
import typings.wdioConfig.wdioConfigStrings.beforeSuite
import typings.wdioConfig.wdioConfigStrings.beforeTest
import typings.wdioConfig.wdioConfigStrings.onComplete
import typings.wdioConfig.wdioConfigStrings.onPrepare
import typings.wdioConfig.wdioConfigStrings.onReload
import typings.wdioConfig.wdioConfigStrings.onWorkerEnd
import typings.wdioConfig.wdioConfigStrings.onWorkerStart
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object constantsMod {
  
  @JSImport("@wdio/config/build/constants", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def DEFAULT_CONFIGS(): OmitTestrunnercapabilitie = ^.asInstanceOf[js.Dynamic].applyDynamic("DEFAULT_CONFIGS")().asInstanceOf[OmitTestrunnercapabilitie]
  
  @JSImport("@wdio/config/build/constants", "SUPPORTED_FILE_EXTENSIONS")
  @js.native
  val SUPPORTED_FILE_EXTENSIONS: js.Array[String] = js.native
  
  @JSImport("@wdio/config/build/constants", "SUPPORTED_HOOKS")
  @js.native
  val SUPPORTED_HOOKS: js.Array[
    /* keyof @wdio/types.@wdio/types/build/Services.Hooks */ afterHook | onWorkerEnd | afterSuite | onReload | beforeTest | onComplete | afterCommand | after | before | beforeCommand | afterTest | beforeSuite | onWorkerStart | beforeSession | beforeHook | onPrepare | afterSession
  ] = js.native
}
