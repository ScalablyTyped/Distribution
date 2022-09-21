package typings.which

import typings.which.whichBooleans.`false`
import typings.which.whichBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(cmd: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].apply(cmd.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  inline def apply(cmd: String, cb: js.Function2[/* err */ js.Error | Null, /* path */ js.UndefOr[String], Unit]): Unit = (^.asInstanceOf[js.Dynamic].apply(cmd.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(cmd: String, options: AsyncOptions & OptionsAll & OptionsFirst): js.Promise[js.Array[String]] = (^.asInstanceOf[js.Dynamic].apply(cmd.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[String]]]
  inline def apply(
    cmd: String,
    options: (AsyncOptions & OptionsAll & OptionsFirst) | AsyncOptions,
    cb: js.Function2[js.Error | Null, js.UndefOr[js.Array[String] | String], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(cmd.asInstanceOf[js.Any], options.asInstanceOf[js.Any], cb.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("which", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def sync(cmd: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sync")(cmd.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def sync(cmd: String, options: Options & OptionsFirst & OptionsThrow): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(cmd.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def sync_Array(cmd: String, options: Options & OptionsAll & OptionsThrow): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(cmd.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  /** Finds all instances of a specified executable in the PATH environment variable */
  inline def sync_Union(cmd: String, options: (Options & OptionsAll & OptionsNoThrow & OptionsFirst) | Options): js.Array[String] | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("sync")(cmd.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String] | Null]
  
  /** Options for which() async API */
  trait AsyncOptions extends StObject {
    
    /** If true, return all matches, instead of just the first one. Note that this means the function returns an array of strings instead of a single string. */
    var all: js.UndefOr[Boolean] = js.undefined
    
    /** Use instead of the PATH environment variable. */
    var path: js.UndefOr[String] = js.undefined
    
    /** Use instead of the PATHEXT environment variable. */
    var pathExt: js.UndefOr[String] = js.undefined
  }
  object AsyncOptions {
    
    inline def apply(): AsyncOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AsyncOptions]
    }
    
    extension [Self <: AsyncOptions](x: Self) {
      
      inline def setAll(value: Boolean): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
      
      inline def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathExt(value: String): Self = StObject.set(x, "pathExt", value.asInstanceOf[js.Any])
      
      inline def setPathExtUndefined: Self = StObject.set(x, "pathExt", js.undefined)
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    }
  }
  
  /** Options for which() sync and async APIs */
  trait Options
    extends StObject
       with AsyncOptions {
    
    /** If true, returns null when not found */
    var nothrow: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setNothrow(value: Boolean): Self = StObject.set(x, "nothrow", value.asInstanceOf[js.Any])
      
      inline def setNothrowUndefined: Self = StObject.set(x, "nothrow", js.undefined)
    }
  }
  
  /** Options that ask for all matches. */
  trait OptionsAll
    extends StObject
       with AsyncOptions {
    
    @JSName("all")
    var all_OptionsAll: `true`
  }
  object OptionsAll {
    
    inline def apply(): OptionsAll = {
      val __obj = js.Dynamic.literal(all = true)
      __obj.asInstanceOf[OptionsAll]
    }
    
    extension [Self <: OptionsAll](x: Self) {
      
      inline def setAll(value: `true`): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
    }
  }
  
  /** Options that ask for the first match (the default behavior) */
  trait OptionsFirst
    extends StObject
       with AsyncOptions {
    
    @JSName("all")
    var all_OptionsFirst: js.UndefOr[`false`] = js.undefined
  }
  object OptionsFirst {
    
    inline def apply(): OptionsFirst = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsFirst]
    }
    
    extension [Self <: OptionsFirst](x: Self) {
      
      inline def setAll(value: `false`): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
      
      inline def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
    }
  }
  
  /** Options that ask to receive null instead of a thrown error */
  trait OptionsNoThrow
    extends StObject
       with Options {
    
    @JSName("nothrow")
    var nothrow_OptionsNoThrow: `true`
  }
  object OptionsNoThrow {
    
    inline def apply(): OptionsNoThrow = {
      val __obj = js.Dynamic.literal(nothrow = true)
      __obj.asInstanceOf[OptionsNoThrow]
    }
    
    extension [Self <: OptionsNoThrow](x: Self) {
      
      inline def setNothrow(value: `true`): Self = StObject.set(x, "nothrow", value.asInstanceOf[js.Any])
    }
  }
  
  /** Options that ask for a thrown error if executable is not found (the default behavior) */
  trait OptionsThrow
    extends StObject
       with Options {
    
    @JSName("nothrow")
    var nothrow_OptionsThrow: js.UndefOr[`false`] = js.undefined
  }
  object OptionsThrow {
    
    inline def apply(): OptionsThrow = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptionsThrow]
    }
    
    extension [Self <: OptionsThrow](x: Self) {
      
      inline def setNothrow(value: `false`): Self = StObject.set(x, "nothrow", value.asInstanceOf[js.Any])
      
      inline def setNothrowUndefined: Self = StObject.set(x, "nothrow", js.undefined)
    }
  }
}
