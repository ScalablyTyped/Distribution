package typings.which

import typings.std.Error
import typings.which.whichBooleans.`false`
import typings.which.whichBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /** Finds the first instance of a specified executable in the PATH environment variable */
  @JSImport("which", JSImport.Namespace)
  @js.native
  def apply(cmd: String): js.Promise[String] = js.native
  /** Finds the first instance of a specified executable in the PATH environment variable */
  @JSImport("which", JSImport.Namespace)
  @js.native
  def apply(cmd: String, cb: js.Function2[/* err */ Error | Null, /* path */ js.UndefOr[String], Unit]): Unit = js.native
  /** Finds the first instance of a specified executable in the PATH environment variable */
  @JSImport("which", JSImport.Namespace)
  @js.native
  def apply(cmd: String, options: AsyncOptions with OptionsAll with OptionsFirst): js.Promise[js.Array[String]] = js.native
  /** Finds the first instance of a specified executable in the PATH environment variable */
  @JSImport("which", JSImport.Namespace)
  @js.native
  def apply(
    cmd: String,
    options: (AsyncOptions with OptionsAll with OptionsFirst) | AsyncOptions,
    cb: js.Function2[Error | Null, js.UndefOr[js.Array[String] | String], Unit]
  ): Unit = js.native
  
  /** Finds the first instance of a specified executable in the PATH environment variable */
  @JSImport("which", "sync")
  @js.native
  def sync(cmd: String): String = js.native
  /** Finds the first instance of a specified executable in the PATH environment variable */
  @JSImport("which", "sync")
  @js.native
  def sync(cmd: String, options: Options with OptionsFirst with OptionsThrow): String = js.native
  /** Finds all instances of a specified executable in the PATH environment variable */
  @JSImport("which", "sync")
  @js.native
  def sync_Array(cmd: String, options: Options with OptionsAll with OptionsThrow): js.Array[String] = js.native
  /** Finds all instances of a specified executable in the PATH environment variable */
  /** Finds the first instance of a specified executable in the PATH environment variable */
  @JSImport("which", "sync")
  @js.native
  def sync_Union(cmd: String, options: (Options with OptionsAll with OptionsNoThrow with OptionsFirst) | Options): js.Array[String] | Null = js.native
  
  /** Options for which() async API */
  @js.native
  trait AsyncOptions extends StObject {
    
    /** If true, return all matches, instead of just the first one. Note that this means the function returns an array of strings instead of a single string. */
    var all: js.UndefOr[Boolean] = js.native
    
    /** Use instead of the PATH environment variable. */
    var path: js.UndefOr[String] = js.native
    
    /** Use instead of the PATHEXT environment variable. */
    var pathExt: js.UndefOr[String] = js.native
  }
  object AsyncOptions {
    
    @scala.inline
    def apply(): AsyncOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AsyncOptions]
    }
    
    @scala.inline
    implicit class AsyncOptionsMutableBuilder[Self <: AsyncOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAll(value: Boolean): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathExt(value: String): Self = StObject.set(x, "pathExt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathExtUndefined: Self = StObject.set(x, "pathExt", js.undefined)
      
      @scala.inline
      def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
  
  /** Options for which() sync and async APIs */
  @js.native
  trait Options extends AsyncOptions {
    
    /** If true, returns null when not found */
    var nothrow: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNothrow(value: Boolean): Self = StObject.set(x, "nothrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNothrowUndefined: Self = StObject.set(x, "nothrow", js.undefined)
    }
  }
  
  /** Options that ask for all matches. */
  @js.native
  trait OptionsAll extends AsyncOptions {
    
    @JSName("all")
    var all_OptionsAll: `true` = js.native
  }
  object OptionsAll {
    
    @scala.inline
    def apply(all: `true`): OptionsAll = {
      val __obj = js.Dynamic.literal(all = all.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionsAll]
    }
    
    @scala.inline
    implicit class OptionsAllMutableBuilder[Self <: OptionsAll] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAll(value: `true`): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    }
  }
  
  /** Options that ask for the first match (the default behavior) */
  @js.native
  trait OptionsFirst extends AsyncOptions {
    
    @JSName("all")
    var all_OptionsFirst: js.UndefOr[`false`] = js.native
  }
  object OptionsFirst {
    
    @scala.inline
    def apply(): OptionsFirst = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsFirst]
    }
    
    @scala.inline
    implicit class OptionsFirstMutableBuilder[Self <: OptionsFirst] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAll(value: `false`): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
    }
  }
  
  /** Options that ask to receive null instead of a thrown error */
  @js.native
  trait OptionsNoThrow extends Options {
    
    @JSName("nothrow")
    var nothrow_OptionsNoThrow: `true` = js.native
  }
  object OptionsNoThrow {
    
    @scala.inline
    def apply(nothrow: `true`): OptionsNoThrow = {
      val __obj = js.Dynamic.literal(nothrow = nothrow.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionsNoThrow]
    }
    
    @scala.inline
    implicit class OptionsNoThrowMutableBuilder[Self <: OptionsNoThrow] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNothrow(value: `true`): Self = StObject.set(x, "nothrow", value.asInstanceOf[js.Any])
    }
  }
  
  /** Options that ask for a thrown error if executable is not found (the default behavior) */
  @js.native
  trait OptionsThrow extends Options {
    
    @JSName("nothrow")
    var nothrow_OptionsThrow: js.UndefOr[`false`] = js.native
  }
  object OptionsThrow {
    
    @scala.inline
    def apply(): OptionsThrow = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsThrow]
    }
    
    @scala.inline
    implicit class OptionsThrowMutableBuilder[Self <: OptionsThrow] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNothrow(value: `false`): Self = StObject.set(x, "nothrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNothrowUndefined: Self = StObject.set(x, "nothrow", js.undefined)
    }
  }
}
