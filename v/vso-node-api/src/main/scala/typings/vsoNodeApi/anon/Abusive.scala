package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Abusive extends StObject {
  
  var abusive: scala.Double = js.native
  
  var general: scala.Double = js.native
  
  var spam: scala.Double = js.native
}
object Abusive {
  
  @scala.inline
  def apply(abusive: scala.Double, general: scala.Double, spam: scala.Double): Abusive = {
    val __obj = js.Dynamic.literal(abusive = abusive.asInstanceOf[js.Any], general = general.asInstanceOf[js.Any], spam = spam.asInstanceOf[js.Any])
    __obj.asInstanceOf[Abusive]
  }
  
  @scala.inline
  implicit class AbusiveMutableBuilder[Self <: Abusive] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAbusive(value: scala.Double): Self = StObject.set(x, "abusive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeneral(value: scala.Double): Self = StObject.set(x, "general", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpam(value: scala.Double): Self = StObject.set(x, "spam", value.asInstanceOf[js.Any])
  }
}
