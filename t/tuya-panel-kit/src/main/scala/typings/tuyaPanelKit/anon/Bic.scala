package typings.tuyaPanelKit.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bic extends StObject {
  
  var bic: js.Array[Code]
  
  var fun: js.UndefOr[Record[String, js.Any]] = js.undefined
}
object Bic {
  
  inline def apply(bic: js.Array[Code]): Bic = {
    val __obj = js.Dynamic.literal(bic = bic.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bic]
  }
  
  extension [Self <: Bic](x: Self) {
    
    inline def setBic(value: js.Array[Code]): Self = StObject.set(x, "bic", value.asInstanceOf[js.Any])
    
    inline def setBicVarargs(value: Code*): Self = StObject.set(x, "bic", js.Array(value :_*))
    
    inline def setFun(value: Record[String, js.Any]): Self = StObject.set(x, "fun", value.asInstanceOf[js.Any])
    
    inline def setFunUndefined: Self = StObject.set(x, "fun", js.undefined)
  }
}
