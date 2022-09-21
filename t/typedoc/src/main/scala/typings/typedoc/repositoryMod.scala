package typings.typedoc

import typings.typedoc.sourcesRepositoryMod.RepositoryType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object repositoryMod {
  
  @JSImport("typedoc/dist/lib/converter/utils/repository", "Repository")
  @js.native
  open class Repository protected () extends StObject {
    /**
      * Create a new Repository instance.
      *
      * @param path  The root path of the repository.
      */
    def this(path: String, gitRevision: String, repoLinks: js.Array[String]) = this()
    
    /**
      * The name of the branch this repository is on right now.
      */
    var branch: String = js.native
    
    /**
      * Check whether the given file is tracked by this repository.
      *
      * @param fileName  The name of the file to test for.
      * @returns TRUE when the file is part of the repository, otherwise FALSE.
      */
    def contains(fileName: String): Boolean = js.native
    
    /**
      * A list of all files tracked by the repository.
      */
    var files: js.Array[String] = js.native
    
    def getLineNumberAnchor(lineNumber: Double): String = js.native
    
    /**
      * Get the URL of the given file on GitHub or Bitbucket.
      *
      * @param fileName  The file whose URL should be determined.
      * @returns A URL pointing to the web preview of the given file or undefined.
      */
    def getURL(fileName: String): js.UndefOr[String] = js.native
    
    /**
      * The hostname for this GitHub/Bitbucket/.etc project.
      *
      * Defaults to: `github.com` (for normal, public GitHub instance projects)
      *
      * Can be the hostname for an enterprise version of GitHub, e.g. `github.acme.com`
      * (if found as a match in the list of git remotes).
      */
    var hostname: String = js.native
    
    /**
      * The root path of this repository.
      */
    var path: String = js.native
    
    /**
      * The project name of this repository on GitHub.
      */
    var project: js.UndefOr[String] = js.native
    
    /**
      * Whether this is a GitHub, Bitbucket, or other type of repository.
      */
    var `type`: RepositoryType = js.native
    
    /* private */ var urlCache: Any = js.native
    
    /**
      * The user/organization name of this repository on GitHub.
      */
    var user: js.UndefOr[String] = js.native
  }
  /* static members */
  object Repository {
    
    @JSImport("typedoc/dist/lib/converter/utils/repository", "Repository")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Try to create a new repository instance.
      *
      * Checks whether the given path is the root of a valid repository and if so
      * creates a new instance of {@link Repository}.
      *
      * @param path  The potential repository root.
      * @returns A new instance of {@link Repository} or undefined.
      */
    inline def tryCreateRepository(path: String, gitRevision: String, gitRemote: String): js.UndefOr[Repository] = (^.asInstanceOf[js.Dynamic].applyDynamic("tryCreateRepository")(path.asInstanceOf[js.Any], gitRevision.asInstanceOf[js.Any], gitRemote.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Repository]]
  }
  
  @JSImport("typedoc/dist/lib/converter/utils/repository", "gitIsInstalled")
  @js.native
  val gitIsInstalled: Boolean = js.native
}
