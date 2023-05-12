package typings.wordpressRichText

import typings.wordpressData.buildTypesTypesMod.DataRegistry
import typings.wordpressData.buildTypesTypesMod.StoreDescriptor
import typings.wordpressData.buildTypesTypesMod.StoreInstance
import typings.wordpressRichText.wordpressRichTextStrings.`coreSlashrich-text`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RichTextStoreDescriptor
  extends StObject
     with StoreDescriptor[Any] {
  
  @JSName("name")
  var name_RichTextStoreDescriptor: `coreSlashrich-text`
}
object RichTextStoreDescriptor {
  
  inline def apply(instantiate: DataRegistry => StoreInstance[Any]): RichTextStoreDescriptor = {
    val __obj = js.Dynamic.literal(instantiate = js.Any.fromFunction1(instantiate), name = "core/rich-text")
    __obj.asInstanceOf[RichTextStoreDescriptor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RichTextStoreDescriptor] (val x: Self) extends AnyVal {
    
    inline def setName(value: `coreSlashrich-text`): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
