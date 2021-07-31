package typings.vueNiceDates.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MergedModifiers extends StObject {
  
  var mergedModifiers: StringDictionary[js.Function2[/* date */ typings.std.Date, /* type */ String, Boolean]]
}
object MergedModifiers {
  
  @scala.inline
  def apply(
    mergedModifiers: StringDictionary[js.Function2[/* date */ typings.std.Date, /* type */ String, Boolean]]
  ): MergedModifiers = {
    val __obj = js.Dynamic.literal(mergedModifiers = mergedModifiers.asInstanceOf[js.Any])
    __obj.asInstanceOf[MergedModifiers]
  }
  
  @scala.inline
  implicit class MergedModifiersMutableBuilder[Self <: MergedModifiers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMergedModifiers(value: StringDictionary[js.Function2[/* date */ typings.std.Date, /* type */ String, Boolean]]): Self = StObject.set(x, "mergedModifiers", value.asInstanceOf[js.Any])
  }
}
