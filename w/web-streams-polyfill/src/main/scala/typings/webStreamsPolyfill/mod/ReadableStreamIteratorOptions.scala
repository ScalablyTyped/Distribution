package typings.webStreamsPolyfill.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadableStreamIteratorOptions extends StObject {
  
  var preventCancel: js.UndefOr[Boolean] = js.undefined
}
object ReadableStreamIteratorOptions {
  
  inline def apply(): ReadableStreamIteratorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReadableStreamIteratorOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadableStreamIteratorOptions] (val x: Self) extends AnyVal {
    
    inline def setPreventCancel(value: Boolean): Self = StObject.set(x, "preventCancel", value.asInstanceOf[js.Any])
    
    inline def setPreventCancelUndefined: Self = StObject.set(x, "preventCancel", js.undefined)
  }
}
