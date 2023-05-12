package typings.wordpressBlocks

import typings.wordpressBlocks.wordpressBlocksStrings.coreSlashblocks
import typings.wordpressData.buildTypesTypesMod.DataRegistry
import typings.wordpressData.buildTypesTypesMod.StoreDescriptor
import typings.wordpressData.buildTypesTypesMod.StoreInstance
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlocksStoreDescriptor
  extends StObject
     with StoreDescriptor[Any] {
  
  @JSName("name")
  var name_BlocksStoreDescriptor: coreSlashblocks
}
object BlocksStoreDescriptor {
  
  inline def apply(instantiate: DataRegistry => StoreInstance[Any]): BlocksStoreDescriptor = {
    val __obj = js.Dynamic.literal(instantiate = js.Any.fromFunction1(instantiate), name = "core/blocks")
    __obj.asInstanceOf[BlocksStoreDescriptor]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BlocksStoreDescriptor] (val x: Self) extends AnyVal {
    
    inline def setName(value: coreSlashblocks): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
