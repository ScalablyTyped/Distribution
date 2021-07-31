package typings.tslint.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{  exclude :std.Array<string>,   format :string}> */
trait PartialexcludeArraystring extends StObject {
  
  var exclude: js.UndefOr[js.Array[String]] = js.undefined
  
  var format: js.UndefOr[String] = js.undefined
}
object PartialexcludeArraystring {
  
  @scala.inline
  def apply(): PartialexcludeArraystring = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialexcludeArraystring]
  }
  
  @scala.inline
  implicit class PartialexcludeArraystringMutableBuilder[Self <: PartialexcludeArraystring] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExclude(value: js.Array[String]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    @scala.inline
    def setExcludeVarargs(value: String*): Self = StObject.set(x, "exclude", js.Array(value :_*))
    
    @scala.inline
    def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
  }
}
