package typings.webpackWatchedGlobEntriesPlugin

import typings.std.Record
import typings.webpack.mod.Plugin
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped webpack.anon.Apply | (this : webpack.webpack.Resolver, arg1 : webpack.webpack.Resolver): void */ @JSImport("webpack-watched-glob-entries-plugin", JSImport.Namespace)
  @js.native
  open class ^ () extends StObject
  @JSImport("webpack-watched-glob-entries-plugin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def getEntries(globs: js.Array[String]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getEntries")(globs.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def getEntries(
    globs: js.Array[String],
    globOptions: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IOptions */ Any
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getEntries")(globs.asInstanceOf[js.Any], globOptions.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getEntries(
    globs: js.Array[String],
    globOptions: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IOptions */ Any,
    pluginOptions: PluginOptions
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getEntries")(globs.asInstanceOf[js.Any], globOptions.asInstanceOf[js.Any], pluginOptions.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def getEntries(globs: js.Array[String], globOptions: Unit, pluginOptions: PluginOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getEntries")(globs.asInstanceOf[js.Any], globOptions.asInstanceOf[js.Any], pluginOptions.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  /* static member */
  inline def getFiles(globString: String): Record[String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFiles")(globString.asInstanceOf[js.Any]).asInstanceOf[Record[String, String]]
  inline def getFiles(
    globString: String,
    globOptions: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IOptions */ Any
  ): Record[String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFiles")(globString.asInstanceOf[js.Any], globOptions.asInstanceOf[js.Any])).asInstanceOf[Record[String, String]]
  inline def getFiles(
    globString: String,
    globOptions: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify IOptions */ Any,
    basename_as_entry_name: Boolean
  ): Record[String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFiles")(globString.asInstanceOf[js.Any], globOptions.asInstanceOf[js.Any], basename_as_entry_name.asInstanceOf[js.Any])).asInstanceOf[Record[String, String]]
  inline def getFiles(globString: String, globOptions: Unit, basename_as_entry_name: Boolean): Record[String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFiles")(globString.asInstanceOf[js.Any], globOptions.asInstanceOf[js.Any], basename_as_entry_name.asInstanceOf[js.Any])).asInstanceOf[Record[String, String]]
  
  trait PluginOptions extends StObject {
    
    var basename_as_entry_name: js.UndefOr[Boolean] = js.undefined
  }
  object PluginOptions {
    
    inline def apply(): PluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PluginOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PluginOptions] (val x: Self) extends AnyVal {
      
      inline def setBasename_as_entry_name(value: Boolean): Self = StObject.set(x, "basename_as_entry_name", value.asInstanceOf[js.Any])
      
      inline def setBasename_as_entry_nameUndefined: Self = StObject.set(x, "basename_as_entry_name", js.undefined)
    }
  }
  
  type WebpackWatchedGlobEntries = Plugin
}
