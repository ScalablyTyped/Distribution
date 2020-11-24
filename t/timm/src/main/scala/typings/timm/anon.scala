package typings.timm

import org.scalablytyped.runtime.TopLevel
import typings.std.Omit
import typings.timm.mod.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobalScope
@js.native
object anon extends js.Object {
  
  @js.native
  trait FnCall extends js.Object {
    
    def apply[T /* <: js.Object */](obj0: T): T = js.native
  }
  
  @js.native
  trait FnCallABC extends js.Object {
    
    def apply(a: js.Object, rest: (js.Object | Null)*): js.Object = js.native
    def apply[T /* <: js.Object */](a: T): T = js.native
    def apply[T /* <: js.Object */, U /* <: js.Object */](a: T, b: U): (Omit[T, /* keyof U */ String]) with U = js.native
    def apply[T /* <: js.Object */, V /* <: js.Object */](a: T, b: js.UndefOr[scala.Nothing], c: V): (Omit[T, /* keyof V */ String]) with V = js.native
    def apply[T /* <: js.Object */, V /* <: js.Object */](a: T, b: Null, c: V): (Omit[T, /* keyof V */ String]) with V = js.native
    def apply[T /* <: js.Object */, U /* <: js.Object */, V /* <: js.Object */](a: T, b: U, c: V): (Omit[(Omit[T, /* keyof U */ String]) with U, /* keyof V */ String]) with V = js.native
  }
  
  @js.native
  trait FnCallABRest extends js.Object {
    
    def apply(a: js.Object, b: js.Object, rest: (js.Object | Null)*): js.Object = js.native
    def apply[T /* <: js.Object */, U /* <: js.Object */](a: T, b: U): (Omit[U, /* keyof T */ String]) with T = js.native
  }
  
  @js.native
  trait FnCallArray extends js.Object {
    
    def apply[T](array: js.Array[T]): js.Array[T] = js.native
  }
  
  @js.native
  trait FnCallArrayIdx extends js.Object {
    
    def apply[T](array: js.Array[T], idx: Double): js.Array[T] = js.native
  }
  
  @js.native
  trait FnCallArrayIdxNewItem extends js.Object {
    
    def apply[T](array: js.Array[T], idx: Double, newItem: T): js.Array[T] = js.native
  }
  
  @js.native
  trait FnCallArrayIdxVal extends js.Object {
    
    def apply[T](array: js.Array[T], idx: Double, `val`: T): js.Array[T] = js.native
    def apply[T](array: js.Array[T], idx: Double, `val`: js.Array[T]): js.Array[T] = js.native
  }
  
  @js.native
  trait FnCallArrayVal extends js.Object {
    
    def apply[T](array: js.Array[T], `val`: T): js.Array[T] = js.native
    def apply[T](array: js.Array[T], `val`: js.Array[T]): js.Array[T] = js.native
  }
  
  @js.native
  trait FnCallObjAttrs extends js.Object {
    
    def apply[T /* <: js.Object */, K /* <: String */](obj: T, attrs: K): Omit[T, /* keyof {[ P in K ]: any} */ String] = js.native
    def apply[T /* <: js.Object */, K /* <: String */](obj: T, attrs: js.Array[K]): Omit[T, /* keyof {[ P in K ]: any} */ String] = js.native
  }
  
  @js.native
  trait FnCallObjKeyVal extends js.Object {
    
    def apply[V](obj: js.UndefOr[scala.Nothing], key: Double, `val`: V): js.Array[V] = js.native
    def apply[V](obj: js.Array[V], key: Double, `val`: V): js.Array[V] = js.native
    def apply[V](obj: Null, key: Double, `val`: V): js.Array[V] = js.native
    def apply[K /* <: String */, V](obj: js.UndefOr[scala.Nothing], key: K, `val`: V): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in K ]: V}
      */ typings.timm.timmStrings.FnCallObjKeyVal with TopLevel[js.Any] = js.native
    def apply[K /* <: String */, V](obj: Null, key: K, `val`: V): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in K ]: V}
      */ typings.timm.timmStrings.FnCallObjKeyVal with TopLevel[js.Any] = js.native
    def apply[T /* <: js.Object */, K /* <: String */, V](obj: T, key: K, `val`: V): (Omit[T, /* keyof {[ P in K ]: any} */ String]) with typings.timm.timmStrings.FnCallObjKeyVal with TopLevel[js.Any] = js.native
  }
  
  @js.native
  trait FnCallObjPath extends js.Object {
    
    def apply(obj: js.UndefOr[scala.Nothing], path: js.Array[Key]): js.UndefOr[scala.Nothing] = js.native
    def apply(obj: js.Object, path: js.Array[Key]): js.Any = js.native
    def apply(obj: Null, path: js.Array[Key]): Null = js.native
  }
}
