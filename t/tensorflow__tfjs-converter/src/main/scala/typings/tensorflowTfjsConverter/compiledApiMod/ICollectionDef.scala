package typings.tensorflowTfjsConverter.compiledApiMod

import typings.tensorflowTfjsConverter.compiledApiMod.CollectionDef.IAnyList
import typings.tensorflowTfjsConverter.compiledApiMod.CollectionDef.IBytesList
import typings.tensorflowTfjsConverter.compiledApiMod.CollectionDef.IFloatList
import typings.tensorflowTfjsConverter.compiledApiMod.CollectionDef.IInt64List
import typings.tensorflowTfjsConverter.compiledApiMod.CollectionDef.INodeList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICollectionDef extends StObject {
  
  /** CollectionDef anyList */
  var anyList: js.UndefOr[IAnyList | Null] = js.native
  
  /** CollectionDef bytesList */
  var bytesList: js.UndefOr[IBytesList | Null] = js.native
  
  /** CollectionDef floatList */
  var floatList: js.UndefOr[IFloatList | Null] = js.native
  
  /** CollectionDef int64List */
  var int64List: js.UndefOr[IInt64List | Null] = js.native
  
  /** CollectionDef nodeList */
  var nodeList: js.UndefOr[INodeList | Null] = js.native
}
object ICollectionDef {
  
  @scala.inline
  def apply(): ICollectionDef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICollectionDef]
  }
  
  @scala.inline
  implicit class ICollectionDefMutableBuilder[Self <: ICollectionDef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnyList(value: IAnyList): Self = StObject.set(x, "anyList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnyListNull: Self = StObject.set(x, "anyList", null)
    
    @scala.inline
    def setAnyListUndefined: Self = StObject.set(x, "anyList", js.undefined)
    
    @scala.inline
    def setBytesList(value: IBytesList): Self = StObject.set(x, "bytesList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBytesListNull: Self = StObject.set(x, "bytesList", null)
    
    @scala.inline
    def setBytesListUndefined: Self = StObject.set(x, "bytesList", js.undefined)
    
    @scala.inline
    def setFloatList(value: IFloatList): Self = StObject.set(x, "floatList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloatListNull: Self = StObject.set(x, "floatList", null)
    
    @scala.inline
    def setFloatListUndefined: Self = StObject.set(x, "floatList", js.undefined)
    
    @scala.inline
    def setInt64List(value: IInt64List): Self = StObject.set(x, "int64List", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInt64ListNull: Self = StObject.set(x, "int64List", null)
    
    @scala.inline
    def setInt64ListUndefined: Self = StObject.set(x, "int64List", js.undefined)
    
    @scala.inline
    def setNodeList(value: INodeList): Self = StObject.set(x, "nodeList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeListNull: Self = StObject.set(x, "nodeList", null)
    
    @scala.inline
    def setNodeListUndefined: Self = StObject.set(x, "nodeList", js.undefined)
  }
}
