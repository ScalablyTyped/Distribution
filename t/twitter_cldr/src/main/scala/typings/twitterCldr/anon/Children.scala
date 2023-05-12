package typings.twitterCldr.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Children extends StObject {
  
  def children(territory: String): js.Array[String]
  
  def contains(parentTerritory: String, childTerritory: String): Boolean
  
  def parents(territory: String): js.Array[String]
}
object Children {
  
  inline def apply(
    children: String => js.Array[String],
    contains: (String, String) => Boolean,
    parents: String => js.Array[String]
  ): Children = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), contains = js.Any.fromFunction2(contains), parents = js.Any.fromFunction1(parents))
    __obj.asInstanceOf[Children]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Children] (val x: Self) extends AnyVal {
    
    inline def setChildren(value: String => js.Array[String]): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
    
    inline def setContains(value: (String, String) => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction2(value))
    
    inline def setParents(value: String => js.Array[String]): Self = StObject.set(x, "parents", js.Any.fromFunction1(value))
  }
}
