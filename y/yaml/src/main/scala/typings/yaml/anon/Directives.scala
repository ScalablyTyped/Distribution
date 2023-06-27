package typings.yaml.anon

import typings.yaml.distErrorsMod.YAMLParseError
import typings.yaml.distErrorsMod.YAMLWarning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Directives extends StObject {
  
  var comment: String
  
  var directives: typings.yaml.distDocDirectivesMod.Directives
  
  var errors: js.Array[YAMLParseError]
  
  var warnings: js.Array[YAMLWarning]
}
object Directives {
  
  inline def apply(
    comment: String,
    directives: typings.yaml.distDocDirectivesMod.Directives,
    errors: js.Array[YAMLParseError],
    warnings: js.Array[YAMLWarning]
  ): Directives = {
    val __obj = js.Dynamic.literal(comment = comment.asInstanceOf[js.Any], directives = directives.asInstanceOf[js.Any], errors = errors.asInstanceOf[js.Any], warnings = warnings.asInstanceOf[js.Any])
    __obj.asInstanceOf[Directives]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Directives] (val x: Self) extends AnyVal {
    
    inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
    
    inline def setDirectives(value: typings.yaml.distDocDirectivesMod.Directives): Self = StObject.set(x, "directives", value.asInstanceOf[js.Any])
    
    inline def setErrors(value: js.Array[YAMLParseError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsVarargs(value: YAMLParseError*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setWarnings(value: js.Array[YAMLWarning]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsVarargs(value: YAMLWarning*): Self = StObject.set(x, "warnings", js.Array(value*))
  }
}
