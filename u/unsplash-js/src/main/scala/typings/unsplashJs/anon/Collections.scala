package typings.unsplashJs.anon

import typings.unsplashJs.mod.CollectionIds
import typings.unsplashJs.mod.ContentSafety
import typings.unsplashJs.mod.Languages
import typings.unsplashJs.unsplashJsStrings.black
import typings.unsplashJs.unsplashJsStrings.black_and_white
import typings.unsplashJs.unsplashJsStrings.blue
import typings.unsplashJs.unsplashJsStrings.green
import typings.unsplashJs.unsplashJsStrings.latest
import typings.unsplashJs.unsplashJsStrings.magenta
import typings.unsplashJs.unsplashJsStrings.orange
import typings.unsplashJs.unsplashJsStrings.purple
import typings.unsplashJs.unsplashJsStrings.red
import typings.unsplashJs.unsplashJsStrings.relevant
import typings.unsplashJs.unsplashJsStrings.teal
import typings.unsplashJs.unsplashJsStrings.white
import typings.unsplashJs.unsplashJsStrings.yellow
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Collections extends js.Object {
  
  var collections: js.UndefOr[CollectionIds] = js.native
  
  var color: js.UndefOr[
    black_and_white | black | white | yellow | orange | red | purple | magenta | green | teal | blue
  ] = js.native
  
  var contentFilter: js.UndefOr[ContentSafety] = js.native
  
  var lang: js.UndefOr[Languages] = js.native
  
  var orderBy: js.UndefOr[latest | relevant] = js.native
  
  var orientation: js.UndefOr[typings.unsplashJs.mod.Orientation] = js.native
}
object Collections {
  
  @scala.inline
  def apply(): Collections = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Collections]
  }
  
  @scala.inline
  implicit class CollectionsOps[Self <: Collections] (val x: Self) extends AnyVal {
    
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
    def setCollectionsVarargs(value: (Double | String)*): Self = this.set("collections", js.Array(value :_*))
    
    @scala.inline
    def setCollections(value: CollectionIds): Self = this.set("collections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollections: Self = this.set("collections", js.undefined)
    
    @scala.inline
    def setColor(
      value: black_and_white | black | white | yellow | orange | red | purple | magenta | green | teal | blue
    ): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setContentFilter(value: ContentSafety): Self = this.set("contentFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentFilter: Self = this.set("contentFilter", js.undefined)
    
    @scala.inline
    def setLang(value: Languages): Self = this.set("lang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLang: Self = this.set("lang", js.undefined)
    
    @scala.inline
    def setOrderBy(value: latest | relevant): Self = this.set("orderBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrderBy: Self = this.set("orderBy", js.undefined)
    
    @scala.inline
    def setOrientation(value: typings.unsplashJs.mod.Orientation): Self = this.set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
  }
}
