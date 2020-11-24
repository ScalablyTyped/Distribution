package typings.webpackEntryManifestPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * Assets manifest filename
    * @default 'manifest.json'
    */
  var filename: js.UndefOr[String] = js.native
  
  /**
    * Assets path filter function
    * @default () => true
    */
  var filter: js.UndefOr[js.Function2[/* path */ String, /* chunk */ String, Boolean]] = js.native
  
  /**
    * Assets path map function
    * @default path => path
    */
  var map: js.UndefOr[js.Function2[/* path */ String, /* chunk */ String, String]] = js.native
  
  /**
    * Assets manifest serialize function
    * @default manifest => JSON.stringify(manifest)
    */
  var serialize: js.UndefOr[js.Function1[/* manifest */ js.Any, String]] = js.native
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
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    
    @scala.inline
    def setFilter(value: (/* path */ String, /* chunk */ String) => Boolean): Self = this.set("filter", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setMap(value: (/* path */ String, /* chunk */ String) => String): Self = this.set("map", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteMap: Self = this.set("map", js.undefined)
    
    @scala.inline
    def setSerialize(value: /* manifest */ js.Any => String): Self = this.set("serialize", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSerialize: Self = this.set("serialize", js.undefined)
  }
}
