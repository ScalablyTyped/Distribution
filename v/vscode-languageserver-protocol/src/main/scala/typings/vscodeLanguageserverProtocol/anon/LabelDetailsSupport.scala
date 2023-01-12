package typings.vscodeLanguageserverProtocol.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelDetailsSupport extends StObject {
  
  /**
    * The server has support for completion item label
    * details (see also `CompletionItemLabelDetails`) when
    * receiving a completion item in a resolve call.
    *
    * @since 3.17.0
    */
  var labelDetailsSupport: js.UndefOr[Boolean] = js.undefined
}
object LabelDetailsSupport {
  
  inline def apply(): LabelDetailsSupport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelDetailsSupport]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LabelDetailsSupport] (val x: Self) extends AnyVal {
    
    inline def setLabelDetailsSupport(value: Boolean): Self = StObject.set(x, "labelDetailsSupport", value.asInstanceOf[js.Any])
    
    inline def setLabelDetailsSupportUndefined: Self = StObject.set(x, "labelDetailsSupport", js.undefined)
  }
}
