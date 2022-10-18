package typings.typedoc.distLibUtilsOptionsDeclarationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidationOptions extends StObject {
  
  /**
    * If set, TypeDoc will produce warnings about \{\@link\} tags which will produce broken links.
    */
  var invalidLink: Boolean
  
  /**
    * If set, TypeDoc will produce warnings about declarations that do not have doc comments
    */
  var notDocumented: Boolean
  
  /**
    * If set, TypeDoc will produce warnings when a symbol is referenced by the documentation,
    * but is not included in the documentation.
    */
  var notExported: Boolean
}
object ValidationOptions {
  
  inline def apply(invalidLink: Boolean, notDocumented: Boolean, notExported: Boolean): ValidationOptions = {
    val __obj = js.Dynamic.literal(invalidLink = invalidLink.asInstanceOf[js.Any], notDocumented = notDocumented.asInstanceOf[js.Any], notExported = notExported.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationOptions]
  }
  
  extension [Self <: ValidationOptions](x: Self) {
    
    inline def setInvalidLink(value: Boolean): Self = StObject.set(x, "invalidLink", value.asInstanceOf[js.Any])
    
    inline def setNotDocumented(value: Boolean): Self = StObject.set(x, "notDocumented", value.asInstanceOf[js.Any])
    
    inline def setNotExported(value: Boolean): Self = StObject.set(x, "notExported", value.asInstanceOf[js.Any])
  }
}
