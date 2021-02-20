package typings.vegaTypings.markMod

import typings.vegaTypings.encodeMod.Encodable
import typings.vegaTypings.encodeMod.TrailEncodeEntry
import typings.vegaTypings.vegaTypingsStrings.trail
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TrailMark
  extends BaseMark
     with Encodable[TrailEncodeEntry]
     with Mark {
  
  var `type`: trail = js.native
}
object TrailMark {
  
  @scala.inline
  def apply(`type`: trail): TrailMark = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrailMark]
  }
  
  @scala.inline
  implicit class TrailMarkMutableBuilder[Self <: TrailMark] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: trail): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
