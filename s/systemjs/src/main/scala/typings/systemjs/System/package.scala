package typings.systemjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object System {
  type DeclareFn = js.Function2[/* _export */ ExportFn, /* _context */ Context, Declare]
  type ExecuteFn = js.Function0[js.Any]
  type GetFn = GetFnModule | GetFnGeneric
  // tslint:disable-next-line no-unnecessary-generics
  type GetFnGeneric = js.Function1[/* moduleId */ String, js.Any]
  type GetFnModule = js.Function1[/* moduleId */ String, Module]
  // tslint:disable-next-line no-unnecessary-generics
  type ImportFn = js.Function2[/* moduleId */ String, /* parentUrl */ js.UndefOr[String], js.Promise[Module]]
  type SetterFn = js.Function1[/* moduleValue */ Module, js.Any]
  type UpdateModuleFn = js.Function0[Unit]
}
