package typings.tensorflowTfjsConverter.distDataCompiledApiMod

import typings.tensorflowTfjsConverter.distDataCompiledApiMod.CollectionDef.IAnyList
import typings.tensorflowTfjsConverter.distDataCompiledApiMod.CollectionDef.IBytesList
import typings.tensorflowTfjsConverter.distDataCompiledApiMod.CollectionDef.IFloatList
import typings.tensorflowTfjsConverter.distDataCompiledApiMod.CollectionDef.IInt64List
import typings.tensorflowTfjsConverter.distDataCompiledApiMod.CollectionDef.INodeList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ICollectionDef extends StObject {
  
  /** CollectionDef anyList */
  var anyList: js.UndefOr[IAnyList | Null] = js.undefined
  
  /** CollectionDef bytesList */
  var bytesList: js.UndefOr[IBytesList | Null] = js.undefined
  
  /** CollectionDef floatList */
  var floatList: js.UndefOr[IFloatList | Null] = js.undefined
  
  /** CollectionDef int64List */
  var int64List: js.UndefOr[IInt64List | Null] = js.undefined
  
  /** CollectionDef nodeList */
  var nodeList: js.UndefOr[INodeList | Null] = js.undefined
}
object ICollectionDef {
  
  inline def apply(): ICollectionDef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICollectionDef]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ICollectionDef] (val x: Self) extends AnyVal {
    
    inline def setAnyList(value: IAnyList): Self = StObject.set(x, "anyList", value.asInstanceOf[js.Any])
    
    inline def setAnyListNull: Self = StObject.set(x, "anyList", null)
    
    inline def setAnyListUndefined: Self = StObject.set(x, "anyList", js.undefined)
    
    inline def setBytesList(value: IBytesList): Self = StObject.set(x, "bytesList", value.asInstanceOf[js.Any])
    
    inline def setBytesListNull: Self = StObject.set(x, "bytesList", null)
    
    inline def setBytesListUndefined: Self = StObject.set(x, "bytesList", js.undefined)
    
    inline def setFloatList(value: IFloatList): Self = StObject.set(x, "floatList", value.asInstanceOf[js.Any])
    
    inline def setFloatListNull: Self = StObject.set(x, "floatList", null)
    
    inline def setFloatListUndefined: Self = StObject.set(x, "floatList", js.undefined)
    
    inline def setInt64List(value: IInt64List): Self = StObject.set(x, "int64List", value.asInstanceOf[js.Any])
    
    inline def setInt64ListNull: Self = StObject.set(x, "int64List", null)
    
    inline def setInt64ListUndefined: Self = StObject.set(x, "int64List", js.undefined)
    
    inline def setNodeList(value: INodeList): Self = StObject.set(x, "nodeList", value.asInstanceOf[js.Any])
    
    inline def setNodeListNull: Self = StObject.set(x, "nodeList", null)
    
    inline def setNodeListUndefined: Self = StObject.set(x, "nodeList", js.undefined)
  }
}
