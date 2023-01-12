package typings.yeomanGenerator

import typings.ejs.mod.Data
import typings.ejs.mod.Options
import typings.jsonSchema.mod.JSONSchema7Type
import typings.memFsEditor.mod.CopyOptions
import typings.memFsEditor.mod.FilePaths
import typings.memFsEditor.mod.ReadRawContents
import typings.memFsEditor.mod.ReadRawOptions
import typings.memFsEditor.mod.ReadStringOptions
import typings.memFsEditor.mod.WithGlobOptions
import typings.memFsEditor.mod.WriteJsonReplacer
import typings.memFsEditor.mod.WriteJsonSpace
import typings.yeomanGenerator.libUtilStorageMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Email extends StObject {
    
    /**
      * Retrieves user's email from Git in the global scope or the project scope
      * (it'll take what Git will use in the current context)
      * @return configured git email or undefined
      */
    def email(): String
    
    /**
      * Retrieves user's name from Git in the global scope or the project scope
      * (it'll take what Git will use in the current context)
      * @return configured git name or undefined
      */
    def name(): String
  }
  object Email {
    
    inline def apply(email: () => String, name: () => String): Email = {
      val __obj = js.Dynamic.literal(email = js.Any.fromFunction0(email), name = js.Any.fromFunction0(name))
      __obj.asInstanceOf[Email]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Email] (val x: Self) extends AnyVal {
      
      inline def setEmail(value: () => String): Self = StObject.set(x, "email", js.Any.fromFunction0(value))
      
      inline def setName(value: () => String): Self = StObject.set(x, "name", js.Any.fromFunction0(value))
    }
  }
  
  trait ExportOption extends StObject {
    
    /**
      * A value indicating whether an option should be exported for this question.
      */
    var exportOption: js.UndefOr[Boolean | js.Object] = js.undefined
    
    /**
      * The storage to store the answers.
      */
    var storage: js.UndefOr[^] = js.undefined
  }
  object ExportOption {
    
    inline def apply(): ExportOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExportOption]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExportOption] (val x: Self) extends AnyVal {
      
      inline def setExportOption(value: Boolean | js.Object): Self = StObject.set(x, "exportOption", value.asInstanceOf[js.Any])
      
      inline def setExportOptionUndefined: Self = StObject.set(x, "exportOption", js.undefined)
      
      inline def setStorage(value: ^): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
      
      inline def setStorageUndefined: Self = StObject.set(x, "storage", js.undefined)
    }
  }
  
  @js.native
  trait Fn0 extends StObject {
    
    def apply(filepath: String): String = js.native
    def apply(filepath: String, options: ReadRawOptions): ReadRawContents = js.native
    def apply(filepath: String, options: ReadStringOptions): String = js.native
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(from: FilePaths, to: String): Unit = js.native
    def apply(from: FilePaths, to: String, options: Unit, context: Unit, templateOptions: Options): Unit = js.native
    def apply(from: FilePaths, to: String, options: Unit, context: Data): Unit = js.native
    def apply(from: FilePaths, to: String, options: Unit, context: Data, templateOptions: Options): Unit = js.native
    def apply(from: FilePaths, to: String, options: CopyOptions): Unit = js.native
    def apply(from: FilePaths, to: String, options: CopyOptions, context: Unit, templateOptions: Options): Unit = js.native
    def apply(from: FilePaths, to: String, options: CopyOptions, context: Data): Unit = js.native
    def apply(from: FilePaths, to: String, options: CopyOptions, context: Data, templateOptions: Options): Unit = js.native
  }
  
  @js.native
  trait FnCallFilepathContentsReplacerSpace extends StObject {
    
    def apply(filepath: String, contents: Any): String = js.native
    def apply(filepath: String, contents: Any, replacer: Unit, space: WriteJsonSpace): String = js.native
    def apply(filepath: String, contents: Any, replacer: WriteJsonReplacer): String = js.native
    def apply(filepath: String, contents: Any, replacer: WriteJsonReplacer, space: WriteJsonSpace): String = js.native
  }
  
  @js.native
  trait FnCallFilepathDefaults extends StObject {
    
    def apply(filepath: String): js.UndefOr[JSONSchema7Type] = js.native
    def apply(filepath: String, defaults: JSONSchema7Type): JSONSchema7Type = js.native
  }
  
  @js.native
  trait FnCallFilepathOptions extends StObject {
    
    def apply(filepath: FilePaths): Unit = js.native
    def apply(filepath: FilePaths, options: WithGlobOptions): Unit = js.native
  }
  
  @js.native
  trait FnCallFromToOptions extends StObject {
    
    def apply(from: FilePaths, to: String): Unit = js.native
    def apply(from: FilePaths, to: String, options: WithGlobOptions): Unit = js.native
  }
  
  trait Git extends StObject {
    
    val git: Email
    
    val github: Username
  }
  object Git {
    
    inline def apply(git: Email, github: Username): Git = {
      val __obj = js.Dynamic.literal(git = git.asInstanceOf[js.Any], github = github.asInstanceOf[js.Any])
      __obj.asInstanceOf[Git]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Git] (val x: Self) extends AnyVal {
      
      inline def setGit(value: Email): Self = StObject.set(x, "git", value.asInstanceOf[js.Any])
      
      inline def setGithub(value: Username): Self = StObject.set(x, "github", value.asInstanceOf[js.Any])
    }
  }
  
  trait Store extends StObject {
    
    /**
      * A value indicating whether to store the user's previous answer.
      */
    var store: js.UndefOr[Boolean] = js.undefined
  }
  object Store {
    
    inline def apply(): Store = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Store]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Store] (val x: Self) extends AnyVal {
      
      inline def setStore(value: Boolean): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      inline def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
    }
  }
  
  trait Username extends StObject {
    
    /**
      * Retrieves GitHub's username from the GitHub API
      * @return Resolved with the GitHub username or rejected if unable to
      *         get the information
      */
    def username(): js.Promise[String]
  }
  object Username {
    
    inline def apply(username: () => js.Promise[String]): Username = {
      val __obj = js.Dynamic.literal(username = js.Any.fromFunction0(username))
      __obj.asInstanceOf[Username]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Username] (val x: Self) extends AnyVal {
      
      inline def setUsername(value: () => js.Promise[String]): Self = StObject.set(x, "username", js.Any.fromFunction0(value))
    }
  }
}
