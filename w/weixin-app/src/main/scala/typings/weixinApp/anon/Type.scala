package typings.weixinApp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Type extends StObject {
  
  def `type`(args: js.Any*): /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any
  
  var value: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any
  ] = js.undefined
}
object Type {
  
  inline def apply(
    `type`: /* repeated */ js.Any => /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any
  ): Type = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(js.Any.fromFunction1(`type`))
    __obj.asInstanceOf[Type]
  }
  
  extension [Self <: Type](x: Self) {
    
    inline def setType(
      value: /* repeated */ js.Any => /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any
    ): Self = StObject.set(x, "type", js.Any.fromFunction1(value))
    
    inline def setValue(value: /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
