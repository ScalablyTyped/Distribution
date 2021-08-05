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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("timm", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object default {
    
    @JSImport("timm", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("timm", "default.addDefaults")
    @js.native
    def addDefaults: FnCallABRest = js.native
    inline def addDefaults(a: js.Object, b: js.Object, rest: (js.Object | Null)*): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("addDefaults")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], rest.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    inline def addDefaults[T /* <: js.Object */, U /* <: js.Object */](a: T, b: U): (Omit[U, /* keyof T */ String]) & T = (^.asInstanceOf[js.Dynamic].applyDynamic("addDefaults")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[(Omit[U, /* keyof T */ String]) & T]
    inline def addDefaults_=(x: FnCallABRest): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("addDefaults")(x.asInstanceOf[js.Any])
    
    @JSImport("timm", "default.addFirst")
    @js.native
    def addFirst: FnCallArrayVal = js.native
    inline def addFirst[T](array: js.Array[T], `val`: T): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("addFirst")(array.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
    inline def addFirst[T](array: js.Array[T], `val`: js.Array[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("addFirst")(array.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
    inline def addFirst_=(x: FnCallArrayVal): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("addFirst")(x.asInstanceOf[js.Any])
    
    @JSImport("timm", "default.addLast")
    @js.native
    def addLast: FnCallArrayVal = js.native
    inline def addLast[T](array: js.Array[T], `val`: T): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("addLast")(array.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
    inline def addLast[T](array: js.Array[T], `val`: js.Array[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("addLast")(array.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
    inline def addLast_=(x: FnCallArrayVal): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("addLast")(x.asInstanceOf[js.Any])
    
    @JSImport("timm", "default.clone")
    @js.native
    def clone_ : FnCall = js.native
    
    inline def clone_[T /* <: js.Object */](obj0: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(obj0.asInstanceOf[js.Any]).asInstanceOf[T]
    inline def clone__=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clone")(x.asInstanceOf[js.Any])
    
    @JSImport("timm", "default.getIn")
    @js.native
    def getIn: FnCallObjPath = js.native
    inline def getIn(obj: js.Object, path: js.Array[Key]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getIn")(obj.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def getIn(obj: Null, path: js.Array[Key]): Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getIn")(obj.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Null]
    inline def getIn(obj: Unit, path: js.Array[Key]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getIn")(obj.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def getIn_=(x: FnCallObjPath): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getIn")(x.asInstanceOf[js.Any])
    
    @JSImport("timm", "default.insert")
    @js.native
    def insert: FnCallArrayIdxVal = js.native
    inline def insert[T](array: js.Array[T], idx: Double, `val`: T): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(array.asInstanceOf[js.Any], idx.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
    inline def insert[T](array: js.Array[T], idx: Double, `val`: js.Array[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(array.asInstanceOf[js.Any], idx.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
    inline def insert_=(x: FnCallArrayIdxVal): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("insert")(x.asInstanceOf[js.Any])
    
    @JSImport("timm", "default.merge")
    @js.native
    def merge: FnCallABC = js.native
    inline def merge(a: js.Object, rest: (js.Object | Null)*): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(a.asInstanceOf[js.Any], rest.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    inline def merge[T /* <: js.Object */](a: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")(a.asInstanceOf[js.Any]).asInstanceOf[T]
    inline def merge[T /* <: js.Object */, U /* <: js.Object */](a: T, b: U): (Omit[T, /* keyof U */ String]) & U = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[(Omit[T, /* keyof U */ String]) & U]
    inline def merge[T /* <: js.Object */, V /* <: js.Object */](a: T, b: Null, c: V): (Omit[T, /* keyof V */ String]) & V = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[(Omit[T, /* keyof V */ String]) & V]
    inline def merge[T /* <: js.Object */, V /* <: js.Object */](a: T, b: Unit, c: V): (Omit[T, /* keyof V */ String]) & V = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[(Omit[T, /* keyof V */ String]) & V]
    inline def merge[T /* <: js.Object */, U /* <: js.Object */, V /* <: js.Object */](a: T, b: U, c: V): (Omit[(Omit[T, /* keyof U */ String]) & U, /* keyof V */ String]) & V = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[(Omit[(Omit[T, /* keyof U */ String]) & U, /* keyof V */ String]) & V]
    
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
    inline def mergeDeep(
      a: js.Object,
      b: js.UndefOr[js.Object | Null],
      c: js.UndefOr[js.Object | Null],
      d: js.UndefOr[js.Object | Null],
      e: js.UndefOr[js.Object | Null],
      f: js.UndefOr[js.Object | Null],
      rest: (js.Object | Null)*
    ): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeDeep")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], e.asInstanceOf[js.Any], f.asInstanceOf[js.Any], rest.asInstanceOf[js.Any])).asInstanceOf[js.Object]
    inline def mergeDeep_=(
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
    inline def mergeIn(
      a: js.Any,
      path: js.Array[Key],
      b: js.UndefOr[js.Object | Null],
      c: js.UndefOr[js.Object | Null],
      d: js.UndefOr[js.Object | Null],
      e: js.UndefOr[js.Object | Null],
      f: js.UndefOr[js.Object | Null],
      rest: (js.Object | Null)*
    ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeIn")(a.asInstanceOf[js.Any], path.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], e.asInstanceOf[js.Any], f.asInstanceOf[js.Any], rest.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def mergeIn_=(
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
    
    inline def merge_=(x: FnCallABC): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("merge")(x.asInstanceOf[js.Any])
    
    @JSImport("timm", "default.omit")
    @js.native
    def omit: FnCallObjAttrs = js.native
    inline def omit[T /* <: js.Object */, K /* <: String */](obj: T, attrs: K): Omit[T, /* keyof {[ P in K ]: any} */ String] = (^.asInstanceOf[js.Dynamic].applyDynamic("omit")(obj.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).asInstanceOf[Omit[T, /* keyof {[ P in K ]: any} */ String]]
    inline def omit[T /* <: js.Object */, K /* <: String */](obj: T, attrs: js.Array[K]): Omit[T, /* keyof {[ P in K ]: any} */ String] = (^.asInstanceOf[js.Dynamic].applyDynamic("omit")(obj.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).asInstanceOf[Omit[T, /* keyof {[ P in K ]: any} */ String]]
    inline def omit_=(x: FnCallObjAttrs): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("omit")(x.asInstanceOf[js.Any])
    
    @JSImport("timm", "default.removeAt")
    @js.native
    def removeAt: FnCallArrayIdx = js.native
    inline def removeAt[T](array: js.Array[T], idx: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAt")(array.asInstanceOf[js.Any], idx.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
    inline def removeAt_=(x: FnCallArrayIdx): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("removeAt")(x.asInstanceOf[js.Any])
    
    @JSImport("timm", "default.removeFirst")
    @js.native
    def removeFirst: FnCallArray = js.native
    inline def removeFirst[T](array: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeFirst")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
    inline def removeFirst_=(x: FnCallArray): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("removeFirst")(x.asInstanceOf[js.Any])
    
    @JSImport("timm", "default.removeLast")
    @js.native
    def removeLast: FnCallArray = js.native
    inline def removeLast[T](array: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeLast")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
    inline def removeLast_=(x: FnCallArray): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("removeLast")(x.asInstanceOf[js.Any])
    
    @JSImport("timm", "default.replaceAt")
    @js.native
    def replaceAt: FnCallArrayIdxNewItem = js.native
    inline def replaceAt[T](array: js.Array[T], idx: Double, newItem: T): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceAt")(array.asInstanceOf[js.Any], idx.asInstanceOf[js.Any], newItem.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
    inline def replaceAt_=(x: FnCallArrayIdxNewItem): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("replaceAt")(x.asInstanceOf[js.Any])
    
    @JSImport("timm", "default.set")
    @js.native
    def set: FnCallObjKeyVal = js.native
    inline def set[V](obj: js.Array[V], key: Double, `val`: V): js.Array[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[js.Array[V]]
    inline def set[V](obj: Null, key: Double, `val`: V): js.Array[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[js.Array[V]]
    inline def set[V](obj: Unit, key: Double, `val`: V): js.Array[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[js.Array[V]]
    inline def set[K /* <: String */, V](obj: Null, key: K, `val`: V): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in K ]: V}
      */ typings.timm.timmStrings.set & TopLevel[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in K ]: V}
      */ typings.timm.timmStrings.set & TopLevel[js.Any]]
    inline def set[K /* <: String */, V](obj: Unit, key: K, `val`: V): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in K ]: V}
      */ typings.timm.timmStrings.set & TopLevel[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ P in K ]: V}
      */ typings.timm.timmStrings.set & TopLevel[js.Any]]
    inline def set[T /* <: js.Object */, K /* <: String */, V](obj: T, key: K, `val`: V): (Omit[T, /* keyof {[ P in K ]: any} */ String]) & typings.timm.timmStrings.set & TopLevel[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[(Omit[T, /* keyof {[ P in K ]: any} */ String]) & typings.timm.timmStrings.set & TopLevel[js.Any]]
    
    @JSImport("timm", "default.setIn")
    @js.native
    def setIn: js.Function3[
        /* obj */ js.UndefOr[js.Object | Null], 
        /* path */ js.Array[Key], 
        /* val */ js.Any, 
        js.Any
      ] = js.native
    inline def setIn(obj: js.Object, path: js.Array[Key], `val`: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setIn")(obj.asInstanceOf[js.Any], path.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def setIn(obj: Null, path: js.Array[Key], `val`: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setIn")(obj.asInstanceOf[js.Any], path.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def setIn(obj: Unit, path: js.Array[Key], `val`: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setIn")(obj.asInstanceOf[js.Any], path.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def setIn_=(
      x: js.Function3[
          /* obj */ js.UndefOr[js.Object | Null], 
          /* path */ js.Array[Key], 
          /* val */ js.Any, 
          js.Any
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("setIn")(x.asInstanceOf[js.Any])
    
    inline def set_=(x: FnCallObjKeyVal): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("set")(x.asInstanceOf[js.Any])
    
    @JSImport("timm", "default.update")
    @js.native
    def update: js.Function3[
        /* obj */ js.UndefOr[js.Object | Null], 
        /* key */ Key, 
        /* fnUpdate */ js.Function1[/* prevValue */ js.Any, js.Any], 
        js.Any
      ] = js.native
    inline def update(obj: js.Object, key: Key, fnUpdate: js.Function1[/* prevValue */ js.Any, js.Any]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], fnUpdate.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def update(obj: Null, key: Key, fnUpdate: js.Function1[/* prevValue */ js.Any, js.Any]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], fnUpdate.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def update(obj: Unit, key: Key, fnUpdate: js.Function1[/* prevValue */ js.Any, js.Any]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], fnUpdate.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    
    @JSImport("timm", "default.updateIn")
    @js.native
    def updateIn: js.Function3[
        /* obj */ js.UndefOr[js.Object | Null], 
        /* path */ js.Array[Key], 
        /* fnUpdate */ js.Function1[/* prevValue */ js.Any, js.Any], 
        js.Any
      ] = js.native
    inline def updateIn(obj: js.Object, path: js.Array[Key], fnUpdate: js.Function1[/* prevValue */ js.Any, js.Any]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("updateIn")(obj.asInstanceOf[js.Any], path.asInstanceOf[js.Any], fnUpdate.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def updateIn(obj: Null, path: js.Array[Key], fnUpdate: js.Function1[/* prevValue */ js.Any, js.Any]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("updateIn")(obj.asInstanceOf[js.Any], path.asInstanceOf[js.Any], fnUpdate.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def updateIn(obj: Unit, path: js.Array[Key], fnUpdate: js.Function1[/* prevValue */ js.Any, js.Any]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("updateIn")(obj.asInstanceOf[js.Any], path.asInstanceOf[js.Any], fnUpdate.asInstanceOf[js.Any])).asInstanceOf[js.Any]
    inline def updateIn_=(
      x: js.Function3[
          /* obj */ js.UndefOr[js.Object | Null], 
          /* path */ js.Array[Key], 
          /* fnUpdate */ js.Function1[/* prevValue */ js.Any, js.Any], 
          js.Any
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("updateIn")(x.asInstanceOf[js.Any])
    
    inline def update_=(
      x: js.Function3[
          /* obj */ js.UndefOr[js.Object | Null], 
          /* key */ Key, 
          /* fnUpdate */ js.Function1[/* prevValue */ js.Any, js.Any], 
          js.Any
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("update")(x.asInstanceOf[js.Any])
  }
  
  inline def addDefaults(a: js.Object, b: js.Object, rest: (js.Object | Null)*): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("addDefaults")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], rest.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def addDefaults[T /* <: js.Object */, U /* <: js.Object */](a: T, b: U): (Omit[U, /* keyof T */ String]) & T = (^.asInstanceOf[js.Dynamic].applyDynamic("addDefaults")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[(Omit[U, /* keyof T */ String]) & T]
  
  inline def addFirst[T](array: js.Array[T], `val`: T): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("addFirst")(array.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def addFirst[T](array: js.Array[T], `val`: js.Array[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("addFirst")(array.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def addLast[T](array: js.Array[T], `val`: T): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("addLast")(array.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def addLast[T](array: js.Array[T], `val`: js.Array[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("addLast")(array.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def clone_[T /* <: js.Object */](obj0: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(obj0.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def getIn(obj: js.Object, path: js.Array[Key]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getIn")(obj.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def getIn(obj: Null, path: js.Array[Key]): Null = (^.asInstanceOf[js.Dynamic].applyDynamic("getIn")(obj.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Null]
  inline def getIn(obj: Unit, path: js.Array[Key]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getIn")(obj.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def insert[T](array: js.Array[T], idx: Double, `val`: T): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(array.asInstanceOf[js.Any], idx.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  inline def insert[T](array: js.Array[T], idx: Double, `val`: js.Array[T]): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(array.asInstanceOf[js.Any], idx.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def merge(a: js.Object, rest: (js.Object | Null)*): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(a.asInstanceOf[js.Any], rest.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  inline def merge[T /* <: js.Object */](a: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")(a.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def merge[T /* <: js.Object */, U /* <: js.Object */](a: T, b: U): (Omit[T, /* keyof U */ String]) & U = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[(Omit[T, /* keyof U */ String]) & U]
  inline def merge[T /* <: js.Object */, V /* <: js.Object */](a: T, b: Null, c: V): (Omit[T, /* keyof V */ String]) & V = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[(Omit[T, /* keyof V */ String]) & V]
  inline def merge[T /* <: js.Object */, V /* <: js.Object */](a: T, b: Unit, c: V): (Omit[T, /* keyof V */ String]) & V = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[(Omit[T, /* keyof V */ String]) & V]
  inline def merge[T /* <: js.Object */, U /* <: js.Object */, V /* <: js.Object */](a: T, b: U, c: V): (Omit[(Omit[T, /* keyof U */ String]) & U, /* keyof V */ String]) & V = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any])).asInstanceOf[(Omit[(Omit[T, /* keyof U */ String]) & U, /* keyof V */ String]) & V]
  
  inline def mergeDeep(
    a: js.Object,
    b: js.UndefOr[js.Object | Null],
    c: js.UndefOr[js.Object | Null],
    d: js.UndefOr[js.Object | Null],
    e: js.UndefOr[js.Object | Null],
    f: js.UndefOr[js.Object | Null],
    rest: (js.Object | Null)*
  ): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeDeep")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], e.asInstanceOf[js.Any], f.asInstanceOf[js.Any], rest.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def mergeIn(
    a: js.Any,
    path: js.Array[Key],
    b: js.UndefOr[js.Object | Null],
    c: js.UndefOr[js.Object | Null],
    d: js.UndefOr[js.Object | Null],
    e: js.UndefOr[js.Object | Null],
    f: js.UndefOr[js.Object | Null],
    rest: (js.Object | Null)*
  ): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeIn")(a.asInstanceOf[js.Any], path.asInstanceOf[js.Any], b.asInstanceOf[js.Any], c.asInstanceOf[js.Any], d.asInstanceOf[js.Any], e.asInstanceOf[js.Any], f.asInstanceOf[js.Any], rest.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def omit[T /* <: js.Object */, K /* <: String */](obj: T, attrs: K): Omit[T, /* keyof {[ P in K ]: any} */ String] = (^.asInstanceOf[js.Dynamic].applyDynamic("omit")(obj.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).asInstanceOf[Omit[T, /* keyof {[ P in K ]: any} */ String]]
  inline def omit[T /* <: js.Object */, K /* <: String */](obj: T, attrs: js.Array[K]): Omit[T, /* keyof {[ P in K ]: any} */ String] = (^.asInstanceOf[js.Dynamic].applyDynamic("omit")(obj.asInstanceOf[js.Any], attrs.asInstanceOf[js.Any])).asInstanceOf[Omit[T, /* keyof {[ P in K ]: any} */ String]]
  
  inline def removeAt[T](array: js.Array[T], idx: Double): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("removeAt")(array.asInstanceOf[js.Any], idx.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def removeFirst[T](array: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeFirst")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  inline def removeLast[T](array: js.Array[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("removeLast")(array.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  inline def replaceAt[T](array: js.Array[T], idx: Double, newItem: T): js.Array[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("replaceAt")(array.asInstanceOf[js.Any], idx.asInstanceOf[js.Any], newItem.asInstanceOf[js.Any])).asInstanceOf[js.Array[T]]
  
  inline def set[V](obj: js.Array[V], key: Double, `val`: V): js.Array[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[js.Array[V]]
  inline def set[V](obj: Null, key: Double, `val`: V): js.Array[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[js.Array[V]]
  inline def set[V](obj: Unit, key: Double, `val`: V): js.Array[V] = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[js.Array[V]]
  inline def set[K /* <: String */, V](obj: Null, key: K, `val`: V): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in K ]: V}
    */ typings.timm.timmStrings.set & TopLevel[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in K ]: V}
    */ typings.timm.timmStrings.set & TopLevel[js.Any]]
  inline def set[K /* <: String */, V](obj: Unit, key: K, `val`: V): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in K ]: V}
    */ typings.timm.timmStrings.set & TopLevel[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in K ]: V}
    */ typings.timm.timmStrings.set & TopLevel[js.Any]]
  inline def set[T /* <: js.Object */, K /* <: String */, V](obj: T, key: K, `val`: V): (Omit[T, /* keyof {[ P in K ]: any} */ String]) & typings.timm.timmStrings.set & TopLevel[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[(Omit[T, /* keyof {[ P in K ]: any} */ String]) & typings.timm.timmStrings.set & TopLevel[js.Any]]
  
  inline def setIn(obj: js.Object, path: js.Array[Key], `val`: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setIn")(obj.asInstanceOf[js.Any], path.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def setIn(obj: Null, path: js.Array[Key], `val`: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setIn")(obj.asInstanceOf[js.Any], path.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def setIn(obj: Unit, path: js.Array[Key], `val`: js.Any): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setIn")(obj.asInstanceOf[js.Any], path.asInstanceOf[js.Any], `val`.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def update(obj: js.Object, key: Key, fnUpdate: js.Function1[/* prevValue */ js.Any, js.Any]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], fnUpdate.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def update(obj: Null, key: Key, fnUpdate: js.Function1[/* prevValue */ js.Any, js.Any]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], fnUpdate.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def update(obj: Unit, key: Key, fnUpdate: js.Function1[/* prevValue */ js.Any, js.Any]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(obj.asInstanceOf[js.Any], key.asInstanceOf[js.Any], fnUpdate.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def updateIn(obj: js.Object, path: js.Array[Key], fnUpdate: js.Function1[/* prevValue */ js.Any, js.Any]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("updateIn")(obj.asInstanceOf[js.Any], path.asInstanceOf[js.Any], fnUpdate.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def updateIn(obj: Null, path: js.Array[Key], fnUpdate: js.Function1[/* prevValue */ js.Any, js.Any]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("updateIn")(obj.asInstanceOf[js.Any], path.asInstanceOf[js.Any], fnUpdate.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def updateIn(obj: Unit, path: js.Array[Key], fnUpdate: js.Function1[/* prevValue */ js.Any, js.Any]): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("updateIn")(obj.asInstanceOf[js.Any], path.asInstanceOf[js.Any], fnUpdate.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  type Key = String | Double
}
