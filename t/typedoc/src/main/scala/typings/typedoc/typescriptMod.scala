package typings.typedoc

import typings.std.ReadonlySet
import typings.typedoc.optionsOptionsMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/utils/options/sources/typescript", JSImport.Namespace)
@js.native
object typescriptMod extends js.Object {
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
  trait IgnoredTsOptionKeys extends js.Object
  
  val IGNORED: ReadonlySet[String] = js.native
  def addTSOptions(container: Options): Unit = js.native
}

