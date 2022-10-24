package typings.wixStyleReact.anon

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Caption extends StObject {
  
  var caption: Requireable[ReactNodeLike]
  
  var className: Requireable[String]
  
  var dataHook: Requireable[String]
  
  var media: Requireable[ReactNodeLike]
  
  var profileImageSrc: Requireable[String]
  
  var profileName: Requireable[ReactNodeLike]
  
  var skin: Requireable[String]
}
object Caption {
  
  inline def apply(
    caption: Requireable[ReactNodeLike],
    className: Requireable[String],
    dataHook: Requireable[String],
    media: Requireable[ReactNodeLike],
    profileImageSrc: Requireable[String],
    profileName: Requireable[ReactNodeLike],
    skin: Requireable[String]
  ): Caption = {
    val __obj = js.Dynamic.literal(caption = caption.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], dataHook = dataHook.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], profileImageSrc = profileImageSrc.asInstanceOf[js.Any], profileName = profileName.asInstanceOf[js.Any], skin = skin.asInstanceOf[js.Any])
    __obj.asInstanceOf[Caption]
  }
  
  extension [Self <: Caption](x: Self) {
    
    inline def setCaption(value: Requireable[ReactNodeLike]): Self = StObject.set(x, "caption", value.asInstanceOf[js.Any])
    
    inline def setClassName(value: Requireable[String]): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setDataHook(value: Requireable[String]): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    
    inline def setMedia(value: Requireable[ReactNodeLike]): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
    
    inline def setProfileImageSrc(value: Requireable[String]): Self = StObject.set(x, "profileImageSrc", value.asInstanceOf[js.Any])
    
    inline def setProfileName(value: Requireable[ReactNodeLike]): Self = StObject.set(x, "profileName", value.asInstanceOf[js.Any])
    
    inline def setSkin(value: Requireable[String]): Self = StObject.set(x, "skin", value.asInstanceOf[js.Any])
  }
}
