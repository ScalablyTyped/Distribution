package typings.threeTdsLoader.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofDataUtils extends StObject {
  
  def fromHalfFloat(`val`: Double): Double
  
  def toHalfFloat(`val`: Double): Double
}
object TypeofDataUtils {
  
  inline def apply(fromHalfFloat: Double => Double, toHalfFloat: Double => Double): TypeofDataUtils = {
    val __obj = js.Dynamic.literal(fromHalfFloat = js.Any.fromFunction1(fromHalfFloat), toHalfFloat = js.Any.fromFunction1(toHalfFloat))
    __obj.asInstanceOf[TypeofDataUtils]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TypeofDataUtils] (val x: Self) extends AnyVal {
    
    inline def setFromHalfFloat(value: Double => Double): Self = StObject.set(x, "fromHalfFloat", js.Any.fromFunction1(value))
    
    inline def setToHalfFloat(value: Double => Double): Self = StObject.set(x, "toHalfFloat", js.Any.fromFunction1(value))
  }
}
