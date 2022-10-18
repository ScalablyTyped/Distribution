package typings.victoryCore.anon

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Desc extends StObject {
  
  var children: Requireable[ReactNodeLike]
  
  var desc: Requireable[String]
  
  var title: Requireable[String]
}
object Desc {
  
  inline def apply(children: Requireable[ReactNodeLike], desc: Requireable[String], title: Requireable[String]): Desc = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], desc = desc.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Desc]
  }
  
  extension [Self <: Desc](x: Self) {
    
    inline def setChildren(value: Requireable[ReactNodeLike]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setDesc(value: Requireable[String]): Self = StObject.set(x, "desc", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: Requireable[String]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
