package typings.vfile

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Settings = org.scalablytyped.runtime.StringDictionary[js.Any]
  
  /* Rewritten from type alias, can be one of: 
    - typings.vfile.mod.VFile
    - typings.vfile.mod.VFileOptions
    - typings.vfile.mod.VFileContents
  */
  type VFileCompatible = typings.vfile.mod._VFileCompatible | typings.vfile.mod.VFileContents
  
  /**
    * VFileContents can either be text, or a Buffer like structure
    * @remarks
    * This does not directly use type `Buffer, because it can also be used in a browser context.
    * Instead this leverages `Uint8Array` which is the base type for `Buffer`, and a native JavaScript construct.
    */
  type VFileContents = java.lang.String | typings.std.Uint8Array
  
  type VFileReporter[T] = js.Function2[/* files */ js.Array[typings.vfile.mod.VFile], /* options */ T, java.lang.String]
}
