package typings.tensorflowTfjsConverter.compiledApiMod

import typings.tensorflowTfjsConverter.compiledApiMod.TensorShape.IDim
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITensorShape extends StObject {
  
  /** TensorShape dim */
  var dim: js.UndefOr[js.Array[IDim] | Null] = js.undefined
  
  /** TensorShape unknownRank */
  var unknownRank: js.UndefOr[Boolean | Null] = js.undefined
}
object ITensorShape {
  
  @scala.inline
  def apply(): ITensorShape = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITensorShape]
  }
  
  @scala.inline
  implicit class ITensorShapeMutableBuilder[Self <: ITensorShape] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDim(value: js.Array[IDim]): Self = StObject.set(x, "dim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDimNull: Self = StObject.set(x, "dim", null)
    
    @scala.inline
    def setDimUndefined: Self = StObject.set(x, "dim", js.undefined)
    
    @scala.inline
    def setDimVarargs(value: IDim*): Self = StObject.set(x, "dim", js.Array(value :_*))
    
    @scala.inline
    def setUnknownRank(value: Boolean): Self = StObject.set(x, "unknownRank", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnknownRankNull: Self = StObject.set(x, "unknownRank", null)
    
    @scala.inline
    def setUnknownRankUndefined: Self = StObject.set(x, "unknownRank", js.undefined)
  }
}
