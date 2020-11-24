package typings.typescriptTuple.anon

import typings.typescriptTuple.typescriptTupleStrings.InfiniteTuple
import typings.typescriptTuple.typescriptTupleStrings.`Cannot reverse an infinite tuple`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CODENAME extends js.Object {
  
  var CODENAME: InfiniteTuple = js.native
  
  var ERROR: `Cannot reverse an infinite tuple` = js.native
}
object CODENAME {
  
  @scala.inline
  def apply(CODENAME: InfiniteTuple, ERROR: `Cannot reverse an infinite tuple`): CODENAME = {
    val __obj = js.Dynamic.literal(CODENAME = CODENAME.asInstanceOf[js.Any], ERROR = ERROR.asInstanceOf[js.Any])
    __obj.asInstanceOf[CODENAME]
  }
  
  @scala.inline
  implicit class CODENAMEOps[Self <: CODENAME] (val x: Self) extends AnyVal {
    
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
    def setCODENAME(value: InfiniteTuple): Self = this.set("CODENAME", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setERROR(value: `Cannot reverse an infinite tuple`): Self = this.set("ERROR", value.asInstanceOf[js.Any])
  }
}
