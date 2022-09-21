package typings.vueNiceDates.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MergedModifiers extends StObject {
  
  var mergedModifiers: StringDictionary[js.Function2[/* date */ js.Date, /* type */ String, Boolean]]
}
object MergedModifiers {
  
  inline def apply(mergedModifiers: StringDictionary[js.Function2[/* date */ js.Date, /* type */ String, Boolean]]): MergedModifiers = {
    val __obj = js.Dynamic.literal(mergedModifiers = mergedModifiers.asInstanceOf[js.Any])
    __obj.asInstanceOf[MergedModifiers]
  }
  
  extension [Self <: MergedModifiers](x: Self) {
    
    inline def setMergedModifiers(value: StringDictionary[js.Function2[/* date */ js.Date, /* type */ String, Boolean]]): Self = StObject.set(x, "mergedModifiers", value.asInstanceOf[js.Any])
  }
}
