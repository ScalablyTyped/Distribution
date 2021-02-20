package typings.xstate.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Meta extends StObject {
  
  var meta: /* import warning: importer.ImportType#apply Failed type conversion: infer D */ js.Any = js.native
}
object Meta {
  
  @scala.inline
  def apply(meta: /* import warning: importer.ImportType#apply Failed type conversion: infer D */ js.Any): Meta = {
    val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[Meta]
  }
  
  @scala.inline
  implicit class MetaMutableBuilder[Self <: Meta] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMeta(value: /* import warning: importer.ImportType#apply Failed type conversion: infer D */ js.Any): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
  }
}
