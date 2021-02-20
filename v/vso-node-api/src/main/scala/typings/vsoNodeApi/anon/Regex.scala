package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Regex extends StObject {
  
  var regex: scala.Double = js.native
  
  var variable: scala.Double = js.native
}
object Regex {
  
  @scala.inline
  def apply(regex: scala.Double, variable: scala.Double): Regex = {
    val __obj = js.Dynamic.literal(regex = regex.asInstanceOf[js.Any], variable = variable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Regex]
  }
  
  @scala.inline
  implicit class RegexMutableBuilder[Self <: Regex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRegex(value: scala.Double): Self = StObject.set(x, "regex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVariable(value: scala.Double): Self = StObject.set(x, "variable", value.asInstanceOf[js.Any])
  }
}
