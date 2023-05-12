package typings.twitterCldr.anon

import typings.twitterCldr.mod.RbnfGroupName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Groupnames extends StObject {
  
  def format(num: Double, group: RbnfGroupName, ruleset: String): String
  
  def group_names(): js.Array[RbnfGroupName]
  
  def rule_set_names_for_group(group: RbnfGroupName): js.Array[String]
}
object Groupnames {
  
  inline def apply(
    format: (Double, RbnfGroupName, String) => String,
    group_names: () => js.Array[RbnfGroupName],
    rule_set_names_for_group: RbnfGroupName => js.Array[String]
  ): Groupnames = {
    val __obj = js.Dynamic.literal(format = js.Any.fromFunction3(format), group_names = js.Any.fromFunction0(group_names), rule_set_names_for_group = js.Any.fromFunction1(rule_set_names_for_group))
    __obj.asInstanceOf[Groupnames]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Groupnames] (val x: Self) extends AnyVal {
    
    inline def setFormat(value: (Double, RbnfGroupName, String) => String): Self = StObject.set(x, "format", js.Any.fromFunction3(value))
    
    inline def setGroup_names(value: () => js.Array[RbnfGroupName]): Self = StObject.set(x, "group_names", js.Any.fromFunction0(value))
    
    inline def setRule_set_names_for_group(value: RbnfGroupName => js.Array[String]): Self = StObject.set(x, "rule_set_names_for_group", js.Any.fromFunction1(value))
  }
}
