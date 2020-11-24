package typings.typedoc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typedoc/dist/lib/models/sources", JSImport.Namespace)
@js.native
object sourcesMod extends js.Object {
  
  @js.native
  class SourceDirectory ()
    extends typings.typedoc.directoryMod.SourceDirectory {
    def this(name: String) = this()
    def this(name: js.UndefOr[scala.Nothing], parent: typings.typedoc.directoryMod.SourceDirectory) = this()
    def this(name: String, parent: typings.typedoc.directoryMod.SourceDirectory) = this()
  }
  
  @js.native
  class SourceFile protected ()
    extends typings.typedoc.fileMod.SourceFile {
    def this(fullFileName: String) = this()
  }
}
