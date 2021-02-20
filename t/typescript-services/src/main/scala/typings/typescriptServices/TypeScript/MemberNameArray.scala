package typings.typescriptServices.TypeScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MemberNameArray extends MemberName {
  
  def add(entry: MemberName): Unit = js.native
  
  def addAll(entries: js.Array[MemberName]): Unit = js.native
  
  var delim: String = js.native
  
  var entries: js.Array[MemberName] = js.native
}
object MemberNameArray {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class MemberNameArrayMutableBuilder[Self <: MemberNameArray] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdd(value: MemberName => Unit): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddAll(value: js.Array[MemberName] => Unit): Self = StObject.set(x, "addAll", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDelim(value: String): Self = StObject.set(x, "delim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntries(value: js.Array[MemberName]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntriesVarargs(value: MemberName*): Self = StObject.set(x, "entries", js.Array(value :_*))
  }
}
