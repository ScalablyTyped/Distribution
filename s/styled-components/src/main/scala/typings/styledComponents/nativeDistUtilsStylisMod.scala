package typings.styledComponents

import typings.styledComponents.anon.Prefix
import typings.styledComponents.nativeDistTypesMod.Stringifier
import typings.stylis.mod.Middleware_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativeDistUtilsStylisMod {
  
  @JSImport("styled-components/native/dist/utils/stylis", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Stringifier = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Stringifier]
  inline def default(param0: StylisInstanceConstructorArgs): Stringifier = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(param0.asInstanceOf[js.Any]).asInstanceOf[Stringifier]
  
  trait StylisInstanceConstructorArgs extends StObject {
    
    var options: js.UndefOr[Prefix] = js.undefined
    
    var plugins: js.UndefOr[js.Array[Middleware_]] = js.undefined
  }
  object StylisInstanceConstructorArgs {
    
    inline def apply(): StylisInstanceConstructorArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StylisInstanceConstructorArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StylisInstanceConstructorArgs] (val x: Self) extends AnyVal {
      
      inline def setOptions(value: Prefix): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setPlugins(value: js.Array[Middleware_]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: Middleware_ *): Self = StObject.set(x, "plugins", js.Array(value*))
    }
  }
}
