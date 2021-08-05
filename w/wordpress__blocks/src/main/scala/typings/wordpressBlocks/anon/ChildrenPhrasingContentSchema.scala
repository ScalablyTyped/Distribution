package typings.wordpressBlocks.anon

import typings.wordpressBlocks.rawHandlingMod.PhrasingContentSchema
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildrenPhrasingContentSchema extends StObject {
  
  val children: PhrasingContentSchema
}
object ChildrenPhrasingContentSchema {
  
  inline def apply(children: PhrasingContentSchema): ChildrenPhrasingContentSchema = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildrenPhrasingContentSchema]
  }
  
  extension [Self <: ChildrenPhrasingContentSchema](x: Self) {
    
    inline def setChildren(value: PhrasingContentSchema): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
  }
}
