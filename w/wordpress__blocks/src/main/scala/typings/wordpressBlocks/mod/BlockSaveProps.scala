package typings.wordpressBlocks.mod

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlockSaveProps[T /* <: Record[String, _] */] extends StObject {
  
  val attributes: T = js.native
}
object BlockSaveProps {
  
  @scala.inline
  def apply[T /* <: Record[String, _] */](attributes: T): BlockSaveProps[T] = {
    val __obj = js.Dynamic.literal(attributes = attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlockSaveProps[T]]
  }
  
  @scala.inline
  implicit class BlockSavePropsMutableBuilder[Self <: BlockSaveProps[_], T /* <: Record[String, _] */] (val x: Self with BlockSaveProps[T]) extends AnyVal {
    
    @scala.inline
    def setAttributes(value: T): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
  }
}
