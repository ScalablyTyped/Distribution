package typings.watsonDeveloperCloud.v2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*************************
  * model interfaces
  ************************/
/** CaptureGroup. */
@js.native
trait CaptureGroup extends StObject {
  
  /** A recognized capture group for the entity. */
  var group: String = js.native
  
  /** Zero-based character offsets that indicate where the entity value begins and ends in the input text. */
  var location: js.UndefOr[js.Array[Double]] = js.native
}
object CaptureGroup {
  
  @scala.inline
  def apply(group: String): CaptureGroup = {
    val __obj = js.Dynamic.literal(group = group.asInstanceOf[js.Any])
    __obj.asInstanceOf[CaptureGroup]
  }
  
  @scala.inline
  implicit class CaptureGroupMutableBuilder[Self <: CaptureGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroup(value: String): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocation(value: js.Array[Double]): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setLocationVarargs(value: Double*): Self = StObject.set(x, "location", js.Array(value :_*))
  }
}
