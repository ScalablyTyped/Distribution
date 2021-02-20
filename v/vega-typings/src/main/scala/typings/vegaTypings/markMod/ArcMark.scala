package typings.vegaTypings.markMod

import typings.vegaTypings.encodeMod.ArcEncodeEntry
import typings.vegaTypings.encodeMod.Encodable
import typings.vegaTypings.vegaTypingsStrings.arc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArcMark
  extends BaseMark
     with Encodable[ArcEncodeEntry]
     with Mark {
  
  var `type`: arc = js.native
}
object ArcMark {
  
  @scala.inline
  def apply(`type`: arc): ArcMark = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArcMark]
  }
  
  @scala.inline
  implicit class ArcMarkMutableBuilder[Self <: ArcMark] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: arc): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
