package typings.wordpressBlocks.anon

import typings.wordpressBlocks.rawHandlingMod.PhrasingContentSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildrenPhrasingContentSchema extends StObject {
  
  val children: PhrasingContentSchema
}
object ChildrenPhrasingContentSchema {
  
  @scala.inline
  def apply(children: PhrasingContentSchema): ChildrenPhrasingContentSchema = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildrenPhrasingContentSchema]
  }
  
  @scala.inline
  implicit class ChildrenPhrasingContentSchemaMutableBuilder[Self <: ChildrenPhrasingContentSchema] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChildren(value: PhrasingContentSchema): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
  }
}
