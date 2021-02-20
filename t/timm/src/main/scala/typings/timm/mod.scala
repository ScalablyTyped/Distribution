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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    @JSImport("timm", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("timm", "default.addDefaults")
    @js.native
    def addDefaults: FnCallABRest = js.native
    @JSImport("timm", "default.addDefaults")
    @js.native
    def addDefaults(a: js.Object, b: js.Object, rest: (js.Object | Null)*): js.Object = js.native
    @JSImport("timm", "default.addDefaults")
    @js.native
    def addDefaults[T /* <: js.Object */, U /* <: js.Object */](a: T, b: U): (Omit[U, /* keyof T */ String]) with T = js.native
    @scala.inline
    def addDefaults_=(x: FnCallABRest): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("addDefaults")(x.asInstanceOf[js.Any])
    
    @JSImport("timm", "default.addFirst")
    @js.native
    def addFirst: FnCallArrayVal = js.native
    @JSImport("timm", "default.addFirst")
    @js.native
    def addFirst[T](array: js.Array[T], `val`: T): js.Array[T] = js.native
    @JSImport("timm", "default.addFirst")
    @js.native
    def addFirst[T](array: js.Array[T], `val`: js.Array[T]): js.Array[T] = js.native
    @scala.inline
    def addFirst_=(x: FnCallArrayVal): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("addFirst")(x.asInstanceOf[js.Any])
    
    @JSImport("timm", "default.addLast")
    @js.native
    def addLast: FnCallArrayVal = js.native
    @JSImport("timm", "default.addLast")
    @js.native
    def addLast[T](array: js.Array[T], `val`: T): js.Array[T] = js.native
    @JSImport("timm", "default.addLast")
    @js.native
    def addLast[T](array: js.Array[T], `val`: js.Array[T]): js.Array[T] = js.native
    @scala.inline
    def addLast_=(x: FnCallArrayVal): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("addLast")(x.asInstanceOf[js.Any])
    
    @JSImport("timm", "default.clone")
    @js.native
    def clone_ : FnCall = js.native
    @JSImport("timm", "default.clone")
    @js.native
    def clone_[T /* <: js.Object */](obj0: T): T = js.native
    
    @scala.inline
    def clone__=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clone")(x.asInstanceOf[js.Any])
    
    @JSImport("timm", "default.getIn")
    @js.native
    def getIn: FnCallObjPath = js.native
    @JSImport("timm", "default.getIn")
    @js.native
    def getIn(obj: js.UndefOr[scala.Nothing], path: js.Array[Key]): js.UndefOr[scala.Nothing] = js.native
    @JSImport("timm", "default.getIn")
    @js.native
    def getIn(obj: js.Object, path: js.Array[Key]): js.Any = js.native
    @JSImport("timm", "default.getIn")
    @js.native
    def getIn(obj: Null, path: js.Array[Key]): Null = js.native
    @scala.inline
    def getIn_=(x: FnCallObjPath): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getIn")(x.asInstanceOf[js.Any])
    
    @JSImport("timm", "default.insert")
    @js.native
    def insert: FnCallArrayIdxVal = js.native
    @JSImport("timm", "default.insert")
    @js.native
    def insert[T](array: js.Array[T], idx: Double, `val`: T): js.Array[T] = js.native
    @JSImport("timm", "default.insert")
    @js.native
    def insert[T](array: js.Array[T], idx: Double, `val`: js.Array[T]): js.Array[T] = js.native
    @scala.inline
    def insert_=(x: FnCallArrayIdxVal): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("insert")(x.asInstanceOf[js.Any])
    
    @JSImport("timm", "default.merge")
    @js.native
    def merge: FnCallABC = js.native
    @JSImport("timm", "default.merge")
    @js.native
    def merge(a: js.Object, rest: (js.Object | Null)*): js.Object = js.native
    @JSImport("timm", "default.merge")
    @js.native
    def merge[T /* <: js.Object */](a: T): T = js.native
    @JSImport("timm", "default.merge")
    @js.native
    def merge[T /* <: js.Object */, U /* <: js.Object */](a: T, b: U): (Omit[T, /* keyof U */ String]) with U = js.native
    @JSImport("timm", "default.merge")
    @js.native
    def merge[T /* <: js.Object */, V /* <: js.Object */](a: T, b: js.UndefOr[scala.Nothing], c: V): (Omit[T, /* keyof V */ String]) with V = js.native
    @JSImport("timm", "default.merge")
    @js.native
    def merge[T /* <: js.Object */, V /* <: js.Object */](a: T, b: Null, c: V): (Omit[T, /* keyof V */ String]) with V = js.native
    @JSImport("timm", "default.merge")
    @js.native
    def merge[T /* <: js.Object */, U /* <: js.Object */, V /* <: js.Object */](a: T, b: U, c: V): (Omit[(Omit[T, /* keyof U */ String]) with U, /* keyof V */ String]) with V = js.native
    
    @JSImport("timm", "default.mergeDeep")
    @js.native
    def mergeDeep: js.Function7[
        /* a */ js.Object, 
        /* b */ js.UndefOr[js.Object | Null], 
        /* c */ js.UndefOr[js.Object | Null], 
        /* d */ js.UndefOr[js.Object | Null], 
        /* e */ js.UndefOr[js.Object | Null], 
        /* f */ js.UndefOr[js.Object | Null], 
        /* repeated */ js.Object | Null, 
        js.Object
      ] = js.native
    @JSImport("timm", "default.mergeDeep")
    @js.native
    def mergeDeep(
      a: js.Object,
      b: js.UndefOr[js.Object | Null],
      c: js.UndefOr[js.Object | Null],
      d: js.UndefOr[js.Object | Null],
      e: js.UndefOr[js.Object | Null],
      f: js.UndefOr[js.Object | Null],
      rest: (js.Object | Null)*
    ): js.Object = js.native
    @scala.inline
    def mergeDeep_=(
      x: js.Function7[
          /* a */ js.Object, 
          /* b */ js.UndefOr[js.Object | Null], 
          /* c */ js.UndefOr[js.Object | Null], 
          /* d */ js.UndefOr[js.Object | Null], 
          /* e */ js.UndefOr[js.Object | Null], 
          /* f */ js.UndefOr[js.Object | Null], 
          /* repeated */ js.Object | Null, 
          js.Object
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mergeDeep")(x.asInstanceOf[js.Any])
    
    @JSImport("timm", "default.mergeIn")
    @js.native
    def mergeIn: js.Function8[
        /* a */ js.Any, 
        /* path */ js.Array[Key], 
        /* b */ js.UndefOr[js.Object | Null], 
        /* c */ js.UndefOr[js.Object | Null], 
        /* d */ js.UndefOr[js.Object | Null], 
        /* e */ js.UndefOr[js.Object | Null], 
        /* f */ js.UndefOr[js.Object | Null], 
        /* repeated */ js.Object | Null, 
        js.Any
      ] = js.native
    @JSImport("timm", "default.mergeIn")
    @js.native
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
    @scala.inline
    def mergeIn_=(
      x: js.Function8[
          /* a */ js.Any, 
          /* path */ js.Array[Key], 
          /* b */ js.UndefOr[js.Object | Null], 
          /* c */ js.UndefOr[js.Object | Null], 
          /* d */ js.UndefOr[js.Object | Null], 
          /* e */ js.UndefOr[js.Object | Null], 
          /* f */ js.UndefOr[js.Object | Null], 
          /* repeated */ js.Object | Null, 
          js.Any
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mergeIn")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def merge_=(x: FnCallABC): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("merge")(x.asInstanceOf[js.Any])
    
    @JSImport("timm", "default.omit")
    @js.native
    def omit: FnCallObjAttrs = js.native
    @JSImport("timm", "default.omit")
    @js.native
    def omit[T /* <: js.Object */, K /* <: String */](obj: T, attrs: K): Omit[T, /* keyof {[ P in K ]: any} */ String] = js.native
    @JSImport("timm", "default.omit")
    @js.native
    def omit[T /* <: js.Object */, K /* <: String */](obj: T, attrs: js.Array[K]): Omit[T, /* keyof {[ P in K ]: any} */ String] = js.native
    @scala.inline
    def omit_=(x: FnCallObjAttrs): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("omit")(x.asInstanceOf[js.Any])
    
    @JSImport("timm", "default.removeAt")
    @js.native
    def removeAt: FnCallArrayIdx = js.native
    @JSImport("timm", "default.removeAt")
    @js.native
    def removeAt[T](array: js.Array[T], idx: Double): js.Array[T] = js.native
    @scala.inline
    def removeAt_=(x: FnCallArrayIdx): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("removeAt")(x.asInstanceOf[js.Any])
    
    @JSImport("timm", "default.removeFirst")
    @js.native
    def removeFirst: FnCallArray = js.native
    @JSImport("timm", "default.removeFirst")
    @js.native
    def removeFirst[T](array: js.Array[T]): js.Array[T] = js.native
    @scala.inline
    def removeFirst_=(x: FnCallArray): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("removeFirst")(x.asInstanceOf[js.Any])
    
    @JSImport("timm", "default.removeLast")
    @js.native
    def removeLast: FnCallArray = js.native
    @JSImport("timm", "default.removeLast")
    @js.native
    def removeLast[T](array: js.Array[T]): js.Array[T] = js.native
    @scala.inline
    def removeLast_=(x: FnCallArray): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("removeLast")(x.asInstanceOf[js.Any])
    
    @JSImport("timm", "default.replaceAt")
    @js.native
    def replaceAt: FnCallArrayIdxNewItem = js.native
    @JSImport("timm", "default.replaceAt")
    @js.native
    def replaceAt[T](array: js.Array[T], idx: Double, newItem: T): js.Array[T] = js.native
    @scala.inline
    def replaceAt_=(x: FnCallArrayIdxNewItem): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("replaceAt")(x.asInstanceOf[js.Any])
    
    @JSImport("timm", "default.set")
    @js.native
    def set: FnCallObjKeyVal = js.native
    @JSImport("timm", "default.set")
    @js.native
    def set[V](obj: js.UndefOr[scala.Nothing], key: Double, `val`: V): js.Array[V] = js.native
    @JSImport("timm", "default.set")
    @js.native
    def set[V](obj: js.Array[V], key: Double, `val`: V): js.Array[V] = js.native
    @JSImport("timm", "default.set")
    @js.native
    def set[V](obj: Null, key: Double, `val`: V): js.Array[V] = js.native
    @JSImport("timm", "default.set")
    @js.native
    def set[K /* <: String */, V](obj: js.UndefOr[scala.Nothing], key: K, `val`: V): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in K ]: V}
      */ typings.timm.timmStrings.set with TopLevel[js.Any] = js.native
    @JSImport("timm", "default.set")
    @js.native
    def set[K /* <: String */, V](obj: Null, key: K, `val`: V): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in K ]: V}
      */ typings.timm.timmStrings.set with TopLevel[js.Any] = js.native
    @JSImport("timm", "default.set")
    @js.native
    def set[T /* <: js.Object */, K /* <: String */, V](obj: T, key: K, `val`: V): (Omit[T, /* keyof {[ P in K ]: any} */ String]) with typings.timm.timmStrings.set with TopLevel[js.Any] = js.native
    
    @JSImport("timm", "default.setIn")
    @js.native
    def setIn: js.Function3[
        /* obj */ js.UndefOr[js.Object | Null], 
        /* path */ js.Array[Key], 
        /* val */ js.Any, 
        js.Any
      ] = js.native
    @JSImport("timm", "default.setIn")
    @js.native
    def setIn(obj: js.UndefOr[scala.Nothing], path: js.Array[Key], `val`: js.Any): js.Any = js.native
    @JSImport("timm", "default.setIn")
    @js.native
    def setIn(obj: js.Object, path: js.Array[Key], `val`: js.Any): js.Any = js.native
    @JSImport("timm", "default.setIn")
    @js.native
    def setIn(obj: Null, path: js.Array[Key], `val`: js.Any): js.Any = js.native
    @scala.inline
    def setIn_=(
      x: js.Function3[
          /* obj */ js.UndefOr[js.Object | Null], 
          /* path */ js.Array[Key], 
          /* val */ js.Any, 
          js.Any
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("setIn")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def set_=(x: FnCallObjKeyVal): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("set")(x.asInstanceOf[js.Any])
    
    @JSImport("timm", "default.update")
    @js.native
    def update: js.Function3[
        /* obj */ js.UndefOr[js.Object | Null], 
        /* key */ Key, 
        /* fnUpdate */ js.Function1[/* prevValue */ js.Any, js.Any], 
        js.Any
      ] = js.native
    @JSImport("timm", "default.update")
    @js.native
    def update(obj: js.UndefOr[scala.Nothing], key: Key, fnUpdate: js.Function1[/* prevValue */ js.Any, _]): js.Any = js.native
    @JSImport("timm", "default.update")
    @js.native
    def update(obj: js.Object, key: Key, fnUpdate: js.Function1[/* prevValue */ js.Any, _]): js.Any = js.native
    @JSImport("timm", "default.update")
    @js.native
    def update(obj: Null, key: Key, fnUpdate: js.Function1[/* prevValue */ js.Any, _]): js.Any = js.native
    
    @JSImport("timm", "default.updateIn")
    @js.native
    def updateIn: js.Function3[
        /* obj */ js.UndefOr[js.Object | Null], 
        /* path */ js.Array[Key], 
        /* fnUpdate */ js.Function1[/* prevValue */ js.Any, js.Any], 
        js.Any
      ] = js.native
    @JSImport("timm", "default.updateIn")
    @js.native
    def updateIn(
      obj: js.UndefOr[scala.Nothing],
      path: js.Array[Key],
      fnUpdate: js.Function1[/* prevValue */ js.Any, _]
    ): js.Any = js.native
    @JSImport("timm", "default.updateIn")
    @js.native
    def updateIn(obj: js.Object, path: js.Array[Key], fnUpdate: js.Function1[/* prevValue */ js.Any, _]): js.Any = js.native
    @JSImport("timm", "default.updateIn")
    @js.native
    def updateIn(obj: Null, path: js.Array[Key], fnUpdate: js.Function1[/* prevValue */ js.Any, _]): js.Any = js.native
    @scala.inline
    def updateIn_=(
      x: js.Function3[
          /* obj */ js.UndefOr[js.Object | Null], 
          /* path */ js.Array[Key], 
          /* fnUpdate */ js.Function1[/* prevValue */ js.Any, js.Any], 
          js.Any
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("updateIn")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def update_=(
      x: js.Function3[
          /* obj */ js.UndefOr[js.Object | Null], 
          /* key */ Key, 
          /* fnUpdate */ js.Function1[/* prevValue */ js.Any, js.Any], 
          js.Any
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("update")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("timm", "addDefaults")
  @js.native
  def addDefaults(a: js.Object, b: js.Object, rest: (js.Object | Null)*): js.Object = js.native
  @JSImport("timm", "addDefaults")
  @js.native
  def addDefaults[T /* <: js.Object */, U /* <: js.Object */](a: T, b: U): (Omit[U, /* keyof T */ String]) with T = js.native
  
  @JSImport("timm", "addFirst")
  @js.native
  def addFirst[T](array: js.Array[T], `val`: T): js.Array[T] = js.native
  @JSImport("timm", "addFirst")
  @js.native
  def addFirst[T](array: js.Array[T], `val`: js.Array[T]): js.Array[T] = js.native
  
  @JSImport("timm", "addLast")
  @js.native
  def addLast[T](array: js.Array[T], `val`: T): js.Array[T] = js.native
  @JSImport("timm", "addLast")
  @js.native
  def addLast[T](array: js.Array[T], `val`: js.Array[T]): js.Array[T] = js.native
  
  @JSImport("timm", "clone")
  @js.native
  def clone_[T /* <: js.Object */](obj0: T): T = js.native
  
  @JSImport("timm", "getIn")
  @js.native
  def getIn(obj: js.UndefOr[scala.Nothing], path: js.Array[Key]): js.UndefOr[scala.Nothing] = js.native
  @JSImport("timm", "getIn")
  @js.native
  def getIn(obj: js.Object, path: js.Array[Key]): js.Any = js.native
  @JSImport("timm", "getIn")
  @js.native
  def getIn(obj: Null, path: js.Array[Key]): Null = js.native
  
  @JSImport("timm", "insert")
  @js.native
  def insert[T](array: js.Array[T], idx: Double, `val`: T): js.Array[T] = js.native
  @JSImport("timm", "insert")
  @js.native
  def insert[T](array: js.Array[T], idx: Double, `val`: js.Array[T]): js.Array[T] = js.native
  
  @JSImport("timm", "merge")
  @js.native
  def merge(a: js.Object, rest: (js.Object | Null)*): js.Object = js.native
  @JSImport("timm", "merge")
  @js.native
  def merge[T /* <: js.Object */](a: T): T = js.native
  @JSImport("timm", "merge")
  @js.native
  def merge[T /* <: js.Object */, U /* <: js.Object */](a: T, b: U): (Omit[T, /* keyof U */ String]) with U = js.native
  @JSImport("timm", "merge")
  @js.native
  def merge[T /* <: js.Object */, V /* <: js.Object */](a: T, b: js.UndefOr[scala.Nothing], c: V): (Omit[T, /* keyof V */ String]) with V = js.native
  @JSImport("timm", "merge")
  @js.native
  def merge[T /* <: js.Object */, V /* <: js.Object */](a: T, b: Null, c: V): (Omit[T, /* keyof V */ String]) with V = js.native
  @JSImport("timm", "merge")
  @js.native
  def merge[T /* <: js.Object */, U /* <: js.Object */, V /* <: js.Object */](a: T, b: U, c: V): (Omit[(Omit[T, /* keyof U */ String]) with U, /* keyof V */ String]) with V = js.native
  
  @JSImport("timm", "mergeDeep")
  @js.native
  def mergeDeep(
    a: js.Object,
    b: js.UndefOr[js.Object | Null],
    c: js.UndefOr[js.Object | Null],
    d: js.UndefOr[js.Object | Null],
    e: js.UndefOr[js.Object | Null],
    f: js.UndefOr[js.Object | Null],
    rest: (js.Object | Null)*
  ): js.Object = js.native
  
  @JSImport("timm", "mergeIn")
  @js.native
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
  
  @JSImport("timm", "omit")
  @js.native
  def omit[T /* <: js.Object */, K /* <: String */](obj: T, attrs: K): Omit[T, /* keyof {[ P in K ]: any} */ String] = js.native
  @JSImport("timm", "omit")
  @js.native
  def omit[T /* <: js.Object */, K /* <: String */](obj: T, attrs: js.Array[K]): Omit[T, /* keyof {[ P in K ]: any} */ String] = js.native
  
  @JSImport("timm", "removeAt")
  @js.native
  def removeAt[T](array: js.Array[T], idx: Double): js.Array[T] = js.native
  
  @JSImport("timm", "removeFirst")
  @js.native
  def removeFirst[T](array: js.Array[T]): js.Array[T] = js.native
  
  @JSImport("timm", "removeLast")
  @js.native
  def removeLast[T](array: js.Array[T]): js.Array[T] = js.native
  
  @JSImport("timm", "replaceAt")
  @js.native
  def replaceAt[T](array: js.Array[T], idx: Double, newItem: T): js.Array[T] = js.native
  
  @JSImport("timm", "set")
  @js.native
  def set[V](obj: js.UndefOr[scala.Nothing], key: Double, `val`: V): js.Array[V] = js.native
  @JSImport("timm", "set")
  @js.native
  def set[V](obj: js.Array[V], key: Double, `val`: V): js.Array[V] = js.native
  @JSImport("timm", "set")
  @js.native
  def set[V](obj: Null, key: Double, `val`: V): js.Array[V] = js.native
  @JSImport("timm", "set")
  @js.native
  def set[K /* <: String */, V](obj: js.UndefOr[scala.Nothing], key: K, `val`: V): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in K ]: V}
    */ typings.timm.timmStrings.set with TopLevel[js.Any] = js.native
  @JSImport("timm", "set")
  @js.native
  def set[K /* <: String */, V](obj: Null, key: K, `val`: V): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in K ]: V}
    */ typings.timm.timmStrings.set with TopLevel[js.Any] = js.native
  @JSImport("timm", "set")
  @js.native
  def set[T /* <: js.Object */, K /* <: String */, V](obj: T, key: K, `val`: V): (Omit[T, /* keyof {[ P in K ]: any} */ String]) with typings.timm.timmStrings.set with TopLevel[js.Any] = js.native
  
  @JSImport("timm", "setIn")
  @js.native
  def setIn(obj: js.UndefOr[scala.Nothing], path: js.Array[Key], `val`: js.Any): js.Any = js.native
  @JSImport("timm", "setIn")
  @js.native
  def setIn(obj: js.Object, path: js.Array[Key], `val`: js.Any): js.Any = js.native
  @JSImport("timm", "setIn")
  @js.native
  def setIn(obj: Null, path: js.Array[Key], `val`: js.Any): js.Any = js.native
  
  @JSImport("timm", "update")
  @js.native
  def update(obj: js.UndefOr[scala.Nothing], key: Key, fnUpdate: js.Function1[/* prevValue */ js.Any, _]): js.Any = js.native
  @JSImport("timm", "update")
  @js.native
  def update(obj: js.Object, key: Key, fnUpdate: js.Function1[/* prevValue */ js.Any, _]): js.Any = js.native
  @JSImport("timm", "update")
  @js.native
  def update(obj: Null, key: Key, fnUpdate: js.Function1[/* prevValue */ js.Any, _]): js.Any = js.native
  
  @JSImport("timm", "updateIn")
  @js.native
  def updateIn(
    obj: js.UndefOr[scala.Nothing],
    path: js.Array[Key],
    fnUpdate: js.Function1[/* prevValue */ js.Any, _]
  ): js.Any = js.native
  @JSImport("timm", "updateIn")
  @js.native
  def updateIn(obj: js.Object, path: js.Array[Key], fnUpdate: js.Function1[/* prevValue */ js.Any, _]): js.Any = js.native
  @JSImport("timm", "updateIn")
  @js.native
  def updateIn(obj: Null, path: js.Array[Key], fnUpdate: js.Function1[/* prevValue */ js.Any, _]): js.Any = js.native
  
  type Key = String | Double
}
