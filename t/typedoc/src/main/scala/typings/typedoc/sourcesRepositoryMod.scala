package typings.typedoc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourcesRepositoryMod {
  
  @js.native
  sealed trait RepositoryType extends StObject
  @JSImport("typedoc/dist/lib/models/sources/repository", "RepositoryType")
  @js.native
  object RepositoryType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[RepositoryType & String] = js.native
    
    @js.native
    sealed trait Bitbucket
      extends StObject
         with RepositoryType
    /* "bitbucket" */ val Bitbucket: typings.typedoc.sourcesRepositoryMod.RepositoryType.Bitbucket & String = js.native
    
    @js.native
    sealed trait GitHub
      extends StObject
         with RepositoryType
    /* "github" */ val GitHub: typings.typedoc.sourcesRepositoryMod.RepositoryType.GitHub & String = js.native
    
    @js.native
    sealed trait GitLab
      extends StObject
         with RepositoryType
    /* "gitlab" */ val GitLab: typings.typedoc.sourcesRepositoryMod.RepositoryType.GitLab & String = js.native
  }
}
