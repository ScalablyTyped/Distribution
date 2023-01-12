package typings.webpagetest.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RunOptions extends StObject {
  
  /** if true returns the repeat view (cached) data */
  var repeatView: js.UndefOr[Boolean] = js.undefined
  
  /** the test run number for multiple runs tests (default: 1, first test) */
  var run: js.UndefOr[Double] = js.undefined
}
object RunOptions {
  
  inline def apply(): RunOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RunOptions] (val x: Self) extends AnyVal {
    
    inline def setRepeatView(value: Boolean): Self = StObject.set(x, "repeatView", value.asInstanceOf[js.Any])
    
    inline def setRepeatViewUndefined: Self = StObject.set(x, "repeatView", js.undefined)
    
    inline def setRun(value: Double): Self = StObject.set(x, "run", value.asInstanceOf[js.Any])
    
    inline def setRunUndefined: Self = StObject.set(x, "run", js.undefined)
  }
}
