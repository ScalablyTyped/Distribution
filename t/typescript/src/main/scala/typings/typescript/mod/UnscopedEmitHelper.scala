package typings.typescript.mod

import typings.typescript.typescriptBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UnscopedEmitHelper extends EmitHelper {
  
  @JSName("scoped")
  val scoped_UnscopedEmitHelper: `false` = js.native
  
  @JSName("text")
  val text_UnscopedEmitHelper: java.lang.String = js.native
}
object UnscopedEmitHelper {
  
  @scala.inline
  def apply(name: java.lang.String, scoped: `false`, text: java.lang.String): UnscopedEmitHelper = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], scoped = scoped.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnscopedEmitHelper]
  }
  
  @scala.inline
  implicit class UnscopedEmitHelperMutableBuilder[Self <: UnscopedEmitHelper] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScoped(value: `false`): Self = StObject.set(x, "scoped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: java.lang.String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
