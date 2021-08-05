package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IgnoreConstraints extends StObject {
  
  var ignoreConstraints: scala.Double
  
  var includeAll: scala.Double
  
  var includeChildren: scala.Double
  
  var includeSelf: scala.Double
  
  var includeSubTree: scala.Double
  
  var none: scala.Double
}
object IgnoreConstraints {
  
  inline def apply(
    ignoreConstraints: scala.Double,
    includeAll: scala.Double,
    includeChildren: scala.Double,
    includeSelf: scala.Double,
    includeSubTree: scala.Double,
    none: scala.Double
  ): IgnoreConstraints = {
    val __obj = js.Dynamic.literal(ignoreConstraints = ignoreConstraints.asInstanceOf[js.Any], includeAll = includeAll.asInstanceOf[js.Any], includeChildren = includeChildren.asInstanceOf[js.Any], includeSelf = includeSelf.asInstanceOf[js.Any], includeSubTree = includeSubTree.asInstanceOf[js.Any], none = none.asInstanceOf[js.Any])
    __obj.asInstanceOf[IgnoreConstraints]
  }
  
  extension [Self <: IgnoreConstraints](x: Self) {
    
    inline def setIgnoreConstraints(value: scala.Double): Self = StObject.set(x, "ignoreConstraints", value.asInstanceOf[js.Any])
    
    inline def setIncludeAll(value: scala.Double): Self = StObject.set(x, "includeAll", value.asInstanceOf[js.Any])
    
    inline def setIncludeChildren(value: scala.Double): Self = StObject.set(x, "includeChildren", value.asInstanceOf[js.Any])
    
    inline def setIncludeSelf(value: scala.Double): Self = StObject.set(x, "includeSelf", value.asInstanceOf[js.Any])
    
    inline def setIncludeSubTree(value: scala.Double): Self = StObject.set(x, "includeSubTree", value.asInstanceOf[js.Any])
    
    inline def setNone(value: scala.Double): Self = StObject.set(x, "none", value.asInstanceOf[js.Any])
  }
}
