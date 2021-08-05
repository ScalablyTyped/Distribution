package typings.styledComponents.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DefaultProps extends StObject {
  
  var defaultProps: /* import warning: importer.ImportType#apply Failed type conversion: infer D */ js.Any
}
object DefaultProps {
  
  inline def apply(
    defaultProps: /* import warning: importer.ImportType#apply Failed type conversion: infer D */ js.Any
  ): DefaultProps = {
    val __obj = js.Dynamic.literal(defaultProps = defaultProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultProps]
  }
  
  extension [Self <: DefaultProps](x: Self) {
    
    inline def setDefaultProps(value: /* import warning: importer.ImportType#apply Failed type conversion: infer D */ js.Any): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
  }
}
