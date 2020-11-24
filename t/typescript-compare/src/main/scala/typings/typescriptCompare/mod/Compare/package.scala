package typings.typescriptCompare.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object Compare {
  
  type Options = typings.typescriptCompare.mod.Compare.Options_
  
  type Strict[A, B, Options /* <: typings.typescriptCompare.mod.Compare.Options */] = typings.typescriptLogic.mod.If[
    typings.typescriptCompare.mod.Extends[A, B], 
    typings.typescriptLogic.mod.If[
      typings.typescriptCompare.mod.Extends[B, A], 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['equal'] */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['broaderRight'] */ js.Any
    ], 
    typings.typescriptLogic.mod.If[
      typings.typescriptCompare.mod.Extends[B, A], 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['broaderLeft'] */ js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: Options['mismatch'] */ js.Any
    ]
  ]
}
