package typings.systeminformation.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Passed extends StObject {
  
  var passed: Boolean = js.native
}
object Passed {
  
  @scala.inline
  def apply(passed: Boolean): Passed = {
    val __obj = js.Dynamic.literal(passed = passed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Passed]
  }
  
  @scala.inline
  implicit class PassedMutableBuilder[Self <: Passed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPassed(value: Boolean): Self = StObject.set(x, "passed", value.asInstanceOf[js.Any])
  }
}
