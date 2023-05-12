package typings.wordpressNotices

import typings.wordpressData.buildTypesTypesMod.DataRegistry
import typings.wordpressData.buildTypesTypesMod.StoreDescriptor
import typings.wordpressData.buildTypesTypesMod.StoreInstance
import typings.wordpressNotices.wordpressNoticesStrings.coreSlashnotices
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NoticesStoreDescriptor
  extends StObject
     with StoreDescriptor[Any] {
  
  @JSName("name")
  var name_NoticesStoreDescriptor: coreSlashnotices
}
object NoticesStoreDescriptor {
  
  inline def apply(instantiate: DataRegistry => StoreInstance[Any]): NoticesStoreDescriptor = {
    val __obj = js.Dynamic.literal(instantiate = js.Any.fromFunction1(instantiate), name = "core/notices")
    __obj.asInstanceOf[NoticesStoreDescriptor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NoticesStoreDescriptor] (val x: Self) extends AnyVal {
    
    inline def setName(value: coreSlashnotices): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
