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
import typings.yeomanGenerator.storageMod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Email extends StObject {
    
    /**
      * Retrieves user's email from Git in the global scope or the project scope
      * (it'll take what Git will use in the current context)
      * @return configured git email or undefined
      */
    def email(): String = js.native
    
    /**
      * Retrieves user's name from Git in the global scope or the project scope
      * (it'll take what Git will use in the current context)
      * @return configured git name or undefined
      */
    def name(): String = js.native
  }
  object Email {
    
    @scala.inline
    def apply(email: () => String, name: () => String): Email = {
      val __obj = js.Dynamic.literal(email = js.Any.fromFunction0(email), name = js.Any.fromFunction0(name))
      __obj.asInstanceOf[Email]
    }
    
    @scala.inline
    implicit class EmailMutableBuilder[Self <: Email] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEmail(value: () => String): Self = StObject.set(x, "email", js.Any.fromFunction0(value))
      
      @scala.inline
      def setName(value: () => String): Self = StObject.set(x, "name", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait ExportOption extends StObject {
    
    /**
      * A value indicating whether an option should be exported for this question.
      */
    var exportOption: js.UndefOr[Boolean | js.Object] = js.native
    
    /**
      * The storage to store the answers.
      */
    var storage: js.UndefOr[^] = js.native
  }
  object ExportOption {
    
    @scala.inline
    def apply(): ExportOption = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExportOption]
    }
    
    @scala.inline
    implicit class ExportOptionMutableBuilder[Self <: ExportOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExportOption(value: Boolean | js.Object): Self = StObject.set(x, "exportOption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExportOptionUndefined: Self = StObject.set(x, "exportOption", js.undefined)
      
      @scala.inline
      def setStorage(value: ^): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageUndefined: Self = StObject.set(x, "storage", js.undefined)
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
    def apply(
      from: FilePaths,
      to: String,
      options: js.UndefOr[scala.Nothing],
      context: js.UndefOr[scala.Nothing],
      templateOptions: Options
    ): Unit = js.native
    def apply(from: FilePaths, to: String, options: js.UndefOr[scala.Nothing], context: Data): Unit = js.native
    def apply(
      from: FilePaths,
      to: String,
      options: js.UndefOr[scala.Nothing],
      context: Data,
      templateOptions: Options
    ): Unit = js.native
    def apply(from: FilePaths, to: String, options: CopyOptions): Unit = js.native
    def apply(
      from: FilePaths,
      to: String,
      options: CopyOptions,
      context: js.UndefOr[scala.Nothing],
      templateOptions: Options
    ): Unit = js.native
    def apply(from: FilePaths, to: String, options: CopyOptions, context: Data): Unit = js.native
    def apply(from: FilePaths, to: String, options: CopyOptions, context: Data, templateOptions: Options): Unit = js.native
  }
  
  @js.native
  trait FnCallFilepathContentsReplacerSpace extends StObject {
    
    def apply(filepath: String, contents: js.Any): String = js.native
    def apply(filepath: String, contents: js.Any, replacer: js.UndefOr[WriteJsonReplacer], space: WriteJsonSpace): String = js.native
    def apply(filepath: String, contents: js.Any, replacer: WriteJsonReplacer): String = js.native
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
  
  @js.native
  trait Git extends StObject {
    
    val git: Email = js.native
    
    val github: Username = js.native
  }
  object Git {
    
    @scala.inline
    def apply(git: Email, github: Username): Git = {
      val __obj = js.Dynamic.literal(git = git.asInstanceOf[js.Any], github = github.asInstanceOf[js.Any])
      __obj.asInstanceOf[Git]
    }
    
    @scala.inline
    implicit class GitMutableBuilder[Self <: Git] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGit(value: Email): Self = StObject.set(x, "git", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGithub(value: Username): Self = StObject.set(x, "github", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Store extends StObject {
    
    /**
      * A value indicating whether to store the user's previous answer.
      */
    var store: js.UndefOr[Boolean] = js.native
  }
  object Store {
    
    @scala.inline
    def apply(): Store = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Store]
    }
    
    @scala.inline
    implicit class StoreMutableBuilder[Self <: Store] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStore(value: Boolean): Self = StObject.set(x, "store", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStoreUndefined: Self = StObject.set(x, "store", js.undefined)
    }
  }
  
  @js.native
  trait Username extends StObject {
    
    /**
      * Retrieves GitHub's username from the GitHub API
      * @return Resolved with the GitHub username or rejected if unable to
      *         get the information
      */
    def username(): js.Promise[String] = js.native
  }
  object Username {
    
    @scala.inline
    def apply(username: () => js.Promise[String]): Username = {
      val __obj = js.Dynamic.literal(username = js.Any.fromFunction0(username))
      __obj.asInstanceOf[Username]
    }
    
    @scala.inline
    implicit class UsernameMutableBuilder[Self <: Username] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUsername(value: () => js.Promise[String]): Self = StObject.set(x, "username", js.Any.fromFunction0(value))
    }
  }
}
