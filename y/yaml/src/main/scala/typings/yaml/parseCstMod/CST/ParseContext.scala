package typings.yaml.parseCstMod.CST

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParseContext extends StObject {
  
  /** Node starts at beginning of line */
  var atLineStart: Boolean
  
  /** true if currently in a collection context */
  var inCollection: Boolean
  
  /** true if currently in a flow context */
  var inFlow: Boolean
  
  /** Current level of indentation */
  var indent: Double
  
  /** Start of the current line */
  var lineStart: Double
  
  /** The parent of the node */
  var parent: Node
  
  /** Source of the YAML document */
  var src: String
}
object ParseContext {
  
  inline def apply(
    atLineStart: Boolean,
    inCollection: Boolean,
    inFlow: Boolean,
    indent: Double,
    lineStart: Double,
    parent: Node,
    src: String
  ): ParseContext = {
    val __obj = js.Dynamic.literal(atLineStart = atLineStart.asInstanceOf[js.Any], inCollection = inCollection.asInstanceOf[js.Any], inFlow = inFlow.asInstanceOf[js.Any], indent = indent.asInstanceOf[js.Any], lineStart = lineStart.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], src = src.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseContext]
  }
  
  extension [Self <: ParseContext](x: Self) {
    
    inline def setAtLineStart(value: Boolean): Self = StObject.set(x, "atLineStart", value.asInstanceOf[js.Any])
    
    inline def setInCollection(value: Boolean): Self = StObject.set(x, "inCollection", value.asInstanceOf[js.Any])
    
    inline def setInFlow(value: Boolean): Self = StObject.set(x, "inFlow", value.asInstanceOf[js.Any])
    
    inline def setIndent(value: Double): Self = StObject.set(x, "indent", value.asInstanceOf[js.Any])
    
    inline def setLineStart(value: Double): Self = StObject.set(x, "lineStart", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Node): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
  }
}
