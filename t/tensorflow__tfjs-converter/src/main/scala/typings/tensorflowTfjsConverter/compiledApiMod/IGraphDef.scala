package typings.tensorflowTfjsConverter.compiledApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGraphDef extends StObject {
  
  /** GraphDef library */
  var library: js.UndefOr[IFunctionDefLibrary | Null] = js.native
  
  /** GraphDef node */
  var node: js.UndefOr[js.Array[INodeDef] | Null] = js.native
  
  /** GraphDef versions */
  var versions: js.UndefOr[IVersionDef | Null] = js.native
}
object IGraphDef {
  
  @scala.inline
  def apply(): IGraphDef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGraphDef]
  }
  
  @scala.inline
  implicit class IGraphDefMutableBuilder[Self <: IGraphDef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLibrary(value: IFunctionDefLibrary): Self = StObject.set(x, "library", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLibraryNull: Self = StObject.set(x, "library", null)
    
    @scala.inline
    def setLibraryUndefined: Self = StObject.set(x, "library", js.undefined)
    
    @scala.inline
    def setNode(value: js.Array[INodeDef]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeNull: Self = StObject.set(x, "node", null)
    
    @scala.inline
    def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
    
    @scala.inline
    def setNodeVarargs(value: INodeDef*): Self = StObject.set(x, "node", js.Array(value :_*))
    
    @scala.inline
    def setVersions(value: IVersionDef): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionsNull: Self = StObject.set(x, "versions", null)
    
    @scala.inline
    def setVersionsUndefined: Self = StObject.set(x, "versions", js.undefined)
  }
}
