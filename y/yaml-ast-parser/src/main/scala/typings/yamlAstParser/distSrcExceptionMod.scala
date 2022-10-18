package typings.yamlAstParser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcExceptionMod {
  
  @JSImport("yaml-ast-parser/dist/src/exception", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with YAMLException {
    def this(reason: String) = this()
    def this(reason: String, mark: typings.yamlAstParser.distSrcMarkMod.^) = this()
    def this(reason: String, mark: Unit, isWarning: Boolean) = this()
    def this(reason: String, mark: typings.yamlAstParser.distSrcMarkMod.^, isWarning: Boolean) = this()
  }
  @JSImport("yaml-ast-parser/dist/src/exception", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSImport("yaml-ast-parser/dist/src/exception", "CLASS_IDENTIFIER")
  @js.native
  def CLASS_IDENTIFIER: Any = js.native
  inline def CLASS_IDENTIFIER_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLASS_IDENTIFIER")(x.asInstanceOf[js.Any])
  
  /* static member */
  inline def isInstance(instance: Any): /* is yaml-ast-parser.yaml-ast-parser/dist/src/exception.YAMLException */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(instance.asInstanceOf[js.Any]).asInstanceOf[/* is yaml-ast-parser.yaml-ast-parser/dist/src/exception.YAMLException */ Boolean]
  
  @js.native
  trait YAMLException extends StObject {
    
    def getClassIdentifier(): js.Array[String] = js.native
    
    var isWarning: Boolean = js.native
    
    var mark: typings.yamlAstParser.distSrcMarkMod.^ = js.native
    
    var message: String = js.native
    
    var name: String = js.native
    
    var reason: String = js.native
    
    def toString(compact: Boolean): Any = js.native
  }
}
