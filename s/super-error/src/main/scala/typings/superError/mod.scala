package typings.superError

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("super-error", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with SuperError {
    def this(args: Any*) = this()
    
    /* CompleteClass */
    override def causedBy(err: js.Error): this.type = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  @JSImport("super-error", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def subclass(exports: Any, name: String): SuperErrorI = (^.asInstanceOf[js.Dynamic].applyDynamic("subclass")(exports.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[SuperErrorI]
  /* static member */
  inline def subclass(
    exports: Any,
    name: String,
    subclass_constructor: js.ThisFunction1[/* this */ SuperError, /* repeated */ Any, Unit]
  ): SuperErrorI = (^.asInstanceOf[js.Dynamic].applyDynamic("subclass")(exports.asInstanceOf[js.Any], name.asInstanceOf[js.Any], subclass_constructor.asInstanceOf[js.Any])).asInstanceOf[SuperErrorI]
  /* static member */
  inline def subclass(name: String): SuperErrorI = ^.asInstanceOf[js.Dynamic].applyDynamic("subclass")(name.asInstanceOf[js.Any]).asInstanceOf[SuperErrorI]
  /* static member */
  inline def subclass(
    name: String,
    subclass_constructor: js.ThisFunction1[/* this */ SuperError, /* repeated */ Any, Unit]
  ): SuperErrorI = (^.asInstanceOf[js.Dynamic].applyDynamic("subclass")(name.asInstanceOf[js.Any], subclass_constructor.asInstanceOf[js.Any])).asInstanceOf[SuperErrorI]
  
  trait SuperError
    extends StObject
       with Error
       with /* k */ StringDictionary[Any] {
    
    @JSName("cause")
    var cause_SuperError: js.UndefOr[js.Error] = js.undefined
    
    def causedBy(err: js.Error): this.type
    
    var rootCause: js.UndefOr[js.Error] = js.undefined
  }
  object SuperError {
    
    inline def apply(causedBy: js.Error => SuperError, message: String, name: String): SuperError = {
      val __obj = js.Dynamic.literal(causedBy = js.Any.fromFunction1(causedBy), message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[SuperError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SuperError] (val x: Self) extends AnyVal {
      
      inline def setCause(value: js.Error): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
      
      inline def setCauseUndefined: Self = StObject.set(x, "cause", js.undefined)
      
      inline def setCausedBy(value: js.Error => SuperError): Self = StObject.set(x, "causedBy", js.Any.fromFunction1(value))
      
      inline def setRootCause(value: js.Error): Self = StObject.set(x, "rootCause", value.asInstanceOf[js.Any])
      
      inline def setRootCauseUndefined: Self = StObject.set(x, "rootCause", js.undefined)
    }
  }
  
  @js.native
  trait SuperErrorI
    extends StObject
       with /* k */ StringDictionary[Any]
       with Instantiable1[/* args (repeated) */ Any, SuperError] {
    
    var message: String = js.native
    
    var name: String = js.native
  }
}
