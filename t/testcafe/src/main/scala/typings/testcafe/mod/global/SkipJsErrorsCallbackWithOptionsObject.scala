package typings.testcafe.mod.global

import org.scalablytyped.runtime.StringDictionary
import typings.testcafe.anon.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SkipJsErrorsCallbackWithOptionsObject extends StObject {
  
  var dependencies: js.UndefOr[StringDictionary[Any]] = js.undefined
  
  def fn(): Boolean
  def fn(opts: Message): Boolean
  @JSName("fn")
  var fn_Original: SkipJsErrorsCallback
}
object SkipJsErrorsCallbackWithOptionsObject {
  
  inline def apply(fn: /* opts */ js.UndefOr[Message] => Boolean): SkipJsErrorsCallbackWithOptionsObject = {
    val __obj = js.Dynamic.literal(fn = js.Any.fromFunction1(fn))
    __obj.asInstanceOf[SkipJsErrorsCallbackWithOptionsObject]
  }
  
  extension [Self <: SkipJsErrorsCallbackWithOptionsObject](x: Self) {
    
    inline def setDependencies(value: StringDictionary[Any]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
    
    inline def setFn(value: /* opts */ js.UndefOr[Message] => Boolean): Self = StObject.set(x, "fn", js.Any.fromFunction1(value))
  }
}
