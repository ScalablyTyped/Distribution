package typings.typedoc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc/dist/lib/models/sources", JSImport.Namespace)
@js.native
object distLibModelsSourcesMod extends js.Object {
  @js.native
  class SourceDirectory ()
    extends typings.typedoc.distLibModelsSourcesDirectoryMod.SourceDirectory {
    def this(name: String) = this()
    def this(name: String, parent: typings.typedoc.distLibModelsSourcesDirectoryMod.SourceDirectory) = this()
  }
  
  @js.native
  class SourceFile protected ()
    extends typings.typedoc.distLibModelsSourcesFileMod.SourceFile {
    def this(fullFileName: String) = this()
  }
  
}

