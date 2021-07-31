package typings.vegaTypings.markMod

import typings.vegaTypings.encodeMod.AreaEncodeEntry
import typings.vegaTypings.encodeMod.Encodable
import typings.vegaTypings.vegaTypingsStrings.area
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AreaMark
  extends StObject
     with BaseMark
     with Encodable[AreaEncodeEntry]
     with Mark {
  
  var `type`: area
}
object AreaMark {
  
  @scala.inline
  def apply(): AreaMark = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("area")
    __obj.asInstanceOf[AreaMark]
  }
  
  @scala.inline
  implicit class AreaMarkMutableBuilder[Self <: AreaMark] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: area): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
