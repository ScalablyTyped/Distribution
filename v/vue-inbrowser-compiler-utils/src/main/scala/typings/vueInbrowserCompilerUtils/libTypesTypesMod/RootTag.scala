package typings.vueInbrowserCompilerUtils.libTypesTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RootTag extends StObject {
  
  var title: String
}
object RootTag {
  
  inline def apply(title: String): RootTag = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[RootTag]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RootTag] (val x: Self) extends AnyVal {
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
