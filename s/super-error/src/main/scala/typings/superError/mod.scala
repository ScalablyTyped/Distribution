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
  class ^ protected ()
    extends StObject
       with SuperError {
    def this(args: js.Any*) = this()
    
    /* CompleteClass */
    override def causedBy(err: Error): this.type = js.native
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
  @JSImport("super-error", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def subclass(exports: js.Any, name: String): SuperErrorI = (^.asInstanceOf[js.Dynamic].applyDynamic("subclass")(exports.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[SuperErrorI]
  /* static member */
  inline def subclass(
    exports: js.Any,
    name: String,
    subclass_constructor: js.ThisFunction1[/* this */ SuperError, /* repeated */ js.Any, Unit]
  ): SuperErrorI = (^.asInstanceOf[js.Dynamic].applyDynamic("subclass")(exports.asInstanceOf[js.Any], name.asInstanceOf[js.Any], subclass_constructor.asInstanceOf[js.Any])).asInstanceOf[SuperErrorI]
  /* static member */
  inline def subclass(name: String): SuperErrorI = ^.asInstanceOf[js.Dynamic].applyDynamic("subclass")(name.asInstanceOf[js.Any]).asInstanceOf[SuperErrorI]
  /* static member */
  inline def subclass(
    name: String,
    subclass_constructor: js.ThisFunction1[/* this */ SuperError, /* repeated */ js.Any, Unit]
  ): SuperErrorI = (^.asInstanceOf[js.Dynamic].applyDynamic("subclass")(name.asInstanceOf[js.Any], subclass_constructor.asInstanceOf[js.Any])).asInstanceOf[SuperErrorI]
  
  trait SuperError
    extends StObject
       with Error
       with /* k */ StringDictionary[js.Any] {
    
    def causedBy(err: Error): this.type
  }
  object SuperError {
    
    inline def apply(causedBy: Error => SuperError, message: String, name: String): SuperError = {
      val __obj = js.Dynamic.literal(causedBy = js.Any.fromFunction1(causedBy), message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[SuperError]
    }
    
    extension [Self <: SuperError](x: Self) {
      
      inline def setCausedBy(value: Error => SuperError): Self = StObject.set(x, "causedBy", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait SuperErrorI
    extends StObject
       with /* k */ StringDictionary[js.Any]
       with Instantiable1[/* args (repeated) */ js.Any, SuperError] {
    
    var message: String = js.native
    
    var name: String = js.native
  }
}
