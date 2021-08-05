package typings.vsoNodeApi.tfvcInterfacesMod

import typings.std.Date
import typings.vsoNodeApi.vssinterfacesMod.IdentityRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TfvcLabel
  extends StObject
     with TfvcLabelRef {
  
  var items: js.Array[TfvcItem]
}
object TfvcLabel {
  
  inline def apply(
    _links: js.Any,
    description: String,
    id: Double,
    items: js.Array[TfvcItem],
    labelScope: String,
    modifiedDate: Date,
    name: String,
    owner: IdentityRef,
    url: String
  ): TfvcLabel = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], labelScope = labelScope.asInstanceOf[js.Any], modifiedDate = modifiedDate.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[TfvcLabel]
  }
  
  extension [Self <: TfvcLabel](x: Self) {
    
    inline def setItems(value: js.Array[TfvcItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: TfvcItem*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
