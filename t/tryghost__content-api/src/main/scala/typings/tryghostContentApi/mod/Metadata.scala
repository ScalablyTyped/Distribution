package typings.tryghostContentApi.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Metadata extends StObject {
  
  var meta_description: js.UndefOr[Nullable[String]] = js.undefined
  
  var meta_title: js.UndefOr[Nullable[String]] = js.undefined
}
object Metadata {
  
  inline def apply(): Metadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Metadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Metadata] (val x: Self) extends AnyVal {
    
    inline def setMeta_description(value: Nullable[String]): Self = StObject.set(x, "meta_description", value.asInstanceOf[js.Any])
    
    inline def setMeta_descriptionNull: Self = StObject.set(x, "meta_description", null)
    
    inline def setMeta_descriptionUndefined: Self = StObject.set(x, "meta_description", js.undefined)
    
    inline def setMeta_title(value: Nullable[String]): Self = StObject.set(x, "meta_title", value.asInstanceOf[js.Any])
    
    inline def setMeta_titleNull: Self = StObject.set(x, "meta_title", null)
    
    inline def setMeta_titleUndefined: Self = StObject.set(x, "meta_title", js.undefined)
  }
}
