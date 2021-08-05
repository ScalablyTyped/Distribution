package typings.yargs

import typings.yargs.commonTypesMod.Dictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("yargs/build/lib/apply-extends", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def applyExtends(config: Dictionary[js.Any], cwd: String): Dictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyExtends")(config.asInstanceOf[js.Any], cwd.asInstanceOf[js.Any])).asInstanceOf[Dictionary[js.Any]]
  inline def applyExtends(config: Dictionary[js.Any], cwd: String, mergeExtends: Boolean): Dictionary[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyExtends")(config.asInstanceOf[js.Any], cwd.asInstanceOf[js.Any], mergeExtends.asInstanceOf[js.Any])).asInstanceOf[Dictionary[js.Any]]
}
