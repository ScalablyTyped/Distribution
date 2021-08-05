package typings.themeUi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SxProps extends StObject {
  
  /**
    * The sx prop lets you style elements inline, using values from your
    * theme. To use the sx prop, add the custom pragma as a comment to the
    * top of your module and import the jsx function.
    *
    * ```ts
    * // @jsx jsx
    *
    * import { jsx } from 'theme-ui'
    * ```
    */
  var sx: js.UndefOr[SxStyleProp] = js.undefined
}
object SxProps {
  
  inline def apply(): SxProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SxProps]
  }
  
  extension [Self <: SxProps](x: Self) {
    
    inline def setSx(value: SxStyleProp): Self = StObject.set(x, "sx", value.asInstanceOf[js.Any])
    
    inline def setSxNull: Self = StObject.set(x, "sx", null)
    
    inline def setSxUndefined: Self = StObject.set(x, "sx", js.undefined)
  }
}
