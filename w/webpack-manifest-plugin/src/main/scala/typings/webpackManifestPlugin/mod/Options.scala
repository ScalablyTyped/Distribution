package typings.webpackManifestPlugin.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * A path prefix for all keys. Useful for including your output path in the manifest.
    */
  var basePath: js.UndefOr[String] = js.native
  
  /**
    * The manifest filename in your output directory.
    * Default: manifest.json
    */
  var fileName: js.UndefOr[String] = js.native
  
  /**
    * Filter out files.
    */
  var filter: js.UndefOr[js.Function1[/* file */ FileDescriptor, Boolean]] = js.native
  
  /**
    * Create the manifest. It can return anything as long as it's serialisable by JSON.stringify.
    */
  var generate: js.UndefOr[
    js.Function3[
      /* seed */ js.Object, 
      /* files */ js.Array[FileDescriptor], 
      /* entrypoints */ StringDictionary[js.Array[String]], 
      js.Object
    ]
  ] = js.native
  
  /**
    * Modify files details before the manifest is created.
    */
  var map: js.UndefOr[js.Function1[/* file */ FileDescriptor, FileDescriptor]] = js.native
  
  /**
    * A path prefix that will be added to values of the manifest.
    * Default: output.publicPath
    */
  var publicPath: js.UndefOr[String] = js.native
  
  /**
    * A cache of key/value pairs to used to seed the manifest. This may include a set of custom key/value pairs to include in your manifest,
    * or may be used to combine manifests across compilations in multi-compiler mode.
    * To combine manifests, pass a shared seed object to each compiler's ManifestPlugin instance.
    * Default: {}
    */
  var seed: js.UndefOr[js.Object] = js.native
  
  /**
    * Output manifest file in different format then json (i.e. yaml).
    */
  var serialize: js.UndefOr[js.Function1[/* manifest */ js.Object, String]] = js.native
  
  /**
    * Sort files before they are passed to generate.
    */
  var sort: js.UndefOr[js.Function2[/* a */ FileDescriptor, /* b */ FileDescriptor, Double]] = js.native
  
  /**
    * If set to true will emit to build folder and memory in combination with webpack-dev-server
    * Default: false
    */
  var writeToFileEmit: js.UndefOr[Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setBasePath(value: String): Self = this.set("basePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBasePath: Self = this.set("basePath", js.undefined)
    
    @scala.inline
    def setFileName(value: String): Self = this.set("fileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFileName: Self = this.set("fileName", js.undefined)
    
    @scala.inline
    def setFilter(value: /* file */ FileDescriptor => Boolean): Self = this.set("filter", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setGenerate(
      value: (/* seed */ js.Object, /* files */ js.Array[FileDescriptor], /* entrypoints */ StringDictionary[js.Array[String]]) => js.Object
    ): Self = this.set("generate", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteGenerate: Self = this.set("generate", js.undefined)
    
    @scala.inline
    def setMap(value: /* file */ FileDescriptor => FileDescriptor): Self = this.set("map", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
    
    @scala.inline
    def setPublicPath(value: String): Self = this.set("publicPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicPath: Self = this.set("publicPath", js.undefined)
    
    @scala.inline
    def setSeed(value: js.Object): Self = this.set("seed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeed: Self = this.set("seed", js.undefined)
    
    @scala.inline
    def setSerialize(value: /* manifest */ js.Object => String): Self = this.set("serialize", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSerialize: Self = this.set("serialize", js.undefined)
    
    @scala.inline
    def setSort(value: (/* a */ FileDescriptor, /* b */ FileDescriptor) => Double): Self = this.set("sort", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
    
    @scala.inline
    def setWriteToFileEmit(value: Boolean): Self = this.set("writeToFileEmit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWriteToFileEmit: Self = this.set("writeToFileEmit", js.undefined)
  }
}
