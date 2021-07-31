package typings.victory.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Negative extends StObject {
  
  var negative: js.UndefOr[String] = js.undefined
  
  var positive: js.UndefOr[String] = js.undefined
}
object Negative {
  
  @scala.inline
  def apply(): Negative = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Negative]
  }
  
  @scala.inline
  implicit class NegativeMutableBuilder[Self <: Negative] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNegative(value: String): Self = StObject.set(x, "negative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNegativeUndefined: Self = StObject.set(x, "negative", js.undefined)
    
    @scala.inline
    def setPositive(value: String): Self = StObject.set(x, "positive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositiveUndefined: Self = StObject.set(x, "positive", js.undefined)
  }
}
