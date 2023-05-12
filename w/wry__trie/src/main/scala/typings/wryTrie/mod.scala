package typings.wryTrie

import typings.std.IArguments
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@wry/trie", "Trie")
  @js.native
  open class Trie[Data] () extends StObject {
    def this(weakness: Boolean) = this()
    def this(weakness: Boolean, makeData: js.Function1[/* array */ js.Array[Any], Data]) = this()
    def this(weakness: Unit, makeData: js.Function1[/* array */ js.Array[Any], Data]) = this()
    
    /* private */ var data: Any = js.native
    
    /* private */ var getChildTrie: Any = js.native
    
    def lookup[T /* <: js.Array[Any] */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param array because its type T is not an array type */ array: T
    ): Data = js.native
    
    def lookupArray[T /* <: IArguments | js.Array[Any] */](array: T): Data = js.native
    
    /* private */ var makeData: Any = js.native
    
    def peek[T /* <: js.Array[Any] */](
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param array because its type T is not an array type */ array: T
    ): js.UndefOr[Data] = js.native
    
    def peekArray[T /* <: IArguments | js.Array[Any] */](array: T): js.UndefOr[Data] = js.native
    
    /* private */ var strong: Any = js.native
    
    /* private */ var weak: Any = js.native
    
    /* private */ var weakness: Any = js.native
  }
}
