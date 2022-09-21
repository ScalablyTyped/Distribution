package typings.typedoc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourcesMod {
  
  @JSImport("typedoc/dist/lib/models/sources", "RepositoryType")
  @js.native
  object RepositoryType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.typedoc.sourcesRepositoryMod.RepositoryType & String] = js.native
    
    /* "bitbucket" */ val Bitbucket: typings.typedoc.sourcesRepositoryMod.RepositoryType.Bitbucket & String = js.native
    
    /* "github" */ val GitHub: typings.typedoc.sourcesRepositoryMod.RepositoryType.GitHub & String = js.native
    
    /* "gitlab" */ val GitLab: typings.typedoc.sourcesRepositoryMod.RepositoryType.GitLab & String = js.native
  }
  
  @JSImport("typedoc/dist/lib/models/sources", "SourceReference")
  @js.native
  open class SourceReference protected ()
    extends typings.typedoc.fileMod.SourceReference {
    def this(fileName: String, line: Double, character: Double) = this()
  }
}
