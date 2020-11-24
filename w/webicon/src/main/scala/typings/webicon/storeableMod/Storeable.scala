package typings.webicon.storeableMod

import typings.webicon.downloadableMod.Downloadable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Storeable
  extends Downloadable[scala.Nothing] {
  
  /**
    * Resolves the id of the underlying source.
    *
    * @param id
    * The underlying id of the source.
    *
    * @return
    * The resolved id of the source.
    */
  var iconIdResolver: js.UndefOr[js.Function1[/* id */ String, String]] = js.native
  
  /**
    * A value indicating whether the source is preloadable.
    */
  var preloadable: js.UndefOr[Boolean] = js.native
}
object Storeable {
  
  @scala.inline
  def apply(): Storeable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Storeable]
  }
  
  @scala.inline
  implicit class StoreableOps[Self <: Storeable] (val x: Self) extends AnyVal {
    
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
    def setIconIdResolver(value: /* id */ String => String): Self = this.set("iconIdResolver", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteIconIdResolver: Self = this.set("iconIdResolver", js.undefined)
    
    @scala.inline
    def setPreloadable(value: Boolean): Self = this.set("preloadable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreloadable: Self = this.set("preloadable", js.undefined)
  }
}
