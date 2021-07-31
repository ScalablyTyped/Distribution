package typings.typedoc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourcesMod {
  
  @JSImport("typedoc/dist/lib/models/sources", "SourceDirectory")
  @js.native
  class SourceDirectory ()
    extends typings.typedoc.directoryMod.SourceDirectory {
    def this(name: String) = this()
    def this(name: String, parent: typings.typedoc.directoryMod.SourceDirectory) = this()
    def this(name: Unit, parent: typings.typedoc.directoryMod.SourceDirectory) = this()
  }
  
  @JSImport("typedoc/dist/lib/models/sources", "SourceFile")
  @js.native
  class SourceFile protected ()
    extends typings.typedoc.fileMod.SourceFile {
    def this(fullFileName: String) = this()
  }
}
