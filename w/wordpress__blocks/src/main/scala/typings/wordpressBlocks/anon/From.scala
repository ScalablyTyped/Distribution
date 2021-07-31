package typings.wordpressBlocks.anon

import typings.std.Record
import typings.wordpressBlocks.mod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait From[T /* <: Record[String, js.Any] */] extends StObject {
  
  /**
    * Transforms from another block type to this block type.
    */
  val from: js.UndefOr[js.Array[Transform[T]]] = js.undefined
  
  /**
    * Transforms from this block type to another block type.
    */
  val to: js.UndefOr[js.Array[Transform[Record[String, js.Any]]]] = js.undefined
}
object From {
  
  @scala.inline
  def apply[T /* <: Record[String, js.Any] */](): From[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[From[T]]
  }
  
  @scala.inline
  implicit class FromMutableBuilder[Self <: From[?], T /* <: Record[String, js.Any] */] (val x: Self & From[T]) extends AnyVal {
    
    @scala.inline
    def setFrom(value: js.Array[Transform[T]]): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    @scala.inline
    def setFromVarargs(value: Transform[T]*): Self = StObject.set(x, "from", js.Array(value :_*))
    
    @scala.inline
    def setTo(value: js.Array[Transform[Record[String, js.Any]]]): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    
    @scala.inline
    def setToVarargs(value: (Transform[Record[String, js.Any]])*): Self = StObject.set(x, "to", js.Array(value :_*))
  }
}
