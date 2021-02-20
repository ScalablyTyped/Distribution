package typings.tuyaPanelKit.anon

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bic extends StObject {
  
  var bic: js.Array[Code] = js.native
  
  var fun: js.UndefOr[Record[String, _]] = js.native
}
object Bic {
  
  @scala.inline
  def apply(bic: js.Array[Code]): Bic = {
    val __obj = js.Dynamic.literal(bic = bic.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bic]
  }
  
  @scala.inline
  implicit class BicMutableBuilder[Self <: Bic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBic(value: js.Array[Code]): Self = StObject.set(x, "bic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBicVarargs(value: Code*): Self = StObject.set(x, "bic", js.Array(value :_*))
    
    @scala.inline
    def setFun(value: Record[String, _]): Self = StObject.set(x, "fun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFunUndefined: Self = StObject.set(x, "fun", js.undefined)
  }
}
