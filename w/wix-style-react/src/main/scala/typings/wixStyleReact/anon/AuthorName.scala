package typings.wixStyleReact.anon

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuthorName extends StObject {
  
  var authorName: Requireable[String]
  
  var avatar: Requireable[ReactNodeLike]
  
  var text: Requireable[String]
}
object AuthorName {
  
  inline def apply(authorName: Requireable[String], avatar: Requireable[ReactNodeLike], text: Requireable[String]): AuthorName = {
    val __obj = js.Dynamic.literal(authorName = authorName.asInstanceOf[js.Any], avatar = avatar.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthorName]
  }
  
  extension [Self <: AuthorName](x: Self) {
    
    inline def setAuthorName(value: Requireable[String]): Self = StObject.set(x, "authorName", value.asInstanceOf[js.Any])
    
    inline def setAvatar(value: Requireable[ReactNodeLike]): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
    
    inline def setText(value: Requireable[String]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
