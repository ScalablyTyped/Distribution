package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Allvoices extends StObject {
  
  var all_voices: js.UndefOr[Boolean] = js.undefined
}
object Allvoices {
  
  inline def apply(): Allvoices = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Allvoices]
  }
  
  extension [Self <: Allvoices](x: Self) {
    
    inline def setAll_voices(value: Boolean): Self = StObject.set(x, "all_voices", value.asInstanceOf[js.Any])
    
    inline def setAll_voicesUndefined: Self = StObject.set(x, "all_voices", js.undefined)
  }
}
