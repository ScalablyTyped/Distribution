package typings.superError

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("super-error", JSImport.Namespace)
  @js.native
  class ^ protected () extends SuperError {
    def this(args: js.Any*) = this()
  }
  
  /* static member */
  @JSImport("super-error", "subclass")
  @js.native
  def subclass(exports: js.Any, name: String): SuperErrorI = js.native
  /* static member */
  @JSImport("super-error", "subclass")
  @js.native
  def subclass(
    exports: js.Any,
    name: String,
    subclass_constructor: js.ThisFunction1[/* this */ SuperError, /* repeated */ js.Any, Unit]
  ): SuperErrorI = js.native
  /* static member */
  @JSImport("super-error", "subclass")
  @js.native
  def subclass(name: String): SuperErrorI = js.native
  /* static member */
  @JSImport("super-error", "subclass")
  @js.native
  def subclass(
    name: String,
    subclass_constructor: js.ThisFunction1[/* this */ SuperError, /* repeated */ js.Any, Unit]
  ): SuperErrorI = js.native
  
  @js.native
  trait SuperError
    extends Error
       with /* k */ StringDictionary[js.Any] {
    
    def causedBy(err: Error): this.type = js.native
  }
  object SuperError {
    
    @scala.inline
    def apply(causedBy: Error => SuperError, message: String, name: String): SuperError = {
      val __obj = js.Dynamic.literal(causedBy = js.Any.fromFunction1(causedBy), message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[SuperError]
    }
    
    @scala.inline
    implicit class SuperErrorMutableBuilder[Self <: SuperError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCausedBy(value: Error => SuperError): Self = StObject.set(x, "causedBy", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait SuperErrorI
    extends /* k */ StringDictionary[js.Any]
       with Instantiable1[/* args (repeated) */ js.Any, SuperError] {
    
    var message: String = js.native
    
    var name: String = js.native
  }
}
