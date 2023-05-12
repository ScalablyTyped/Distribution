package typings.vscodeTextmate

import org.scalablytyped.runtime.StringDictionary
import typings.vscodeTextmate.mod.RegistryOptions
import typings.vscodeTextmate.releaseOnigLibMod.IOnigLib
import typings.vscodeTextmate.releaseRawGrammarMod.IRawGrammar
import typings.vscodeTextmate.releaseThemeMod.ScopeName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object releaseTestsResolverMod {
  
  @JSImport("vscode-textmate/release/tests/resolver", "Resolver")
  @js.native
  open class Resolver protected ()
    extends StObject
       with RegistryOptions {
    def this(
      grammars: js.Array[IGrammarRegistration],
      languages: js.Array[ILanguageRegistration],
      onigLibPromise: js.Promise[IOnigLib]
    ) = this()
    
    /* private */ val _grammars: Any = js.native
    
    /* private */ var _id2language: Any = js.native
    
    /* private */ val _languages: Any = js.native
    
    /* private */ var _lastLanguageId: Any = js.native
    
    def findGrammarByLanguage(language: String): IGrammarRegistration = js.native
    
    def findLanguageByExtension(fileExtension: String): String | Null = js.native
    
    def findLanguageByFilename(filename: String): String | Null = js.native
    
    def findScopeByFilename(filename: String): String | Null = js.native
    
    val language2id: StringDictionary[Double] = js.native
    
    /* CompleteClass */
    override def loadGrammar(scopeName: ScopeName): js.Promise[js.UndefOr[IRawGrammar | Null]] = js.native
    
    /* CompleteClass */
    var onigLib: js.Promise[IOnigLib] = js.native
  }
  
  trait IGrammarRegistration extends StObject {
    
    var embeddedLanguages: StringDictionary[String]
    
    var grammar: js.UndefOr[js.Promise[IRawGrammar]] = js.undefined
    
    var language: String
    
    var path: String
    
    var scopeName: String
  }
  object IGrammarRegistration {
    
    inline def apply(embeddedLanguages: StringDictionary[String], language: String, path: String, scopeName: String): IGrammarRegistration = {
      val __obj = js.Dynamic.literal(embeddedLanguages = embeddedLanguages.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], scopeName = scopeName.asInstanceOf[js.Any])
      __obj.asInstanceOf[IGrammarRegistration]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IGrammarRegistration] (val x: Self) extends AnyVal {
      
      inline def setEmbeddedLanguages(value: StringDictionary[String]): Self = StObject.set(x, "embeddedLanguages", value.asInstanceOf[js.Any])
      
      inline def setGrammar(value: js.Promise[IRawGrammar]): Self = StObject.set(x, "grammar", value.asInstanceOf[js.Any])
      
      inline def setGrammarUndefined: Self = StObject.set(x, "grammar", js.undefined)
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setScopeName(value: String): Self = StObject.set(x, "scopeName", value.asInstanceOf[js.Any])
    }
  }
  
  trait ILanguageRegistration extends StObject {
    
    var extensions: js.Array[String]
    
    var filenames: js.Array[String]
    
    var id: String
  }
  object ILanguageRegistration {
    
    inline def apply(extensions: js.Array[String], filenames: js.Array[String], id: String): ILanguageRegistration = {
      val __obj = js.Dynamic.literal(extensions = extensions.asInstanceOf[js.Any], filenames = filenames.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[ILanguageRegistration]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ILanguageRegistration] (val x: Self) extends AnyVal {
      
      inline def setExtensions(value: js.Array[String]): Self = StObject.set(x, "extensions", value.asInstanceOf[js.Any])
      
      inline def setExtensionsVarargs(value: String*): Self = StObject.set(x, "extensions", js.Array(value*))
      
      inline def setFilenames(value: js.Array[String]): Self = StObject.set(x, "filenames", value.asInstanceOf[js.Any])
      
      inline def setFilenamesVarargs(value: String*): Self = StObject.set(x, "filenames", js.Array(value*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
}
