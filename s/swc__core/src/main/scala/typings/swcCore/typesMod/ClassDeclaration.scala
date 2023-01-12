package typings.swcCore.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassDeclaration
  extends StObject
     with Class
     with Node
     with Declaration {
  
  var declare: Boolean
  
  var identifier: Identifier
  
  @JSName("type")
  var type_ClassDeclaration: typings.swcCore.swcCoreStrings.ClassDeclaration
}
object ClassDeclaration {
  
  inline def apply(
    body: js.Array[ClassMember],
    declare: Boolean,
    identifier: Identifier,
    implements: js.Array[TsExpressionWithTypeArguments],
    isAbstract: Boolean,
    span: Span
  ): ClassDeclaration = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], declare = declare.asInstanceOf[js.Any], identifier = identifier.asInstanceOf[js.Any], implements = implements.asInstanceOf[js.Any], isAbstract = isAbstract.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("ClassDeclaration")
    __obj.asInstanceOf[ClassDeclaration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClassDeclaration] (val x: Self) extends AnyVal {
    
    inline def setDeclare(value: Boolean): Self = StObject.set(x, "declare", value.asInstanceOf[js.Any])
    
    inline def setIdentifier(value: Identifier): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.swcCore.swcCoreStrings.ClassDeclaration): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
