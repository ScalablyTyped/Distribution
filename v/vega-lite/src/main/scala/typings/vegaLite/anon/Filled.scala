package typings.vegaLite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Filled extends StObject {
  
  var filled: js.UndefOr[Boolean] = js.undefined
}
object Filled {
  
  @scala.inline
  def apply(): Filled = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Filled]
  }
  
  @scala.inline
  implicit class FilledMutableBuilder[Self <: Filled] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFilled(value: Boolean): Self = StObject.set(x, "filled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilledUndefined: Self = StObject.set(x, "filled", js.undefined)
  }
}
