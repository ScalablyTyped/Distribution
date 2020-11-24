package typings.timm

import org.scalablytyped.runtime.TopLevel
import typings.std.Omit
import typings.timm.anon.FnCall
import typings.timm.anon.FnCallABC
import typings.timm.anon.FnCallABRest
import typings.timm.anon.FnCallArray
import typings.timm.anon.FnCallArrayIdx
import typings.timm.anon.FnCallArrayIdxNewItem
import typings.timm.anon.FnCallArrayIdxVal
import typings.timm.anon.FnCallArrayVal
import typings.timm.anon.FnCallObjAttrs
import typings.timm.anon.FnCallObjKeyVal
import typings.timm.anon.FnCallObjPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("timm", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def addDefaults(a: js.Object, b: js.Object, rest: (js.Object | Null)*): js.Object = js.native
  def addDefaults[T /* <: js.Object */, U /* <: js.Object */](a: T, b: U): (Omit[U, /* keyof T */ String]) with T = js.native
  
  def addFirst[T](array: js.Array[T], `val`: T): js.Array[T] = js.native
  def addFirst[T](array: js.Array[T], `val`: js.Array[T]): js.Array[T] = js.native
  
  def addLast[T](array: js.Array[T], `val`: T): js.Array[T] = js.native
  def addLast[T](array: js.Array[T], `val`: js.Array[T]): js.Array[T] = js.native
  
  def clone[T /* <: js.Object */](obj0: T): T = js.native
  
  def getIn(obj: js.UndefOr[scala.Nothing], path: js.Array[Key]): js.UndefOr[scala.Nothing] = js.native
  def getIn(obj: js.Object, path: js.Array[Key]): js.Any = js.native
  def getIn(obj: Null, path: js.Array[Key]): Null = js.native
  
  def insert[T](array: js.Array[T], idx: Double, `val`: T): js.Array[T] = js.native
  def insert[T](array: js.Array[T], idx: Double, `val`: js.Array[T]): js.Array[T] = js.native
  
  def merge(a: js.Object, rest: (js.Object | Null)*): js.Object = js.native
  def merge[T /* <: js.Object */](a: T): T = js.native
  def merge[T /* <: js.Object */, U /* <: js.Object */](a: T, b: U): (Omit[T, /* keyof U */ String]) with U = js.native
  def merge[T /* <: js.Object */, V /* <: js.Object */](a: T, b: js.UndefOr[scala.Nothing], c: V): (Omit[T, /* keyof V */ String]) with V = js.native
  def merge[T /* <: js.Object */, V /* <: js.Object */](a: T, b: Null, c: V): (Omit[T, /* keyof V */ String]) with V = js.native
  def merge[T /* <: js.Object */, U /* <: js.Object */, V /* <: js.Object */](a: T, b: U, c: V): (Omit[(Omit[T, /* keyof U */ String]) with U, /* keyof V */ String]) with V = js.native
  
  def mergeDeep(
    a: js.Object,
    b: js.UndefOr[js.Object | Null],
    c: js.UndefOr[js.Object | Null],
    d: js.UndefOr[js.Object | Null],
    e: js.UndefOr[js.Object | Null],
    f: js.UndefOr[js.Object | Null],
    rest: (js.Object | Null)*
  ): js.Object = js.native
  
  def mergeIn(
    a: js.Any,
    path: js.Array[Key],
    b: js.UndefOr[js.Object | Null],
    c: js.UndefOr[js.Object | Null],
    d: js.UndefOr[js.Object | Null],
    e: js.UndefOr[js.Object | Null],
    f: js.UndefOr[js.Object | Null],
    rest: (js.Object | Null)*
  ): js.Any = js.native
  
  def omit[T /* <: js.Object */, K /* <: String */](obj: T, attrs: K): Omit[T, /* keyof {[ P in K ]: any} */ String] = js.native
  def omit[T /* <: js.Object */, K /* <: String */](obj: T, attrs: js.Array[K]): Omit[T, /* keyof {[ P in K ]: any} */ String] = js.native
  
  def removeAt[T](array: js.Array[T], idx: Double): js.Array[T] = js.native
  
  def removeFirst[T](array: js.Array[T]): js.Array[T] = js.native
  
  def removeLast[T](array: js.Array[T]): js.Array[T] = js.native
  
  def replaceAt[T](array: js.Array[T], idx: Double, newItem: T): js.Array[T] = js.native
  
  def set[V](obj: js.UndefOr[scala.Nothing], key: Double, `val`: V): js.Array[V] = js.native
  def set[V](obj: js.Array[V], key: Double, `val`: V): js.Array[V] = js.native
  def set[V](obj: Null, key: Double, `val`: V): js.Array[V] = js.native
  def set[K /* <: String */, V](obj: js.UndefOr[scala.Nothing], key: K, `val`: V): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in K ]: V}
    */ typings.timm.timmStrings.set with TopLevel[js.Any] = js.native
  def set[K /* <: String */, V](obj: Null, key: K, `val`: V): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in K ]: V}
    */ typings.timm.timmStrings.set with TopLevel[js.Any] = js.native
  def set[T /* <: js.Object */, K /* <: String */, V](obj: T, key: K, `val`: V): (Omit[T, /* keyof {[ P in K ]: any} */ String]) with typings.timm.timmStrings.set with TopLevel[js.Any] = js.native
  
  def setIn(obj: js.UndefOr[scala.Nothing], path: js.Array[Key], `val`: js.Any): js.Any = js.native
  def setIn(obj: js.Object, path: js.Array[Key], `val`: js.Any): js.Any = js.native
  def setIn(obj: Null, path: js.Array[Key], `val`: js.Any): js.Any = js.native
  
  def update(obj: js.UndefOr[scala.Nothing], key: Key, fnUpdate: js.Function1[/* prevValue */ js.Any, _]): js.Any = js.native
  def update(obj: js.Object, key: Key, fnUpdate: js.Function1[/* prevValue */ js.Any, _]): js.Any = js.native
  def update(obj: Null, key: Key, fnUpdate: js.Function1[/* prevValue */ js.Any, _]): js.Any = js.native
  
  def updateIn(
    obj: js.UndefOr[scala.Nothing],
    path: js.Array[Key],
    fnUpdate: js.Function1[/* prevValue */ js.Any, _]
  ): js.Any = js.native
  def updateIn(obj: js.Object, path: js.Array[Key], fnUpdate: js.Function1[/* prevValue */ js.Any, _]): js.Any = js.native
  def updateIn(obj: Null, path: js.Array[Key], fnUpdate: js.Function1[/* prevValue */ js.Any, _]): js.Any = js.native
  
  @js.native
  object default extends js.Object {
    
    def addDefaults(a: js.Object, b: js.Object, rest: (js.Object | Null)*): js.Object = js.native
    def addDefaults[T /* <: js.Object */, U /* <: js.Object */](a: T, b: U): (Omit[U, /* keyof T */ String]) with T = js.native
    @JSName("addDefaults")
    var addDefaults_Original: FnCallABRest = js.native
    
    def addFirst[T](array: js.Array[T], `val`: T): js.Array[T] = js.native
    def addFirst[T](array: js.Array[T], `val`: js.Array[T]): js.Array[T] = js.native
    @JSName("addFirst")
    var addFirst_Original: FnCallArrayVal = js.native
    
    def addLast[T](array: js.Array[T], `val`: T): js.Array[T] = js.native
    def addLast[T](array: js.Array[T], `val`: js.Array[T]): js.Array[T] = js.native
    @JSName("addLast")
    var addLast_Original: FnCallArrayVal = js.native
    
    def clone[T /* <: js.Object */](obj0: T): T = js.native
    @JSName("clone")
    var clone_Original: FnCall = js.native
    
    def getIn(obj: js.UndefOr[scala.Nothing], path: js.Array[Key]): js.UndefOr[scala.Nothing] = js.native
    def getIn(obj: js.Object, path: js.Array[Key]): js.Any = js.native
    def getIn(obj: Null, path: js.Array[Key]): Null = js.native
    @JSName("getIn")
    var getIn_Original: FnCallObjPath = js.native
    
    def insert[T](array: js.Array[T], idx: Double, `val`: T): js.Array[T] = js.native
    def insert[T](array: js.Array[T], idx: Double, `val`: js.Array[T]): js.Array[T] = js.native
    @JSName("insert")
    var insert_Original: FnCallArrayIdxVal = js.native
    
    def merge(a: js.Object, rest: (js.Object | Null)*): js.Object = js.native
    def merge[T /* <: js.Object */](a: T): T = js.native
    def merge[T /* <: js.Object */, U /* <: js.Object */](a: T, b: U): (Omit[T, /* keyof U */ String]) with U = js.native
    def merge[T /* <: js.Object */, V /* <: js.Object */](a: T, b: js.UndefOr[scala.Nothing], c: V): (Omit[T, /* keyof V */ String]) with V = js.native
    def merge[T /* <: js.Object */, V /* <: js.Object */](a: T, b: Null, c: V): (Omit[T, /* keyof V */ String]) with V = js.native
    def merge[T /* <: js.Object */, U /* <: js.Object */, V /* <: js.Object */](a: T, b: U, c: V): (Omit[(Omit[T, /* keyof U */ String]) with U, /* keyof V */ String]) with V = js.native
    
    def mergeDeep(
      a: js.Object,
      b: js.UndefOr[js.Object | Null],
      c: js.UndefOr[js.Object | Null],
      d: js.UndefOr[js.Object | Null],
      e: js.UndefOr[js.Object | Null],
      f: js.UndefOr[js.Object | Null],
      rest: (js.Object | Null)*
    ): js.Object = js.native
    @JSName("mergeDeep")
    var mergeDeep_Original: js.Function7[
        /* a */ js.Object, 
        /* b */ js.UndefOr[js.Object | Null], 
        /* c */ js.UndefOr[js.Object | Null], 
        /* d */ js.UndefOr[js.Object | Null], 
        /* e */ js.UndefOr[js.Object | Null], 
        /* f */ js.UndefOr[js.Object | Null], 
        /* repeated */ js.Object | Null, 
        js.Object
      ] = js.native
    
    def mergeIn(
      a: js.Any,
      path: js.Array[Key],
      b: js.UndefOr[js.Object | Null],
      c: js.UndefOr[js.Object | Null],
      d: js.UndefOr[js.Object | Null],
      e: js.UndefOr[js.Object | Null],
      f: js.UndefOr[js.Object | Null],
      rest: (js.Object | Null)*
    ): js.Any = js.native
    @JSName("mergeIn")
    var mergeIn_Original: js.Function8[
        /* a */ js.Any, 
        /* path */ js.Array[Key], 
        /* b */ js.UndefOr[js.Object | Null], 
        /* c */ js.UndefOr[js.Object | Null], 
        /* d */ js.UndefOr[js.Object | Null], 
        /* e */ js.UndefOr[js.Object | Null], 
        /* f */ js.UndefOr[js.Object | Null], 
        /* repeated */ js.Object | Null, 
        _
      ] = js.native
    
    @JSName("merge")
    var merge_Original: FnCallABC = js.native
    
    def omit[T /* <: js.Object */, K /* <: String */](obj: T, attrs: K): Omit[T, /* keyof {[ P in K ]: any} */ String] = js.native
    def omit[T /* <: js.Object */, K /* <: String */](obj: T, attrs: js.Array[K]): Omit[T, /* keyof {[ P in K ]: any} */ String] = js.native
    @JSName("omit")
    var omit_Original: FnCallObjAttrs = js.native
    
    def removeAt[T](array: js.Array[T], idx: Double): js.Array[T] = js.native
    @JSName("removeAt")
    var removeAt_Original: FnCallArrayIdx = js.native
    
    def removeFirst[T](array: js.Array[T]): js.Array[T] = js.native
    @JSName("removeFirst")
    var removeFirst_Original: FnCallArray = js.native
    
    def removeLast[T](array: js.Array[T]): js.Array[T] = js.native
    @JSName("removeLast")
    var removeLast_Original: FnCallArray = js.native
    
    def replaceAt[T](array: js.Array[T], idx: Double, newItem: T): js.Array[T] = js.native
    @JSName("replaceAt")
    var replaceAt_Original: FnCallArrayIdxNewItem = js.native
    
    def set[V](obj: js.UndefOr[scala.Nothing], key: Double, `val`: V): js.Array[V] = js.native
    def set[V](obj: js.Array[V], key: Double, `val`: V): js.Array[V] = js.native
    def set[V](obj: Null, key: Double, `val`: V): js.Array[V] = js.native
    def set[K /* <: String */, V](obj: js.UndefOr[scala.Nothing], key: K, `val`: V): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in K ]: V}
      */ typings.timm.timmStrings.default with TopLevel[js.Any] = js.native
    def set[K /* <: String */, V](obj: Null, key: K, `val`: V): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in K ]: V}
      */ typings.timm.timmStrings.default with TopLevel[js.Any] = js.native
    def set[T /* <: js.Object */, K /* <: String */, V](obj: T, key: K, `val`: V): (Omit[T, /* keyof {[ P in K ]: any} */ String]) with typings.timm.timmStrings.default with TopLevel[js.Any] = js.native
    
    def setIn(obj: js.UndefOr[scala.Nothing], path: js.Array[Key], `val`: js.Any): js.Any = js.native
    def setIn(obj: js.Object, path: js.Array[Key], `val`: js.Any): js.Any = js.native
    def setIn(obj: Null, path: js.Array[Key], `val`: js.Any): js.Any = js.native
    @JSName("setIn")
    var setIn_Original: js.Function3[/* obj */ js.UndefOr[js.Object | Null], /* path */ js.Array[Key], /* val */ js.Any, _] = js.native
    
    @JSName("set")
    var set_Original: FnCallObjKeyVal = js.native
    
    def update(obj: js.UndefOr[scala.Nothing], key: Key, fnUpdate: js.Function1[/* prevValue */ js.Any, _]): js.Any = js.native
    def update(obj: js.Object, key: Key, fnUpdate: js.Function1[/* prevValue */ js.Any, _]): js.Any = js.native
    def update(obj: Null, key: Key, fnUpdate: js.Function1[/* prevValue */ js.Any, _]): js.Any = js.native
    
    def updateIn(
      obj: js.UndefOr[scala.Nothing],
      path: js.Array[Key],
      fnUpdate: js.Function1[/* prevValue */ js.Any, _]
    ): js.Any = js.native
    def updateIn(obj: js.Object, path: js.Array[Key], fnUpdate: js.Function1[/* prevValue */ js.Any, _]): js.Any = js.native
    def updateIn(obj: Null, path: js.Array[Key], fnUpdate: js.Function1[/* prevValue */ js.Any, _]): js.Any = js.native
    @JSName("updateIn")
    var updateIn_Original: js.Function3[
        /* obj */ js.UndefOr[js.Object | Null], 
        /* path */ js.Array[Key], 
        /* fnUpdate */ js.Function1[/* prevValue */ js.Any, _], 
        _
      ] = js.native
    
    @JSName("update")
    var update_Original: js.Function3[
        /* obj */ js.UndefOr[js.Object | Null], 
        /* key */ Key, 
        /* fnUpdate */ js.Function1[/* prevValue */ js.Any, _], 
        _
      ] = js.native
  }
  
  type Key = String | Double
}
