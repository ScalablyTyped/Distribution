package typings.typedoc

import typings.std.ReadonlySet
import typings.typedoc.optionsOptionsMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typescriptMod {
  
  @JSImport("typedoc/dist/lib/utils/options/sources/typescript", "IGNORED")
  @js.native
  val IGNORED: ReadonlySet[String] = js.native
  
  @JSImport("typedoc/dist/lib/utils/options/sources/typescript", "addTSOptions")
  @js.native
  def addTSOptions(container: Options): Unit = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.typedoc.typedocStrings.out
    - typings.typedoc.typedocStrings.version
    - typings.typedoc.typedocStrings.help
    - typings.typedoc.typedocStrings.emitDeclarationOnly
    - typings.typedoc.typedocStrings.watch
    - typings.typedoc.typedocStrings.declaration
    - typings.typedoc.typedocStrings.declarationDir
    - typings.typedoc.typedocStrings.declarationMap
    - typings.typedoc.typedocStrings.mapRoot
    - typings.typedoc.typedocStrings.sourceMap
    - typings.typedoc.typedocStrings.inlineSources
    - typings.typedoc.typedocStrings.removeComments
    - typings.typedoc.typedocStrings.incremental
    - typings.typedoc.typedocStrings.tsBuildInfoFile
  */
  trait IgnoredTsOptionKeys extends StObject
}
