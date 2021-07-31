package typings.tern.ternMod

import typings.tern.ternStrings.`type`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeQuery
  extends StObject
     with BaseQueryWithFile
     with Query {
  
  /**
    * Determines how deep the type string must be expanded.
    * Nested objects will only display property types up to this depth,
    * and be represented by their type name or a representation showing
    * only property names below it. Default `0`
    */
  var depth: js.UndefOr[Double] = js.undefined
  
  /** Specify the location of the expression. */
  var end: Double | Position
  
  /**
    * Set to `true` when you are interested in a function type.
    * This will cause function types to win when something has multiple types.
    * Default `false`
    */
  var preferFunction: js.UndefOr[Boolean] = js.undefined
  
  /** Specify the location of the expression. */
  var start: js.UndefOr[Double | Position] = js.undefined
  
  /** Query the type of something. */
  @JSName("type")
  var type_TypeQuery: `type`
}
object TypeQuery {
  
  @scala.inline
  def apply(end: Double | Position, file: String): TypeQuery = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("type")
    __obj.asInstanceOf[TypeQuery]
  }
  
  @scala.inline
  implicit class TypeQueryMutableBuilder[Self <: TypeQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDepthUndefined: Self = StObject.set(x, "depth", js.undefined)
    
    @scala.inline
    def setEnd(value: Double | Position): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferFunction(value: Boolean): Self = StObject.set(x, "preferFunction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreferFunctionUndefined: Self = StObject.set(x, "preferFunction", js.undefined)
    
    @scala.inline
    def setStart(value: Double | Position): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    @scala.inline
    def setType(value: `type`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
