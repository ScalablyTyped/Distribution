package typings.vueMarkdown.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TocLastLevelComputed extends StObject {
  
  var tocLastLevelComputed: scala.Any
}
object TocLastLevelComputed {
  
  inline def apply(tocLastLevelComputed: scala.Any): TocLastLevelComputed = {
    val __obj = js.Dynamic.literal(tocLastLevelComputed = tocLastLevelComputed.asInstanceOf[js.Any])
    __obj.asInstanceOf[TocLastLevelComputed]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TocLastLevelComputed] (val x: Self) extends AnyVal {
    
    inline def setTocLastLevelComputed(value: scala.Any): Self = StObject.set(x, "tocLastLevelComputed", value.asInstanceOf[js.Any])
  }
}
