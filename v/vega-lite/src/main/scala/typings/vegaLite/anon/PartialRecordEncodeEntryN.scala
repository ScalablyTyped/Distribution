package typings.vegaLite.anon

import typings.vegaTypings.encodeMod.TextEncodeEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Record<vega.vega.EncodeEntryName, vega.vega.TextEncodeEntry>> */
@js.native
trait PartialRecordEncodeEntryN extends StObject {
  
  var enter: js.UndefOr[TextEncodeEntry] = js.native
  
  var exit: js.UndefOr[TextEncodeEntry] = js.native
  
  var hover: js.UndefOr[TextEncodeEntry] = js.native
  
  var leave: js.UndefOr[TextEncodeEntry] = js.native
  
  var release: js.UndefOr[TextEncodeEntry] = js.native
  
  var select: js.UndefOr[TextEncodeEntry] = js.native
  
  var update: js.UndefOr[TextEncodeEntry] = js.native
}
object PartialRecordEncodeEntryN {
  
  @scala.inline
  def apply(): PartialRecordEncodeEntryN = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRecordEncodeEntryN]
  }
  
  @scala.inline
  implicit class PartialRecordEncodeEntryNMutableBuilder[Self <: PartialRecordEncodeEntryN] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnter(value: TextEncodeEntry): Self = StObject.set(x, "enter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
    
    @scala.inline
    def setExit(value: TextEncodeEntry): Self = StObject.set(x, "exit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExitUndefined: Self = StObject.set(x, "exit", js.undefined)
    
    @scala.inline
    def setHover(value: TextEncodeEntry): Self = StObject.set(x, "hover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
    
    @scala.inline
    def setLeave(value: TextEncodeEntry): Self = StObject.set(x, "leave", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLeaveUndefined: Self = StObject.set(x, "leave", js.undefined)
    
    @scala.inline
    def setRelease(value: TextEncodeEntry): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReleaseUndefined: Self = StObject.set(x, "release", js.undefined)
    
    @scala.inline
    def setSelect(value: TextEncodeEntry): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
    
    @scala.inline
    def setUpdate(value: TextEncodeEntry): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
