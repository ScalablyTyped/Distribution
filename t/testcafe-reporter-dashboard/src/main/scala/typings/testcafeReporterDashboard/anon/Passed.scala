package typings.testcafeReporterDashboard.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Passed extends StObject {
  
  var passed: Boolean
}
object Passed {
  
  inline def apply(passed: Boolean): Passed = {
    val __obj = js.Dynamic.literal(passed = passed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Passed]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Passed] (val x: Self) extends AnyVal {
    
    inline def setPassed(value: Boolean): Self = StObject.set(x, "passed", value.asInstanceOf[js.Any])
  }
}
