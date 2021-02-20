package typings.wordpressBlocks.anon

import typings.std.Record
import typings.wordpressBlocks.mod.Transform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait From[T /* <: Record[String, _] */] extends StObject {
  
  /**
    * Transforms from another block type to this block type.
    */
  val from: js.UndefOr[js.Array[Transform[T]]] = js.native
  
  /**
    * Transforms from this block type to another block type.
    */
  val to: js.UndefOr[js.Array[Transform[Record[String, _]]]] = js.native
}
object From {
  
  @scala.inline
  def apply[T /* <: Record[String, _] */](): From[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[From[T]]
  }
  
  @scala.inline
  implicit class FromMutableBuilder[Self <: From[_], T /* <: Record[String, _] */] (val x: Self with From[T]) extends AnyVal {
    
    @scala.inline
    def setFrom(value: js.Array[Transform[T]]): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
    
    @scala.inline
    def setFromVarargs(value: Transform[T]*): Self = StObject.set(x, "from", js.Array(value :_*))
    
    @scala.inline
    def setTo(value: js.Array[Transform[Record[String, _]]]): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToUndefined: Self = StObject.set(x, "to", js.undefined)
    
    @scala.inline
    def setToVarargs(value: (Transform[Record[String, js.Any]])*): Self = StObject.set(x, "to", js.Array(value :_*))
  }
}
