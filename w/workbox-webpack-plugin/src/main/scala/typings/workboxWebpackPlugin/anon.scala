package typings.workboxWebpackPlugin

import typings.workboxBuild.buildTypesMod.ManifestEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Size extends StObject {
    
    var size: Double
    
    var sortedEntries: js.Array[ManifestEntry]
  }
  object Size {
    
    inline def apply(size: Double, sortedEntries: js.Array[ManifestEntry]): Size = {
      val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any], sortedEntries = sortedEntries.asInstanceOf[js.Any])
      __obj.asInstanceOf[Size]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Size] (val x: Self) extends AnyVal {
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSortedEntries(value: js.Array[ManifestEntry]): Self = StObject.set(x, "sortedEntries", value.asInstanceOf[js.Any])
      
      inline def setSortedEntriesVarargs(value: ManifestEntry*): Self = StObject.set(x, "sortedEntries", js.Array(value*))
    }
  }
}
