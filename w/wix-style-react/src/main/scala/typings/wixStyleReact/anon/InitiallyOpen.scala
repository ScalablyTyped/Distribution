package typings.wixStyleReact.anon

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InitiallyOpen extends StObject {
  
  var content: Requireable[ReactNodeLike]
  
  var disabled: Requireable[Boolean]
  
  var initiallyOpen: Requireable[Boolean]
  
  var open: Requireable[Boolean]
  
  var subtitle: Requireable[ReactNodeLike]
  
  var title: Requireable[ReactNodeLike]
}
object InitiallyOpen {
  
  inline def apply(
    content: Requireable[ReactNodeLike],
    disabled: Requireable[Boolean],
    initiallyOpen: Requireable[Boolean],
    open: Requireable[Boolean],
    subtitle: Requireable[ReactNodeLike],
    title: Requireable[ReactNodeLike]
  ): InitiallyOpen = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], initiallyOpen = initiallyOpen.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], subtitle = subtitle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[InitiallyOpen]
  }
  
  extension [Self <: InitiallyOpen](x: Self) {
    
    inline def setContent(value: Requireable[ReactNodeLike]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setDisabled(value: Requireable[Boolean]): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setInitiallyOpen(value: Requireable[Boolean]): Self = StObject.set(x, "initiallyOpen", value.asInstanceOf[js.Any])
    
    inline def setOpen(value: Requireable[Boolean]): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setSubtitle(value: Requireable[ReactNodeLike]): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: Requireable[ReactNodeLike]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
