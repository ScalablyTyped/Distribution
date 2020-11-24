package typings.yeomanTest.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RunContextSettings extends js.Object {
  
  /**
    * Namespace (only used if Generator is a constructor)
    * @default 'gen:test'
    */
  var namespace: js.UndefOr[String] = js.native
  
  /**
    * File path to the generator (only used if Generator is a constructor)
    */
  var resolved: js.UndefOr[String] = js.native
  
  /**
    * Automatically run this generator in a tmp dir
    * @default true
    */
  var tmpdir: js.UndefOr[Boolean] = js.native
}
object RunContextSettings {
  
  @scala.inline
  def apply(): RunContextSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RunContextSettings]
  }
  
  @scala.inline
  implicit class RunContextSettingsOps[Self <: RunContextSettings] (val x: Self) extends AnyVal {
    
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
    def setNamespace(value: String): Self = this.set("namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNamespace: Self = this.set("namespace", js.undefined)
    
    @scala.inline
    def setResolved(value: String): Self = this.set("resolved", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolved: Self = this.set("resolved", js.undefined)
    
    @scala.inline
    def setTmpdir(value: Boolean): Self = this.set("tmpdir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTmpdir: Self = this.set("tmpdir", js.undefined)
  }
}
