package typings.typedoc.anon

import typings.typedoc.typedocStrings.all_
import typings.typedoc.typedocStrings.block
import typings.typedoc.typedocStrings.jsdoc
import typings.typedoc.typedocStrings.line
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait All extends StObject {
  
  val All: all_
  
  val Block: block
  
  val JSDoc: jsdoc
  
  val Line: line
}
object All {
  
  inline def apply(): All = {
    val __obj = js.Dynamic.literal(All = "all", Block = "block", JSDoc = "jsdoc", Line = "line")
    __obj.asInstanceOf[All]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: All] (val x: Self) extends AnyVal {
    
    inline def setAll(value: all_): Self = StObject.set(x, "All", value.asInstanceOf[js.Any])
    
    inline def setBlock(value: block): Self = StObject.set(x, "Block", value.asInstanceOf[js.Any])
    
    inline def setJSDoc(value: jsdoc): Self = StObject.set(x, "JSDoc", value.asInstanceOf[js.Any])
    
    inline def setLine(value: line): Self = StObject.set(x, "Line", value.asInstanceOf[js.Any])
  }
}
