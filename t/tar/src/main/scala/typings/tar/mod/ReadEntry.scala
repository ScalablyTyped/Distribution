package typings.tar.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify MiniPass * / any */ trait ReadEntry
  extends StObject
     with HeaderProperties {
  
  /** The number of 512-byte blocks remaining to be written into the stream. */
  var blockRemain: Double
  
  /** The extended metadata object provided to the constructor. */
  var extended: Any
  
  /** The global extended metadata object provided to the constructor. */
  var globalExtended: Any
  
  /** Whether this entry should be ignored. */
  var ignore: Boolean
  
  /**
    * True if this represents metadata about the next entry, false if it
    * represents a filesystem object.
    */
  var meta: Boolean
  
  /** The number of bytes remaining to be written into the stream. */
  var remain: Double
}
object ReadEntry {
  
  inline def apply(
    blockRemain: Double,
    extended: Any,
    globalExtended: Any,
    ignore: Boolean,
    meta: Boolean,
    path: String,
    remain: Double
  ): ReadEntry = {
    val __obj = js.Dynamic.literal(blockRemain = blockRemain.asInstanceOf[js.Any], extended = extended.asInstanceOf[js.Any], globalExtended = globalExtended.asInstanceOf[js.Any], ignore = ignore.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], remain = remain.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadEntry] (val x: Self) extends AnyVal {
    
    inline def setBlockRemain(value: Double): Self = StObject.set(x, "blockRemain", value.asInstanceOf[js.Any])
    
    inline def setExtended(value: Any): Self = StObject.set(x, "extended", value.asInstanceOf[js.Any])
    
    inline def setGlobalExtended(value: Any): Self = StObject.set(x, "globalExtended", value.asInstanceOf[js.Any])
    
    inline def setIgnore(value: Boolean): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: Boolean): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setRemain(value: Double): Self = StObject.set(x, "remain", value.asInstanceOf[js.Any])
  }
}
