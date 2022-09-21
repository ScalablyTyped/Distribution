package typings.surveyKnockout.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("survey-knockout", "RenderedRatingItem")
@js.native
open class RenderedRatingItem protected () extends Base {
  def this(itemValue: ItemValue) = this()
  def this(itemValue: ItemValue, locString: LocalizableString) = this()
  
  var itemValue: ItemValue = js.native
  
  def locText: LocalizableString = js.native
  
  def value: Double = js.native
}
