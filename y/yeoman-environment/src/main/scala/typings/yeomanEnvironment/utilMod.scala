package typings.yeomanEnvironment

import typings.yeomanEnvironment.logMod.Logger
import typings.yeomanEnvironment.logMod.LoggerOptions
import typings.yeomanEnvironment.mod.Options
import typings.yeomanEnvironment.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("yeoman-environment/lib/util/util", JSImport.Namespace)
@js.native
object utilMod extends js.Object {
  
  def duplicateEnv(initialEnv: ^[Options]): ^[Options] = js.native
  
  @js.native
  object log extends js.Object {
    
    def apply[TCategories /* <: String | Double | js.Symbol */](options: LoggerOptions[TCategories]): Logger[TCategories] = js.native
  }
}
