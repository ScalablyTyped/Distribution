package typings.twitterCldr.anon

import typings.twitterCldr.mod.PluralRule
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait All extends StObject {
  
  def all(): js.Array[PluralRule]
  
  def rule_for(num: Double): PluralRule
}
object All {
  
  inline def apply(all: () => js.Array[PluralRule], rule_for: Double => PluralRule): All = {
    val __obj = js.Dynamic.literal(all = js.Any.fromFunction0(all), rule_for = js.Any.fromFunction1(rule_for))
    __obj.asInstanceOf[All]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: All] (val x: Self) extends AnyVal {
    
    inline def setAll(value: () => js.Array[PluralRule]): Self = StObject.set(x, "all", js.Any.fromFunction0(value))
    
    inline def setRule_for(value: Double => PluralRule): Self = StObject.set(x, "rule_for", js.Any.fromFunction1(value))
  }
}
