package typings.stylelint.mod

import typings.postcss.mod.Node
import typings.std.Parameters
import typings.stylelint.anon.Line
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Problem extends StObject {
  
  /**
  			 * The exclusive end position of the problem, relative to the
  			 * node's source text. If provided, this will be used instead of
  			 * `endIndex`.
  			 */
  var end: js.UndefOr[Line] = js.undefined
  
  /**
  			 * The exclusive end index of the problem, relative to the node's
  			 * source text.
  			 */
  var endIndex: js.UndefOr[Double] = js.undefined
  
  /**
  			 * The inclusive start index of the problem, relative to the node's
  			 * source text.
  			 */
  var index: js.UndefOr[Double] = js.undefined
  
  var line: js.UndefOr[Double] = js.undefined
  
  var message: RuleMessage
  
  var messageArgs: js.UndefOr[Parameters[RuleMessageFunc]] = js.undefined
  
  var node: Node
  
  var result: PostcssResult
  
  var ruleName: String
  
  /**
  			 * Optional severity override for the problem.
  			 */
  var severity: js.UndefOr[Severity] = js.undefined
  
  /**
  			 * The inclusive start position of the problem, relative to the
  			 * node's source text. If provided, this will be used instead of
  			 * `index`.
  			 */
  var start: js.UndefOr[Line] = js.undefined
  
  var word: js.UndefOr[String] = js.undefined
}
object Problem {
  
  inline def apply(message: RuleMessage, node: Node, result: PostcssResult, ruleName: String): Problem = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any], ruleName = ruleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Problem]
  }
  
  extension [Self <: Problem](x: Self) {
    
    inline def setEnd(value: Line): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setEndIndex(value: Double): Self = StObject.set(x, "endIndex", value.asInstanceOf[js.Any])
    
    inline def setEndIndexUndefined: Self = StObject.set(x, "endIndex", js.undefined)
    
    inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    inline def setMessage(value: RuleMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageArgs(value: Parameters[RuleMessageFunc]): Self = StObject.set(x, "messageArgs", value.asInstanceOf[js.Any])
    
    inline def setMessageArgsUndefined: Self = StObject.set(x, "messageArgs", js.undefined)
    
    inline def setNode(value: Node): Self = StObject.set(x, "node", value.asInstanceOf[js.Any])
    
    inline def setResult(value: PostcssResult): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    
    inline def setRuleName(value: String): Self = StObject.set(x, "ruleName", value.asInstanceOf[js.Any])
    
    inline def setSeverity(value: Severity): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    
    inline def setStart(value: Line): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    
    inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    
    inline def setWord(value: String): Self = StObject.set(x, "word", value.asInstanceOf[js.Any])
    
    inline def setWordUndefined: Self = StObject.set(x, "word", js.undefined)
  }
}
