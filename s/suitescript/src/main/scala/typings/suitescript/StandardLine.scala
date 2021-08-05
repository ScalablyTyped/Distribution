package typings.suitescript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StandardLine extends StObject {
  
  def getEntityId(): Double
  
  def getId(): Double
  
  def getSubsidiaryId(): Double
  
  def getTaxAmount(): String
  
  def getTaxItemId(): Double
  
  def getTaxType(): String
  
  def getTaxableAmount(): String
  
  def isPosting(): Boolean
  
  def isTaxable(): Boolean
}
object StandardLine {
  
  inline def apply(
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
  
  extension [Self <: StandardLine](x: Self) {
    
    inline def setGetEntityId(value: () => Double): Self = StObject.set(x, "getEntityId", js.Any.fromFunction0(value))
    
    inline def setGetId(value: () => Double): Self = StObject.set(x, "getId", js.Any.fromFunction0(value))
    
    inline def setGetSubsidiaryId(value: () => Double): Self = StObject.set(x, "getSubsidiaryId", js.Any.fromFunction0(value))
    
    inline def setGetTaxAmount(value: () => String): Self = StObject.set(x, "getTaxAmount", js.Any.fromFunction0(value))
    
    inline def setGetTaxItemId(value: () => Double): Self = StObject.set(x, "getTaxItemId", js.Any.fromFunction0(value))
    
    inline def setGetTaxType(value: () => String): Self = StObject.set(x, "getTaxType", js.Any.fromFunction0(value))
    
    inline def setGetTaxableAmount(value: () => String): Self = StObject.set(x, "getTaxableAmount", js.Any.fromFunction0(value))
    
    inline def setIsPosting(value: () => Boolean): Self = StObject.set(x, "isPosting", js.Any.fromFunction0(value))
    
    inline def setIsTaxable(value: () => Boolean): Self = StObject.set(x, "isTaxable", js.Any.fromFunction0(value))
  }
}
