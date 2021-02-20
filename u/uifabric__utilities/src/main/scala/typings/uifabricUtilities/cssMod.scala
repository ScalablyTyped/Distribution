package typings.uifabricUtilities

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cssMod {
  
  @JSImport("@uifabric/utilities/lib/css", "css")
  @js.native
  def css(args: ICssInput*): String = js.native
  
  type ICssInput = js.UndefOr[String | ISerializableObject | IDictionary | Null | Boolean]
  
  type IDictionary = StringDictionary[Boolean]
  
  @js.native
  trait ISerializableObject extends StObject {
    
    @JSName("toString")
    var toString_FISerializableObject: js.UndefOr[js.Function0[String]] = js.native
  }
  object ISerializableObject {
    
    @scala.inline
    def apply(): ISerializableObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ISerializableObject]
    }
    
    @scala.inline
    implicit class ISerializableObjectMutableBuilder[Self <: ISerializableObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setToString_(value: () => String): Self = StObject.set(x, "toString", js.Any.fromFunction0(value))
      
      @scala.inline
      def setToString_Undefined: Self = StObject.set(x, "toString", js.undefined)
    }
  }
}
