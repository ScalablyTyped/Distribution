package typings.typedoc

import typings.std.Set
import typings.typedoc.distLibUtilsMod.Logger
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibConverterUtilsRepositoryMod {
  
  @JSImport("typedoc/dist/lib/converter/utils/repository", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("typedoc/dist/lib/converter/utils/repository", "Repository")
  @js.native
  open class Repository protected () extends StObject {
    /**
      * Create a new Repository instance.
      *
      * @param path  The root path of the repository.
      */
    def this(path: String, gitRevision: String, urlTemplate: String) = this()
    
    /**
      * All files tracked by the repository.
      */
    var files: Set[String] = js.native
    
    /**
      * Get the URL of the given file on GitHub or Bitbucket.
      *
      * @param fileName  The file whose URL should be determined.
      * @returns A URL pointing to the web preview of the given file or undefined.
      */
    def getURL(fileName: String, line: Double): js.UndefOr[String] = js.native
    
    var gitRevision: String = js.native
    
    /**
      * The path of this repository on disk.
      */
    var path: String = js.native
    
    var urlTemplate: String = js.native
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
    inline def tryCreateRepository(path: String, sourceLinkTemplate: String, gitRevision: String, gitRemote: String, logger: Logger): js.UndefOr[Repository] = (^.asInstanceOf[js.Dynamic].applyDynamic("tryCreateRepository")(path.asInstanceOf[js.Any], sourceLinkTemplate.asInstanceOf[js.Any], gitRevision.asInstanceOf[js.Any], gitRemote.asInstanceOf[js.Any], logger.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Repository]]
  }
  
  @JSImport("typedoc/dist/lib/converter/utils/repository", "gitIsInstalled")
  @js.native
  val gitIsInstalled: Boolean = js.native
  
  inline def guessSourceUrlTemplate(remotes: js.Array[String]): js.UndefOr[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("guessSourceUrlTemplate")(remotes.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[String]]
}
