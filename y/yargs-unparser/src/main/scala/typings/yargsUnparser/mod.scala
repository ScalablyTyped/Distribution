package typings.yargsUnparser

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("yargs-unparser", JSImport.Namespace)
  @js.native
  val ^ : Unparser = js.native
  
  trait Arguments
    extends StObject
       with /* argName */ StringDictionary[Any] {
    
    @JSName("_")
    var _underscore: js.Array[String]
  }
  object Arguments {
    
    inline def apply(_underscore: js.Array[String]): Arguments = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("_")(_underscore.asInstanceOf[js.Any])
      __obj.asInstanceOf[Arguments]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Arguments] (val x: Self) extends AnyVal {
      
      inline def set_underscore(value: js.Array[String]): Self = StObject.set(x, "_", value.asInstanceOf[js.Any])
      
      inline def set_underscoreVarargs(value: String*): Self = StObject.set(x, "_", js.Array(value*))
    }
  }
  
  type Argv = js.Array[String]
  
  type Unparser = js.Function2[/* args */ Arguments, /* opts */ js.UndefOr[UnparserOptions], Argv]
  
  trait UnparserOptions extends StObject {
    
    var default: js.UndefOr[Record[String, String]] = js.undefined
    
    var alias: js.UndefOr[Record[String, js.Array[String]]] = js.undefined
    
    var command: js.UndefOr[String] = js.undefined
  }
  object UnparserOptions {
    
    inline def apply(): UnparserOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnparserOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UnparserOptions] (val x: Self) extends AnyVal {
      
      inline def setAlias(value: Record[String, js.Array[String]]): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
      
      inline def setAliasUndefined: Self = StObject.set(x, "alias", js.undefined)
      
      inline def setCommand(value: String): Self = StObject.set(x, "command", value.asInstanceOf[js.Any])
      
      inline def setCommandUndefined: Self = StObject.set(x, "command", js.undefined)
      
      inline def setDefault(value: Record[String, String]): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    }
  }
  
  type _To = Unparser
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Unparser = ^
}
