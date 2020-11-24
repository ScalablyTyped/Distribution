package typings.tern.ternMod

import org.scalablytyped.runtime.StringDictionary
import typings.tern.ternNumbers.`5`
import typings.tern.ternNumbers.`6`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CtorOptions extends js.Object {
  
  /** The definition objects to load into the server’s environment. */
  var defs: js.UndefOr[js.Array[Def]] = js.native
  
  /** The ECMAScript version to parse. Should be either 5 or 6. Default is 6. */
  var ecmaVersion: js.UndefOr[`5` | `6`] = js.native
  
  /** Indicates the maximum amount of milliseconds to wait for an asynchronous getFile before giving up on it. Defaults to 1000. */
  var fetchTimeout: js.UndefOr[Double] = js.native
  
  /** Specifies the set of plugins that the server should load. The property names of the object name the plugins, and their values hold options that will be passed to them. */
  var plugins: js.UndefOr[StringDictionary[js.Object]] = js.native
}
object CtorOptions {
  
  @scala.inline
  def apply(): CtorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CtorOptions]
  }
  
  @scala.inline
  implicit class CtorOptionsOps[Self <: CtorOptions] (val x: Self) extends AnyVal {
    
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
    def setDefsVarargs(value: Def*): Self = this.set("defs", js.Array(value :_*))
    
    @scala.inline
    def setDefs(value: js.Array[Def]): Self = this.set("defs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefs: Self = this.set("defs", js.undefined)
    
    @scala.inline
    def setEcmaVersion(value: `5` | `6`): Self = this.set("ecmaVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEcmaVersion: Self = this.set("ecmaVersion", js.undefined)
    
    @scala.inline
    def setFetchTimeout(value: Double): Self = this.set("fetchTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFetchTimeout: Self = this.set("fetchTimeout", js.undefined)
    
    @scala.inline
    def setPlugins(value: StringDictionary[js.Object]): Self = this.set("plugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
  }
}
