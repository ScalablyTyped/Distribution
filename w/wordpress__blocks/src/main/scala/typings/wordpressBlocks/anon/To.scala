package typings.wordpressBlocks.anon

import typings.std.Record
import typings.wordpressBlocks.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait To[T /* <: Record[String, Any] */] extends StObject {
  
  /**
    * Transforms from another block type to this block type.
    */
  val from: js.UndefOr[js.Array[Transform[T]]] = js.undefined
  
  /**
    * Transforms from this block type to another block type.
    */
  val to: js.UndefOr[js.Array[Transform[Record[String, Any]]]] = js.undefined
}
object To {
  
  inline def apply[T /* <: Record[String, Any] */](): To[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[To[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: To[?], T /* <: Record[String, Any] */] (val x: Self & To[T]) extends AnyVal {
    
    inline def setFrom(value: js.Array[Transform[T]]): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    inline def setFromVarargs(value: Transform[T]*): Self = StObject.set(x, "from", js.Array(value*))
    
    inline def setTo(value: js.Array[Transform[Record[String, Any]]]): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    
    inline def setToVarargs(value: (Transform[Record[String, Any]])*): Self = StObject.set(x, "to", js.Array(value*))
  }
}
