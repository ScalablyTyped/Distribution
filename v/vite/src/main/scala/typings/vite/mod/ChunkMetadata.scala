package typings.vite.mod

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChunkMetadata extends StObject {
  
  var importedAssets: Set[String]
  
  var importedCss: Set[String]
}
object ChunkMetadata {
  
  inline def apply(importedAssets: Set[String], importedCss: Set[String]): ChunkMetadata = {
    val __obj = js.Dynamic.literal(importedAssets = importedAssets.asInstanceOf[js.Any], importedCss = importedCss.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChunkMetadata]
  }
  
  extension [Self <: ChunkMetadata](x: Self) {
    
    inline def setImportedAssets(value: Set[String]): Self = StObject.set(x, "importedAssets", value.asInstanceOf[js.Any])
    
    inline def setImportedCss(value: Set[String]): Self = StObject.set(x, "importedCss", value.asInstanceOf[js.Any])
  }
}
