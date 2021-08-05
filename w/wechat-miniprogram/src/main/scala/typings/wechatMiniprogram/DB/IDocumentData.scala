package typings.wechatMiniprogram.DB

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDocumentData
  extends StObject
     with /* key */ StringDictionary[js.Any] {
  
  var _id: js.UndefOr[DocumentId] = js.undefined
}
object IDocumentData {
  
  inline def apply(): IDocumentData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDocumentData]
  }
  
  extension [Self <: IDocumentData](x: Self) {
    
    inline def set_id(value: DocumentId): Self = StObject.set(x, "_id", value.asInstanceOf[js.Any])
    
    inline def set_idUndefined: Self = StObject.set(x, "_id", js.undefined)
  }
}
