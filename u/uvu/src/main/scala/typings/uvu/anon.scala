package typings.uvu

import typings.uvu.parseMod.Arrayable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Actual extends StObject {
    
    var actual: Any
    
    var details: js.UndefOr[String] = js.undefined
    
    var expects: Any
    
    var generated: js.UndefOr[Boolean] = js.undefined
    
    var message: String
    
    var operator: String
  }
  object Actual {
    
    inline def apply(actual: Any, expects: Any, message: String, operator: String): Actual = {
      val __obj = js.Dynamic.literal(actual = actual.asInstanceOf[js.Any], expects = expects.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any])
      __obj.asInstanceOf[Actual]
    }
    
    extension [Self <: Actual](x: Self) {
      
      inline def setActual(value: Any): Self = StObject.set(x, "actual", value.asInstanceOf[js.Any])
      
      inline def setDetails(value: String): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
      
      inline def setExpects(value: Any): Self = StObject.set(x, "expects", value.asInstanceOf[js.Any])
      
      inline def setGenerated(value: Boolean): Self = StObject.set(x, "generated", value.asInstanceOf[js.Any])
      
      inline def setGeneratedUndefined: Self = StObject.set(x, "generated", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setOperator(value: String): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    }
  }
  
  trait Bail extends StObject {
    
    var bail: Boolean
  }
  object Bail {
    
    inline def apply(bail: Boolean): Bail = {
      val __obj = js.Dynamic.literal(bail = bail.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bail]
    }
    
    extension [Self <: Bail](x: Self) {
      
      inline def setBail(value: Boolean): Self = StObject.set(x, "bail", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Partial<uvu.uvu/parse.Options> */
  trait PartialOptions extends StObject {
    
    var cwd: js.UndefOr[String] = js.undefined
    
    var ignore: js.UndefOr[Arrayable[String | js.RegExp]] = js.undefined
    
    var require: js.UndefOr[Arrayable[String]] = js.undefined
  }
  object PartialOptions {
    
    inline def apply(): PartialOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialOptions]
    }
    
    extension [Self <: PartialOptions](x: Self) {
      
      inline def setCwd(value: String): Self = StObject.set(x, "cwd", value.asInstanceOf[js.Any])
      
      inline def setCwdUndefined: Self = StObject.set(x, "cwd", js.undefined)
      
      inline def setIgnore(value: Arrayable[String | js.RegExp]): Self = StObject.set(x, "ignore", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUndefined: Self = StObject.set(x, "ignore", js.undefined)
      
      inline def setIgnoreVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "ignore", js.Array(value*))
      
      inline def setRequire(value: Arrayable[String]): Self = StObject.set(x, "require", value.asInstanceOf[js.Any])
      
      inline def setRequireUndefined: Self = StObject.set(x, "require", js.undefined)
      
      inline def setRequireVarargs(value: String*): Self = StObject.set(x, "require", js.Array(value*))
    }
  }
}
