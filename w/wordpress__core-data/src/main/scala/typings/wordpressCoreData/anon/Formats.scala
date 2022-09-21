package typings.wordpressCoreData.anon

import typings.wordpressCoreData.schemaMod.Schema.PostFormat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Formats extends StObject {
  
  var formats: js.Array[PostFormat]
  
  var `post-thumbnails`: Boolean
  
  var `responsive-embeds`: Boolean
}
object Formats {
  
  inline def apply(formats: js.Array[PostFormat], `post-thumbnails`: Boolean, `responsive-embeds`: Boolean): Formats = {
    val __obj = js.Dynamic.literal(formats = formats.asInstanceOf[js.Any])
    __obj.updateDynamic("post-thumbnails")(`post-thumbnails`.asInstanceOf[js.Any])
    __obj.updateDynamic("responsive-embeds")(`responsive-embeds`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Formats]
  }
  
  extension [Self <: Formats](x: Self) {
    
    inline def setFormats(value: js.Array[PostFormat]): Self = StObject.set(x, "formats", value.asInstanceOf[js.Any])
    
    inline def setFormatsVarargs(value: PostFormat*): Self = StObject.set(x, "formats", js.Array(value*))
    
    inline def `setPost-thumbnails`(value: Boolean): Self = StObject.set(x, "post-thumbnails", value.asInstanceOf[js.Any])
    
    inline def `setResponsive-embeds`(value: Boolean): Self = StObject.set(x, "responsive-embeds", value.asInstanceOf[js.Any])
  }
}
