package typings.webpack.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FailOnConflict extends StObject {
  
  /**
  		 * context relative to which module identifiers are computed
  		 */
  var context: js.UndefOr[String] = js.undefined
  
  /**
  		 * throw an error when id conflicts occur (instead of rehashing)
  		 */
  var failOnConflict: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * do not increase the maxLength to find an optimal id space size
  		 */
  var fixedLength: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * maximum id length in digits (used as starting point)
  		 */
  var maxLength: js.UndefOr[Double] = js.undefined
  
  /**
  		 * hash salt for ids
  		 */
  var salt: js.UndefOr[Double] = js.undefined
  
  /**
  		 * selector function for modules
  		 */
  var test: js.UndefOr[js.Function1[/* arg0 */ typings.webpack.mod.Module, Boolean]] = js.undefined
}
object FailOnConflict {
  
  inline def apply(): FailOnConflict = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FailOnConflict]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FailOnConflict] (val x: Self) extends AnyVal {
    
    inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
    
    inline def setFailOnConflict(value: Boolean): Self = StObject.set(x, "failOnConflict", value.asInstanceOf[js.Any])
    
    inline def setFailOnConflictUndefined: Self = StObject.set(x, "failOnConflict", js.undefined)
    
    inline def setFixedLength(value: Boolean): Self = StObject.set(x, "fixedLength", value.asInstanceOf[js.Any])
    
    inline def setFixedLengthUndefined: Self = StObject.set(x, "fixedLength", js.undefined)
    
    inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
    
    inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
    
    inline def setSalt(value: Double): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
    
    inline def setSaltUndefined: Self = StObject.set(x, "salt", js.undefined)
    
    inline def setTest(value: /* arg0 */ typings.webpack.mod.Module => Boolean): Self = StObject.set(x, "test", js.Any.fromFunction1(value))
    
    inline def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
  }
}
