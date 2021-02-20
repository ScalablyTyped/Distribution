package typings.xrm.XrmEnum

import typings.xrm.xrmStrings.date
import typings.xrm.xrmStrings.datetime
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Constant Enum: Date attribute formats for Attributes.Attribute.getFormat(), used by {@link Attributes.DateAttribute DateAttribute}.
  * @see {@link Xrm.Attributes.DateAttributeFormat}
  */
/* Rewritten from type alias, can be one of: 
  - typings.xrm.xrmStrings.date
  - typings.xrm.xrmStrings.datetime
*/
trait DateAttributeFormat extends StObject
object DateAttributeFormat {
  
  @scala.inline
  def Date: date = "date".asInstanceOf[date]
  
  @scala.inline
  def DateTime: datetime = "datetime".asInstanceOf[datetime]
}
