package typings.wordpressBlocks.mod

import typings.std.Node
import typings.std.Partial
import typings.std.Record
import typings.wordpressBlocks.wordpressBlocksStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformRaw[T /* <: Record[String, js.Any] */]
  extends StObject
     with Transform[T] {
  
  var isMatch: js.UndefOr[js.Function1[/* node */ Node, Boolean]] = js.undefined
  
  var priority: js.UndefOr[Double] = js.undefined
  
  var schema: js.UndefOr[TransformRawSchema] = js.undefined
  
  /**
    * Comma-separated list of selectors, no spaces.
    *
    * @example 'p,div,h1,.css-class,#id'
    */
  var selector: js.UndefOr[String] = js.undefined
  
  var transform: js.UndefOr[js.Function1[/* node */ Node, BlockInstance[Partial[T]] | Unit]] = js.undefined
  
  var `type`: raw
}
object TransformRaw {
  
  @scala.inline
  def apply[T /* <: Record[String, js.Any] */](): TransformRaw[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("raw")
    __obj.asInstanceOf[TransformRaw[T]]
  }
  
  @scala.inline
  implicit class TransformRawMutableBuilder[Self <: TransformRaw[?], T /* <: Record[String, js.Any] */] (val x: Self & TransformRaw[T]) extends AnyVal {
    
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
