package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A list of Word conversion settings. */
trait WordSettings extends StObject {
  
  var heading: js.UndefOr[WordHeadingDetection] = js.undefined
}
object WordSettings {
  
  @scala.inline
  def apply(): WordSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WordSettings]
  }
  
  @scala.inline
  implicit class WordSettingsMutableBuilder[Self <: WordSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeading(value: WordHeadingDetection): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadingUndefined: Self = StObject.set(x, "heading", js.undefined)
  }
}
