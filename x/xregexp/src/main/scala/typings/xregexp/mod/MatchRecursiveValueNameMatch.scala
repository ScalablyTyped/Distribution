package typings.xregexp.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A match to a defined value name during a recursive match.
  */
@js.native
trait MatchRecursiveValueNameMatch extends StObject {
  
  /**
    * The end index of the string portion.
    */
  var end: Double = js.native
  
  /**
    * The value name as specified in the `XRegExp.MatchRecursiveOptions`
    */
  var name: String = js.native
  
  /**
    * The start index of the string portion.
    */
  var start: Double = js.native
  
  /**
    * The portion of the string that corresponds to the value name,
    */
  var value: String = js.native
}
object MatchRecursiveValueNameMatch {
  
  @scala.inline
  def apply(end: Double, name: String, start: Double, value: String): MatchRecursiveValueNameMatch = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchRecursiveValueNameMatch]
  }
  
  @scala.inline
  implicit class MatchRecursiveValueNameMatchMutableBuilder[Self <: MatchRecursiveValueNameMatch] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
