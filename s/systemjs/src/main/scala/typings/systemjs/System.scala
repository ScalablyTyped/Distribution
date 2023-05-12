package typings.systemjs

import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
import typings.systemjs.anon.Url
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object System {
  
  trait Context extends StObject {
    
    def `import`[T /* <: Module */](moduleId: String): js.Promise[T]
    def `import`[T /* <: Module */](moduleId: String, parentUrl: String): js.Promise[T]
    @JSName("import")
    var import_Original: ImportFn
    
    var meta: Url
  }
  object Context {
    
    inline def apply(
      `import`: (/* moduleId */ String, /* parentUrl */ js.UndefOr[String]) => js.Promise[Module],
      meta: Url
    ): Context = {
      val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any])
      __obj.updateDynamic("import")(js.Any.fromFunction2(`import`))
      __obj.asInstanceOf[Context]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Context] (val x: Self) extends AnyVal {
      
      inline def setImport(value: (/* moduleId */ String, /* parentUrl */ js.UndefOr[String]) => js.Promise[Module]): Self = StObject.set(x, "import", js.Any.fromFunction2(value))
      
      inline def setMeta(value: Url): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    }
  }
  
  trait Declare extends StObject {
    
    var execute: js.UndefOr[js.Function0[Any]] = js.undefined
    
    var setters: js.UndefOr[js.Array[SetterFn]] = js.undefined
  }
  object Declare {
    
    inline def apply(): Declare = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Declare]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Declare] (val x: Self) extends AnyVal {
      
      inline def setExecute(value: () => Any): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
      
      inline def setExecuteUndefined: Self = StObject.set(x, "execute", js.undefined)
      
      inline def setSetters(value: js.Array[SetterFn]): Self = StObject.set(x, "setters", value.asInstanceOf[js.Any])
      
      inline def setSettersUndefined: Self = StObject.set(x, "setters", js.undefined)
      
      inline def setSettersVarargs(value: SetterFn*): Self = StObject.set(x, "setters", js.Array(value*))
    }
  }
  
  type DeclareFn = js.Function2[/* _export */ ExportFn, /* _context */ Context, Declare]
  
  type ExecuteFn = js.Function0[Any]
  
  @js.native
  trait ExportFn extends StObject {
    
    def apply(exportName: String, value: Any): Unit = js.native
    def apply(exports: js.Object): Unit = js.native
  }
  
  type GetFn = GetFnModule | GetFnGeneric
  
  // eslint-disable-next-line no-unnecessary-generics
  type GetFnGeneric = js.Function1[/* moduleId */ String, Any]
  
  type GetFnModule = js.Function1[/* moduleId */ String, Module]
  
  // eslint-disable-next-line no-unnecessary-generics
  type ImportFn = js.Function2[/* moduleId */ String, /* parentUrl */ js.UndefOr[String], js.Promise[Module]]
  
  /** The importmap standard is defined here: https://github.com/WICG/import-maps */
  trait ImportMap extends StObject {
    
    var imports: js.UndefOr[Record[String, String]] = js.undefined
    
    var scopes: js.UndefOr[Record[String, Record[String, String]]] = js.undefined
  }
  object ImportMap {
    
    inline def apply(): ImportMap = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImportMap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ImportMap] (val x: Self) extends AnyVal {
      
      inline def setImports(value: Record[String, String]): Self = StObject.set(x, "imports", value.asInstanceOf[js.Any])
      
      inline def setImportsUndefined: Self = StObject.set(x, "imports", js.undefined)
      
      inline def setScopes(value: Record[String, Record[String, String]]): Self = StObject.set(x, "scopes", value.asInstanceOf[js.Any])
      
      inline def setScopesUndefined: Self = StObject.set(x, "scopes", js.undefined)
    }
  }
  
  trait Module
    extends StObject
       with /* exportName */ StringDictionary[Any] {
    
    var default: js.UndefOr[Any] = js.undefined
  }
  object Module {
    
    inline def apply(): Module = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Module]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Module] (val x: Self) extends AnyVal {
      
      inline def setDefault(value: Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    }
  }
  
  type SetterFn = js.Function1[/* moduleValue */ Module, Any]
  
  type UpdateModuleFn = js.Function0[Unit]
}
