package typings.webdriverio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildCommandsElementAddValueMod {
  
  @JSImport("webdriverio/build/commands/element/addValue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(value: js.Array[Value]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def default(value: js.Array[Value], param2: CommandOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], param2.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  inline def default(value: Value): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  inline def default(value: Value, param2: CommandOptions): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], param2.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  trait CommandOptions extends StObject {
    
    var translateToUnicode: js.UndefOr[Boolean] = js.undefined
  }
  object CommandOptions {
    
    inline def apply(): CommandOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommandOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommandOptions] (val x: Self) extends AnyVal {
      
      inline def setTranslateToUnicode(value: Boolean): Self = StObject.set(x, "translateToUnicode", value.asInstanceOf[js.Any])
      
      inline def setTranslateToUnicodeUndefined: Self = StObject.set(x, "translateToUnicode", js.undefined)
    }
  }
  
  type Value = String | Double
}
