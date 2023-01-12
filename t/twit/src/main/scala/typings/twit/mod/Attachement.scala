package typings.twit.mod

import typings.twit.anon.IdString
import typings.twit.anon.Sharedcoordinate
import typings.twit.twitStrings.location
import typings.twit.twitStrings.media
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attachement extends StObject {
  
  var location: js.UndefOr[Sharedcoordinate] = js.undefined
  
  var media: js.UndefOr[IdString] = js.undefined
  
  var `type`: location | media
}
object Attachement {
  
  inline def apply(`type`: location | media): Attachement = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attachement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Attachement] (val x: Self) extends AnyVal {
    
    inline def setLocation(value: Sharedcoordinate): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setMedia(value: IdString): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
    
    inline def setType(value: location | media): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
