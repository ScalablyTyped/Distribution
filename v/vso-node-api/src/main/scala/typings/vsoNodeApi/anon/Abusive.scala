package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Abusive extends StObject {
  
  var abusive: scala.Double
  
  var general: scala.Double
  
  var spam: scala.Double
}
object Abusive {
  
  inline def apply(abusive: scala.Double, general: scala.Double, spam: scala.Double): Abusive = {
    val __obj = js.Dynamic.literal(abusive = abusive.asInstanceOf[js.Any], general = general.asInstanceOf[js.Any], spam = spam.asInstanceOf[js.Any])
    __obj.asInstanceOf[Abusive]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Abusive] (val x: Self) extends AnyVal {
    
    inline def setAbusive(value: scala.Double): Self = StObject.set(x, "abusive", value.asInstanceOf[js.Any])
    
    inline def setGeneral(value: scala.Double): Self = StObject.set(x, "general", value.asInstanceOf[js.Any])
    
    inline def setSpam(value: scala.Double): Self = StObject.set(x, "spam", value.asInstanceOf[js.Any])
  }
}
