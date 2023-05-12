package typings.twitterCldr.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Eachsentence extends StObject {
  
  def each_sentence(str: String): js.Array[String]
}
object Eachsentence {
  
  inline def apply(each_sentence: String => js.Array[String]): Eachsentence = {
    val __obj = js.Dynamic.literal(each_sentence = js.Any.fromFunction1(each_sentence))
    __obj.asInstanceOf[Eachsentence]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Eachsentence] (val x: Self) extends AnyVal {
    
    inline def setEach_sentence(value: String => js.Array[String]): Self = StObject.set(x, "each_sentence", js.Any.fromFunction1(value))
  }
}
