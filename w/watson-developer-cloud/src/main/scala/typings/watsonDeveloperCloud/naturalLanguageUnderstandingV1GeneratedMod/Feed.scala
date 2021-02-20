package typings.watsonDeveloperCloud.naturalLanguageUnderstandingV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** RSS or ATOM feed found on the webpage. */
@js.native
trait Feed extends StObject {
  
  /** URL of the RSS or ATOM feed. */
  var link: js.UndefOr[String] = js.native
}
object Feed {
  
  @scala.inline
  def apply(): Feed = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Feed]
  }
  
  @scala.inline
  implicit class FeedMutableBuilder[Self <: Feed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLink(value: String): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLinkUndefined: Self = StObject.set(x, "link", js.undefined)
  }
}
