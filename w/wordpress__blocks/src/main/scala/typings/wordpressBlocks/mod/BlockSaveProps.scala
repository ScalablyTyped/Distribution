package typings.wordpressBlocks.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BlockSaveProps[T /* <: Record[String, Any] */] extends StObject {
  
  val attributes: T
  
  val className: String
}
object BlockSaveProps {
  
  inline def apply[T /* <: Record[String, Any] */](attributes: T, className: String): BlockSaveProps[T] = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockSaveProps[T]]
  }
  
  extension [Self <: BlockSaveProps[?], T /* <: Record[String, Any] */](x: Self & BlockSaveProps[T]) {
    
    inline def setAttributes(value: T): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
  }
}
