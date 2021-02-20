package typings.usePersistedState

import typings.react.mod.Dispatch
import typings.react.mod.SetStateAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply[S](): js.Tuple2[js.UndefOr[S], Dispatch[SetStateAction[js.UndefOr[S]]]] = js.native
    def apply[S](initialState: S): js.Tuple2[S, Dispatch[SetStateAction[S]]] = js.native
    def apply[S](initialState: js.Function0[S]): js.Tuple2[S, Dispatch[SetStateAction[S]]] = js.native
  }
  
  /* Inlined std.Pick<std.Storage, 'getItem' | 'setItem'> */
  @js.native
  trait PickStoragegetItemsetItem extends StObject {
    
    var getItem: js.Function1[/* key */ String, String | Null] = js.native
    
    var setItem: js.Function2[/* key */ String, /* value */ String, Unit] = js.native
  }
  object PickStoragegetItemsetItem {
    
    @scala.inline
    def apply(
      getItem: /* key */ String => String | Null,
      setItem: (/* key */ String, /* value */ String) => Unit
    ): PickStoragegetItemsetItem = {
      val __obj = js.Dynamic.literal(getItem = js.Any.fromFunction1(getItem), setItem = js.Any.fromFunction2(setItem))
      __obj.asInstanceOf[PickStoragegetItemsetItem]
    }
    
    @scala.inline
    implicit class PickStoragegetItemsetItemMutableBuilder[Self <: PickStoragegetItemsetItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetItem(value: /* key */ String => String | Null): Self = StObject.set(x, "getItem", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetItem(value: (/* key */ String, /* value */ String) => Unit): Self = StObject.set(x, "setItem", js.Any.fromFunction2(value))
    }
  }
}
