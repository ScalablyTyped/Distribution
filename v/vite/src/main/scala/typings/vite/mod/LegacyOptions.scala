package typings.vite.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LegacyOptions extends StObject {
  
  /**
    * Revert vite build --ssr to the v2.9 strategy. Use CJS SSR build and v2.9 externalization heuristics
    *
    * @experimental
    * @deprecated
    * @default false
    */
  var buildSsrCjsExternalHeuristics: js.UndefOr[Boolean] = js.undefined
}
object LegacyOptions {
  
  inline def apply(): LegacyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegacyOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LegacyOptions] (val x: Self) extends AnyVal {
    
    inline def setBuildSsrCjsExternalHeuristics(value: Boolean): Self = StObject.set(x, "buildSsrCjsExternalHeuristics", value.asInstanceOf[js.Any])
    
    inline def setBuildSsrCjsExternalHeuristicsUndefined: Self = StObject.set(x, "buildSsrCjsExternalHeuristics", js.undefined)
  }
}
