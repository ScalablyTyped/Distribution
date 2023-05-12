package typings.twitterCldr.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Isvalid extends StObject {
  
  def is_valid(territory: String, postalCode: String): Boolean
  
  def regex_for_territory(territory: String): js.RegExp
  
  def territories(): js.Array[String]
}
object Isvalid {
  
  inline def apply(
    is_valid: (String, String) => Boolean,
    regex_for_territory: String => js.RegExp,
    territories: () => js.Array[String]
  ): Isvalid = {
    val __obj = js.Dynamic.literal(is_valid = js.Any.fromFunction2(is_valid), regex_for_territory = js.Any.fromFunction1(regex_for_territory), territories = js.Any.fromFunction0(territories))
    __obj.asInstanceOf[Isvalid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Isvalid] (val x: Self) extends AnyVal {
    
    inline def setIs_valid(value: (String, String) => Boolean): Self = StObject.set(x, "is_valid", js.Any.fromFunction2(value))
    
    inline def setRegex_for_territory(value: String => js.RegExp): Self = StObject.set(x, "regex_for_territory", js.Any.fromFunction1(value))
    
    inline def setTerritories(value: () => js.Array[String]): Self = StObject.set(x, "territories", js.Any.fromFunction0(value))
  }
}
