package typings.wordpressAdmin.anon

import typings.wordpressAdmin.wordpressAdminStrings.post
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @wordpress/admin.@wordpress/admin/components/media-views.FrameOptions & {  frame :'post'} */
trait FrameOptionsframepost extends StObject {
  
  var button: js.UndefOr[Text] = js.undefined
  
  var frame: post
  
  // frame?: FrameType;
  var multiple: js.UndefOr[Boolean] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
}
object FrameOptionsframepost {
  
  inline def apply(): FrameOptionsframepost = {
    val __obj = js.Dynamic.literal(frame = "post")
    __obj.asInstanceOf[FrameOptionsframepost]
  }
  
  extension [Self <: FrameOptionsframepost](x: Self) {
    
    inline def setButton(value: Text): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    inline def setButtonUndefined: Self = StObject.set(x, "button", js.undefined)
    
    inline def setFrame(value: post): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
    
    inline def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
    
    inline def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
