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
  
  @scala.inline
  def apply(section: String): ITreeArgs = {
    val __obj = js.Dynamic.literal(section = section.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITreeArgs]
  }
  
  @scala.inline
  implicit class ITreeArgsMutableBuilder[Self <: ITreeArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCacheKey(value: String): Self = StObject.set(x, "cacheKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheKeyUndefined: Self = StObject.set(x, "cacheKey", js.undefined)
    
    @scala.inline
    def setSection(value: String): Self = StObject.set(x, "section", value.asInstanceOf[js.Any])
  }
}
