package typings.vueRuntimeDom.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HtmlHTMLAttributes
  extends StObject
     with HTMLAttributes {
  
  var manifest: js.UndefOr[String] = js.undefined
}
object HtmlHTMLAttributes {
  
  inline def apply(): HtmlHTMLAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HtmlHTMLAttributes]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HtmlHTMLAttributes] (val x: Self) extends AnyVal {
    
    inline def setManifest(value: String): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
    
    inline def setManifestUndefined: Self = StObject.set(x, "manifest", js.undefined)
  }
}
