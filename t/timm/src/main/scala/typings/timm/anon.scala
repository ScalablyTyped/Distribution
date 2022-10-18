package typings.timm

import typings.std.Omit
import typings.timm.mod.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply[T /* <: js.Object */](obj0: T): T = js.native
  }
  
  @js.native
  trait FnCallABC extends StObject {
    
    def apply(a: js.Object, rest: (js.Object | Null)*): js.Object = js.native
    def apply[T /* <: js.Object */](a: T): T = js.native
    def apply[T /* <: js.Object */, U /* <: js.Object */](a: T, b: U): (Omit[T, /* keyof U */ String]) & U = js.native
    def apply[T /* <: js.Object */, V /* <: js.Object */](a: T, b: Null, c: V): (Omit[T, /* keyof V */ String]) & V = js.native
    def apply[T /* <: js.Object */, V /* <: js.Object */](a: T, b: Unit, c: V): (Omit[T, /* keyof V */ String]) & V = js.native
    def apply[T /* <: js.Object */, U /* <: js.Object */, V /* <: js.Object */](a: T, b: U, c: V): (Omit[(Omit[T, /* keyof U */ String]) & U, /* keyof V */ String]) & V = js.native
  }
  
  @js.native
  trait FnCallABRest extends StObject {
    
    def apply(a: js.Object, b: js.Object, rest: (js.Object | Null)*): js.Object = js.native
    def apply[T /* <: js.Object */, U /* <: js.Object */](a: T, b: U): (Omit[U, /* keyof T */ String]) & T = js.native
  }
  
  @js.native
  trait FnCallArray extends StObject {
    
    def apply[T](array: js.Array[T]): js.Array[T] = js.native
  }
  
  @js.native
  trait FnCallArrayIdx extends StObject {
    
    def apply[T](array: js.Array[T], idx: Double): js.Array[T] = js.native
  }
  
  @js.native
  trait FnCallArrayIdxNewItem extends StObject {
    
    def apply[T](array: js.Array[T], idx: Double, newItem: T): js.Array[T] = js.native
  }
  
  @js.native
  trait FnCallArrayIdxVal extends StObject {
    
    def apply[T](array: js.Array[T], idx: Double, `val`: T): js.Array[T] = js.native
    def apply[T](array: js.Array[T], idx: Double, `val`: js.Array[T]): js.Array[T] = js.native
  }
  
  @js.native
  trait FnCallArrayVal extends StObject {
    
    def apply[T](array: js.Array[T], `val`: T): js.Array[T] = js.native
    def apply[T](array: js.Array[T], `val`: js.Array[T]): js.Array[T] = js.native
  }
  
  @js.native
  trait FnCallObjAttrs extends StObject {
    
    def apply[T /* <: js.Object */, K /* <: String */](obj: T, attrs: K): Omit[T, /* keyof {[ P in K ]: any} */ String] = js.native
    def apply[T /* <: js.Object */, K /* <: String */](obj: T, attrs: js.Array[K]): Omit[T, /* keyof {[ P in K ]: any} */ String] = js.native
  }
  
  @js.native
  trait FnCallObjKeyVal extends StObject {
    
    def apply[V](obj: js.Array[V], key: Double, `val`: V): js.Array[V] = js.native
    def apply[V](obj: Null, key: Double, `val`: V): js.Array[V] = js.native
    def apply[V](obj: Unit, key: Double, `val`: V): js.Array[V] = js.native
    def apply[K /* <: String */, V](obj: Null, key: K, `val`: V): /* import warning: importer.ImportType#apply Failed type conversion: {[ P in K ]: V} */ js.Any = js.native
    def apply[K /* <: String */, V](obj: Unit, key: K, `val`: V): /* import warning: importer.ImportType#apply Failed type conversion: {[ P in K ]: V} */ js.Any = js.native
    def apply[T /* <: js.Object */, K /* <: String */, V](obj: T, key: K, `val`: V): (Omit[T, /* keyof {[ P in K ]: any} */ String]) & (/* import warning: importer.ImportType#apply Failed type conversion: {[ P in K ]: V} */ js.Any) = js.native
  }
  
  @js.native
  trait FnCallObjPath extends StObject {
    
    def apply(obj: js.Object, path: js.Array[Key]): Any = js.native
    def apply(obj: Null, path: js.Array[Key]): Null = js.native
    def apply(obj: Unit, path: js.Array[Key]): Unit = js.native
  }
}
