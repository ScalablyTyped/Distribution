package typings.webpackWatchedGlobEntriesPlugin

import typings.glob.mod.IOptions
import typings.std.Plugin
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("webpack-watched-glob-entries-plugin", JSImport.Namespace)
  @js.native
  class ^ () extends Plugin
  
  /* static member */
  @JSImport("webpack-watched-glob-entries-plugin", "getEntries")
  @js.native
  def getEntries(globs: js.Array[String]): js.Any = js.native
  @JSImport("webpack-watched-glob-entries-plugin", "getEntries")
  @js.native
  def getEntries(globs: js.Array[String], globOptions: js.UndefOr[scala.Nothing], pluginOptions: PluginOptions): js.Any = js.native
  @JSImport("webpack-watched-glob-entries-plugin", "getEntries")
  @js.native
  def getEntries(globs: js.Array[String], globOptions: IOptions): js.Any = js.native
  @JSImport("webpack-watched-glob-entries-plugin", "getEntries")
  @js.native
  def getEntries(globs: js.Array[String], globOptions: IOptions, pluginOptions: PluginOptions): js.Any = js.native
  
  /* static member */
  @JSImport("webpack-watched-glob-entries-plugin", "getFiles")
  @js.native
  def getFiles(globString: String): Record[String, String] = js.native
  @JSImport("webpack-watched-glob-entries-plugin", "getFiles")
  @js.native
  def getFiles(globString: String, globOptions: js.UndefOr[scala.Nothing], basename_as_entry_name: Boolean): Record[String, String] = js.native
  @JSImport("webpack-watched-glob-entries-plugin", "getFiles")
  @js.native
  def getFiles(globString: String, globOptions: IOptions): Record[String, String] = js.native
  @JSImport("webpack-watched-glob-entries-plugin", "getFiles")
  @js.native
  def getFiles(globString: String, globOptions: IOptions, basename_as_entry_name: Boolean): Record[String, String] = js.native
  
  @js.native
  trait PluginOptions extends StObject {
    
    var basename_as_entry_name: js.UndefOr[Boolean] = js.native
  }
  object PluginOptions {
    
    @scala.inline
    def apply(): PluginOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PluginOptions]
    }
    
    @scala.inline
    implicit class PluginOptionsMutableBuilder[Self <: PluginOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBasename_as_entry_name(value: Boolean): Self = StObject.set(x, "basename_as_entry_name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBasename_as_entry_nameUndefined: Self = StObject.set(x, "basename_as_entry_name", js.undefined)
    }
  }
  
  type WebpackWatchedGlobEntries = Plugin
}
