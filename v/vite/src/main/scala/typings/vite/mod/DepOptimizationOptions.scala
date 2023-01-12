package typings.vite.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DepOptimizationOptions
  extends StObject
     with DepOptimizationConfig {
  
  /**
    * By default, Vite will crawl your `index.html` to detect dependencies that
    * need to be pre-bundled. If `build.rollupOptions.input` is specified, Vite
    * will crawl those entry points instead.
    *
    * If neither of these fit your needs, you can specify custom entries using
    * this option - the value should be a fast-glob pattern or array of patterns
    * (https://github.com/mrmlnc/fast-glob#basic-syntax) that are relative from
    * vite project root. This will overwrite default entries inference.
    */
  var entries: js.UndefOr[String | js.Array[String]] = js.undefined
  
  /**
    * Force dep pre-optimization regardless of whether deps have changed.
    * @experimental
    */
  var force: js.UndefOr[Boolean] = js.undefined
}
object DepOptimizationOptions {
  
  inline def apply(): DepOptimizationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DepOptimizationOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DepOptimizationOptions] (val x: Self) extends AnyVal {
    
    inline def setEntries(value: String | js.Array[String]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
    
    inline def setEntriesVarargs(value: String*): Self = StObject.set(x, "entries", js.Array(value*))
    
    inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
    
    inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
  }
}
