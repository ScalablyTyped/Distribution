package typings.tempy

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type FileOptions = typings.typeFest.mergeExclusiveMod.MergeExclusive[typings.tempy.anon.Extension, typings.tempy.anon.Name]
  
  /**
  	The temporary path created by the function. Can be asynchronous.
  	*/
  type TaskCallback[ReturnValueType] = js.Function1[/* tempPath */ java.lang.String, js.Promise[ReturnValueType] | ReturnValueType]
}
