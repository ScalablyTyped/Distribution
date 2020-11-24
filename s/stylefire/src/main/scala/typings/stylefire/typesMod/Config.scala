package typings.stylefire.typesMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Config extends js.Object {
  
  var aliasMap: js.UndefOr[StringDictionary[String]] = js.native
  
  def onRead(key: String, props: Props): js.Any = js.native
  
  def onRender(state: State, props: Props, changedValues: ChangedValues): Unit = js.native
  
  var uncachedValues: js.UndefOr[Set[String]] = js.native
  
  var useCache: js.UndefOr[Boolean] = js.native
}
object Config {
  
  @scala.inline
  def apply(onRead: (String, Props) => js.Any, onRender: (State, Props, ChangedValues) => Unit): Config = {
    val __obj = js.Dynamic.literal(onRead = js.Any.fromFunction2(onRead), onRender = js.Any.fromFunction3(onRender))
    __obj.asInstanceOf[Config]
  }
  
  @scala.inline
  implicit class ConfigOps[Self <: Config] (val x: Self) extends AnyVal {
    
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
    def setOnRead(value: (String, Props) => js.Any): Self = this.set("onRead", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnRender(value: (State, Props, ChangedValues) => Unit): Self = this.set("onRender", js.Any.fromFunction3(value))
    
    @scala.inline
    def setAliasMap(value: StringDictionary[String]): Self = this.set("aliasMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAliasMap: Self = this.set("aliasMap", js.undefined)
    
    @scala.inline
    def setUncachedValues(value: Set[String]): Self = this.set("uncachedValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUncachedValues: Self = this.set("uncachedValues", js.undefined)
    
    @scala.inline
    def setUseCache(value: Boolean): Self = this.set("useCache", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseCache: Self = this.set("useCache", js.undefined)
  }
}
