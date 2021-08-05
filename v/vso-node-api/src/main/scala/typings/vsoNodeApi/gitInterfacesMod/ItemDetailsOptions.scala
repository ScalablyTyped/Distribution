package typings.vsoNodeApi.gitInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemDetailsOptions extends StObject {
  
  /**
    * If true, include metadata about the file type
    */
  var includeContentMetadata: Boolean
  
  /**
    * Specifies whether to include children (OneLevel), all descendants (Full) or None for folder items
    */
  var recursionLevel: VersionControlRecursionType
}
object ItemDetailsOptions {
  
  inline def apply(includeContentMetadata: Boolean, recursionLevel: VersionControlRecursionType): ItemDetailsOptions = {
    val __obj = js.Dynamic.literal(includeContentMetadata = includeContentMetadata.asInstanceOf[js.Any], recursionLevel = recursionLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemDetailsOptions]
  }
  
  extension [Self <: ItemDetailsOptions](x: Self) {
    
    inline def setIncludeContentMetadata(value: Boolean): Self = StObject.set(x, "includeContentMetadata", value.asInstanceOf[js.Any])
    
    inline def setRecursionLevel(value: VersionControlRecursionType): Self = StObject.set(x, "recursionLevel", value.asInstanceOf[js.Any])
  }
}
