package typings.vite.mod

import typings.std.Record
import typings.vite.viteStrings.`body-prepend`
import typings.vite.viteStrings.`head-prepend`
import typings.vite.viteStrings.body
import typings.vite.viteStrings.head
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HtmlTagDescriptor extends StObject {
  
  var attrs: js.UndefOr[Record[String, js.UndefOr[String | Boolean]]] = js.undefined
  
  var children: js.UndefOr[String | js.Array[HtmlTagDescriptor]] = js.undefined
  
  /**
    * default: 'head-prepend'
    */
  var injectTo: js.UndefOr[head | body | `head-prepend` | `body-prepend`] = js.undefined
  
  var tag: String
}
object HtmlTagDescriptor {
  
  inline def apply(tag: String): HtmlTagDescriptor = {
    val __obj = js.Dynamic.literal(tag = tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[HtmlTagDescriptor]
  }
  
  extension [Self <: HtmlTagDescriptor](x: Self) {
    
    inline def setAttrs(value: Record[String, js.UndefOr[String | Boolean]]): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setAttrsUndefined: Self = StObject.set(x, "attrs", js.undefined)
    
    inline def setChildren(value: String | js.Array[HtmlTagDescriptor]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setChildrenVarargs(value: HtmlTagDescriptor*): Self = StObject.set(x, "children", js.Array(value*))
    
    inline def setInjectTo(value: head | body | `head-prepend` | `body-prepend`): Self = StObject.set(x, "injectTo", value.asInstanceOf[js.Any])
    
    inline def setInjectToUndefined: Self = StObject.set(x, "injectTo", js.undefined)
    
    inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
  }
}
