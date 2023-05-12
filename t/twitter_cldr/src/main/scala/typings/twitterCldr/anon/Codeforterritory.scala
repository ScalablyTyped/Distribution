package typings.twitterCldr.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Codeforterritory extends StObject {
  
  def code_for_territory(territory: String): String
  
  def territories(): js.Array[String]
}
object Codeforterritory {
  
  inline def apply(code_for_territory: String => String, territories: () => js.Array[String]): Codeforterritory = {
    val __obj = js.Dynamic.literal(code_for_territory = js.Any.fromFunction1(code_for_territory), territories = js.Any.fromFunction0(territories))
    __obj.asInstanceOf[Codeforterritory]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Codeforterritory] (val x: Self) extends AnyVal {
    
    inline def setCode_for_territory(value: String => String): Self = StObject.set(x, "code_for_territory", js.Any.fromFunction1(value))
    
    inline def setTerritories(value: () => js.Array[String]): Self = StObject.set(x, "territories", js.Any.fromFunction0(value))
  }
}
