package typings.typeorm.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisableMixedMap extends StObject {
  
  var disableMixedMap: js.UndefOr[Boolean] = js.native
  
  var relations: js.UndefOr[js.Array[String]] = js.native
}
object DisableMixedMap {
  
  @scala.inline
  def apply(): DisableMixedMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisableMixedMap]
  }
  
  @scala.inline
  implicit class DisableMixedMapMutableBuilder[Self <: DisableMixedMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisableMixedMap(value: Boolean): Self = StObject.set(x, "disableMixedMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisableMixedMapUndefined: Self = StObject.set(x, "disableMixedMap", js.undefined)
    
    @scala.inline
    def setRelations(value: js.Array[String]): Self = StObject.set(x, "relations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelationsUndefined: Self = StObject.set(x, "relations", js.undefined)
    
    @scala.inline
    def setRelationsVarargs(value: String*): Self = StObject.set(x, "relations", js.Array(value :_*))
  }
}
