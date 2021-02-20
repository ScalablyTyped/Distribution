package typings.tuyaPanelKit.anon

import typings.tuyaPanelKit.tuyaPanelKitStrings.GO_BACK
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Source
  extends typings.tuyaPanelKit.commonActionsMod.Action {
  
  // tslint:disable-next-line no-redundant-undefined
  var source: js.UndefOr[String] = js.native
  
  // tslint:disable-next-line no-redundant-undefined
  var target: js.UndefOr[String] = js.native
  
  var `type`: GO_BACK = js.native
}
object Source {
  
  @scala.inline
  def apply(`type`: GO_BACK): Source = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source]
  }
  
  @scala.inline
  implicit class SourceMutableBuilder[Self <: Source] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setType(value: GO_BACK): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
