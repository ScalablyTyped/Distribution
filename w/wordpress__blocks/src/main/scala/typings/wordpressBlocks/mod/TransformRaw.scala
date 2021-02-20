package typings.wordpressBlocks.mod

import typings.std.Node
import typings.std.Partial
import typings.std.Record
import typings.wordpressBlocks.wordpressBlocksStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransformRaw[T /* <: Record[String, _] */] extends Transform[T] {
  
  var isMatch: js.UndefOr[js.Function1[/* node */ Node, Boolean]] = js.native
  
  var priority: js.UndefOr[Double] = js.native
  
  var schema: js.UndefOr[TransformRawSchema] = js.native
  
  /**
    * Comma-separated list of selectors, no spaces.
    *
    * @example 'p,div,h1,.css-class,#id'
    */
  var selector: js.UndefOr[String] = js.native
  
  var transform: js.UndefOr[js.Function1[/* node */ Node, BlockInstance[Partial[T]] | Unit]] = js.native
  
  var `type`: raw = js.native
}
object TransformRaw {
  
  @scala.inline
  def apply[T /* <: Record[String, _] */](`type`: raw): TransformRaw[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformRaw[T]]
  }
  
  @scala.inline
  implicit class TransformRawMutableBuilder[Self <: TransformRaw[_], T /* <: Record[String, _] */] (val x: Self with TransformRaw[T]) extends AnyVal {
    
    @scala.inline
    def setIsMatch(value: /* node */ Node => Boolean): Self = StObject.set(x, "isMatch", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsMatchUndefined: Self = StObject.set(x, "isMatch", js.undefined)
    
    @scala.inline
    def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    @scala.inline
    def setSchema(value: TransformRawSchema): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
    
    @scala.inline
    def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorUndefined: Self = StObject.set(x, "selector", js.undefined)
    
    @scala.inline
    def setTransform(value: /* node */ Node => BlockInstance[Partial[T]] | Unit): Self = StObject.set(x, "transform", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTransformUndefined: Self = StObject.set(x, "transform", js.undefined)
    
    @scala.inline
    def setType(value: raw): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
