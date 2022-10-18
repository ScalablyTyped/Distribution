package typings.tensorflowTfjsConverter.distDataCompiledApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGraphDef extends StObject {
  
  /** GraphDef library */
  var library: js.UndefOr[IFunctionDefLibrary | Null] = js.undefined
  
  /** GraphDef node */
  var node: js.UndefOr[js.Array[INodeDef] | Null] = js.undefined
  
  /** GraphDef versions */
  var versions: js.UndefOr[IVersionDef | Null] = js.undefined
}
object IGraphDef {
  
  inline def apply(): IGraphDef = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGraphDef]
  }
  
  extension [Self <: IGraphDef](x: Self) {
    
    inline def setLibrary(value: IFunctionDefLibrary): Self = StObject.set(x, "library", value.asInstanceOf[js.Any])
    
    inline def setLibraryNull: Self = StObject.set(x, "library", null)
    
    inline def setLibraryUndefined: Self = StObject.set(x, "library", js.undefined)
    
    inline def setNode(value: js.Array[INodeDef]): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setNodeNull: Self = StObject.set(x, "node", null)
    
    inline def setNodeUndefined: Self = StObject.set(x, "node", js.undefined)
    
    inline def setNodeVarargs(value: INodeDef*): Self = StObject.set(x, "node", js.Array(value*))
    
    inline def setVersions(value: IVersionDef): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
    
    inline def setVersionsNull: Self = StObject.set(x, "versions", null)
    
    inline def setVersionsUndefined: Self = StObject.set(x, "versions", js.undefined)
  }
}
