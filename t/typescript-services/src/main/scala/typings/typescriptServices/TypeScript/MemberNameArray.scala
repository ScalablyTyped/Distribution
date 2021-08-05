package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemberNameArray
  extends StObject
     with MemberName {
  
  def add(entry: MemberName): Unit
  
  def addAll(entries: js.Array[MemberName]): Unit
  
  var delim: String
  
  var entries: js.Array[MemberName]
}
object MemberNameArray {
  
  inline def apply(
    add: MemberName => Unit,
    addAll: js.Array[MemberName] => Unit,
    delim: String,
    entries: js.Array[MemberName],
    isArray: () => Boolean,
    isMarker: () => Boolean,
    isString: () => Boolean,
    prefix: String,
    suffix: String
  ): MemberNameArray = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), addAll = js.Any.fromFunction1(addAll), delim = delim.asInstanceOf[js.Any], entries = entries.asInstanceOf[js.Any], isArray = js.Any.fromFunction0(isArray), isMarker = js.Any.fromFunction0(isMarker), isString = js.Any.fromFunction0(isString), prefix = prefix.asInstanceOf[js.Any], suffix = suffix.asInstanceOf[js.Any])
    __obj.asInstanceOf[MemberNameArray]
  }
  
  extension [Self <: MemberNameArray](x: Self) {
    
    inline def setAdd(value: MemberName => Unit): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    inline def setAddAll(value: js.Array[MemberName] => Unit): Self = StObject.set(x, "addAll", js.Any.fromFunction1(value))
    
    inline def setDelim(value: String): Self = StObject.set(x, "delim", value.asInstanceOf[js.Any])
    
    inline def setEntries(value: js.Array[MemberName]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    inline def setEntriesVarargs(value: MemberName*): Self = StObject.set(x, "entries", js.Array(value :_*))
  }
}
