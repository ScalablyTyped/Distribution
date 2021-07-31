package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Term. */
trait Term extends StObject {
  
  var count: js.UndefOr[Double] = js.undefined
  
  /** The field where the aggregation is located in the document. */
  var field: js.UndefOr[String] = js.undefined
}
object Term {
  
  @scala.inline
  def apply(): Term = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Term]
  }
  
  @scala.inline
  implicit class TermMutableBuilder[Self <: Term] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
  }
}
