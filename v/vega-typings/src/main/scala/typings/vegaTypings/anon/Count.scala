package typings.vegaTypings.anon

import typings.vegaTypings.encodeMod._ColorValueRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Count extends _ColorValueRef {
  
  var count: js.UndefOr[Double] = js.native
  
  var gradient: typings.vegaTypings.encodeMod.Field = js.native
  
  var start: js.UndefOr[js.Array[Double]] = js.native
  
  var stop: js.UndefOr[js.Array[Double]] = js.native
}
object Count {
  
  @scala.inline
  def apply(gradient: typings.vegaTypings.encodeMod.Field): Count = {
    val __obj = js.Dynamic.literal(gradient = gradient.asInstanceOf[js.Any])
    __obj.asInstanceOf[Count]
  }
  
  @scala.inline
  implicit class CountMutableBuilder[Self <: Count] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    @scala.inline
    def setGradient(value: typings.vegaTypings.encodeMod.Field): Self = StObject.set(x, "gradient", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: js.Array[Double]): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    @scala.inline
    def setStartVarargs(value: Double*): Self = StObject.set(x, "start", js.Array(value :_*))
    
    @scala.inline
    def setStop(value: js.Array[Double]): Self = StObject.set(x, "stop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopUndefined: Self = StObject.set(x, "stop", js.undefined)
    
    @scala.inline
    def setStopVarargs(value: Double*): Self = StObject.set(x, "stop", js.Array(value :_*))
  }
}
