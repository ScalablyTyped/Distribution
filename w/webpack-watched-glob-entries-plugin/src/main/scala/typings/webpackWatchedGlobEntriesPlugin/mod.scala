package typings.webpackWatchedGlobEntriesPlugin

import typings.glob.mod.IOptions
import typings.std.Plugin
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("webpack-watched-glob-entries-plugin", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with Plugin
  @JSImport("webpack-watched-glob-entries-plugin", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def getEntries(globs: js.Array[String]): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("getEntries")(globs.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  inline def getEntries(globs: js.Array[String], globOptions: Unit, pluginOptions: PluginOptions): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getEntries")(globs.asInstanceOf[js.Any], globOptions.asInstanceOf[js.Any], pluginOptions.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def getEntries(globs: js.Array[String], globOptions: IOptions): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getEntries")(globs.asInstanceOf[js.Any], globOptions.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  inline def getEntries(globs: js.Array[String], globOptions: IOptions, pluginOptions: PluginOptions): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getEntries")(globs.asInstanceOf[js.Any], globOptions.asInstanceOf[js.Any], pluginOptions.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  /* static member */
  inline def getFiles(globString: String): Record[String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getFiles")(globString.asInstanceOf[js.Any]).asInstanceOf[Record[String, String]]
  inline def getFiles(globString: String, globOptions: Unit, basename_as_entry_name: Boolean): Record[String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFiles")(globString.asInstanceOf[js.Any], globOptions.asInstanceOf[js.Any], basename_as_entry_name.asInstanceOf[js.Any])).asInstanceOf[Record[String, String]]
  inline def getFiles(globString: String, globOptions: IOptions): Record[String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFiles")(globString.asInstanceOf[js.Any], globOptions.asInstanceOf[js.Any])).asInstanceOf[Record[String, String]]
  inline def getFiles(globString: String, globOptions: IOptions, basename_as_entry_name: Boolean): Record[String, String] = (^.asInstanceOf[js.Dynamic].applyDynamic("getFiles")(globString.asInstanceOf[js.Any], globOptions.asInstanceOf[js.Any], basename_as_entry_name.asInstanceOf[js.Any])).asInstanceOf[Record[String, String]]
  
  trait PluginOptions extends StObject {
    
    var basename_as_entry_name: js.UndefOr[Boolean] = js.undefined
  }
  object PluginOptions {
    
    inline def apply(): PluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PluginOptions]
    }
    
    extension [Self <: PluginOptions](x: Self) {
      
      inline def setBasename_as_entry_name(value: Boolean): Self = StObject.set(x, "basename_as_entry_name", value.asInstanceOf[js.Any])
      
      inline def setBasename_as_entry_nameUndefined: Self = StObject.set(x, "basename_as_entry_name", js.undefined)
    }
  }
  
  type WebpackWatchedGlobEntries = Plugin
}
