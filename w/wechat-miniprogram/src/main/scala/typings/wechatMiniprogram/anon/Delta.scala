package typings.wechatMiniprogram.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Delta extends StObject {
  
  // eslint-disable-next-line @typescript-eslint/no-explicit-any
  var delta: js.Array[_] = js.native
  
  var html: String = js.native
  
  var text: String = js.native
}
object Delta {
  
  @scala.inline
  def apply(delta: js.Array[_], html: String, text: String): Delta = {
    val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delta]
  }
  
  @scala.inline
  implicit class DeltaMutableBuilder[Self <: Delta] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelta(value: js.Array[_]): Self = StObject.set(x, "delta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeltaVarargs(value: js.Any*): Self = StObject.set(x, "delta", js.Array(value :_*))
    
    @scala.inline
    def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
