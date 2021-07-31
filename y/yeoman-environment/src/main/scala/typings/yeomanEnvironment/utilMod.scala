package typings.yeomanEnvironment

import typings.yeomanEnvironment.logMod.Logger
import typings.yeomanEnvironment.logMod.LoggerOptions
import typings.yeomanEnvironment.mod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilMod {
  
  @JSImport("yeoman-environment/lib/util/util", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def duplicateEnv(initialEnv: typings.yeomanEnvironment.mod.^[Options]): typings.yeomanEnvironment.mod.^[Options] = ^.asInstanceOf[js.Dynamic].applyDynamic("duplicateEnv")(initialEnv.asInstanceOf[js.Any]).asInstanceOf[typings.yeomanEnvironment.mod.^[Options]]
  
  @scala.inline
  def log[TCategories /* <: String | Double | js.Symbol */](options: LoggerOptions[TCategories]): Logger[TCategories] = ^.asInstanceOf[js.Dynamic].applyDynamic("log")(options.asInstanceOf[js.Any]).asInstanceOf[Logger[TCategories]]
}
