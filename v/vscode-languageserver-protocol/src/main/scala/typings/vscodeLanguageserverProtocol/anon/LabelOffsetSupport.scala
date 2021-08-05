package typings.vscodeLanguageserverProtocol.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelOffsetSupport extends StObject {
  
  /**
    * The client supports processing label offsets instead of a
    * simple label string.
    *
    * @since 3.14.0
    */
  var labelOffsetSupport: js.UndefOr[Boolean] = js.undefined
}
object LabelOffsetSupport {
  
  inline def apply(): LabelOffsetSupport = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelOffsetSupport]
  }
  
  extension [Self <: LabelOffsetSupport](x: Self) {
    
    inline def setLabelOffsetSupport(value: Boolean): Self = StObject.set(x, "labelOffsetSupport", value.asInstanceOf[js.Any])
    
    inline def setLabelOffsetSupportUndefined: Self = StObject.set(x, "labelOffsetSupport", js.undefined)
  }
}
