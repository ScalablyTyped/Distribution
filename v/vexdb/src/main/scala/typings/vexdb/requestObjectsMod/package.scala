package typings.vexdb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object requestObjectsMod {
  
  type Filter[ResponseObject, Key /* <: /* keyof ResponseObject */ java.lang.String */, Direct /* <: /* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ js.Any */] = (js.Function2[
    /* import warning: importer.ImportType#apply Failed type conversion: ResponseObject[Key] */ /* key */ js.Any, 
    /* full */ ResponseObject, 
    js.Promise[scala.Boolean] | scala.Boolean
  ]) | Direct
}
