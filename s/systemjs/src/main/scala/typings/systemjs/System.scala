package typings.systemjs

import org.scalablytyped.runtime.StringDictionary
import typings.systemjs.anon.Url
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object System {
  
  @js.native
  trait Context extends StObject {
    
    def `import`[T /* <: Module */](moduleId: String): js.Promise[T] = js.native
    def `import`[T /* <: Module */](moduleId: String, parentUrl: String): js.Promise[T] = js.native
    @JSName("import")
    var import_Original: ImportFn = js.native
    
    var meta: Url = js.native
  }
  
  @js.native
  trait Declare extends StObject {
    
    var execute: js.UndefOr[js.Function0[_]] = js.native
    
    var setters: js.UndefOr[js.Array[SetterFn]] = js.native
  }
  object Declare {
    
    @scala.inline
    def apply(): Declare = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Declare]
    }
    
    @scala.inline
    implicit class DeclareMutableBuilder[Self <: Declare] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExecute(value: () => _): Self = StObject.set(x, "execute", js.Any.fromFunction0(value))
      
      @scala.inline
      def setExecuteUndefined: Self = StObject.set(x, "execute", js.undefined)
      
      @scala.inline
      def setSetters(value: js.Array[SetterFn]): Self = StObject.set(x, "setters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSettersUndefined: Self = StObject.set(x, "setters", js.undefined)
      
      @scala.inline
      def setSettersVarargs(value: SetterFn*): Self = StObject.set(x, "setters", js.Array(value :_*))
    }
  }
  
  type DeclareFn = js.Function2[/* _export */ ExportFn, /* _context */ Context, Declare]
  
  type ExecuteFn = js.Function0[js.Any]
  
  @js.native
  trait ExportFn extends StObject {
    
    def apply(exportName: String, value: js.Any): Unit = js.native
    def apply(exports: js.Object): Unit = js.native
  }
  
  type GetFn = GetFnModule | GetFnGeneric
  
  // tslint:disable-next-line no-unnecessary-generics
  type GetFnGeneric = js.Function1[/* moduleId */ String, js.Any]
  
  type GetFnModule = js.Function1[/* moduleId */ String, Module]
  
  // tslint:disable-next-line no-unnecessary-generics
  type ImportFn = js.Function2[/* moduleId */ String, /* parentUrl */ js.UndefOr[String], js.Promise[Module]]
  
  @js.native
  trait Module
    extends /* exportName */ StringDictionary[js.Any] {
    
    var default: js.UndefOr[js.Any] = js.native
  }
  object Module {
    
    @scala.inline
    def apply(): Module = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Module]
    }
    
    @scala.inline
    implicit class ModuleMutableBuilder[Self <: Module] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefault(value: js.Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    }
  }
  
  type SetterFn = js.Function1[/* moduleValue */ Module, js.Any]
  
  type UpdateModuleFn = js.Function0[Unit]
}
