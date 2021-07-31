package typings.uifabricUtilities

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cssMod {
  
  @JSImport("@uifabric/utilities/lib/css", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def css(args: ICssInput*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("css")(args.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type ICssInput = js.UndefOr[String | ISerializableObject | IDictionary | Null | Boolean]
  
  type IDictionary = StringDictionary[Boolean]
  
  trait ISerializableObject extends StObject {
    
    @JSName("toString")
    var toString_FISerializableObject: js.UndefOr[js.Function0[String]] = js.undefined
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
