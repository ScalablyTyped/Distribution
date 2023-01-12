package typings.vite.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolvedSSROptions
  extends StObject
     with SSROptions {
  
  @JSName("format")
  var format_ResolvedSSROptions: SSRFormat
  
  @JSName("optimizeDeps")
  var optimizeDeps_ResolvedSSROptions: SsrDepOptimizationOptions
  
  @JSName("target")
  var target_ResolvedSSROptions: SSRTarget
}
object ResolvedSSROptions {
  
  inline def apply(format: SSRFormat, optimizeDeps: SsrDepOptimizationOptions, target: SSRTarget): ResolvedSSROptions = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], optimizeDeps = optimizeDeps.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedSSROptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResolvedSSROptions] (val x: Self) extends AnyVal {
    
    inline def setFormat(value: SSRFormat): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setOptimizeDeps(value: SsrDepOptimizationOptions): Self = StObject.set(x, "optimizeDeps", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: SSRTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
