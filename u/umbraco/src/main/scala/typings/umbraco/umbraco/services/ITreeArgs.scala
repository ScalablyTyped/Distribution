package typings.umbraco.umbraco.services

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Tree args
  */
trait ITreeArgs extends StObject {
  
  var cacheKey: js.UndefOr[String] = js.undefined
  
  var section: String
}
object ITreeArgs {
  
  inline def apply(section: String): ITreeArgs = {
    val __obj = js.Dynamic.literal(section = section.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITreeArgs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ITreeArgs] (val x: Self) extends AnyVal {
    
    inline def setCacheKey(value: String): Self = StObject.set(x, "cacheKey", value.asInstanceOf[js.Any])
    
    inline def setCacheKeyUndefined: Self = StObject.set(x, "cacheKey", js.undefined)
    
    inline def setSection(value: String): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
  }
}
