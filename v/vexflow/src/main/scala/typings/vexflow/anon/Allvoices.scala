package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Allvoices extends StObject {
  
  var all_voices: js.UndefOr[Boolean] = js.native
}
object Allvoices {
  
  @scala.inline
  def apply(): Allvoices = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Allvoices]
  }
  
  @scala.inline
  implicit class AllvoicesMutableBuilder[Self <: Allvoices] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAll_voices(value: Boolean): Self = StObject.set(x, "all_voices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAll_voicesUndefined: Self = StObject.set(x, "all_voices", js.undefined)
  }
}
