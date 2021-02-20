package typings.suitescript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StandardLine extends StObject {
  
  def getEntityId(): Double = js.native
  
  def getId(): Double = js.native
  
  def getSubsidiaryId(): Double = js.native
  
  def getTaxAmount(): String = js.native
  
  def getTaxItemId(): Double = js.native
  
  def getTaxType(): String = js.native
  
  def getTaxableAmount(): String = js.native
  
  def isPosting(): Boolean = js.native
  
  def isTaxable(): Boolean = js.native
}
object StandardLine {
  
  @scala.inline
  def apply(
    getEntityId: () => Double,
    getId: () => Double,
    getSubsidiaryId: () => Double,
    getTaxAmount: () => String,
    getTaxItemId: () => Double,
    getTaxType: () => String,
    getTaxableAmount: () => String,
    isPosting: () => Boolean,
    isTaxable: () => Boolean
  ): StandardLine = {
    val __obj = js.Dynamic.literal(getEntityId = js.Any.fromFunction0(getEntityId), getId = js.Any.fromFunction0(getId), getSubsidiaryId = js.Any.fromFunction0(getSubsidiaryId), getTaxAmount = js.Any.fromFunction0(getTaxAmount), getTaxItemId = js.Any.fromFunction0(getTaxItemId), getTaxType = js.Any.fromFunction0(getTaxType), getTaxableAmount = js.Any.fromFunction0(getTaxableAmount), isPosting = js.Any.fromFunction0(isPosting), isTaxable = js.Any.fromFunction0(isTaxable))
    __obj.asInstanceOf[StandardLine]
  }
  
  @scala.inline
  implicit class StandardLineMutableBuilder[Self <: StandardLine] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetEntityId(value: () => Double): Self = StObject.set(x, "getEntityId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetId(value: () => Double): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetSubsidiaryId(value: () => Double): Self = StObject.set(x, "getSubsidiaryId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTaxAmount(value: () => String): Self = StObject.set(x, "getTaxAmount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTaxItemId(value: () => Double): Self = StObject.set(x, "getTaxItemId", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTaxType(value: () => String): Self = StObject.set(x, "getTaxType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTaxableAmount(value: () => String): Self = StObject.set(x, "getTaxableAmount", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsPosting(value: () => Boolean): Self = StObject.set(x, "isPosting", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsTaxable(value: () => Boolean): Self = StObject.set(x, "isTaxable", js.Any.fromFunction0(value))
  }
}
