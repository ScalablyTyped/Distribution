package typings.typedoc.anon

import typings.typedoc.typedocStrings.all_
import typings.typedoc.typedocStrings.block
import typings.typedoc.typedocStrings.jsdoc
import typings.typedoc.typedocStrings.line
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<{ readonly JSDoc :'jsdoc',  readonly Block :'block',  readonly Line :'line',  readonly All :'all'}> */
trait PartialreadonlyJSDocjsdoc extends StObject {
  
  var All: js.UndefOr[all_] = js.undefined
  
  var Block: js.UndefOr[block] = js.undefined
  
  var JSDoc: js.UndefOr[jsdoc] = js.undefined
  
  var Line: js.UndefOr[line] = js.undefined
}
object PartialreadonlyJSDocjsdoc {
  
  inline def apply(): PartialreadonlyJSDocjsdoc = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialreadonlyJSDocjsdoc]
  }
  
  extension [Self <: PartialreadonlyJSDocjsdoc](x: Self) {
    
    inline def setAll(value: all_): Self = StObject.set(x, "All", value.asInstanceOf[js.Any])
    
    inline def setAllUndefined: Self = StObject.set(x, "All", js.undefined)
    
    inline def setBlock(value: block): Self = StObject.set(x, "Block", value.asInstanceOf[js.Any])
    
    inline def setBlockUndefined: Self = StObject.set(x, "Block", js.undefined)
    
    inline def setJSDoc(value: jsdoc): Self = StObject.set(x, "JSDoc", value.asInstanceOf[js.Any])
    
    inline def setJSDocUndefined: Self = StObject.set(x, "JSDoc", js.undefined)
    
    inline def setLine(value: line): Self = StObject.set(x, "Line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "Line", js.undefined)
  }
}
