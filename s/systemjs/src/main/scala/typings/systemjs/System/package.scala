package typings.systemjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object System {
  
  type DeclareFn = js.Function2[
    /* _export */ typings.systemjs.System.ExportFn, 
    /* _context */ typings.systemjs.System.Context, 
    typings.systemjs.System.Declare
  ]
  
  type ExecuteFn = js.Function0[js.Any]
  
  type GetFn = typings.systemjs.System.GetFnModule | typings.systemjs.System.GetFnGeneric
  
  // tslint:disable-next-line no-unnecessary-generics
  type GetFnGeneric = js.Function1[/* moduleId */ java.lang.String, js.Any]
  
  type GetFnModule = js.Function1[/* moduleId */ java.lang.String, typings.systemjs.System.Module]
  
  // tslint:disable-next-line no-unnecessary-generics
  type ImportFn = js.Function2[
    /* moduleId */ java.lang.String, 
    /* parentUrl */ js.UndefOr[java.lang.String], 
    js.Promise[typings.systemjs.System.Module]
  ]
  
  type SetterFn = js.Function1[/* moduleValue */ typings.systemjs.System.Module, js.Any]
  
  type UpdateModuleFn = js.Function0[scala.Unit]
}
