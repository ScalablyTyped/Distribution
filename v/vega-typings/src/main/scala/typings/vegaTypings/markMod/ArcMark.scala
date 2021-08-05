package typings.vegaTypings.markMod

import typings.vegaTypings.encodeMod.ArcEncodeEntry
import typings.vegaTypings.encodeMod.Encodable
import typings.vegaTypings.vegaTypingsStrings.arc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArcMark
  extends StObject
     with BaseMark
     with Encodable[ArcEncodeEntry]
     with Mark {
  
  var `type`: arc
}
object ArcMark {
  
  inline def apply(): ArcMark = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("arc")
    __obj.asInstanceOf[ArcMark]
  }
  
  extension [Self <: ArcMark](x: Self) {
    
    inline def setType(value: arc): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
